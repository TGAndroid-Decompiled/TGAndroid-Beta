package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class sh1 extends org.telegram.ui.Components.w81 {
    public boolean T;
    public final Path U;
    public final th1 V;

    public sh1(th1 th1Var, Context context) {
        super(context, null);
        this.V = th1Var;
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
        org.telegram.ui.ActionBar.m2 X = ((yg0) this.V).X();
        if (!(X instanceof xg0)) {
            return false;
        }
        return ((xg0) X).S(motionEvent, false);
    }

    @Override
    public final boolean k(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.m2 X = ((yg0) this.V).X();
        if (X instanceof xg0) {
            return ((xg0) X).S(motionEvent, true);
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
        qy qyVar;
        th1 th1Var = this.V;
        yg0 yg0Var = (yg0) th1Var;
        if (yg0Var.F != null) {
            yg0Var.m0(yg0Var.f38109c.getCurrentPosition(), true);
            yg0Var.n0(0.0f, false);
        }
        yg0Var.d0();
        sh1 sh1Var = yg0Var.f38109c;
        if (sh1Var != null) {
            int currentPosition = sh1Var.getCurrentPosition();
            if (currentPosition != 2 && yg0Var.f40132x) {
                yg0Var.W(2);
                yg0Var.f40132x = false;
            }
            if (currentPosition != 3) {
                yg0Var.W(3);
            }
            Integer num = yg0Var.I;
            if (num != null && currentPosition == 0 && (qyVar = yg0Var.J) != null) {
                qyVar.w4(num.intValue());
                yg0Var.I = null;
            }
        }
        th1Var.U();
    }

    @Override
    public final void w(boolean z10) {
        th1 th1Var = this.V;
        yg0 yg0Var = (yg0) th1Var;
        boolean z11 = !z10;
        if (yg0Var.F != null) {
            float positionAnimated = yg0Var.f38109c.getPositionAnimated();
            yg0Var.n0(positionAnimated, z11);
            if (!z10) {
                yg0Var.m0(Math.round(positionAnimated), true);
            }
        }
        yg0Var.h0();
        yg0Var.d0();
        yg0Var.f38108b.invalidate();
        th1Var.U();
        th1Var.checkSystemBarColors();
    }
}
