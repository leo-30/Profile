package app.harada.leo.profile

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myNameButton.setOnClickListener {
            myNameButton.setBackgroundColor(Color.parseColor("#29abe2")) //選択したボタン
            myLikeSportsButton.setBackgroundColor(Color.parseColor("#929292")) //選択していないボタン
            myLikeFoodsButton.setBackgroundColor(Color.parseColor("#929292")) //選択していないボタン
            myLikeHobbyButton.setBackgroundColor(Color.parseColor("#929292")) //選択していないボタン
            myImageView.setImageResource(R.drawable.tobisuke) //画像を設置
            myText.text = "とびすけ"
        }

        myLikeSportsButton.setOnClickListener {
            myNameButton.setBackgroundColor(Color.parseColor("#929292")) //選択していないボタン
            myLikeSportsButton.setBackgroundColor(Color.parseColor("#29abe2")) //選択したボタン
            myLikeFoodsButton.setBackgroundColor(Color.parseColor("#929292")) //選択していないボタン
            myLikeHobbyButton.setBackgroundColor(Color.parseColor("#929292")) //選択していないボタン
            myImageView.setImageResource(R.drawable.soccer) //画像を設置
            myText.text = "サッカー"
        }

        myLikeFoodsButton.setOnClickListener {
            myNameButton.setBackgroundColor(Color.parseColor("#929292")) //選択していないボタン
            myLikeSportsButton.setBackgroundColor(Color.parseColor("#929292")) //選択していないボタン
            myLikeFoodsButton.setBackgroundColor(Color.parseColor("#29abe2")) //選択したボタン
            myLikeHobbyButton.setBackgroundColor(Color.parseColor("#929292")) //選択していないボタン
            myImageView.setImageResource(R.drawable.sushi) //画像を設置
            myText.text = "すし"
        }

        myLikeHobbyButton.setOnClickListener {
            myNameButton.setBackgroundColor(Color.parseColor("#929292")) //選択していないボタン
            myLikeSportsButton.setBackgroundColor(Color.parseColor("#929292")) //選択していないボタン
            myLikeFoodsButton.setBackgroundColor(Color.parseColor("#929292")) //選択ししていないボタン
            myLikeHobbyButton.setBackgroundColor(Color.parseColor("#29abe2")) //選択したボタン
            myImageView.setImageResource(R.drawable.dance) //画像を設置
            myText.text = "ダンス"
        }

//        //画像とテキストを隠す
//        myImageView.visibility = View.INVISIBLE
//        myText.visibility = View.INVISIBLE
//
//        myNameButton.setOnClickListener {
//            //ボタンが押された時の処理
//            //画像とテキストを表示
//            myImageView.visibility = View.VISIBLE
//            myText.visibility = View.VISIBLE
//        }
    }
}
