package tf;

import ai.n4;
import android.view.View;
import android.view.ViewTreeObserver;
import yf.x;
public final class a implements ViewTreeObserver.OnDrawListener {
    public final int f43343a;
    public final View f43344b;

    public a(int i10, View view) {
        this.f43343a = i10;
        this.f43344b = view;
    }

    @Override
    public final void onDraw() {
        switch (this.f43343a) {
            case 0:
                ((n4) this.f43344b).forceLayout();
                return;
            default:
                ((x) this.f43344b).e.incrementAndGet();
                return;
        }
    }
}
