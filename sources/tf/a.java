package tf;

import ai.n4;
import android.view.View;
import android.view.ViewTreeObserver;
import yf.x;
public final class a implements ViewTreeObserver.OnDrawListener {
    public final int f43005a;
    public final View f43006b;

    public a(int i10, View view) {
        this.f43005a = i10;
        this.f43006b = view;
    }

    @Override
    public final void onDraw() {
        switch (this.f43005a) {
            case 0:
                ((n4) this.f43006b).forceLayout();
                return;
            default:
                ((x) this.f43006b).e.incrementAndGet();
                return;
        }
    }
}
