package ph;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class s7 extends b8 {
    public final y7 I;

    public s7(y7 y7Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, q7 q7Var) {
        super(context, f6Var, q7Var);
        this.I = y7Var;
    }

    @Override
    public final void setContainerHeight(float f10) {
        int paddingTop;
        super.setContainerHeight(f10);
        y7 y7Var = this.I;
        org.telegram.ui.Cells.t3 t3Var = y7Var.f42667y;
        float y10 = getY();
        FrameLayout frameLayout = y7Var.e;
        if (frameLayout == null) {
            paddingTop = 0;
        } else {
            paddingTop = frameLayout.getPaddingTop();
        }
        t3Var.setTranslationY((Math.min(AndroidUtilities.dp(150.0f), this.F) + (y10 - paddingTop)) - 1.0f);
        FrameLayout frameLayout2 = y7Var.e;
        if (frameLayout2 != null) {
            frameLayout2.invalidate();
        }
    }

    @Override
    public final void setTranslationY(float f10) {
        int paddingTop;
        super.setTranslationY(f10);
        y7 y7Var = this.I;
        org.telegram.ui.Cells.t3 t3Var = y7Var.f42667y;
        float y10 = getY();
        FrameLayout frameLayout = y7Var.e;
        if (frameLayout == null) {
            paddingTop = 0;
        } else {
            paddingTop = frameLayout.getPaddingTop();
        }
        t3Var.setTranslationY((Math.min(AndroidUtilities.dp(150.0f), this.F) + (y10 - paddingTop)) - 1.0f);
        FrameLayout frameLayout2 = y7Var.e;
        if (frameLayout2 != null) {
            frameLayout2.invalidate();
        }
    }
}
