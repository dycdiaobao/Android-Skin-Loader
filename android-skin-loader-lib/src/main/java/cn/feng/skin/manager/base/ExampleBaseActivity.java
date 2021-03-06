package cn.feng.skin.manager.base;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import java.util.List;

import cn.feng.skin.manager.entity.DynamicAttr;
import cn.feng.skin.manager.listener.IDynamicNewView;

/**
 * 作者：aprz on 2016/7/4.
 * 邮箱：aprz512@163.com
 */
public class ExampleBaseActivity extends Activity implements IDynamicNewView {

    private IActivitySkinHelper mSkinHelper = new ActivitySkinHelper(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mSkinHelper.onCreate();
    }

    @Override
    protected void onResume() {
        super.onResume();
        mSkinHelper.onResume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mSkinHelper.onDestroy();
    }

    protected void dynamicAddSkinEnableView(View view, String attrName, int attrValueResId) {
        mSkinHelper.dynamicAddView(view, attrName, attrValueResId);
    }

    protected void dynamicAddSkinEnableView(View view, List<DynamicAttr> pDAttrs) {
        mSkinHelper.dynamicAddView(view, pDAttrs);
    }

    final protected void enableResponseOnSkinChanging(boolean enable) {
        mSkinHelper.enableResponseOnSkinChanging(enable);
    }

    @Override
    public void dynamicAddView(View view, List<DynamicAttr> pDAttrs) {
        mSkinHelper.dynamicAddView(view, pDAttrs);
    }
}
