package app.harada.leo.profile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //画像とテキストを隠す
        myImageView.visibility = View.INVISIBLE
        myText.visibility = View.INVISIBLE

        myNameButton.setOnClickListener {
            //ボタンが押された時の処理
            //画像とテキストを表示
            myImageView.visibility = View.VISIBLE
            myText.visibility = View.VISIBLE
        }
    }
}
