package vf;

import android.view.View;
import android.view.ViewTreeObserver;
import bi.d4;
import zf.y;
public final class a implements ViewTreeObserver.OnDrawListener {
    public final int f46948a;
    public final View f46949b;

    public a(int i10, View view) {
        this.f46948a = i10;
        this.f46949b = view;
    }

    @Override
    public final void onDraw() {
        switch (this.f46948a) {
            case 0:
                ((d4) this.f46949b).forceLayout();
                return;
            default:
                ((y) this.f46949b).e.incrementAndGet();
                return;
        }
    }
}
