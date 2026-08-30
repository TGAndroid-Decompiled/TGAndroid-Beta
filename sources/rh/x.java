package rh;

import org.telegram.ui.ActionBar.f5;
public final class x extends f5 {
    public final a0 f43840p;

    public x(a0 a0Var) {
        this.f43840p = a0Var;
    }

    @Override
    public final void invalidateSelf() {
        super.invalidateSelf();
        this.f43840p.invalidate();
    }
}
