package tf;

import ai.n4;
import android.view.View;
import android.view.ViewTreeObserver;
import yf.x;
public final class a implements ViewTreeObserver.OnDrawListener {
    public final int f43081a;
    public final View f43082b;

    public a(int i10, View view) {
        this.f43081a = i10;
        this.f43082b = view;
    }

    @Override
    public final void onDraw() {
        switch (this.f43081a) {
            case 0:
                ((n4) this.f43082b).forceLayout();
                return;
            default:
                ((x) this.f43082b).e.incrementAndGet();
                return;
        }
    }
}
