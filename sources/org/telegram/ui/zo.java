package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class zo extends org.telegram.ui.Components.ro0 {
    public final hp f43863r;

    public zo(hp hpVar, Context context, zd zdVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, zdVar, d6Var, false);
        this.f43863r = hpVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f43863r.L && super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return super.onTouchEvent(motionEvent);
        }
        if (!this.f43863r.L && super.onTouchEvent(motionEvent)) {
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
