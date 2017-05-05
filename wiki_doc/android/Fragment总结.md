# Fragment总结

## 代码位置
/code/fragment/

## 1 Fragment 回退栈


			FragmentManager fragmentManager = getFragmentManager();

			FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
			FragmentPage fragment = new FragmentPage();
			fragmentTransaction.add(R.id.fragment_container, fragment);

			if (backStackFlag)
				// fragmentTransaction.addToBackStack(null);//将当前Fragment的状态添加到回退栈中
				//  为每一个Fragment状态指定一个name，就是Fragment当前的需要
				fragmentTransaction.addToBackStack(String.valueOf(getFragmentManager().getBackStackEntryCount() + 1));
			fragmentTransaction.commit();
			//指定回退栈监听器
			fragmentManager.addOnBackStackChangedListener(this);


## 2 Fragment 生命周期

## 3 Fragment 用途

### 3.1 DialogFragment实现蒙层


