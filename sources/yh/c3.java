package yh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.l40;
public final class c3 extends FrameLayout {
    public final int[] f47293a;
    public final d3 f47294b;

    public c3(d3 d3Var, Context context) {
        super(context);
        this.f47294b = d3Var;
        this.f47293a = new int[2];
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        FrameLayout frameLayout;
        super.onLayout(z10, i10, i11, i12, i13);
        d3 d3Var = this.f47294b;
        l40 l40Var = d3Var.f47329i;
        if (l40Var != null && l40Var.d.getChildCount() >= 2 && d3Var.f47338r != null && (frameLayout = d3Var.f47333m) != null) {
            int[] iArr = this.f47293a;
            frameLayout.getLocationInWindow(iArr);
            float translationX = iArr[0] - d3Var.f47333m.getTranslationX();
            float translationY = iArr[1] - d3Var.f47333m.getTranslationY();
            View childAt = l40Var.d.getChildAt(1);
            childAt.getLocationInWindow(iArr);
            float translationY2 = iArr[1] - childAt.getTranslationY();
            ci.f4 f4Var = d3Var.f47338r;
            f4Var.setTranslationY(((translationY2 - translationY) - f4Var.getMeasuredHeight()) - l40Var.getMeasuredHeight());
            d3Var.f47338r.m(0.0f, ((childAt.getMeasuredWidth() / 2.0f) + ((iArr[0] - childAt.getTranslationX()) - translationX)) - AndroidUtilities.dp(12.0f));
        }
    }
}
