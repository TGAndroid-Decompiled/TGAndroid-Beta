package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
public final class yj extends org.telegram.ui.Cells.w0 {
    public final sn f43441t2;

    public yj(Context context, org.telegram.ui.ActionBar.d6 d6Var, sn snVar) {
        super(context, d6Var, false);
        this.f43441t2 = snVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        sn snVar = this.f43441t2;
        if (snVar.B8 == null) {
            float y3 = ((snVar.f41454x0.getY() + snVar.f41398s9) - getY()) - AndroidUtilities.dp(4.0f);
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
            sn snVar = this.f43441t2;
            kVar = ((org.telegram.ui.ActionBar.n2) snVar).actionBar;
            if (!kVar.s() && !snVar.F9()) {
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
            sn snVar = this.f43441t2;
            kVar = ((org.telegram.ui.ActionBar.n2) snVar).actionBar;
            if (!kVar.s() && !snVar.F9()) {
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
