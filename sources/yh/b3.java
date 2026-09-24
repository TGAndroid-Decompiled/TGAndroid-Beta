package yh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.m40;
public final class b3 extends FrameLayout {
    public final int[] f47213a;
    public final c3 f47214b;

    public b3(c3 c3Var, Context context) {
        super(context);
        this.f47214b = c3Var;
        this.f47213a = new int[2];
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        FrameLayout frameLayout;
        super.onLayout(z10, i10, i11, i12, i13);
        c3 c3Var = this.f47214b;
        m40 m40Var = c3Var.f47248i;
        if (m40Var != null && m40Var.d.getChildCount() >= 2 && c3Var.f47257r != null && (frameLayout = c3Var.f47252m) != null) {
            int[] iArr = this.f47213a;
            frameLayout.getLocationInWindow(iArr);
            float translationX = iArr[0] - c3Var.f47252m.getTranslationX();
            float translationY = iArr[1] - c3Var.f47252m.getTranslationY();
            View childAt = m40Var.d.getChildAt(1);
            childAt.getLocationInWindow(iArr);
            float translationY2 = iArr[1] - childAt.getTranslationY();
            ci.e4 e4Var = c3Var.f47257r;
            e4Var.setTranslationY(((translationY2 - translationY) - e4Var.getMeasuredHeight()) - m40Var.getMeasuredHeight());
            c3Var.f47257r.m(0.0f, ((childAt.getMeasuredWidth() / 2.0f) + ((iArr[0] - childAt.getTranslationX()) - translationX)) - AndroidUtilities.dp(12.0f));
        }
    }
}
