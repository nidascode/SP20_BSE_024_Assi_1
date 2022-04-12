package com.example.sp20_bse_024_assi_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.res.Configuration;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements ActionFragment.FragmentActionInterface
{
    private FragmentManager fragManager;
    private FragmentTransaction fragmentTrans;
    private ActionFragment actionFragment;
    private MsgFragment messageFragment;
    private RecordFragment recordFragment;
    private SearchFragment searchFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(getResources().getConfiguration().orientation== Configuration.ORIENTATION_LANDSCAPE)
        {
            fragManager = getSupportFragmentManager();
            fragmentTrans = fragManager.beginTransaction();
            actionFragment = ActionFragment.newInstance();
            messageFragment = MsgFragment.newInstance();
            recordFragment = recordFragment.newInstance();
            fragmentTrans.replace(R.id.FragmentLeft, actionFragment);
            fragmentTrans.replace(R.id.FragmentRight, messageFragment);
            fragmentTrans.commitNow();
        }
    }

    @Override
    public void record()
    {
            fragmentTrans = fragManager.beginTransaction();
            fragmentTrans.replace(R.id.FragmentRight, recordFragment);
            fragmentTrans.commitNow();
    }

    @Override
    public void searchRecord()
    {
            fragmentTrans = fragManager.beginTransaction();
            fragmentTrans.replace(R.id.FragmentRight, searchFragment);
            fragmentTrans.commitNow();
    }
}