package yh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.p40;
public final class c3 extends FrameLayout {
    public final int[] f51181a;
    public final d3 f51182b;

    public c3(d3 d3Var, Context context) {
        super(context);
        this.f51182b = d3Var;
        this.f51181a = new int[2];
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        FrameLayout frameLayout;
        super.onLayout(z10, i10, i11, i12, i13);
        d3 d3Var = this.f51182b;
        p40 p40Var = d3Var.f51218i;
        if (p40Var != null && p40Var.d.getChildCount() >= 2 && d3Var.f51227r != null && (frameLayout = d3Var.f51222m) != null) {
            int[] iArr = this.f51181a;
            frameLayout.getLocationInWindow(iArr);
            float translationX = iArr[0] - d3Var.f51222m.getTranslationX();
            float translationY = iArr[1] - d3Var.f51222m.getTranslationY();
            View childAt = p40Var.d.getChildAt(1);
            childAt.getLocationInWindow(iArr);
            float translationY2 = iArr[1] - childAt.getTranslationY();
            ci.e4 e4Var = d3Var.f51227r;
            e4Var.setTranslationY(((translationY2 - translationY) - e4Var.getMeasuredHeight()) - p40Var.getMeasuredHeight());
            d3Var.f51227r.m(0.0f, ((childAt.getMeasuredWidth() / 2.0f) + ((iArr[0] - childAt.getTranslationX()) - translationX)) - AndroidUtilities.dp(12.0f));
        }
    }
}
