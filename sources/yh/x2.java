package yh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.f50;
public final class x2 extends FrameLayout {
    public final int[] f53591a;
    public final y2 f53592b;

    public x2(y2 y2Var, Context context) {
        super(context);
        this.f53592b = y2Var;
        this.f53591a = new int[2];
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        FrameLayout frameLayout;
        super.onLayout(z10, i10, i11, i12, i13);
        y2 y2Var = this.f53592b;
        f50 f50Var = y2Var.f53639i;
        if (f50Var != null && f50Var.d.getChildCount() >= 2 && y2Var.f53648r != null && (frameLayout = y2Var.f53643m) != null) {
            int[] iArr = this.f53591a;
            frameLayout.getLocationInWindow(iArr);
            float translationX = iArr[0] - y2Var.f53643m.getTranslationX();
            float translationY = iArr[1] - y2Var.f53643m.getTranslationY();
            View childAt = f50Var.d.getChildAt(1);
            childAt.getLocationInWindow(iArr);
            float translationY2 = iArr[1] - childAt.getTranslationY();
            ci.d4 d4Var = y2Var.f53648r;
            d4Var.setTranslationY(((translationY2 - translationY) - d4Var.getMeasuredHeight()) - f50Var.getMeasuredHeight());
            y2Var.f53648r.m(0.0f, ((childAt.getMeasuredWidth() / 2.0f) + ((iArr[0] - childAt.getTranslationX()) - translationX)) - AndroidUtilities.dp(12.0f));
        }
    }
}
