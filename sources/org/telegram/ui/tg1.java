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
public final class tg1 extends org.telegram.ui.Components.u91 {
    public boolean V;
    public final Path W;
    public final ug1 f43836a0;

    public tg1(ug1 ug1Var, Context context) {
        super(context, null);
        this.f43836a0 = ug1Var;
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
        org.telegram.ui.ActionBar.r2 X = ((pg0) this.f43836a0).X();
        if (!(X instanceof og0)) {
            return false;
        }
        return ((og0) X).T(motionEvent, false);
    }

    @Override
    public final boolean k(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.r2 X = ((pg0) this.f43836a0).X();
        if (X instanceof og0) {
            return ((og0) X).T(motionEvent, true);
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
        this.f43836a0.V();
    }

    @Override
    public final void u() {
        cy cyVar;
        ug1 ug1Var = this.f43836a0;
        pg0 pg0Var = (pg0) ug1Var;
        if (pg0Var.E != null) {
            pg0Var.j0(pg0Var.f44132c.getCurrentPosition(), true);
            pg0Var.k0(0.0f, false);
        }
        pg0Var.b0();
        tg1 tg1Var = pg0Var.f44132c;
        if (tg1Var != null) {
            int currentPosition = tg1Var.getCurrentPosition();
            if (currentPosition != 3) {
                SparseArray sparseArray = pg0Var.f44130a;
                sg1 sg1Var = (sg1) sparseArray.get(3);
                if (sg1Var != null) {
                    org.telegram.ui.ActionBar.r2 r2Var = sg1Var.f43502a;
                    if (sg1Var.f43504c) {
                        r2Var.onBecomeFullyHidden();
                    }
                    if (sg1Var.d) {
                        r2Var.onPause();
                    }
                    r2Var.onFragmentDestroy();
                    r2Var.setParentLayout(null);
                }
                sparseArray.remove(3);
            }
            Integer num = pg0Var.H;
            if (num != null && currentPosition == 0 && (cyVar = pg0Var.I) != null) {
                cyVar.E4(num.intValue());
                pg0Var.H = null;
            }
        }
        ug1Var.V();
    }

    @Override
    public final void w(boolean z10) {
        ug1 ug1Var = this.f43836a0;
        pg0 pg0Var = (pg0) ug1Var;
        boolean z11 = !z10;
        if (pg0Var.E != null) {
            float positionAnimated = pg0Var.f44132c.getPositionAnimated();
            pg0Var.k0(positionAnimated, z11);
            if (!z10) {
                pg0Var.j0(Math.round(positionAnimated), true);
            }
        }
        pg0Var.e0();
        pg0Var.b0();
        pg0Var.f44131b.invalidate();
        ug1Var.V();
        ug1Var.checkSystemBarColors();
    }
}
