package vh;

import android.content.Context;
import android.widget.FrameLayout;
public final class k6 extends t6 {
    public final r6 M;

    public k6(r6 r6Var, Context context, org.telegram.ui.ActionBar.p6 p6Var, i6 i6Var) {
        super(context, p6Var, i6Var);
        this.M = r6Var;
    }

    @Override
    public final void setContainerHeight(float f7) {
        int paddingTop;
        super.setContainerHeight(f7);
        r6 r6Var = this.M;
        org.telegram.ui.Cells.z3 z3Var = r6Var.D;
        float y3 = getY();
        FrameLayout frameLayout = r6Var.e;
        if (frameLayout == null) {
            paddingTop = 0;
        } else {
            paddingTop = frameLayout.getPaddingTop();
        }
        z3Var.setTranslationY((Math.min(org.telegram.messenger.i0.L(150.0f), this.J) + (y3 - paddingTop)) - 1.0f);
        FrameLayout frameLayout2 = r6Var.e;
        if (frameLayout2 != null) {
            frameLayout2.invalidate();
        }
    }

    @Override
    public final void setTranslationY(float f7) {
        int paddingTop;
        super.setTranslationY(f7);
        r6 r6Var = this.M;
        org.telegram.ui.Cells.z3 z3Var = r6Var.D;
        float y3 = getY();
        FrameLayout frameLayout = r6Var.e;
        if (frameLayout == null) {
            paddingTop = 0;
        } else {
            paddingTop = frameLayout.getPaddingTop();
        }
        z3Var.setTranslationY((Math.min(org.telegram.messenger.i0.L(150.0f), this.J) + (y3 - paddingTop)) - 1.0f);
        FrameLayout frameLayout2 = r6Var.e;
        if (frameLayout2 != null) {
            frameLayout2.invalidate();
        }
    }
}
