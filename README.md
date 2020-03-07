# 書店の書籍検索サイト
![トップページ](https://lh4.googleusercontent.com/sK7tJW00GD010WhIPX7dWi5Bw9so3FkDwF_bkj3Yd4My_aC24x7F0wW8jadJkpnxcRwxeEY83lxMOn-6oq9WF_u1dwarZ29VuCpztAuWAq7PvNTEwy3x=w1280)

## アプリ名
Yohele（葉柄書店書籍検索サイト）

## 概要

### １．著者名や書籍名での検索機能
　入荷済みの本を書籍名または筆者、あるいはその両方で検索する。
  
![書籍検索ページ](https://lh5.googleusercontent.com/gu2sJd1V8lED2vLUR0pZK0lMtWwcYNl3AG2hF5Rg34BdKM1CIpYzxDoVWMyYIht5s16V8Mswbpt9O_AJ85ELVekbOs5Z6YtfQgcK9sjT6QzQr7g0zgOC=w1280)


### ２．ジャンル毎の書籍一覧表示機能
　入荷済みの本をジャンルで絞って表示する。
  
![ジャンル別検索ページ](https://lh6.googleusercontent.com/ut11syN7v4Y87TSUWf6qWoSmZbc0C_q6zicYlf9Iq8ESOfoUIb3ssmyDYnaBenF3-8Ax0wo9nzpyXy9Z4u4sC4jFUoOZaFaP07gwteWGqPWDioxnVrQ=w1280)


### ３．全書籍の一覧表示
　入荷済みの本を全て確認する。

![新入荷ページ](https://lh5.googleusercontent.com/g5OdoIeLm_Fc3rdSJOdvYzEHaLVyfQnG4EGc_eJ7DdwJUNxEF4--8g39yzeEnlurN-ABkN9i0ha73JKb66jbYsUZMxWubRDzJ-iy7U0zly1HMrfzEw=w1280)


### 4．店内地図
　店内地図表示ページ。略



## 作業環境

* Mac
* java version "11.0.6"
* Spring Boot v2.2.4
* gradl v0.2.3
* VSCode（Visual Studio Code）
* MySQL

## 本番環境
未実装

## DB統計
### idolテーブル
|Column|Type|Options|
|------|----|-------|
|id|int|null: false|
|arrival|text|null: false|
|genre|text|null: false|
|writer|text|null: false|
|titlename|text|null: false|
|teamid|int|null: false|

### teamテーブル
|Column|Type|Options|
|------|----|-------|
|tid|int|null: false|
|teamname|text|null: false|



　
## 制作背景
　前職にて、システムの一番の強みは「大量の情報を正確に扱えること」だと感じていました。前職はDTPオペレータという本の印刷データの作成です。本は何百もの頁によって成り立っているため、例えば各ページのタイトルを太字にしたい場合など、当然手作業では膨大な作業になります。また数が増えれば増えるほどミスの確率はあがります。そんな状況を改善してくれていたのが、システムでした。システムは一瞬かつ漏れなく作業をしてくれるため、とても頼りになる存在です。
　そんな「大量の情報を正確に扱える強み」を生かせるものを作成したいと考え、本屋の検索アプリを作成いたしました。

## 工夫したポイント
　ジャンルから書籍を絞り込めるようにするために、DB間に関係をもたせようとしましたが、実力不足により上手くできませんでした。しかし、メインとなる機能の一つのため諦めきれず、DB間に繋がりがなくても実装できる手段に切り替えて作成しました。現在はjavascriptで絞り込む方法で実装しています。<br>
　独学のためまだまだ学習不足ではありますが、今身につけている技術でできることの幅を広げることはできました。


## 今後の実装予定
* デプロイ
* DBへのデータの挿入が直接入れ込む以外に存在しないため、管理者ページを作成し、そこから書籍の登録を可能にする
