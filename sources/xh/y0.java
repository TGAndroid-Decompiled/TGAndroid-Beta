package xh;

import android.view.View;
public final class y0 implements View.OnAttachStateChangeListener {
    public final org.telegram.messenger.voip.f f46158a;

    public y0(org.telegram.messenger.voip.f fVar) {
        this.f46158a = fVar;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f46158a.run();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
    }
}
