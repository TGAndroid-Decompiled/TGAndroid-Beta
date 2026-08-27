package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.webkit.WebView;
import org.telegram.tgnet.tl.TL_iv;

public final class v1 extends WebView {

    public final w1 f43322a;

    public v1(w1 w1Var, Context context) {
        super(context);
        this.f43322a = w1Var;
        setFocusable(false);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        w1 w1Var = this.f43322a;
        w1Var.f43568s = true;
        TL_iv.pageBlockEmbed pageblockembed = w1Var.v;
        if (pageblockembed != null) {
            if (pageblockembed.allow_scrolling) {
                requestDisallowInterceptTouchEvent(true);
            } else {
                w1Var.f43570x.f40333b0.requestDisallowInterceptTouchEvent(true);
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
