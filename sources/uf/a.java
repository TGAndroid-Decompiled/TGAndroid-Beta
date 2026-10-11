package uf;

import ai.o4;
import android.view.View;
import android.view.ViewTreeObserver;
import yf.x;
public final class a implements ViewTreeObserver.OnDrawListener {
    public final int f48983a;
    public final View f48984b;

    public a(int i10, View view) {
        this.f48983a = i10;
        this.f48984b = view;
    }

    @Override
    public final void onDraw() {
        switch (this.f48983a) {
            case 0:
                ((o4) this.f48984b).forceLayout();
                return;
            default:
                ((x) this.f48984b).f52291e.incrementAndGet();
                return;
        }
    }
}
