package org.telegram.ui;

import android.view.ViewTreeObserver;
public final class zh implements ViewTreeObserver.OnPreDrawListener {
    public boolean f46275a;
    public final ViewTreeObserver f46276b;
    public final wn f46277c;

    public zh(wn wnVar, ViewTreeObserver viewTreeObserver) {
        this.f46277c = wnVar;
        this.f46276b = viewTreeObserver;
    }

    @Override
    public final boolean onPreDraw() {
        ViewTreeObserver viewTreeObserver = this.f46276b;
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this);
        }
        wn wnVar = this.f46277c;
        lj ljVar = wnVar.f45198m1;
        if (ljVar != null) {
            ljVar.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        if (this.f46275a) {
            return true;
        }
        this.f46275a = true;
        return wnVar.D8();
    }
}
