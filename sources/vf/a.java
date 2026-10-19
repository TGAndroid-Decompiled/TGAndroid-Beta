package vf;

import android.view.View;
import android.view.ViewTreeObserver;
import ci.i3;
import zf.x;
public final class a implements ViewTreeObserver.OnDrawListener {
    public final int f48333a;
    public final View f48334b;

    public a(int i10, View view) {
        this.f48333a = i10;
        this.f48334b = view;
    }

    @Override
    public final void onDraw() {
        switch (this.f48333a) {
            case 0:
                ((i3) this.f48334b).forceLayout();
                return;
            default:
                ((x) this.f48334b).e.incrementAndGet();
                return;
        }
    }
}
