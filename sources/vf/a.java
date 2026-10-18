package vf;

import android.view.View;
import android.view.ViewTreeObserver;
import ci.i3;
import zf.x;
public final class a implements ViewTreeObserver.OnDrawListener {
    public final int f48380a;
    public final View f48381b;

    public a(int i10, View view) {
        this.f48380a = i10;
        this.f48381b = view;
    }

    @Override
    public final void onDraw() {
        switch (this.f48380a) {
            case 0:
                ((i3) this.f48381b).forceLayout();
                return;
            default:
                ((x) this.f48381b).e.incrementAndGet();
                return;
        }
    }
}
