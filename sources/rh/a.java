package rh;

import android.view.View;
public final class a implements View.OnAttachStateChangeListener {
    public final b f47533a;

    public a(b bVar) {
        this.f47533a = bVar;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f47533a.f47536c.e();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f47533a.f47536c.f();
    }
}
