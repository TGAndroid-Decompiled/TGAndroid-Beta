package xh;

import org.telegram.ui.ActionBar.a5;
public final class t extends a5 {
    public final w f54061p;

    public t(w wVar) {
        this.f54061p = wVar;
    }

    @Override
    public final void invalidateSelf() {
        super.invalidateSelf();
        this.f54061p.invalidate();
    }
}
