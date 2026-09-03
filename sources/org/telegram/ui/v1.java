package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.webkit.WebView;
import org.telegram.tgnet.tl.TL_iv;
public final class v1 extends WebView {
    public final w1 f38949a;

    public v1(w1 w1Var, Context context) {
        super(context);
        this.f38949a = w1Var;
        setFocusable(false);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        w1 w1Var = this.f38949a;
        w1Var.f39239s = true;
        TL_iv.pageBlockEmbed pageblockembed = w1Var.v;
        if (pageblockembed != null) {
            if (pageblockembed.allow_scrolling) {
                requestDisallowInterceptTouchEvent(true);
            } else {
                w1Var.f39241x.f36361c0.requestDisallowInterceptTouchEvent(true);
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
