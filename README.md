java-log4j2-sample
==================
log4j2のサンプルソースコードです

Version
-------

* log4j2 2.0-beta8
* Java jdk_1.7.0_40
* Eclipse Kepler 4.3

Abstract
--------

* log4j2のライブラリを使ったソースコードです
* mainメソッドを持つサンプルクラスが1つあります
  * src/com/kakakikikeke/sample/Log4j2Sample.java

How to use
----------

### インストール方法

1. GithubからEclipseにプロジェクトを[インポート](http://kakakikikeke.blogspot.jp/2012/12/githubandroideclipse.html)します
1. プロジェクトのJavaのバージョンをビルドパスの構成から変更します
1. libフォルダ配下のjarファイルをビルドパスに追加してください

### 実行方法

* mainメソッドを実行する
  * src/com/kakakikikeke/sample/Log4j2Sample.java を実行します
  * サンプル用のmainメソッドが準備されていますので、Eclipse からであれば、クラスを右クリックし Run As -> Java Application で実行できます


Configure
---------

* log4j2のダウンロード
  * log4j2の[配布サイト](http://logging.apache.org/log4j/2.x/download.html)から最新のlog4j2をダウンロードしてください
    * リポジトリに含まれる`log4j-api-2.0-beta8.jar`と`log4j-core-2.0-beta8.jar`を使っても問題ないですが、最新版を使うことをおすすめします
  * ダウンロードしたjarファイルをlibフォルダ配下に配置しビルドパスに追加してください
* log4j2.xmlの配置
  * src 配下に配置します
    * Eclipseでは src 直下はデフォルトでクラスパスが通っています

Tips
----

* log4j2.xml と log4j2.json の2つプロパティファイルでロギング内容を操作できます
* log4j.properties はなくってみたいです、またlog4j→log4j2とファイル名の規則も変わっています
* コンソールにロギングするだけならプロパティファイルは必要です、その場合ログレベルがERRORで表示されます
* TRACE < DEBUG < INFO < WARN < ERROR < FATAL の順でログレベルは設定できます（デフォルトはERRORとFATALのみ表示されます）
  * http://logging.apache.org/log4j/2.x/manual/architecture.html
* 指定できる出力フォーマット
  * http://logging.apache.org/log4j/2.x/manual/layouts.html
* 出力に必要な最低限のタグ
    * appenders
      * コンソールに出力するフォーマットとファイルに出力するフォーマットを定義します
      * 指定できるappenders一覧
          * http://logging.apache.org/log4j/2.x/manual/appenders.html
      * RollingFileAppender
          * http://logging.apache.org/log4j/2.x/manual/appenders.html#RollingFileAppender
    * loggers
        * カテゴリを定義します
        * カテゴリはどのappendersを使うかを指定することでログの出力方式を決定します