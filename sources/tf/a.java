package tf;

import ai.n4;
import android.view.View;
import android.view.ViewTreeObserver;
import yf.y;
public final class a implements ViewTreeObserver.OnDrawListener {
    public final int f43311a;
    public final View f43312b;

    public a(int i10, View view) {
        this.f43311a = i10;
        this.f43312b = view;
    }

    @Override
    public final void onDraw() {
        switch (this.f43311a) {
            case 0:
                ((n4) this.f43312b).forceLayout();
                return;
            default:
                ((y) this.f43312b).e.incrementAndGet();
                return;
        }
    }
}
