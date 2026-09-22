package yh;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.i81;
import org.telegram.ui.Components.sr0;
public final class i2 extends i81 {
    public final z3 T;

    public i2(z3 z3Var, Context context) {
        super(context, null);
        this.T = z3Var;
    }

    @Override
    public final void E(View view, float f7) {
        int i10;
        View view2;
        xh.m2 m2Var;
        xh.m2 m2Var2;
        k2 k2Var;
        k2 k2Var2;
        k2 k2Var3;
        if (getMeasuredWidth() <= 0) {
            view.setTranslationX(f7);
            return;
        }
        float clamp = Utilities.clamp(f7 / getMeasuredWidth(), 1.0f, -1.0f);
        z3 z3Var = this.T;
        i10 = ((org.telegram.ui.ActionBar.f3) z3Var).backgroundPaddingLeft;
        view.setTranslationX(((-clamp) * 2.0f * i10) + f7);
        float f10 = 0.0f;
        if (clamp <= 0.0f) {
            f10 = view.getMeasuredWidth();
        }
        view.setPivotX(f10);
        view.setCameraDistance(view.getMeasuredHeight() * 3.4f);
        view.setScaleX(1.0f - Math.abs(0.25f * clamp));
        view.setRotationY(clamp * 10.0f);
        if (view instanceof FrameLayout) {
            FrameLayout frameLayout = (FrameLayout) view;
            if (frameLayout.getChildCount() > 0) {
                view2 = frameLayout.getChildAt(0);
                m2Var = z3Var.f48013b0;
                if (m2Var != null && view2 == m2Var.Y && (k2Var3 = m2Var.f48017d0) != null) {
                    k2Var3.invalidate();
                }
                if (view2 == z3Var.Y && (k2Var2 = z3Var.f48017d0) != null) {
                    k2Var2.invalidate();
                }
                m2Var2 = z3Var.f48015c0;
                if (m2Var2 == null && view2 == m2Var2.Y && (k2Var = m2Var2.f48017d0) != null) {
                    k2Var.invalidate();
                    return;
                }
                return;
            }
        }
        view2 = null;
        m2Var = z3Var.f48013b0;
        if (m2Var != null) {
            k2Var3.invalidate();
        }
        if (view2 == z3Var.Y) {
            k2Var2.invalidate();
        }
        m2Var2 = z3Var.f48015c0;
        if (m2Var2 == null) {
        }
    }

    @Override
    public final void F() {
        super.F();
        int i10 = this.f24963b;
        z3 z3Var = this.T;
        boolean z10 = false;
        if (i10 != z3Var.L1(false)) {
            if (this.f24963b > z3Var.L1(false)) {
                z10 = true;
            }
            AndroidUtilities.runOnUIThread(new sr0(15, this, z10));
        }
    }

    @Override
    public final boolean i(MotionEvent motionEvent) {
        f4.d dVar = this.T.Y0;
        if (dVar != null && !dVar.c(0)) {
            return false;
        }
        return true;
    }
}
