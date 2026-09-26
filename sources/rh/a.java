package rh;

import android.view.View;
public final class a implements View.OnAttachStateChangeListener {
    public final b f42860a;

    public a(b bVar) {
        this.f42860a = bVar;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f42860a.f42863c.e();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f42860a.f42863c.f();
    }
}
