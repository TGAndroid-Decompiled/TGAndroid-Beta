package rh;

import android.view.View;
public final class a implements View.OnAttachStateChangeListener {
    public final b f46418a;

    public a(b bVar) {
        this.f46418a = bVar;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f46418a.f46421c.e();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f46418a.f46421c.f();
    }
}
