package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class zh1 extends org.telegram.ui.Components.z81 {
    public boolean U;
    public final Path V;
    public final ai1 W;

    public zh1(ai1 ai1Var, Context context) {
        super(context, null);
        this.W = ai1Var;
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
        org.telegram.ui.ActionBar.n2 X = ((gh0) this.W).X();
        if (!(X instanceof fh0)) {
            return false;
        }
        return ((fh0) X).S(motionEvent, false);
    }

    @Override
    public final boolean k(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.n2 X = ((gh0) this.W).X();
        if (X instanceof fh0) {
            return ((fh0) X).S(motionEvent, true);
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
        this.W.U();
    }

    @Override
    public final void u() {
        uy uyVar;
        ai1 ai1Var = this.W;
        gh0 gh0Var = (gh0) ai1Var;
        if (gh0Var.F != null) {
            gh0Var.m0(gh0Var.f32123c.getCurrentPosition(), true);
            gh0Var.n0(0.0f, false);
        }
        gh0Var.d0();
        zh1 zh1Var = gh0Var.f32123c;
        if (zh1Var != null) {
            int currentPosition = zh1Var.getCurrentPosition();
            if (currentPosition != 2 && gh0Var.f33918x) {
                gh0Var.W(2);
                gh0Var.f33918x = false;
            }
            if (currentPosition != 3) {
                gh0Var.W(3);
            }
            Integer num = gh0Var.I;
            if (num != null && currentPosition == 0 && (uyVar = gh0Var.J) != null) {
                uyVar.w4(num.intValue());
                gh0Var.I = null;
            }
        }
        ai1Var.U();
    }

    @Override
    public final void w(boolean z10) {
        ai1 ai1Var = this.W;
        gh0 gh0Var = (gh0) ai1Var;
        boolean z11 = !z10;
        if (gh0Var.F != null) {
            float positionAnimated = gh0Var.f32123c.getPositionAnimated();
            gh0Var.n0(positionAnimated, z11);
            if (!z10) {
                gh0Var.m0(Math.round(positionAnimated), true);
            }
        }
        gh0Var.h0();
        gh0Var.d0();
        gh0Var.f32122b.invalidate();
        ai1Var.U();
        ai1Var.checkSystemBarColors();
    }
}
