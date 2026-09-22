package yh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.l40;
public final class d3 extends FrameLayout {
    public final int[] f47006a;
    public final e3 f47007b;

    public d3(e3 e3Var, Context context) {
        super(context);
        this.f47007b = e3Var;
        this.f47006a = new int[2];
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        FrameLayout frameLayout;
        super.onLayout(z10, i10, i11, i12, i13);
        e3 e3Var = this.f47007b;
        l40 l40Var = e3Var.f47049i;
        if (l40Var != null && l40Var.d.getChildCount() >= 2 && e3Var.f47058r != null && (frameLayout = e3Var.f47053m) != null) {
            int[] iArr = this.f47006a;
            frameLayout.getLocationInWindow(iArr);
            float translationX = iArr[0] - e3Var.f47053m.getTranslationX();
            float translationY = iArr[1] - e3Var.f47053m.getTranslationY();
            View childAt = l40Var.d.getChildAt(1);
            childAt.getLocationInWindow(iArr);
            float translationY2 = iArr[1] - childAt.getTranslationY();
            ci.f4 f4Var = e3Var.f47058r;
            f4Var.setTranslationY(((translationY2 - translationY) - f4Var.getMeasuredHeight()) - l40Var.getMeasuredHeight());
            e3Var.f47058r.m(0.0f, ((childAt.getMeasuredWidth() / 2.0f) + ((iArr[0] - childAt.getTranslationX()) - translationX)) - AndroidUtilities.dp(12.0f));
        }
    }
}
