package zh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.l40;
public final class b3 extends FrameLayout {
    public final int[] f51740a;
    public final c3 f51741b;

    public b3(c3 c3Var, Context context) {
        super(context);
        this.f51741b = c3Var;
        this.f51740a = new int[2];
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        FrameLayout frameLayout;
        super.onLayout(z10, i10, i11, i12, i13);
        c3 c3Var = this.f51741b;
        l40 l40Var = c3Var.f51772i;
        if (l40Var != null && l40Var.d.getChildCount() >= 2 && c3Var.f51781r != null && (frameLayout = c3Var.f51776m) != null) {
            int[] iArr = this.f51740a;
            frameLayout.getLocationInWindow(iArr);
            float translationX = iArr[0] - c3Var.f51776m.getTranslationX();
            float translationY = iArr[1] - c3Var.f51776m.getTranslationY();
            View childAt = l40Var.d.getChildAt(1);
            childAt.getLocationInWindow(iArr);
            float translationY2 = iArr[1] - childAt.getTranslationY();
            di.f4 f4Var = c3Var.f51781r;
            f4Var.setTranslationY(((translationY2 - translationY) - f4Var.getMeasuredHeight()) - l40Var.getMeasuredHeight());
            c3Var.f51781r.m(0.0f, ((childAt.getMeasuredWidth() / 2.0f) + ((iArr[0] - childAt.getTranslationX()) - translationX)) - AndroidUtilities.dp(12.0f));
        }
    }
}
