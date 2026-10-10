package rh;

import android.view.View;
public final class a implements View.OnAttachStateChangeListener {
    public final b f47579a;

    public a(b bVar) {
        this.f47579a = bVar;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f47579a.f47582c.e();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f47579a.f47582c.f();
    }
}
