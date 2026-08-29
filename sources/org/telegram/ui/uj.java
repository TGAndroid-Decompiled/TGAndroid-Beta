package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
public final class uj extends org.telegram.ui.Cells.v0 {
    public final tn f43275g2;

    public uj(Context context, org.telegram.ui.ActionBar.c6 c6Var, tn tnVar) {
        super(context, c6Var, false);
        this.f43275g2 = tnVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        tn tnVar = this.f43275g2;
        if (tnVar.f43034x8 == null) {
            float y8 = ((tnVar.f42973t0.getY() + tnVar.f42921o9) - getY()) - AndroidUtilities.dp(4.0f);
            if (y8 > 0.0f) {
                if (y8 < getMeasuredHeight()) {
                    canvas.save();
                    canvas.clipRect(0.0f, y8, getMeasuredWidth(), getMeasuredHeight());
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
        org.telegram.ui.ActionBar.l lVar;
        if (getAlpha() != 0.0f) {
            tn tnVar = this.f43275g2;
            lVar = ((org.telegram.ui.ActionBar.o2) tnVar).actionBar;
            if (!lVar.s() && !tnVar.A9()) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.l lVar;
        if (getAlpha() != 0.0f) {
            tn tnVar = this.f43275g2;
            lVar = ((org.telegram.ui.ActionBar.o2) tnVar).actionBar;
            if (!lVar.s() && !tnVar.A9()) {
                return super.onTouchEvent(motionEvent);
            }
            return false;
        }
        return false;
    }

    @Override
    public final void setAlpha(float f9) {
        int i10;
        super.setAlpha(f9);
        if (f9 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        setVisibility(i10);
    }

    @Override
    public final void setTranslationY(float f9) {
        if (getTranslationY() != f9) {
            invalidate();
        }
        super.setTranslationY(f9);
    }
}
