package tf;

import ai.n4;
import android.view.View;
import android.view.ViewTreeObserver;
import yf.x;
public final class a implements ViewTreeObserver.OnDrawListener {
    public final int f43327a;
    public final View f43328b;

    public a(int i10, View view) {
        this.f43327a = i10;
        this.f43328b = view;
    }

    @Override
    public final void onDraw() {
        switch (this.f43327a) {
            case 0:
                ((n4) this.f43328b).forceLayout();
                return;
            default:
                ((x) this.f43328b).e.incrementAndGet();
                return;
        }
    }
}
