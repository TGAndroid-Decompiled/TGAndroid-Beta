package uf;

import ai.o4;
import android.view.View;
import android.view.ViewTreeObserver;
import yf.x;
public final class a implements ViewTreeObserver.OnDrawListener {
    public final int f48894a;
    public final View f48895b;

    public a(int i10, View view) {
        this.f48894a = i10;
        this.f48895b = view;
    }

    @Override
    public final void onDraw() {
        switch (this.f48894a) {
            case 0:
                ((o4) this.f48895b).forceLayout();
                return;
            default:
                ((x) this.f48895b).f52202e.incrementAndGet();
                return;
        }
    }
}
