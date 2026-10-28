package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class vg1 extends org.telegram.ui.Components.v91 {
    public boolean V;
    public final Path W;
    public final wg1 f44350a0;

    public vg1(wg1 wg1Var, Context context) {
        super(context, null);
        this.f44350a0 = wg1Var;
        this.W = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.V) {
            Path path = this.W;
            path.rewind();
            float dpf2 = AndroidUtilities.dpf2(24.0f);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, AndroidUtilities.statusBarHeight, getWidth(), getHeight());
            path.addRoundRect(rectF, dpf2, dpf2, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
        }
        super.dispatchDraw(canvas);
        if (this.V) {
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
        org.telegram.ui.ActionBar.r2 X = ((rg0) this.f44350a0).X();
        if (!(X instanceof qg0)) {
            return false;
        }
        return ((qg0) X).T(motionEvent, false);
    }

    @Override
    public final boolean k(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.r2 X = ((rg0) this.f44350a0).X();
        if (X instanceof qg0) {
            return ((qg0) X).T(motionEvent, true);
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
        if (this.V == z10) {
            return;
        }
        this.V = z10;
        invalidate();
    }

    @Override
    public final void t(View view, View view2, int i10, int i11) {
        this.f44350a0.V();
    }

    @Override
    public final void u() {
        ey eyVar;
        wg1 wg1Var = this.f44350a0;
        rg0 rg0Var = (rg0) wg1Var;
        if (rg0Var.E != null) {
            rg0Var.j0(rg0Var.f45001c.getCurrentPosition(), true);
            rg0Var.k0(0.0f, false);
        }
        rg0Var.b0();
        vg1 vg1Var = rg0Var.f45001c;
        if (vg1Var != null) {
            int currentPosition = vg1Var.getCurrentPosition();
            if (currentPosition != 3) {
                SparseArray sparseArray = rg0Var.f44999a;
                ug1 ug1Var = (ug1) sparseArray.get(3);
                if (ug1Var != null) {
                    org.telegram.ui.ActionBar.r2 r2Var = ug1Var.f44021a;
                    if (ug1Var.f44023c) {
                        r2Var.onBecomeFullyHidden();
                    }
                    if (ug1Var.d) {
                        r2Var.onPause();
                    }
                    r2Var.onFragmentDestroy();
                    r2Var.setParentLayout(null);
                }
                sparseArray.remove(3);
            }
            Integer num = rg0Var.H;
            if (num != null && currentPosition == 0 && (eyVar = rg0Var.I) != null) {
                eyVar.E4(num.intValue());
                rg0Var.H = null;
            }
        }
        wg1Var.V();
    }

    @Override
    public final void w(boolean z10) {
        wg1 wg1Var = this.f44350a0;
        rg0 rg0Var = (rg0) wg1Var;
        boolean z11 = !z10;
        if (rg0Var.E != null) {
            float positionAnimated = rg0Var.f45001c.getPositionAnimated();
            rg0Var.k0(positionAnimated, z11);
            if (!z10) {
                rg0Var.j0(Math.round(positionAnimated), true);
            }
        }
        rg0Var.e0();
        rg0Var.b0();
        rg0Var.f45000b.invalidate();
        wg1Var.V();
        wg1Var.checkSystemBarColors();
    }
}
