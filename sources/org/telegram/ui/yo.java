package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class yo extends org.telegram.ui.Components.no0 {
    public final gp f40289r;

    public yo(gp gpVar, Context context, zd zdVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, zdVar, e6Var, false);
        this.f40289r = gpVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f40289r.L && super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return super.onTouchEvent(motionEvent);
        }
        if (!this.f40289r.L && super.onTouchEvent(motionEvent)) {
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
