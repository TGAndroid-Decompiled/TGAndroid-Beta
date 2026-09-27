package yh;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.as0;
import org.telegram.ui.Components.y81;
public final class g2 extends y81 {
    public final x3 U;

    public g2(x3 x3Var, Context context) {
        super(context, null);
        this.U = x3Var;
    }

    @Override
    public final void F(View view, float f7) {
        int i10;
        View view2;
        xh.o2 o2Var;
        xh.o2 o2Var2;
        i2 i2Var;
        i2 i2Var2;
        i2 i2Var3;
        if (getMeasuredWidth() <= 0) {
            view.setTranslationX(f7);
            return;
        }
        float clamp = Utilities.clamp(f7 / getMeasuredWidth(), 1.0f, -1.0f);
        x3 x3Var = this.U;
        i10 = ((org.telegram.ui.ActionBar.g3) x3Var).backgroundPaddingLeft;
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
                o2Var = x3Var.f48279b0;
                if (o2Var != null && view2 == o2Var.Y && (i2Var3 = o2Var.f48283d0) != null) {
                    i2Var3.invalidate();
                }
                if (view2 == x3Var.Y && (i2Var2 = x3Var.f48283d0) != null) {
                    i2Var2.invalidate();
                }
                o2Var2 = x3Var.f48281c0;
                if (o2Var2 == null && view2 == o2Var2.Y && (i2Var = o2Var2.f48283d0) != null) {
                    i2Var.invalidate();
                    return;
                }
                return;
            }
        }
        view2 = null;
        o2Var = x3Var.f48279b0;
        if (o2Var != null) {
            i2Var3.invalidate();
        }
        if (view2 == x3Var.Y) {
            i2Var2.invalidate();
        }
        o2Var2 = x3Var.f48281c0;
        if (o2Var2 == null) {
        }
    }

    @Override
    public final void G() {
        super.G();
        int i10 = this.f30620b;
        x3 x3Var = this.U;
        boolean z10 = false;
        if (i10 != x3Var.L1(false)) {
            if (this.f30620b > x3Var.L1(false)) {
                z10 = true;
            }
            AndroidUtilities.runOnUIThread(new as0(16, this, z10));
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
