package vf;

import android.view.View;
import android.view.ViewTreeObserver;
import ci.h3;
import zf.x;
public final class a implements ViewTreeObserver.OnDrawListener {
    public final int f48782a;
    public final View f48783b;

    public a(int i10, View view) {
        this.f48782a = i10;
        this.f48783b = view;
    }

    @Override
    public final void onDraw() {
        switch (this.f48782a) {
            case 0:
                ((h3) this.f48783b).forceLayout();
                return;
            default:
                ((x) this.f48783b).e.incrementAndGet();
                return;
        }
    }
}
