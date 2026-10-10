package uf;

import ai.o4;
import android.view.View;
import android.view.ViewTreeObserver;
import yf.x;
public final class a implements ViewTreeObserver.OnDrawListener {
    public final int f48940a;
    public final View f48941b;

    public a(int i10, View view) {
        this.f48940a = i10;
        this.f48941b = view;
    }

    @Override
    public final void onDraw() {
        switch (this.f48940a) {
            case 0:
                ((o4) this.f48941b).forceLayout();
                return;
            default:
                ((x) this.f48941b).f52248e.incrementAndGet();
                return;
        }
    }
}
