package com.bailiangjin.wiki.code.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.bailiangjin.wiki.R;

public class FragmentDemoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        boolean isAddToBacKStack = false;
        DemoFragment fragment = new DemoFragment();

        addFragmentToContainer(fragment,isAddToBacKStack);
    }

    /**
     * 添加Fragment到view容器
     * @param fragment
     * @param isAddToBacKStack
     */
    private void addFragmentToContainer(Fragment fragment, boolean isAddToBacKStack) {
        FragmentManager fragmentManager = getSupportFragmentManager();

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.add(R.id.rl_container, fragment);

        if (isAddToBacKStack){
            // fragmentTransaction.addToBackStack(null);//将当前Fragment的状态添加到回退栈中
            //  为每一个Fragment状态指定一个name，就是Fragment当前的需要
            fragmentTransaction.addToBackStack(String.valueOf(getFragmentManager().getBackStackEntryCount() + 1));
        }

        fragmentTransaction.commit();
        //指定回退栈监听器
        fragmentManager.addOnBackStackChangedListener(new FragmentManager.OnBackStackChangedListener() {
            @Override
            public void onBackStackChanged() {
                Log.e(getClass().getSimpleName(), "onBackStackChanged");
            }
        });
    }

    /**
     * 退回上一个Fragment
     */
    public void toPreFragment()
    {
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.popBackStack();//将栈顶的Fragment对象状态弹出，重新显示上一页

    }

    /**
     * 将tag之后的fragment出栈 显示tag对应的Fragment
     * @param tag
     */
    public void backToFragment(String tag)
    {
        FragmentManager fragmentManager = getSupportFragmentManager();
        //将回退栈在Fragment状态全部出栈，恢复到第1页
        fragmentManager.popBackStackImmediate(tag,FragmentManager.POP_BACK_STACK_INCLUSIVE);

    }
}
