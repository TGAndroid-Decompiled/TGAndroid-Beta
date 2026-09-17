package xh;

import android.view.View;
public final class x0 implements View.OnAttachStateChangeListener {
    public final org.telegram.messenger.voip.f f46218a;

    public x0(org.telegram.messenger.voip.f fVar) {
        this.f46218a = fVar;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f46218a.run();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
    }
}
