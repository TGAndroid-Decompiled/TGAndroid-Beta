package rh;

import android.view.View;
public final class a implements View.OnAttachStateChangeListener {
    public final b f42604a;

    public a(b bVar) {
        this.f42604a = bVar;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f42604a.f42607c.e();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f42604a.f42607c.f();
    }
}
