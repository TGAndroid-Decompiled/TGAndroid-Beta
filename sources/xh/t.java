package xh;

import org.telegram.ui.ActionBar.a5;
public final class t extends a5 {
    public final w f54055p;

    public t(w wVar) {
        this.f54055p = wVar;
    }

    @Override
    public final void invalidateSelf() {
        super.invalidateSelf();
        this.f54055p.invalidate();
    }
}
