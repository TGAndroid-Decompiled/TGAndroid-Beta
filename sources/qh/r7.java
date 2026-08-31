package qh;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class r7 extends a8 {
    public final x7 I;

    public r7(x7 x7Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, p7 p7Var) {
        super(context, g6Var, p7Var);
        this.I = x7Var;
    }

    @Override
    public final void setContainerHeight(float f10) {
        int paddingTop;
        super.setContainerHeight(f10);
        x7 x7Var = this.I;
        org.telegram.ui.Cells.u3 u3Var = x7Var.f46299y;
        float y10 = getY();
        FrameLayout frameLayout = x7Var.f46292e;
        if (frameLayout == null) {
            paddingTop = 0;
        } else {
            paddingTop = frameLayout.getPaddingTop();
        }
        u3Var.setTranslationY((Math.min(AndroidUtilities.dp(150.0f), this.F) + (y10 - paddingTop)) - 1.0f);
        FrameLayout frameLayout2 = x7Var.f46292e;
        if (frameLayout2 != null) {
            frameLayout2.invalidate();
        }
    }

    @Override
    public final void setTranslationY(float f10) {
        int paddingTop;
        super.setTranslationY(f10);
        x7 x7Var = this.I;
        org.telegram.ui.Cells.u3 u3Var = x7Var.f46299y;
        float y10 = getY();
        FrameLayout frameLayout = x7Var.f46292e;
        if (frameLayout == null) {
            paddingTop = 0;
        } else {
            paddingTop = frameLayout.getPaddingTop();
        }
        u3Var.setTranslationY((Math.min(AndroidUtilities.dp(150.0f), this.F) + (y10 - paddingTop)) - 1.0f);
        FrameLayout frameLayout2 = x7Var.f46292e;
        if (frameLayout2 != null) {
            frameLayout2.invalidate();
        }
    }
}
