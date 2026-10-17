package vf;

import android.view.View;
import android.view.ViewTreeObserver;
import ci.i3;
import zf.x;
public final class a implements ViewTreeObserver.OnDrawListener {
    public final int f48355a;
    public final View f48356b;

    public a(int i10, View view) {
        this.f48355a = i10;
        this.f48356b = view;
    }

    @Override
    public final void onDraw() {
        switch (this.f48355a) {
            case 0:
                ((i3) this.f48356b).forceLayout();
                return;
            default:
                ((x) this.f48356b).e.incrementAndGet();
                return;
        }
    }
}
