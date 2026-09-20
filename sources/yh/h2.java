package yh;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ds0;
import org.telegram.ui.Components.x81;
public final class h2 extends x81 {
    public final y3 U;

    public h2(y3 y3Var, Context context) {
        super(context, null);
        this.U = y3Var;
    }

    @Override
    public final void F(View view, float f7) {
        int i10;
        View view2;
        xh.n2 n2Var;
        xh.n2 n2Var2;
        j2 j2Var;
        j2 j2Var2;
        j2 j2Var3;
        if (getMeasuredWidth() <= 0) {
            view.setTranslationX(f7);
            return;
        }
        float clamp = Utilities.clamp(f7 / getMeasuredWidth(), 1.0f, -1.0f);
        y3 y3Var = this.U;
        i10 = ((org.telegram.ui.ActionBar.f3) y3Var).backgroundPaddingLeft;
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
                n2Var = y3Var.f48301b0;
                if (n2Var != null && view2 == n2Var.Y && (j2Var3 = n2Var.f48305d0) != null) {
                    j2Var3.invalidate();
                }
                if (view2 == y3Var.Y && (j2Var2 = y3Var.f48305d0) != null) {
                    j2Var2.invalidate();
                }
                n2Var2 = y3Var.f48303c0;
                if (n2Var2 == null && view2 == n2Var2.Y && (j2Var = n2Var2.f48305d0) != null) {
                    j2Var.invalidate();
                    return;
                }
                return;
            }
        }
        view2 = null;
        n2Var = y3Var.f48301b0;
        if (n2Var != null) {
            j2Var3.invalidate();
        }
        if (view2 == y3Var.Y) {
            j2Var2.invalidate();
        }
        n2Var2 = y3Var.f48303c0;
        if (n2Var2 == null) {
        }
    }

    @Override
    public final void G() {
        super.G();
        int i10 = this.f30193b;
        y3 y3Var = this.U;
        boolean z10 = false;
        if (i10 != y3Var.L1(false)) {
            if (this.f30193b > y3Var.L1(false)) {
                z10 = true;
            }
            AndroidUtilities.runOnUIThread(new ds0(15, this, z10));
        }
    }

    @Override
    public final boolean i(MotionEvent motionEvent) {
        f4.d dVar = this.U.Y0;
        if (dVar != null && !dVar.c(0)) {
            return false;
        }
        return true;
    }
}
