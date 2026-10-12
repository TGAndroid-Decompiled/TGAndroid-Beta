package uf;

import ai.o4;
import android.view.View;
import android.view.ViewTreeObserver;
import yf.x;
public final class a implements ViewTreeObserver.OnDrawListener {
    public final int f49132a;
    public final View f49133b;

    public a(int i10, View view) {
        this.f49132a = i10;
        this.f49133b = view;
    }

    @Override
    public final void onDraw() {
        switch (this.f49132a) {
            case 0:
                ((o4) this.f49133b).forceLayout();
                return;
            default:
                ((x) this.f49133b).f52436e.incrementAndGet();
                return;
        }
    }
}
