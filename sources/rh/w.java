package rh;

import org.telegram.ui.ActionBar.f5;
public final class w extends f5 {
    public final z f43892p;

    public w(z zVar) {
        this.f43892p = zVar;
    }

    @Override
    public final void invalidateSelf() {
        super.invalidateSelf();
        this.f43892p.invalidate();
    }
}
