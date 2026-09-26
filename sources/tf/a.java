package tf;

import ai.n4;
import android.view.View;
import android.view.ViewTreeObserver;
import yf.x;
public final class a implements ViewTreeObserver.OnDrawListener {
    public final int f43340a;
    public final View f43341b;

    public a(int i10, View view) {
        this.f43340a = i10;
        this.f43341b = view;
    }

    @Override
    public final void onDraw() {
        switch (this.f43340a) {
            case 0:
                ((n4) this.f43341b).forceLayout();
                return;
            default:
                ((x) this.f43341b).e.incrementAndGet();
                return;
        }
    }
}
