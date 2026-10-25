package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
public final class yj extends org.telegram.ui.Cells.v0 {
    public final un f46069t2;

    public yj(Context context, org.telegram.ui.ActionBar.u6 u6Var, un unVar) {
        super(context, u6Var, false);
        this.f46069t2 = unVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        un unVar = this.f46069t2;
        if (unVar.N8 == null) {
            float y3 = ((unVar.f44468x0.getY() + unVar.E9) - getY()) - AndroidUtilities.dp(4.0f);
            if (y3 > 0.0f) {
                if (y3 < getMeasuredHeight()) {
                    canvas.save();
                    canvas.clipRect(0.0f, y3, getMeasuredWidth(), getMeasuredHeight());
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
            un unVar = this.f46069t2;
            kVar = ((org.telegram.ui.ActionBar.r2) unVar).actionBar;
            if (!kVar.q() && !unVar.J9()) {
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
            un unVar = this.f46069t2;
            kVar = ((org.telegram.ui.ActionBar.r2) unVar).actionBar;
            if (!kVar.q() && !unVar.J9()) {
                return super.onTouchEvent(motionEvent);
            }
            return false;
        }
        return false;
    }

    @Override
    public final void setAlpha(float f7) {
        int i10;
        super.setAlpha(f7);
        if (f7 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        setVisibility(i10);
    }

    @Override
    public final void setTranslationY(float f7) {
        if (getTranslationY() != f7) {
            invalidate();
        }
        super.setTranslationY(f7);
    }
}
