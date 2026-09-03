package sh;

import org.telegram.ui.ActionBar.g5;
public final class w extends g5 {
    public final z f47795p;

    public w(z zVar) {
        this.f47795p = zVar;
    }

    @Override
    public final void invalidateSelf() {
        super.invalidateSelf();
        this.f47795p.invalidate();
    }
}
