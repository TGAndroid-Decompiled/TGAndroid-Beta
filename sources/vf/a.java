package vf;

import android.view.View;
import android.view.ViewTreeObserver;
import ci.i3;
import zf.x;
public final class a implements ViewTreeObserver.OnDrawListener {
    public final int f48335a;
    public final View f48336b;

    public a(int i10, View view) {
        this.f48335a = i10;
        this.f48336b = view;
    }

    @Override
    public final void onDraw() {
        switch (this.f48335a) {
            case 0:
                ((i3) this.f48336b).forceLayout();
                return;
            default:
                ((x) this.f48336b).e.incrementAndGet();
                return;
        }
    }
}
