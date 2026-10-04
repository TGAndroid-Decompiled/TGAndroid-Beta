package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.webkit.WebView;
import org.telegram.tgnet.tl.TL_iv;
public final class s1 extends WebView {
    public final t1 f40324a;

    public s1(t1 t1Var, Context context) {
        super(context);
        this.f40324a = t1Var;
        setFocusable(false);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        t1 t1Var = this.f40324a;
        t1Var.f40670s = true;
        TL_iv.pageBlockEmbed pageblockembed = t1Var.v;
        if (pageblockembed != null) {
            if (pageblockembed.allow_scrolling) {
                requestDisallowInterceptTouchEvent(true);
            } else {
                t1Var.f40672x.f37266f0.requestDisallowInterceptTouchEvent(true);
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
