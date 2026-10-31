package rh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.Components.t30;
public final class f3 extends FrameLayout {
    public final int[] f46895a;
    public final g3 f46896b;

    public f3(g3 g3Var, Context context) {
        super(context);
        this.f46896b = g3Var;
        this.f46895a = new int[2];
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        FrameLayout frameLayout;
        super.onLayout(z10, i10, i11, i12, i13);
        g3 g3Var = this.f46896b;
        t30 t30Var = g3Var.f46943i;
        if (t30Var != null && t30Var.d.getChildCount() >= 2 && g3Var.f46952r != null && (frameLayout = g3Var.f46947m) != null) {
            int[] iArr = this.f46895a;
            frameLayout.getLocationInWindow(iArr);
            float translationX = iArr[0] - g3Var.f46947m.getTranslationX();
            float translationY = iArr[1] - g3Var.f46947m.getTranslationY();
            View childAt = t30Var.d.getChildAt(1);
            childAt.getLocationInWindow(iArr);
            float translationY2 = iArr[1] - childAt.getTranslationY();
            vh.p2 p2Var = g3Var.f46952r;
            p2Var.setTranslationY(((translationY2 - translationY) - p2Var.getMeasuredHeight()) - t30Var.getMeasuredHeight());
            g3Var.f46952r.m(0.0f, ((childAt.getMeasuredWidth() / 2.0f) + ((iArr[0] - childAt.getTranslationX()) - translationX)) - org.telegram.messenger.i0.L(12.0f));
        }
    }
}
