package yh;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.i81;
import org.telegram.ui.Components.sr0;
public final class j2 extends i81 {
    public final a4 T;

    public j2(a4 a4Var, Context context) {
        super(context, null);
        this.T = a4Var;
    }

    @Override
    public final void E(View view, float f7) {
        int i10;
        View view2;
        xh.m2 m2Var;
        xh.m2 m2Var2;
        l2 l2Var;
        l2 l2Var2;
        l2 l2Var3;
        if (getMeasuredWidth() <= 0) {
            view.setTranslationX(f7);
            return;
        }
        float clamp = Utilities.clamp(f7 / getMeasuredWidth(), 1.0f, -1.0f);
        a4 a4Var = this.T;
        i10 = ((org.telegram.ui.ActionBar.f3) a4Var).backgroundPaddingLeft;
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
                m2Var = a4Var.f46947b0;
                if (m2Var != null && view2 == m2Var.Y && (l2Var3 = m2Var.f46951d0) != null) {
                    l2Var3.invalidate();
                }
                if (view2 == a4Var.Y && (l2Var2 = a4Var.f46951d0) != null) {
                    l2Var2.invalidate();
                }
                m2Var2 = a4Var.f46949c0;
                if (m2Var2 == null && view2 == m2Var2.Y && (l2Var = m2Var2.f46951d0) != null) {
                    l2Var.invalidate();
                    return;
                }
                return;
            }
        }
        view2 = null;
        m2Var = a4Var.f46947b0;
        if (m2Var != null) {
            l2Var3.invalidate();
        }
        if (view2 == a4Var.Y) {
            l2Var2.invalidate();
        }
        m2Var2 = a4Var.f46949c0;
        if (m2Var2 == null) {
        }
    }

    @Override
    public final void F() {
        super.F();
        int i10 = this.f24957b;
        a4 a4Var = this.T;
        boolean z10 = false;
        if (i10 != a4Var.L1(false)) {
            if (this.f24957b > a4Var.L1(false)) {
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
