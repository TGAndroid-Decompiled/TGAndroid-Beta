package vf;

import android.view.View;
import android.view.ViewTreeObserver;
import ci.h3;
import zf.x;
public final class a implements ViewTreeObserver.OnDrawListener {
    public final int f48781a;
    public final View f48782b;

    public a(int i10, View view) {
        this.f48781a = i10;
        this.f48782b = view;
    }

    @Override
    public final void onDraw() {
        switch (this.f48781a) {
            case 0:
                ((h3) this.f48782b).forceLayout();
                return;
            default:
                ((x) this.f48782b).e.incrementAndGet();
                return;
        }
    }
}
