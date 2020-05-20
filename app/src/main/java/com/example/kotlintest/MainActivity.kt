package com.example.kotlintest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlintest.iInterface.BaseInterfaceAdapter
import com.example.kotlintest.iInterface.NameItemAdapterListener
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity(),NameItemAdapterListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        text_test.text = "hii";
        text_test.setOnClickListener {
            Toast.makeText(this, "hoho", Toast.LENGTH_LONG).show()
            val intent: Intent = Intent(this@MainActivity, NMainActivity::class.java)
            intent.putExtra("WWW", "hello u")

            val Pt: PhuongTien = PhuongTien("xe dap", "den", "2 banh");

            intent.putExtra("data", Pt)
            startActivity(intent);
        }
        var s3: Student = Student("hi", 1997, 1998)
        var s2: Student = Student("hello", 1997, 1998)
        var studentList : MutableList<Student> = mutableListOf()
        studentList.add(s3)
        studentList.add(s2)
        studentList.add(s2)
        studentList.add(s2)
        studentList.add(s2)
        studentList.add(s2)
        studentList.add(s2)
        studentList.add(s2)
        studentList.add(s2)
        studentList.add(s2)
        studentList.add(s2)
        studentList.add(s2)
        var adapterName : AdapterName = AdapterName()
        adapterName.submitList(studentList)
        adapterName.setListerer(this)
        rcvName.layoutManager = LinearLayoutManager(this)
        rcvName.adapter = adapterName
        


//            text_test.setOnClickListener { object : View.OnClickListener{
//                override fun onClick(v: View?) {
//                    TODO("Not yet implemented")
//                }
//            }
//            } }

        /*
         sự khác biệt giưa var và val giống final trong java, khi khai báo var thì có thể thay đổi được, còn khi
         dùng val thì chỉ khai báo được một lần .
         */
        /*
        nếu để ? trước khi bao kiểu dữ liệu thì có thể ép biến về null; còn 2 dáu !! thì là khai báo k được để null
         */

//        var a : String? = ""
//        a = "gokou"
//        a.toInt()
//        val b : String = " phat"!!
//         a= null

        var a: String = "phat"
        var b: String = "tuan"
        when (a) {
            "hien" -> Log.d("AAA", "hi hien")
            "tuan" -> Log.d("AAA", "hi tuan")
            "phat" -> Log.d("AAA", " hi phat")
        }
        var c: Int = 0;
        var d: Int = 10;
        /*
        in x..y : trong khoảng  x đến  y, when giống như switch hoặc if else trong java, câu lệnh rẽ nhánh
         */
        when (c) {
            1, 2, 3, 4 -> Log.d("AAA", "1 den 4")
            in 5..10 -> Log.d("AAA", "5 den 10")
            else -> Log.d("AAA", "khong co")
        }

        var e: Int = 0;
        while (e < 10) {
            Log.d("AAA", "chao cac ban lan thu " + e);
            e++;
        }
        for (i in 0..10) {
            // hiển thị 0 đến 10
            Log.d("AAA", i.toString());
        }
        var f: Int = 5;
        for (i in 0 until f) {
            //chạy từ 0 đến 5 : hiển thị i là: 0 ,1 ,2 ,3 ,4
            Log.d("AAA1", "" + i);
        }
        for (i in f downTo 0) {
            // hiển thị 5 đến 9
            Log.d("AAA2", "" + i);
        }
        for (i in 0..f step 2) {
            // môi lần + 2 lần lên : hiển thị  0,2,4
            Log.d("AAA3", "" + i);
        }

        var mangso: IntArray = intArrayOf(1, 2, 3, 4)
        var mangten: List<String> = listOf("hoa", "hung", "tuan")
        mangten.get(1);
        var mangten2: ArrayList<String> = ArrayList();
        mangten2.add("anh");
        mangten2.add("yeu")
        mangten2.add("em");

        for (i in 0 until mangten2.size) {
            Log.d("AAA4", mangten2.get(i))
        }
        //  mangten2.remove("yeu")
//        mangten2.removeAt(0)
//        mangten2.set(2,"who know")

        /*
        MutableList Là collection có thể thay đổi kích thước dữ liệu: Có thể thêm, sửa, xóa…
        List Là collection chỉ có nhiệm vụ readOnly, dùng để hiển thị thông tin.
        Và dĩ nhiên nó sẽ tối ưu bộ nhớ hơn so với MutableList.
         đó nếu như bạn chỉ muốn hiển thị thông tin thì nên dùng List.
         */
        var manglist: MutableList<Int> = mutableListOf(2, 4)
        manglist.add(1)

        // lọc và sắp xếp giảm dần
        for (i in 0 until manglist.filter { a -> a % 2 == 0 }.sortedDescending().size) {
            Log.d("AAA5", manglist.get(i).toString())
        }
        var dsfitter = manglist.filter { a -> a % 2 === 0 }
        showname("hung", 9888)

        var s1: Student = Student("lol", 1997, 1998)
        s1.Hoten = "hung"
        s1.Phone = 2000
        s1.setNamSinh(1997)
        Log.d("AAA6", s1.child.toString() + " " + " : " + s1.AldultNotChild.toString())
    }

    //cách khai báo funtion
    fun showname(name: String, phone: Long) {
        Log.d("AAA7", name + " : " + phone)
    }

    private fun test(){

    }

    override fun onClickItem(item: Student) {
        Toast.makeText(this,item.Hoten,Toast.LENGTH_SHORT).show()
    }

}
