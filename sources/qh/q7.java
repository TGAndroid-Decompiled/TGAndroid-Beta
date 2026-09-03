package qh;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class q7 extends z7 {
    public final w7 I;

    public q7(w7 w7Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, o7 o7Var) {
        super(context, g6Var, o7Var);
        this.I = w7Var;
    }

    @Override
    public final void setContainerHeight(float f10) {
        int paddingTop;
        super.setContainerHeight(f10);
        w7 w7Var = this.I;
        org.telegram.ui.Cells.u3 u3Var = w7Var.f46272y;
        float y10 = getY();
        FrameLayout frameLayout = w7Var.f46265e;
        if (frameLayout == null) {
            paddingTop = 0;
        } else {
            paddingTop = frameLayout.getPaddingTop();
        }
        u3Var.setTranslationY((Math.min(AndroidUtilities.dp(150.0f), this.F) + (y10 - paddingTop)) - 1.0f);
        FrameLayout frameLayout2 = w7Var.f46265e;
        if (frameLayout2 != null) {
            frameLayout2.invalidate();
        }
    }

    @Override
    public final void setTranslationY(float f10) {
        int paddingTop;
        super.setTranslationY(f10);
        w7 w7Var = this.I;
        org.telegram.ui.Cells.u3 u3Var = w7Var.f46272y;
        float y10 = getY();
        FrameLayout frameLayout = w7Var.f46265e;
        if (frameLayout == null) {
            paddingTop = 0;
        } else {
            paddingTop = frameLayout.getPaddingTop();
        }
        u3Var.setTranslationY((Math.min(AndroidUtilities.dp(150.0f), this.F) + (y10 - paddingTop)) - 1.0f);
        FrameLayout frameLayout2 = w7Var.f46265e;
        if (frameLayout2 != null) {
            frameLayout2.invalidate();
        }
    }
}
