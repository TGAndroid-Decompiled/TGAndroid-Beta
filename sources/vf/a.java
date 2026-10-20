package vf;

import android.view.View;
import android.view.ViewTreeObserver;
import ci.i3;
import zf.x;
public final class a implements ViewTreeObserver.OnDrawListener {
    public final int f48340a;
    public final View f48341b;

    public a(int i10, View view) {
        this.f48340a = i10;
        this.f48341b = view;
    }

    @Override
    public final void onDraw() {
        switch (this.f48340a) {
            case 0:
                ((i3) this.f48341b).forceLayout();
                return;
            default:
                ((x) this.f48341b).e.incrementAndGet();
                return;
        }
    }
}
