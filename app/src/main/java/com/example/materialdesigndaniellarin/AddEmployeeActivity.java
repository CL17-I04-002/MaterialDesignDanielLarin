package com.example.materialdesigndaniellarin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.materialdesigndaniellarin.models.EmployeeModel;
import com.example.materialdesigndaniellarin.utils.Utils;

import java.util.ArrayList;

public class AddEmployeeActivity extends AppCompatActivity {

    private Button btnAdd;
    private EditText edtName, edtLastName;

    public static ArrayList<EmployeeModel> employee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_employee);

        btnAdd = findViewById(R.id.btnAdd);
        edtName = findViewById(R.id.edtName);
        edtLastName = findViewById(R.id.edtLastname);

        if(employee == null){
            employee = new ArrayList<>();
        }

        btnAdd.setOnClickListener(v -> {
            if(Utils.verifyEditText(edtName) && Utils.verifyEditText(edtLastName)){
                employee.add(new EmployeeModel(1, edtName.getText().toString(), edtLastName.getText().toString()));
                Toast.makeText(AddEmployeeActivity.this, "Agregado", Toast.LENGTH_LONG).show();
            }
        });
    }
}