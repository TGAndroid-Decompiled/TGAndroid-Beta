package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.webkit.WebView;
import org.telegram.tgnet.tl.TL_iv;
public final class u1 extends WebView {
    public final v1 f41783a;

    public u1(v1 v1Var, Context context) {
        super(context);
        this.f41783a = v1Var;
        setFocusable(false);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        v1 v1Var = this.f41783a;
        v1Var.f42091s = true;
        TL_iv.pageBlockEmbed pageblockembed = v1Var.v;
        if (pageblockembed != null) {
            if (pageblockembed.allow_scrolling) {
                requestDisallowInterceptTouchEvent(true);
            } else {
                v1Var.f42093x.f38764f0.requestDisallowInterceptTouchEvent(true);
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
