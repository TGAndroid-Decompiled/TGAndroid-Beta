package sh;

import android.view.View;
public final class a implements View.OnAttachStateChangeListener {
    public final b f46410a;

    public a(b bVar) {
        this.f46410a = bVar;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f46410a.f46413c.e();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f46410a.f46413c.f();
    }
}
