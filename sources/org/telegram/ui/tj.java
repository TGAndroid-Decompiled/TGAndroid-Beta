package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;

public final class tj extends org.telegram.ui.Cells.v0 {

    public final rn f42953g2;

    public tj(Context context, org.telegram.ui.ActionBar.c6 c6Var, rn rnVar) {
        super(context, c6Var, false);
        this.f42953g2 = rnVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        rn rnVar = this.f42953g2;
        if (rnVar.x8 != null) {
            return;
        }
        float y10 = ((rnVar.f42213t0.getY() + rnVar.f42160o9) - getY()) - AndroidUtilities.dp(4.0f);
        if (y10 <= 0.0f) {
            super.onDraw(canvas);
        } else if (y10 < getMeasuredHeight()) {
            canvas.save();
            canvas.clipRect(0.0f, y10, getMeasuredWidth(), getMeasuredHeight());
            super.onDraw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() == 0.0f) {
            return false;
        }
        rn rnVar = this.f42953g2;
        if (((org.telegram.ui.ActionBar.n2) rnVar).actionBar.t() || rnVar.A9()) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() == 0.0f) {
            return false;
        }
        rn rnVar = this.f42953g2;
        if (((org.telegram.ui.ActionBar.n2) rnVar).actionBar.t() || rnVar.A9()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void setAlpha(float f10) {
        super.setAlpha(f10);
        setVisibility(f10 > 0.0f ? 0 : 4);
    }

    @Override
    public final void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            invalidate();
        }
        super.setTranslationY(f10);
    }
}
