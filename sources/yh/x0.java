package yh;

import android.view.View;
public final class x0 implements View.OnAttachStateChangeListener {
    public final org.telegram.messenger.voip.f f49194a;

    public x0(org.telegram.messenger.voip.f fVar) {
        this.f49194a = fVar;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f49194a.run();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
    }
}
