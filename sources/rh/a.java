package rh;

import android.view.View;
public final class a implements View.OnAttachStateChangeListener {
    public final b f47659a;

    public a(b bVar) {
        this.f47659a = bVar;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f47659a.f47662c.e();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f47659a.f47662c.f();
    }
}
