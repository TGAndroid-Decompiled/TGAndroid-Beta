package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.webkit.WebView;
import org.telegram.tgnet.tl.TL_iv;
public final class r1 extends WebView {
    public final s1 f36988a;

    public r1(s1 s1Var, Context context) {
        super(context);
        this.f36988a = s1Var;
        setFocusable(false);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        s1 s1Var = this.f36988a;
        s1Var.f37230s = true;
        TL_iv.pageBlockEmbed pageblockembed = s1Var.v;
        if (pageblockembed != null) {
            if (pageblockembed.allow_scrolling) {
                requestDisallowInterceptTouchEvent(true);
            } else {
                s1Var.f37232x.f34137f0.requestDisallowInterceptTouchEvent(true);
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
