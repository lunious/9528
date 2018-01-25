package com.lubanjianye.biaoxuntong.ui.main.user.opinion;

import android.support.v7.widget.AppCompatTextView;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;

import com.lubanjianye.biaoxuntong.R;
import com.lubanjianye.biaoxuntong.base.BaseFragment;

/**
 * Created by 11645 on 2018/1/25.
 */

public class OpinionFragment extends BaseFragment implements View.OnClickListener {

    private LinearLayout llBack = null;
    private AppCompatTextView mainBarName = null;

    private RadioButton rbError = null;
    private EditText editText = null;
    private ImageView ivAdd = null;
    private ImageView ivClear = null;
    private AppCompatTextView atvCommit = null;

    @Override
    public Object setLayout() {
        return R.layout.fragment_opinion;
    }

    @Override
    public void initView() {
        llBack = getView().findViewById(R.id.ll_iv_back);
        mainBarName = getView().findViewById(R.id.main_bar_name);

        rbError = getView().findViewById(R.id.rb_error);
        editText = getView().findViewById(R.id.et_feed_back);
        ivAdd = getView().findViewById(R.id.iv_add);
        ivClear = getView().findViewById(R.id.iv_clear_img);
        atvCommit = getView().findViewById(R.id.tv_commit);

        llBack.setOnClickListener(this);

        ivAdd.setOnClickListener(this);
        ivClear.setOnClickListener(this);
        atvCommit.setOnClickListener(this);


    }

    @Override
    public void initData() {
        llBack.setVisibility(View.VISIBLE);
        mainBarName.setText("意见反馈");
    }

    @Override
    public void initEvent() {
        rbError.setChecked(true);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ll_iv_back:
                getActivity().onBackPressed();
                break;
            case R.id.iv_add:
//                openImageSelector();
                break;
            case R.id.iv_clear_img:
                break;
            case R.id.tv_commit:
                break;
            default:
                break;
        }
    }
//    public void openImageSelector() {
//        SelectImageActivity.show(this, new SelectOptions.Builder()
//                .setHasCam(false)
//                .setSelectCount(1)
//                .setCallback(new SelectOptions.Callback() {
//                    @Override
//                    public void doSelected(String[] images) {
//                        mFilePath = images[0];
//                        getImageLoader().load(mFilePath).into(iv_add);
//                        iv_clear_img.setVisibility(View.VISIBLE);
//                    }
//                }).build());
//    }

}
