package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.webkit.WebView;
import org.telegram.tgnet.tl.TL_iv;
public final class u1 extends WebView {
    public final v1 f41777a;

    public u1(v1 v1Var, Context context) {
        super(context);
        this.f41777a = v1Var;
        setFocusable(false);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        v1 v1Var = this.f41777a;
        v1Var.f42085s = true;
        TL_iv.pageBlockEmbed pageblockembed = v1Var.v;
        if (pageblockembed != null) {
            if (pageblockembed.allow_scrolling) {
                requestDisallowInterceptTouchEvent(true);
            } else {
                v1Var.f42087x.f38758f0.requestDisallowInterceptTouchEvent(true);
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
