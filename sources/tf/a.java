package tf;

import ai.n4;
import android.view.View;
import android.view.ViewTreeObserver;
import yf.x;
public final class a implements ViewTreeObserver.OnDrawListener {
    public final int f43355a;
    public final View f43356b;

    public a(int i10, View view) {
        this.f43355a = i10;
        this.f43356b = view;
    }

    @Override
    public final void onDraw() {
        switch (this.f43355a) {
            case 0:
                ((n4) this.f43356b).forceLayout();
                return;
            default:
                ((x) this.f43356b).e.incrementAndGet();
                return;
        }
    }
}
