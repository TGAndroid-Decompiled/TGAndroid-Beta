package uf;

import ai.o4;
import android.view.View;
import android.view.ViewTreeObserver;
import yf.x;
public final class a implements ViewTreeObserver.OnDrawListener {
    public final int f49017a;
    public final View f49018b;

    public a(int i10, View view) {
        this.f49017a = i10;
        this.f49018b = view;
    }

    @Override
    public final void onDraw() {
        switch (this.f49017a) {
            case 0:
                ((o4) this.f49018b).forceLayout();
                return;
            default:
                ((x) this.f49018b).f52325e.incrementAndGet();
                return;
        }
    }
}
