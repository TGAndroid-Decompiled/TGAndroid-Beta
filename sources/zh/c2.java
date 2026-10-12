package zh;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.k91;
import org.telegram.ui.Components.sn0;
public final class c2 extends k91 {
    public final r3 T;

    public c2(r3 r3Var, Context context) {
        super(context, null);
        this.T = r3Var;
    }

    @Override
    public final void E(View view, float f7) {
        int i10;
        View view2;
        yh.l2 l2Var;
        yh.l2 l2Var2;
        e2 e2Var;
        e2 e2Var2;
        e2 e2Var3;
        if (getMeasuredWidth() <= 0) {
            view.setTranslationX(f7);
            return;
        }
        float clamp = Utilities.clamp(f7 / getMeasuredWidth(), 1.0f, -1.0f);
        r3 r3Var = this.T;
        i10 = ((org.telegram.ui.ActionBar.e3) r3Var).backgroundPaddingLeft;
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
                l2Var = r3Var.f51072c0;
                if (l2Var != null && view2 == l2Var.Y && (e2Var3 = l2Var.f51076e0) != null) {
                    e2Var3.invalidate();
                }
                if (view2 == r3Var.Y && (e2Var2 = r3Var.f51076e0) != null) {
                    e2Var2.invalidate();
                }
                l2Var2 = r3Var.f51074d0;
                if (l2Var2 == null && view2 == l2Var2.Y && (e2Var = l2Var2.f51076e0) != null) {
                    e2Var.invalidate();
                    return;
                }
                return;
            }
        }
        view2 = null;
        l2Var = r3Var.f51072c0;
        if (l2Var != null) {
            e2Var3.invalidate();
        }
        if (view2 == r3Var.Y) {
            e2Var2.invalidate();
        }
        l2Var2 = r3Var.f51074d0;
        if (l2Var2 == null) {
        }
    }

    @Override
    public final void F() {
        super.F();
        int i10 = this.f26640b;
        r3 r3Var = this.T;
        boolean z10 = false;
        if (i10 != r3Var.M1(false)) {
            if (this.f26640b > r3Var.M1(false)) {
                z10 = true;
            }
            AndroidUtilities.runOnUIThread(new sn0(19, this, z10));
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
