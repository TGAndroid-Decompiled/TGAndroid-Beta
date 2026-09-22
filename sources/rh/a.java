package rh;

import android.view.View;
public final class a implements View.OnAttachStateChangeListener {
    public final b f42896a;

    public a(b bVar) {
        this.f42896a = bVar;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f42896a.f42899c.e();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f42896a.f42899c.f();
    }
}
