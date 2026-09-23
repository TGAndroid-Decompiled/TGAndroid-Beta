package yh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.m40;
public final class c3 extends FrameLayout {
    public final int[] f46942a;
    public final d3 f46943b;

    public c3(d3 d3Var, Context context) {
        super(context);
        this.f46943b = d3Var;
        this.f46942a = new int[2];
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        FrameLayout frameLayout;
        super.onLayout(z10, i10, i11, i12, i13);
        d3 d3Var = this.f46943b;
        m40 m40Var = d3Var.f46976i;
        if (m40Var != null && m40Var.d.getChildCount() >= 2 && d3Var.f46985r != null && (frameLayout = d3Var.f46980m) != null) {
            int[] iArr = this.f46942a;
            frameLayout.getLocationInWindow(iArr);
            float translationX = iArr[0] - d3Var.f46980m.getTranslationX();
            float translationY = iArr[1] - d3Var.f46980m.getTranslationY();
            View childAt = m40Var.d.getChildAt(1);
            childAt.getLocationInWindow(iArr);
            float translationY2 = iArr[1] - childAt.getTranslationY();
            ci.e4 e4Var = d3Var.f46985r;
            e4Var.setTranslationY(((translationY2 - translationY) - e4Var.getMeasuredHeight()) - m40Var.getMeasuredHeight());
            d3Var.f46985r.m(0.0f, ((childAt.getMeasuredWidth() / 2.0f) + ((iArr[0] - childAt.getTranslationX()) - translationX)) - AndroidUtilities.dp(12.0f));
        }
    }
}
