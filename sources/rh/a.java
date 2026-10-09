package rh;

import android.view.View;
public final class a implements View.OnAttachStateChangeListener {
    public final b f47535a;

    public a(b bVar) {
        this.f47535a = bVar;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f47535a.f47538c.e();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f47535a.f47538c.f();
    }
}
