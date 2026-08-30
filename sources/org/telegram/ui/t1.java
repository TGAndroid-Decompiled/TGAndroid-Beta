package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.webkit.WebView;
import org.telegram.tgnet.tl.TL_iv;
public final class t1 extends WebView {
    public final u1 f38470a;

    public t1(u1 u1Var, Context context) {
        super(context);
        this.f38470a = u1Var;
        setFocusable(false);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        u1 u1Var = this.f38470a;
        u1Var.f38815s = true;
        TL_iv.pageBlockEmbed pageblockembed = u1Var.v;
        if (pageblockembed != null) {
            if (pageblockembed.allow_scrolling) {
                requestDisallowInterceptTouchEvent(true);
            } else {
                u1Var.f38817x.f35931c0.requestDisallowInterceptTouchEvent(true);
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
