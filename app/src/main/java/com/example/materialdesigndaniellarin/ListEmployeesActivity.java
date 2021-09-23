package com.example.materialdesigndaniellarin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.materialdesigndaniellarin.adapters.EmployeesAdapter;
import com.example.materialdesigndaniellarin.models.EmployeeModel;



import java.util.ArrayList;
import java.util.List;

public class ListEmployeesActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    EmployeesAdapter employeesAdapter;

    public List<EmployeeModel> lstEmployees;
    LinearLayoutManager linearLayoutManager;

    ArrayList<String> lst = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_employees);

        if(lstEmployees != null){
            for(int i = 0; i<AddEmployeeActivity.employee.size(); i++){
                String cadena = R.drawable.android_kotlin + " " + AddEmployeeActivity.employee.get(i).getName() + " " + AddEmployeeActivity.employee.get(i).getLastName();
                lst.add(cadena);
            }
        }

        ///lstEmployees = new ArrayList<>();
        ///lstEmployees.add(new EmployeeModel(R.drawable.android_kotlin, "Juan", "Pedro"));
        setRecyclerView(lstEmployees);
    }
    private void setRecyclerView(List<EmployeeModel> lstEMployees){
        recyclerView = findViewById(R.id.rvEmployees);
        linearLayoutManager = new LinearLayoutManager(ListEmployeesActivity.this, RecyclerView.VERTICAL, false);
        ///linearLayoutManager = new GridLayoutManager(ListEmployeesActivity.this, 2);
        recyclerView.setLayoutManager(linearLayoutManager);
        employeesAdapter = new EmployeesAdapter(lstEmployees);
        ///recyclerView.setAdapter(employeesAdapter);
    }
}