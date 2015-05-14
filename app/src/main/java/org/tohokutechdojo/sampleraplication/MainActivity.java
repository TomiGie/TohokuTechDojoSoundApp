package org.tohokutechdojo.sampleraplication;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity implements View.OnTouchListener{

    private ImageButton soundButton01;
    private ImageButton soundButton02;
    private ImageButton soundButton03;
    private ImageButton soundButton04;
    private ImageButton soundButton05;
    private ImageButton soundButton06;
    private ImageButton soundButton07;
    private ImageButton soundButton08;
    private ImageButton soundButton09;
    private ImageButton soundButton10;
    private ImageButton soundButton11;
    private ImageButton soundButton12;
    private SoundPool soundPool;

    private int soundIdBass;
    private int soundIdClap;
    private int soundIdPiano;
    private int soundIdHihat;
    private int soundIdKick;
    private int soundIdSfx;
    private int soundIdSfx2;
    private int soundIdTom;
    private int soundIdDo;
    private int soundIdRe;
    private int soundIdMi;
    private int soundIdFa;
    private int soundIdSo;
    private int soundIdRa;
    private int soundIdShi;
    private int soundIdDoHi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 音源の読み込み
        loadSounds();

        // ボタンのレイアウトの読み込み
        setButtons();

        // ※ボタン画像の読み込み
        setButtonsColor();

        // ※ボタンタップ時の音設定
        setButtonSounds();
    }

    private void loadSounds() {
        // app/src/main/res/raw にある音源を読み込む
        soundPool = new SoundPool(12, AudioManager.STREAM_MUSIC, 1);
        soundIdBass = soundPool.load(this, R.raw.bass, 1);
        soundIdClap = soundPool.load(this, R.raw.clap, 1);
        soundIdPiano = soundPool.load(this, R.raw.electoric_piano, 1);
        soundIdHihat = soundPool.load(this, R.raw.hihat, 1);
        soundIdKick = soundPool.load(this, R.raw.kick, 1);
        soundIdSfx = soundPool.load(this, R.raw.sfx, 1);
        soundIdSfx2 = soundPool.load(this, R.raw.sfx2, 1);
        soundIdTom = soundPool.load(this, R.raw.tom, 1);
        soundIdDo = soundPool.load(this, R.raw.synth_do, 1);
        soundIdRe = soundPool.load(this, R.raw.synth_re, 1);
        soundIdMi = soundPool.load(this, R.raw.synth_mi, 1);
        soundIdFa = soundPool.load(this, R.raw.synth_fa, 1);
        soundIdSo = soundPool.load(this, R.raw.synth_so, 1);
        soundIdRa = soundPool.load(this, R.raw.synth_ra, 1);
        soundIdShi = soundPool.load(this, R.raw.synth_si, 1);
        soundIdDoHi = soundPool.load(this, R.raw.synth_do_hi, 1);
    }

    private void setButtons() {
        // ボタンのレイアウトの読み込み
        soundButton01 = (ImageButton) findViewById(R.id.button_sound_01);
        soundButton02 = (ImageButton) findViewById(R.id.button_sound_02);
        soundButton03 = (ImageButton) findViewById(R.id.button_sound_03);
        soundButton04 = (ImageButton) findViewById(R.id.button_sound_04);
        soundButton05 = (ImageButton) findViewById(R.id.button_sound_05);
        soundButton06 = (ImageButton) findViewById(R.id.button_sound_06);
        soundButton07 = (ImageButton) findViewById(R.id.button_sound_07);
        soundButton08 = (ImageButton) findViewById(R.id.button_sound_08);
        soundButton09 = (ImageButton) findViewById(R.id.button_sound_09);
        soundButton10 = (ImageButton) findViewById(R.id.button_sound_10);
        soundButton11 = (ImageButton) findViewById(R.id.button_sound_11);
        soundButton12 = (ImageButton) findViewById(R.id.button_sound_12);

        // 各ボタンがタッチされたら反応するように設定
        // これを設定すると152行目の「OnTouch」メソッドの処理がが実行される(音を鳴らすだけ)
        soundButton01.setOnTouchListener(this);
        soundButton02.setOnTouchListener(this);
        soundButton03.setOnTouchListener(this);
        soundButton04.setOnTouchListener(this);
        soundButton05.setOnTouchListener(this);
        soundButton06.setOnTouchListener(this);
        soundButton07.setOnTouchListener(this);
        soundButton08.setOnTouchListener(this);
        soundButton09.setOnTouchListener(this);
        soundButton10.setOnTouchListener(this);
        soundButton11.setOnTouchListener(this);
        soundButton12.setOnTouchListener(this);
    }

    // ※ボタン画像の読み込み
    private void setButtonsColor() {
        int buttonColorOrange = R.drawable.selector_button_orange;  // オレンジ
        int buttonColorBlue = R.drawable.selector_button_blue;      // 青ボタン
        int buttonColorPink = R.drawable.selector_button_pink;      // ピンク
        int buttonColorGreen = R.drawable.selector_button_green;    // 緑

        soundButton01.setBackgroundResource(buttonColorOrange);
        soundButton02.setBackgroundResource(buttonColorOrange);
        soundButton03.setBackgroundResource(buttonColorOrange);
        soundButton04.setBackgroundResource(buttonColorOrange);

        soundButton05.setBackgroundResource(buttonColorBlue);
        soundButton06.setBackgroundResource(buttonColorBlue);
        soundButton07.setBackgroundResource(buttonColorBlue);
        soundButton08.setBackgroundResource(buttonColorBlue);

        soundButton09.setBackgroundResource(buttonColorPink);
        soundButton10.setBackgroundResource(buttonColorPink);
        soundButton11.setBackgroundResource(buttonColorPink);
        soundButton12.setBackgroundResource(buttonColorPink);
    }


    // ※各ボタンの音を設定する
    private void setButtonSounds() {
        soundButton01.setTag(soundIdDo);
        soundButton02.setTag(soundIdRe);
        soundButton03.setTag(soundIdMi);
        soundButton04.setTag(soundIdFa);
        soundButton05.setTag(soundIdSo);
        soundButton06.setTag(soundIdRa);
        soundButton07.setTag(soundIdShi);
        soundButton08.setTag(soundIdDoHi);
        soundButton09.setTag(soundIdBass);
        soundButton10.setTag(soundIdClap);
        soundButton11.setTag(soundIdHihat);
        soundButton12.setTag(soundIdKick);
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {

            // ボタンに設定された音のidを取得する
            int soundId = (int) v.getTag();

            //音を鳴らす
            soundPool.play(soundId, 1, 1, 0, 0, 0);
        }
        return false;
    }
}
