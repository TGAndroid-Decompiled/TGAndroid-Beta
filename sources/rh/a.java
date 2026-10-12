package rh;

import android.view.View;
public final class a implements View.OnAttachStateChangeListener {
    public final b f47749a;

    public a(b bVar) {
        this.f47749a = bVar;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f47749a.f47752c.e();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f47749a.f47752c.f();
    }
}
