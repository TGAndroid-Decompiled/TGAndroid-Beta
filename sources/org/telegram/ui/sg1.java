package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class sg1 extends org.telegram.ui.Components.n71 {
    public boolean P;
    public final Path Q;
    public final tg1 R;

    public sg1(tg1 tg1Var, Context context) {
        super(context, null);
        this.R = tg1Var;
        this.Q = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.P) {
            Path path = this.Q;
            path.rewind();
            float dpf2 = AndroidUtilities.dpf2(24.0f);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, AndroidUtilities.statusBarHeight, getWidth(), getHeight());
            path.addRoundRect(rectF, dpf2, dpf2, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
        }
        super.dispatchDraw(canvas);
        if (this.P) {
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
        org.telegram.ui.ActionBar.o2 W = ((ng0) this.R).W();
        if (!(W instanceof mg0)) {
            return false;
        }
        return ((mg0) W).R(motionEvent, false);
    }

    @Override
    public final boolean k(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.o2 W = ((ng0) this.R).W();
        if (W instanceof mg0) {
            return ((mg0) W).R(motionEvent, true);
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
    }

    @Override
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
    }

    public void setTabletLayout(boolean z10) {
        if (this.P == z10) {
            return;
        }
        this.P = z10;
        invalidate();
    }

    @Override
    public final void t(View view, View view2, int i9, int i10) {
        this.R.T();
    }

    @Override
    public final void u() {
        dy dyVar;
        tg1 tg1Var = this.R;
        ng0 ng0Var = (ng0) tg1Var;
        if (ng0Var.B != null) {
            ng0Var.l0(ng0Var.f42999c.getCurrentPosition(), true);
            ng0Var.m0(0.0f, false);
        }
        ng0Var.c0();
        sg1 sg1Var = ng0Var.f42999c;
        if (sg1Var != null) {
            int currentPosition = sg1Var.getCurrentPosition();
            if (currentPosition != 2 && ng0Var.f40723x) {
                ng0Var.V(2);
                ng0Var.f40723x = false;
            }
            if (currentPosition != 3) {
                ng0Var.V(3);
            }
            Integer num = ng0Var.E;
            if (num != null && currentPosition == 0 && (dyVar = ng0Var.F) != null) {
                dyVar.w4(num.intValue());
                ng0Var.E = null;
            }
        }
        tg1Var.T();
    }

    @Override
    public final void w(boolean z10) {
        tg1 tg1Var = this.R;
        ng0 ng0Var = (ng0) tg1Var;
        boolean z11 = !z10;
        if (ng0Var.B != null) {
            float positionAnimated = ng0Var.f42999c.getPositionAnimated();
            ng0Var.m0(positionAnimated, z11);
            if (!z10) {
                ng0Var.l0(Math.round(positionAnimated), true);
            }
        }
        ng0Var.g0();
        ng0Var.c0();
        ng0Var.f42998b.invalidate();
        tg1Var.T();
        tg1Var.checkSystemBarColors();
    }
}
