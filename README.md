# TohokuTechDojoSoundApp
このアプリは東北Tech道場の講義用に作成をした、ボタンをタップすると音を再生させるサンプルアプリです  
  
  
![Qiita](https://raw.githubusercontent.com/TomiGie/TohokuTechDojoSoundApp/master/capture/MainActivity.png "Qiita")

## Getting Started
このアプリは画面に12個のボタンが配置されており、それぞれのボタンを押下するとソースコードで設定された音源が再生されるものです。
しかし、ソースコードはハンズオンように設計されており、未完成の状態となっています。  
そのままの状態でもアプリのビルドは可能ですが、初期の状態では画面の左下のボタンのみ音が設定されています。  
  
以下に変更が必要な部分とその手順を記載します。


### 音の設定
このプログラムではImageButtonのView要素にSetTagでint型のsoundIdを設定し、OnTouchが呼ばれたらそのViewにセットされているタグをgetTagし、取得したsoundIdをSoundPoolで再生する仕組みになっています。  
```java:MainActivity.java
private void setButtonSounds() {
    soundButton01.setTag(soundIdDo);
    soundButton02.setTag(0);
    soundButton03.setTag(0);
    soundButton04.setTag(0);
    soundButton05.setTag(0);
    soundButton06.setTag(0);
    soundButton07.setTag(0);
    soundButton08.setTag(0);
    soundButton09.setTag(0);
    soundButton10.setTag(0);
    soundButton11.setTag(0);
    soundButton12.setTag(0);
}
```
  
音の設定はMainActivity.javaクラスのsetButtonSoundsメソッド内にあり、その中のsetTagの引数に以下のsoundIdの変数をセットすると、ボタンタップ時に音が再生されるようになります。

```java:MainActivity.java
// soundID //
private int soundIdDo;
private int soundIdRe;
private int soundIdMi;
private int soundIdFa;
private int soundIdSo;
private int soundIdRa;
private int soundIdShi;
private int soundIdDoHi;
private int soundIdBass;
private int soundIdClap;
private int soundIdPiano;
private int soundIdHihat;
private int soundIdKick;
private int soundIdSfx;
private int soundIdSfx2;
private int soundIdTom;
```

### ボタン画像の変更
ボタン画像はMainActivity.javaのsetButtonsColorメソッドで設定をしています。
```java:MainActivity.java
// ※2 ボタン画像の設定
private void setButtonsColor() {
    int buttonColorOrange = R.drawable.selector_button_orange;  // オレンジ
    int buttonColorBlue = R.drawable.selector_button_blue;      // 青ボタン
    int buttonColorPink = R.drawable.selector_button_pink;      // ピンク
    int buttonColorGreen = R.drawable.selector_button_green;    // 緑

    soundButton01.setImageResource(buttonColorOrange);
    soundButton02.setImageResource(buttonColorOrange);
    soundButton03.setImageResource(buttonColorOrange);
    soundButton04.setImageResource(buttonColorOrange);

    soundButton05.setImageResource(buttonColorOrange);
    soundButton06.setImageResource(buttonColorOrange);
    soundButton07.setImageResource(buttonColorOrange);
    soundButton08.setImageResource(buttonColorOrange);

    soundButton09.setImageResource(buttonColorOrange);
    soundButton10.setImageResource(buttonColorOrange);
    soundButton11.setImageResource(buttonColorOrange);
    soundButton12.setImageResource(buttonColorOrange);
}
```
ボタンの変更は上記メソッド内のsetImageResource(buttonColorOrange)の引数である、buttonColorOrangeを他のbuttonColorBlue等に変更すると、ボタンの画像を変えることができます。  
