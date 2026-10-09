package yh;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ds0;
import org.telegram.ui.Components.o91;
public final class d2 extends o91 {
    public final s3 T;

    public d2(s3 s3Var, Context context) {
        super(context, null);
        this.T = s3Var;
    }

    @Override
    public final void E(View view, float f7) {
        int i10;
        View view2;
        xh.n2 n2Var;
        xh.n2 n2Var2;
        f2 f2Var;
        f2 f2Var2;
        f2 f2Var3;
        if (getMeasuredWidth() <= 0) {
            view.setTranslationX(f7);
            return;
        }
        float clamp = Utilities.clamp(f7 / getMeasuredWidth(), 1.0f, -1.0f);
        s3 s3Var = this.T;
        i10 = ((org.telegram.ui.ActionBar.f3) s3Var).backgroundPaddingLeft;
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
                n2Var = s3Var.f53163c0;
                if (n2Var != null && view2 == n2Var.Y && (f2Var3 = n2Var.f53167e0) != null) {
                    f2Var3.invalidate();
                }
                if (view2 == s3Var.Y && (f2Var2 = s3Var.f53167e0) != null) {
                    f2Var2.invalidate();
                }
                n2Var2 = s3Var.f53165d0;
                if (n2Var2 == null && view2 == n2Var2.Y && (f2Var = n2Var2.f53167e0) != null) {
                    f2Var.invalidate();
                    return;
                }
                return;
            }
        }
        view2 = null;
        n2Var = s3Var.f53163c0;
        if (n2Var != null) {
            f2Var3.invalidate();
        }
        if (view2 == s3Var.Y) {
            f2Var2.invalidate();
        }
        n2Var2 = s3Var.f53165d0;
        if (n2Var2 == null) {
        }
    }

    @Override
    public final void F() {
        super.F();
        int i10 = this.f29427b;
        s3 s3Var = this.T;
        boolean z10 = false;
        if (i10 != s3Var.M1(false)) {
            if (this.f29427b > s3Var.M1(false)) {
                z10 = true;
            }
            AndroidUtilities.runOnUIThread(new ds0(18, this, z10));
        }
    }

    @Override
    public final boolean i(MotionEvent motionEvent) {
        f4.d dVar = this.T.Z0;
        if (dVar != null && !dVar.c(0)) {
            return false;
        }
        return true;
    }
}
