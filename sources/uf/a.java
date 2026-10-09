package uf;

import ai.o4;
import android.view.View;
import android.view.ViewTreeObserver;
import yf.x;
public final class a implements ViewTreeObserver.OnDrawListener {
    public final int f48896a;
    public final View f48897b;

    public a(int i10, View view) {
        this.f48896a = i10;
        this.f48897b = view;
    }

    @Override
    public final void onDraw() {
        switch (this.f48896a) {
            case 0:
                ((o4) this.f48897b).forceLayout();
                return;
            default:
                ((x) this.f48897b).f52204e.incrementAndGet();
                return;
        }
    }
}
