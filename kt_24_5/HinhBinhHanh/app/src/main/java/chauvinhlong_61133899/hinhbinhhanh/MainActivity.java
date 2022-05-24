package chauvinhlong_61133899.hinhbinhhanh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // khai báo sẵn các đối tượng sẽ làm việc
    EditText editCD,editCR,editCC;
    TextView textViewKetQua;
    Button CHUVI, DIENTICH;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimWidget();
    }
    void TimWidget(){
        editCD=(EditText)findViewById(R.id.edCD);
        editCR=(EditText)findViewById(R.id.edCR);
        editCC=(EditText)findViewById(R.id.edCC);
        textViewKetQua=(TextView)findViewById(R.id.tvKetQua);
        CHUVI=(Button)findViewById(R.id.btnCV);
        DIENTICH=(Button)findViewById(R.id.btnDT);
    }
    //hàm xử lí
    public void ChuVi(View view){
        EditText tvCD=(EditText)findViewById(R.id.edCD);
        int CD= Integer.parseInt(tvCD.getText().toString());
        EditText tvCR=(EditText)findViewById(R.id.edCR);
        int CR= Integer.parseInt(tvCR.getText().toString());
        int KetQua= (CD+CR)*2;
        TextView tvKetQua=(TextView)findViewById(R.id.tvKetQua);
        tvKetQua.setText(String.valueOf(KetQua));

    }
    public void DienTich(View view){
        EditText tvCD=(EditText)findViewById(R.id.edCD);
        int CD= Integer.parseInt(tvCD.getText().toString());
        EditText tvCR=(EditText)findViewById(R.id.edCC);
        int CC= Integer.parseInt(tvCR.getText().toString());
        int KetQua= CD*CC;
        TextView tvKetQua=(TextView)findViewById(R.id.tvKetQua);
        tvKetQua.setText(String.valueOf(KetQua));
    }
}