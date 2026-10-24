package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class sg1 extends org.telegram.ui.Components.l91 {
    public boolean T;
    public final Path U;
    public final tg1 V;

    public sg1(tg1 tg1Var, Context context) {
        super(context, null);
        this.V = tg1Var;
        this.U = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.T) {
            Path path = this.U;
            path.rewind();
            float dpf2 = AndroidUtilities.dpf2(24.0f);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, AndroidUtilities.statusBarHeight, getWidth(), getHeight());
            path.addRoundRect(rectF, dpf2, dpf2, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
        }
        super.dispatchDraw(canvas);
        if (this.T) {
            canvas.restore();
        }
    }

    @Override
    public float getAvailableTranslationX() {
        return getMeasuredWidth();
    }

    @Override
    public long getManualScrollDuration() {
        return 320L;
    }

    @Override
    public final boolean j(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.o2 X = ((qg0) this.V).X();
        if (!(X instanceof pg0)) {
            return false;
        }
        return ((pg0) X).S(motionEvent, false);
    }

    @Override
    public final boolean k(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.o2 X = ((qg0) this.V).X();
        if (X instanceof pg0) {
            return ((pg0) X).S(motionEvent, true);
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
    }

    public void setTabletLayout(boolean z10) {
        if (this.T == z10) {
            return;
        }
        this.T = z10;
        invalidate();
    }

    @Override
    public final void t(View view, View view2, int i10, int i11) {
        this.V.U();
    }

    @Override
    public final void u() {
        ey eyVar;
        tg1 tg1Var = this.V;
        qg0 qg0Var = (qg0) tg1Var;
        if (qg0Var.F != null) {
            qg0Var.m0(qg0Var.f42051c.getCurrentPosition(), true);
            qg0Var.n0(0.0f, false);
        }
        qg0Var.d0();
        sg1 sg1Var = qg0Var.f42051c;
        if (sg1Var != null) {
            int currentPosition = sg1Var.getCurrentPosition();
            if (currentPosition != 2 && qg0Var.f40820x) {
                qg0Var.W(2);
                qg0Var.f40820x = false;
            }
            if (currentPosition != 3) {
                qg0Var.W(3);
            }
            Integer num = qg0Var.I;
            if (num != null && currentPosition == 0 && (eyVar = qg0Var.J) != null) {
                eyVar.u4(num.intValue());
                qg0Var.I = null;
            }
        }
        tg1Var.U();
    }

    @Override
    public final void w(boolean z10) {
        tg1 tg1Var = this.V;
        qg0 qg0Var = (qg0) tg1Var;
        boolean z11 = !z10;
        if (qg0Var.F != null) {
            float positionAnimated = qg0Var.f42051c.getPositionAnimated();
            qg0Var.n0(positionAnimated, z11);
            if (!z10) {
                qg0Var.m0(Math.round(positionAnimated), true);
            }
        }
        qg0Var.h0();
        qg0Var.d0();
        qg0Var.f42050b.invalidate();
        tg1Var.U();
        tg1Var.checkSystemBarColors();
    }
}
