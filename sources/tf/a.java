package tf;

import ai.n4;
import android.view.View;
import android.view.ViewTreeObserver;
import yf.x;
public final class a implements ViewTreeObserver.OnDrawListener {
    public final int f43376a;
    public final View f43377b;

    public a(int i10, View view) {
        this.f43376a = i10;
        this.f43377b = view;
    }

    @Override
    public final void onDraw() {
        switch (this.f43376a) {
            case 0:
                ((n4) this.f43377b).forceLayout();
                return;
            default:
                ((x) this.f43377b).e.incrementAndGet();
                return;
        }
    }
}
