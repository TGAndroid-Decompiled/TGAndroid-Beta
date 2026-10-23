package vf;

import android.view.View;
import android.view.ViewTreeObserver;
import ci.i3;
import zf.x;
public final class a implements ViewTreeObserver.OnDrawListener {
    public final int f48344a;
    public final View f48345b;

    public a(int i10, View view) {
        this.f48344a = i10;
        this.f48345b = view;
    }

    @Override
    public final void onDraw() {
        switch (this.f48344a) {
            case 0:
                ((i3) this.f48345b).forceLayout();
                return;
            default:
                ((x) this.f48345b).e.incrementAndGet();
                return;
        }
    }
}
