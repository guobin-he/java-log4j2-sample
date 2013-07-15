java-log4j2-sample
------------------

* 設定方法
  * log4j2のダウンロード
    * http://logging.apache.org/log4j/2.x/download.html から最新のlog4j2をダウンロードします
    * log4j-api-2.0-beta8.jar と  log4j-core-2.0-beta8.jar をlibフォルダ配下に移動します（バージョンはダウンロードした時とは異なる可能性があります）
    * 上記2つのファイルをクラスパスに追加します
  * log4j2.xmlの配置
    * src 配下に配置します
    * src直下はデフォルトでクラスパスが通っているパスになっています
* 特徴
  * log4j2.xml と log4j2.json の2つプロパティファイルで内容を操作できます
  * log4j.properties はなくってみたいです、またlog4j→log4j2とファイル名の規則も変わっています
  * デフォルトでプロパティファイルが必要なくなりましたがログレベルがerrorになっています
  * TRACE < DEBUG < INFO < WARN < ERROR < FATAL の順でログレベルは設定できます（デフォルトはERRORとFATALのみ表示されます）
    * http://logging.apache.org/log4j/2.x/manual/architecture.html
  * 指定できる出力フォーマット
    * http://logging.apache.org/log4j/2.x/manual/layouts.html
  * タグ
    * appenders
      * コンソールに出力するフォーマットとファイルに出力するフォーマットを定義します
      * 指定できるappenders一覧
        * http://logging.apache.org/log4j/2.x/manual/appenders.html
      * RollingFileAppender
        * http://logging.apache.org/log4j/2.x/manual/appenders.html#RollingFileAppender
    * loggers
      * カテゴリを定義します
      * カテゴリはどのappendersを使うかを指定することでログの出力方式を決定します    