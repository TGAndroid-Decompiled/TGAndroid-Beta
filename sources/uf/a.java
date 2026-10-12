package uf;

import ai.o4;
import android.view.View;
import android.view.ViewTreeObserver;
import yf.x;
public final class a implements ViewTreeObserver.OnDrawListener {
    public final int f49124a;
    public final View f49125b;

    public a(int i10, View view) {
        this.f49124a = i10;
        this.f49125b = view;
    }

    @Override
    public final void onDraw() {
        switch (this.f49124a) {
            case 0:
                ((o4) this.f49125b).forceLayout();
                return;
            default:
                ((x) this.f49125b).f52428e.incrementAndGet();
                return;
        }
    }
}
