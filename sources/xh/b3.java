package xh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.v40;
public final class b3 extends FrameLayout {
    public final int[] f45264a;
    public final c3 f45265b;

    public b3(c3 c3Var, Context context) {
        super(context);
        this.f45265b = c3Var;
        this.f45264a = new int[2];
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        FrameLayout frameLayout;
        super.onLayout(z10, i10, i11, i12, i13);
        c3 c3Var = this.f45265b;
        v40 v40Var = c3Var.f45304i;
        if (v40Var != null && v40Var.d.getChildCount() >= 2 && c3Var.f45313r != null && (frameLayout = c3Var.f45308m) != null) {
            int[] iArr = this.f45264a;
            frameLayout.getLocationInWindow(iArr);
            float translationX = iArr[0] - c3Var.f45308m.getTranslationX();
            float translationY = iArr[1] - c3Var.f45308m.getTranslationY();
            View childAt = v40Var.d.getChildAt(1);
            childAt.getLocationInWindow(iArr);
            float translationY2 = iArr[1] - childAt.getTranslationY();
            bi.x4 x4Var = c3Var.f45313r;
            x4Var.setTranslationY(((translationY2 - translationY) - x4Var.getMeasuredHeight()) - v40Var.getMeasuredHeight());
            c3Var.f45313r.m(0.0f, ((childAt.getMeasuredWidth() / 2.0f) + ((iArr[0] - childAt.getTranslationX()) - translationX)) - AndroidUtilities.dp(12.0f));
        }
    }
}
