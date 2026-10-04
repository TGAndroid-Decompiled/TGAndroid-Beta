package yh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.p40;
public final class b3 extends FrameLayout {
    public final int[] f51116a;
    public final c3 f51117b;

    public b3(c3 c3Var, Context context) {
        super(context);
        this.f51117b = c3Var;
        this.f51116a = new int[2];
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        FrameLayout frameLayout;
        super.onLayout(z10, i10, i11, i12, i13);
        c3 c3Var = this.f51117b;
        p40 p40Var = c3Var.f51155i;
        if (p40Var != null && p40Var.d.getChildCount() >= 2 && c3Var.f51164r != null && (frameLayout = c3Var.f51159m) != null) {
            int[] iArr = this.f51116a;
            frameLayout.getLocationInWindow(iArr);
            float translationX = iArr[0] - c3Var.f51159m.getTranslationX();
            float translationY = iArr[1] - c3Var.f51159m.getTranslationY();
            View childAt = p40Var.d.getChildAt(1);
            childAt.getLocationInWindow(iArr);
            float translationY2 = iArr[1] - childAt.getTranslationY();
            ci.e4 e4Var = c3Var.f51164r;
            e4Var.setTranslationY(((translationY2 - translationY) - e4Var.getMeasuredHeight()) - p40Var.getMeasuredHeight());
            c3Var.f51164r.m(0.0f, ((childAt.getMeasuredWidth() / 2.0f) + ((iArr[0] - childAt.getTranslationX()) - translationX)) - AndroidUtilities.dp(12.0f));
        }
    }
}
