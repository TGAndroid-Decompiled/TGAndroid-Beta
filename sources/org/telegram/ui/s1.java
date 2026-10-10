package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.webkit.WebView;
import org.telegram.tgnet.tl.TL_iv;
public final class s1 extends WebView {
    public final t1 f41598a;

    public s1(t1 t1Var, Context context) {
        super(context);
        this.f41598a = t1Var;
        setFocusable(false);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        t1 t1Var = this.f41598a;
        t1Var.f41865s = true;
        TL_iv.pageBlockEmbed pageblockembed = t1Var.v;
        if (pageblockembed != null) {
            if (pageblockembed.allow_scrolling) {
                requestDisallowInterceptTouchEvent(true);
            } else {
                t1Var.f41867x.f38545f0.requestDisallowInterceptTouchEvent(true);
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
