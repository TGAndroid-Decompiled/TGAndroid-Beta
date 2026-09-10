package xh;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.bs0;
import org.telegram.ui.Components.v81;
public final class h2 extends v81 {
    public final x3 T;

    public h2(x3 x3Var, Context context) {
        super(context, null);
        this.T = x3Var;
    }

    @Override
    public final void E(View view, float f7) {
        int i10;
        View view2;
        wh.l2 l2Var;
        wh.l2 l2Var2;
        j2 j2Var;
        j2 j2Var2;
        j2 j2Var3;
        if (getMeasuredWidth() <= 0) {
            view.setTranslationX(f7);
            return;
        }
        float clamp = Utilities.clamp(f7 / getMeasuredWidth(), 1.0f, -1.0f);
        x3 x3Var = this.T;
        i10 = ((org.telegram.ui.ActionBar.h3) x3Var).backgroundPaddingLeft;
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
                l2Var = x3Var.f46269b0;
                if (l2Var != null && view2 == l2Var.Y && (j2Var3 = l2Var.f46273d0) != null) {
                    j2Var3.invalidate();
                }
                if (view2 == x3Var.Y && (j2Var2 = x3Var.f46273d0) != null) {
                    j2Var2.invalidate();
                }
                l2Var2 = x3Var.f46271c0;
                if (l2Var2 == null && view2 == l2Var2.Y && (j2Var = l2Var2.f46273d0) != null) {
                    j2Var.invalidate();
                    return;
                }
                return;
            }
        }
        view2 = null;
        l2Var = x3Var.f46269b0;
        if (l2Var != null) {
            j2Var3.invalidate();
        }
        if (view2 == x3Var.Y) {
            j2Var2.invalidate();
        }
        l2Var2 = x3Var.f46271c0;
        if (l2Var2 == null) {
        }
    }

    @Override
    public final void F() {
        super.F();
        int i10 = this.f27886b;
        x3 x3Var = this.T;
        boolean z10 = false;
        if (i10 != x3Var.L1(false)) {
            if (this.f27886b > x3Var.L1(false)) {
                z10 = true;
            }
            AndroidUtilities.runOnUIThread(new bs0(15, this, z10));
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
