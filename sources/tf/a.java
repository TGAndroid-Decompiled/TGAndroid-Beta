package tf;

import ai.n4;
import android.view.View;
import android.view.ViewTreeObserver;
import yf.x;
public final class a implements ViewTreeObserver.OnDrawListener {
    public final int f43449a;
    public final View f43450b;

    public a(int i10, View view) {
        this.f43449a = i10;
        this.f43450b = view;
    }

    @Override
    public final void onDraw() {
        switch (this.f43449a) {
            case 0:
                ((n4) this.f43450b).forceLayout();
                return;
            default:
                ((x) this.f43450b).e.incrementAndGet();
                return;
        }
    }
}
