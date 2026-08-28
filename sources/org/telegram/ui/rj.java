package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
public final class rj extends org.telegram.ui.Cells.w0 {
    public final qn f42438g2;

    public rj(Context context, org.telegram.ui.ActionBar.b6 b6Var, qn qnVar) {
        super(context, b6Var, false);
        this.f42438g2 = qnVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        qn qnVar = this.f42438g2;
        if (qnVar.f42135x8 == null) {
            float y10 = ((qnVar.f42077t0.getY() + qnVar.o9) - getY()) - AndroidUtilities.dp(4.0f);
            if (y10 > 0.0f) {
                if (y10 < getMeasuredHeight()) {
                    canvas.save();
                    canvas.clipRect(0.0f, y10, getMeasuredWidth(), getMeasuredHeight());
                    super.onDraw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            }
            super.onDraw(canvas);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        if (getAlpha() != 0.0f) {
            qn qnVar = this.f42438g2;
            kVar = ((org.telegram.ui.ActionBar.o2) qnVar).actionBar;
            if (!kVar.s() && !qnVar.A9()) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        if (getAlpha() != 0.0f) {
            qn qnVar = this.f42438g2;
            kVar = ((org.telegram.ui.ActionBar.o2) qnVar).actionBar;
            if (!kVar.s() && !qnVar.A9()) {
                return super.onTouchEvent(motionEvent);
            }
            return false;
        }
        return false;
    }

    @Override
    public final void setAlpha(float f10) {
        int i9;
        super.setAlpha(f10);
        if (f10 > 0.0f) {
            i9 = 0;
        } else {
            i9 = 4;
        }
        setVisibility(i9);
    }

    @Override
    public final void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            invalidate();
        }
        super.setTranslationY(f10);
    }
}
