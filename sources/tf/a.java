package tf;

import ai.n4;
import android.view.View;
import android.view.ViewTreeObserver;
import yf.x;
public final class a implements ViewTreeObserver.OnDrawListener {
    public final int f43341a;
    public final View f43342b;

    public a(int i10, View view) {
        this.f43341a = i10;
        this.f43342b = view;
    }

    @Override
    public final void onDraw() {
        switch (this.f43341a) {
            case 0:
                ((n4) this.f43342b).forceLayout();
                return;
            default:
                ((x) this.f43342b).e.incrementAndGet();
                return;
        }
    }
}
