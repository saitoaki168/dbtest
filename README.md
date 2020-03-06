# 書店の書籍検索サイト
![トップページ](https://lh6.googleusercontent.com/SvURigAqHJmQqY1VCSTXhaHAyBmwqKaEp9zGqrzDBPiXkQCl8tCul_av8QVK8_C9VU8CFawHytngVKk-UXAYUjMf8G1FpnCSCIAzwl9q9skgY_j7Moc=w1280)

## アプリ名
Yohele（葉柄書店書籍検索サイト）

## 概要

### １．著者名や書籍名での検索機能
　入荷済みの本を書籍名または筆者、あるいはその両方で検索する。
  
![書籍検索ページ](https://lh4.googleusercontent.com/rxDTQVkUuopXQKqAjh12ZViu48sdmb2j_f3jA5Im-TTDVKqdhYqkn3GuihNMuuJ8dCa00VK8rYoabpVYQKnZ1DH8kXIMJqiBOMTYer2BZ-WXalMtmp_E=w1280)


### ２．ジャンル毎の書籍一覧表示機能
　入荷済みの本をジャンルで絞って表示する。
  
![ジャンル別検索ページ](https://lh6.googleusercontent.com/rb3EWiVcG4ThFu_BxsRevvQP9lubsdScE21Y1ZekQ70mDwTquD_k523XuJCxXv1Tt94HdcrkVRUKCcTytBLNZlm5LyLHVJyIivX7XQkb3Rbl6Ll-Xg=w1280)


### ３．全書籍の一覧表示
　入荷済みの本を全て確認する。

![新入荷ページ](https://lh4.googleusercontent.com/Zntfg02RcCYe6OPiTAIwR_1npOev2NTYja19-_Wa_7E2EhOfhMjO9jVK2LyPgLHP4pEp-kuUvMvpsj7DcEH9Bi4RLn4FXuyud7vDnDUibRud7FppR8s=w1280)


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
　検索機能をメインとしたサイトを作成したかった。


## 工夫したポイント
　DB間に関係をもたせようとしましたが実力不足により上手く行かず、ジャンル検索ページではjavascriptでの絞り込みを使用して作成しました。
 独学のためまだまだ学習不足ではありますが、今身につけている技術でできることの幅を広げることができました。


## 今後の実装予定
* デプロイ
* 管理者ページにて書籍の登録を可能にする
