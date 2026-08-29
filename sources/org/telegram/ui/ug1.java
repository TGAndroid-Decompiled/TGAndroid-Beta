package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class ug1 extends org.telegram.ui.Components.z71 {
    public boolean P;
    public final Path Q;
    public final vg1 R;

    public ug1(vg1 vg1Var, Context context) {
        super(context, null);
        this.R = vg1Var;
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
        org.telegram.ui.ActionBar.o2 X = ((ng0) this.R).X();
        if (!(X instanceof mg0)) {
            return false;
        }
        return ((mg0) X).S(motionEvent, false);
    }

    @Override
    public final boolean k(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.o2 X = ((ng0) this.R).X();
        if (X instanceof mg0) {
            return ((mg0) X).S(motionEvent, true);
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
        if (this.P == z10) {
            return;
        }
        this.P = z10;
        invalidate();
    }

    @Override
    public final void t(View view, View view2, int i10, int i11) {
        this.R.U();
    }

    @Override
    public final void u() {
        fy fyVar;
        vg1 vg1Var = this.R;
        ng0 ng0Var = (ng0) vg1Var;
        if (ng0Var.B != null) {
            ng0Var.m0(ng0Var.f43594c.getCurrentPosition(), true);
            ng0Var.n0(0.0f, false);
        }
        ng0Var.d0();
        ug1 ug1Var = ng0Var.f43594c;
        if (ug1Var != null) {
            int currentPosition = ug1Var.getCurrentPosition();
            if (currentPosition != 2 && ng0Var.f40798x) {
                ng0Var.W(2);
                ng0Var.f40798x = false;
            }
            if (currentPosition != 3) {
                ng0Var.W(3);
            }
            Integer num = ng0Var.E;
            if (num != null && currentPosition == 0 && (fyVar = ng0Var.F) != null) {
                fyVar.w4(num.intValue());
                ng0Var.E = null;
            }
        }
        vg1Var.U();
    }

    @Override
    public final void w(boolean z10) {
        vg1 vg1Var = this.R;
        ng0 ng0Var = (ng0) vg1Var;
        boolean z11 = !z10;
        if (ng0Var.B != null) {
            float positionAnimated = ng0Var.f43594c.getPositionAnimated();
            ng0Var.n0(positionAnimated, z11);
            if (!z10) {
                ng0Var.m0(Math.round(positionAnimated), true);
            }
        }
        ng0Var.h0();
        ng0Var.d0();
        ng0Var.f43593b.invalidate();
        vg1Var.U();
        vg1Var.checkSystemBarColors();
    }
}
