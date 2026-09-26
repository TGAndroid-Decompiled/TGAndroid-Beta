package yh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.n40;
public final class b3 extends FrameLayout {
    public final int[] f47223a;
    public final c3 f47224b;

    public b3(c3 c3Var, Context context) {
        super(context);
        this.f47224b = c3Var;
        this.f47223a = new int[2];
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        FrameLayout frameLayout;
        super.onLayout(z10, i10, i11, i12, i13);
        c3 c3Var = this.f47224b;
        n40 n40Var = c3Var.f47258i;
        if (n40Var != null && n40Var.d.getChildCount() >= 2 && c3Var.f47267r != null && (frameLayout = c3Var.f47262m) != null) {
            int[] iArr = this.f47223a;
            frameLayout.getLocationInWindow(iArr);
            float translationX = iArr[0] - c3Var.f47262m.getTranslationX();
            float translationY = iArr[1] - c3Var.f47262m.getTranslationY();
            View childAt = n40Var.d.getChildAt(1);
            childAt.getLocationInWindow(iArr);
            float translationY2 = iArr[1] - childAt.getTranslationY();
            ci.e4 e4Var = c3Var.f47267r;
            e4Var.setTranslationY(((translationY2 - translationY) - e4Var.getMeasuredHeight()) - n40Var.getMeasuredHeight());
            c3Var.f47267r.m(0.0f, ((childAt.getMeasuredWidth() / 2.0f) + ((iArr[0] - childAt.getTranslationX()) - translationX)) - AndroidUtilities.dp(12.0f));
        }
    }
}
