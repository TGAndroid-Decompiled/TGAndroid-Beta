package ph;

import org.telegram.ui.ActionBar.c5;
public final class w extends c5 {
    public final z f46134p;

    public w(z zVar) {
        this.f46134p = zVar;
    }

    @Override
    public final void invalidateSelf() {
        super.invalidateSelf();
        this.f46134p.invalidate();
    }
}
