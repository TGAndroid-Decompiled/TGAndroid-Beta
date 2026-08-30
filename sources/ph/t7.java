package ph;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class t7 extends c8 {
    public final z7 I;

    public t7(z7 z7Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, r7 r7Var) {
        super(context, f6Var, r7Var);
        this.I = z7Var;
    }

    @Override
    public final void setContainerHeight(float f10) {
        int paddingTop;
        super.setContainerHeight(f10);
        z7 z7Var = this.I;
        org.telegram.ui.Cells.u3 u3Var = z7Var.f42669y;
        float y10 = getY();
        FrameLayout frameLayout = z7Var.e;
        if (frameLayout == null) {
            paddingTop = 0;
        } else {
            paddingTop = frameLayout.getPaddingTop();
        }
        u3Var.setTranslationY((Math.min(AndroidUtilities.dp(150.0f), this.F) + (y10 - paddingTop)) - 1.0f);
        FrameLayout frameLayout2 = z7Var.e;
        if (frameLayout2 != null) {
            frameLayout2.invalidate();
        }
    }

    @Override
    public final void setTranslationY(float f10) {
        int paddingTop;
        super.setTranslationY(f10);
        z7 z7Var = this.I;
        org.telegram.ui.Cells.u3 u3Var = z7Var.f42669y;
        float y10 = getY();
        FrameLayout frameLayout = z7Var.e;
        if (frameLayout == null) {
            paddingTop = 0;
        } else {
            paddingTop = frameLayout.getPaddingTop();
        }
        u3Var.setTranslationY((Math.min(AndroidUtilities.dp(150.0f), this.F) + (y10 - paddingTop)) - 1.0f);
        FrameLayout frameLayout2 = z7Var.e;
        if (frameLayout2 != null) {
            frameLayout2.invalidate();
        }
    }
}
