package tf;

import ai.n4;
import android.view.View;
import android.view.ViewTreeObserver;
import yf.x;
public final class a implements ViewTreeObserver.OnDrawListener {
    public final int f43054a;
    public final View f43055b;

    public a(int i10, View view) {
        this.f43054a = i10;
        this.f43055b = view;
    }

    @Override
    public final void onDraw() {
        switch (this.f43054a) {
            case 0:
                ((n4) this.f43055b).forceLayout();
                return;
            default:
                ((x) this.f43055b).e.incrementAndGet();
                return;
        }
    }
}
