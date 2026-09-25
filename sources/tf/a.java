package tf;

import ai.n4;
import android.view.View;
import android.view.ViewTreeObserver;
import yf.x;
public final class a implements ViewTreeObserver.OnDrawListener {
    public final int f43342a;
    public final View f43343b;

    public a(int i10, View view) {
        this.f43342a = i10;
        this.f43343b = view;
    }

    @Override
    public final void onDraw() {
        switch (this.f43342a) {
            case 0:
                ((n4) this.f43343b).forceLayout();
                return;
            default:
                ((x) this.f43343b).e.incrementAndGet();
                return;
        }
    }
}
