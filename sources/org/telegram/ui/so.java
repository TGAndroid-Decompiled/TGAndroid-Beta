package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class so extends org.telegram.ui.Components.gp0 {
    public final ap N;

    public so(ap apVar, Context context, org.telegram.ui.Components.fp0 fp0Var, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, fp0Var, u6Var, false);
        this.N = apVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.N.L && super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return super.onTouchEvent(motionEvent);
        }
        if (!this.N.L && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        rect.bottom = AndroidUtilities.dp(60.0f) + rect.bottom;
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }
}
