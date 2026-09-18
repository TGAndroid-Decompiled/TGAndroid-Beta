package yh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.l40;
public final class e3 extends FrameLayout {
    public final int[] f47134a;
    public final f3 f47135b;

    public e3(f3 f3Var, Context context) {
        super(context);
        this.f47135b = f3Var;
        this.f47134a = new int[2];
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        FrameLayout frameLayout;
        super.onLayout(z10, i10, i11, i12, i13);
        f3 f3Var = this.f47135b;
        l40 l40Var = f3Var.f47179i;
        if (l40Var != null && l40Var.d.getChildCount() >= 2 && f3Var.f47188r != null && (frameLayout = f3Var.f47183m) != null) {
            int[] iArr = this.f47134a;
            frameLayout.getLocationInWindow(iArr);
            float translationX = iArr[0] - f3Var.f47183m.getTranslationX();
            float translationY = iArr[1] - f3Var.f47183m.getTranslationY();
            View childAt = l40Var.d.getChildAt(1);
            childAt.getLocationInWindow(iArr);
            float translationY2 = iArr[1] - childAt.getTranslationY();
            ci.f4 f4Var = f3Var.f47188r;
            f4Var.setTranslationY(((translationY2 - translationY) - f4Var.getMeasuredHeight()) - l40Var.getMeasuredHeight());
            f3Var.f47188r.m(0.0f, ((childAt.getMeasuredWidth() / 2.0f) + ((iArr[0] - childAt.getTranslationX()) - translationX)) - AndroidUtilities.dp(12.0f));
        }
    }
}
