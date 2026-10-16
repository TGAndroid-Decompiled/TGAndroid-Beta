package zh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.y40;
public final class w2 extends FrameLayout {
    public final int[] f51267a;
    public final x2 f51268b;

    public w2(x2 x2Var, Context context) {
        super(context);
        this.f51268b = x2Var;
        this.f51267a = new int[2];
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        FrameLayout frameLayout;
        super.onLayout(z10, i10, i11, i12, i13);
        x2 x2Var = this.f51268b;
        y40 y40Var = x2Var.f51297i;
        if (y40Var != null && y40Var.d.getChildCount() >= 2 && x2Var.f51306r != null && (frameLayout = x2Var.f51301m) != null) {
            int[] iArr = this.f51267a;
            frameLayout.getLocationInWindow(iArr);
            float translationX = iArr[0] - x2Var.f51301m.getTranslationX();
            float translationY = iArr[1] - x2Var.f51301m.getTranslationY();
            View childAt = y40Var.d.getChildAt(1);
            childAt.getLocationInWindow(iArr);
            float translationY2 = iArr[1] - childAt.getTranslationY();
            di.d4 d4Var = x2Var.f51306r;
            d4Var.setTranslationY(((translationY2 - translationY) - d4Var.getMeasuredHeight()) - y40Var.getMeasuredHeight());
            x2Var.f51306r.m(0.0f, ((childAt.getMeasuredWidth() / 2.0f) + ((iArr[0] - childAt.getTranslationX()) - translationX)) - AndroidUtilities.dp(12.0f));
        }
    }
}
