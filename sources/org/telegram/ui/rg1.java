package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

public final class rg1 extends org.telegram.ui.Components.p71 {
    public boolean P;
    public final Path Q;
    public final sg1 R;

    public rg1(sg1 sg1Var, Context context) {
        super(context, null);
        this.R = sg1Var;
        this.Q = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.P) {
            Path path = this.Q;
            path.rewind();
            float fDpf2 = AndroidUtilities.dpf2(24.0f);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, AndroidUtilities.statusBarHeight, getWidth(), getHeight());
            path.addRoundRect(rectF, fDpf2, fDpf2, Path.Direction.CW);
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
        Object objX = ((qg0) this.R).X();
        if (objX instanceof pg0) {
            return ((pg0) objX).S(motionEvent, false);
        }
        return false;
    }

    @Override
    public final boolean k(MotionEvent motionEvent) {
        Object objX = ((qg0) this.R).X();
        if (objX instanceof pg0) {
            return ((pg0) objX).S(motionEvent, true);
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
        gy gyVar;
        sg1 sg1Var = this.R;
        qg0 qg0Var = (qg0) sg1Var;
        if (qg0Var.B != null) {
            qg0Var.m0(qg0Var.f42640c.getCurrentPosition(), true);
            qg0Var.n0(0.0f, false);
        }
        qg0Var.d0();
        rg1 rg1Var = qg0Var.f42640c;
        if (rg1Var != null) {
            int currentPosition = rg1Var.getCurrentPosition();
            if (currentPosition != 2 && qg0Var.f41657x) {
                qg0Var.W(2);
                qg0Var.f41657x = false;
            }
            if (currentPosition != 3) {
                qg0Var.W(3);
            }
            Integer num = qg0Var.E;
            if (num != null && currentPosition == 0 && (gyVar = qg0Var.F) != null) {
                gyVar.w4(num.intValue());
                qg0Var.E = null;
            }
        }
        sg1Var.U();
    }

    @Override
    public final void w(boolean z10) {
        sg1 sg1Var = this.R;
        qg0 qg0Var = (qg0) sg1Var;
        boolean z11 = !z10;
        if (qg0Var.B != null) {
            float positionAnimated = qg0Var.f42640c.getPositionAnimated();
            qg0Var.n0(positionAnimated, z11);
            if (!z10) {
                qg0Var.m0(Math.round(positionAnimated), true);
            }
        }
        qg0Var.h0();
        qg0Var.d0();
        qg0Var.f42639b.invalidate();
        sg1Var.U();
        sg1Var.checkSystemBarColors();
    }
}
