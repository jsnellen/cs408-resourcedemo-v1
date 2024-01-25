package edu.jsu.mcis.cs408.resourcedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import edu.jsu.mcis.cs408.resourcedemo.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ActivityMainBinding binding;

    private boolean coinHeads;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.button.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        coinHeads = !coinHeads;

        if (coinHeads)
            binding.button.setImageResource(R.drawable.heads);
        else
            binding.button.setImageResource(R.drawable.tails);

    }

}
