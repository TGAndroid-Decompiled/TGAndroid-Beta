package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class sh1 extends org.telegram.ui.Components.h81 {
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
        org.telegram.ui.ActionBar.n2 X = ((zg0) this.V).X();
        if (!(X instanceof yg0)) {
            return false;
        }
        return ((yg0) X).S(motionEvent, false);
    }

    @Override
    public final boolean k(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.n2 X = ((zg0) this.V).X();
        if (X instanceof yg0) {
            return ((yg0) X).S(motionEvent, true);
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
        ry ryVar;
        th1 th1Var = this.V;
        zg0 zg0Var = (zg0) th1Var;
        if (zg0Var.F != null) {
            zg0Var.m0(zg0Var.f37686c.getCurrentPosition(), true);
            zg0Var.n0(0.0f, false);
        }
        zg0Var.d0();
        sh1 sh1Var = zg0Var.f37686c;
        if (sh1Var != null) {
            int currentPosition = sh1Var.getCurrentPosition();
            if (currentPosition != 2 && zg0Var.f40125x) {
                zg0Var.W(2);
                zg0Var.f40125x = false;
            }
            if (currentPosition != 3) {
                zg0Var.W(3);
            }
            Integer num = zg0Var.I;
            if (num != null && currentPosition == 0 && (ryVar = zg0Var.J) != null) {
                ryVar.w4(num.intValue());
                zg0Var.I = null;
            }
        }
        th1Var.U();
    }

    @Override
    public final void w(boolean z10) {
        th1 th1Var = this.V;
        zg0 zg0Var = (zg0) th1Var;
        boolean z11 = !z10;
        if (zg0Var.F != null) {
            float positionAnimated = zg0Var.f37686c.getPositionAnimated();
            zg0Var.n0(positionAnimated, z11);
            if (!z10) {
                zg0Var.m0(Math.round(positionAnimated), true);
            }
        }
        zg0Var.h0();
        zg0Var.d0();
        zg0Var.f37685b.invalidate();
        th1Var.U();
        th1Var.checkSystemBarColors();
    }
}
