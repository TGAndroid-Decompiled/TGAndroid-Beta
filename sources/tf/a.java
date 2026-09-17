package tf;

import ai.n4;
import android.view.View;
import android.view.ViewTreeObserver;
import yf.x;
public final class a implements ViewTreeObserver.OnDrawListener {
    public final int f43076a;
    public final View f43077b;

    public a(int i10, View view) {
        this.f43076a = i10;
        this.f43077b = view;
    }

    @Override
    public final void onDraw() {
        switch (this.f43076a) {
            case 0:
                ((n4) this.f43077b).forceLayout();
                return;
            default:
                ((x) this.f43077b).e.incrementAndGet();
                return;
        }
    }
}
