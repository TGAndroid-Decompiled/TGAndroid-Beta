package tf;

import ai.n4;
import android.view.View;
import android.view.ViewTreeObserver;
import yf.x;
public final class a implements ViewTreeObserver.OnDrawListener {
    public final int f43386a;
    public final View f43387b;

    public a(int i10, View view) {
        this.f43386a = i10;
        this.f43387b = view;
    }

    @Override
    public final void onDraw() {
        switch (this.f43386a) {
            case 0:
                ((n4) this.f43387b).forceLayout();
                return;
            default:
                ((x) this.f43387b).e.incrementAndGet();
                return;
        }
    }
}
