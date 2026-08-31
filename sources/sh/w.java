package sh;

import org.telegram.ui.ActionBar.g5;
public final class w extends g5 {
    public final z f47759p;

    public w(z zVar) {
        this.f47759p = zVar;
    }

    @Override
    public final void invalidateSelf() {
        super.invalidateSelf();
        this.f47759p.invalidate();
    }
}
