package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class sh1 extends org.telegram.ui.Components.g91 {
    public boolean U;
    public final Path V;
    public final th1 W;

    public sh1(th1 th1Var, Context context) {
        super(context, null);
        this.W = th1Var;
        this.V = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.U) {
            Path path = this.V;
            path.rewind();
            float dpf2 = AndroidUtilities.dpf2(24.0f);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, AndroidUtilities.statusBarHeight, getWidth(), getHeight());
            path.addRoundRect(rectF, dpf2, dpf2, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
        }
        super.dispatchDraw(canvas);
        if (this.U) {
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
        org.telegram.ui.ActionBar.n2 W = ((ch0) this.W).W();
        if (!(W instanceof bh0)) {
            return false;
        }
        return ((bh0) W).Q(motionEvent, false);
    }

    @Override
    public final boolean k(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.n2 W = ((ch0) this.W).W();
        if (W instanceof bh0) {
            return ((bh0) W).Q(motionEvent, true);
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
        if (this.U == z10) {
            return;
        }
        this.U = z10;
        invalidate();
    }

    @Override
    public final void t(View view, View view2, int i10, int i11) {
        this.W.S();
    }

    @Override
    public final void u() {
        uy uyVar;
        th1 th1Var = this.W;
        ch0 ch0Var = (ch0) th1Var;
        if (ch0Var.F != null) {
            ch0Var.m0(ch0Var.f40849c.getCurrentPosition(), true);
            ch0Var.n0(0.0f, false);
        }
        ch0Var.d0();
        sh1 sh1Var = ch0Var.f40849c;
        if (sh1Var != null) {
            int currentPosition = sh1Var.getCurrentPosition();
            if (currentPosition != 2 && ch0Var.f35470x) {
                ch0Var.U(2);
                ch0Var.f35470x = false;
            }
            if (currentPosition != 3) {
                ch0Var.U(3);
            }
            Integer num = ch0Var.I;
            if (num != null && currentPosition == 0 && (uyVar = ch0Var.J) != null) {
                uyVar.F4(num.intValue());
                ch0Var.I = null;
            }
        }
        th1Var.S();
    }

    @Override
    public final void w(boolean z10) {
        th1 th1Var = this.W;
        ch0 ch0Var = (ch0) th1Var;
        boolean z11 = !z10;
        if (ch0Var.F != null) {
            float positionAnimated = ch0Var.f40849c.getPositionAnimated();
            ch0Var.n0(positionAnimated, z11);
            if (!z10) {
                ch0Var.m0(Math.round(positionAnimated), true);
            }
        }
        ch0Var.h0();
        ch0Var.d0();
        ch0Var.f40848b.invalidate();
        th1Var.S();
        th1Var.checkSystemBarColors();
    }
}
