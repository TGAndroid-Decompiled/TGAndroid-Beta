package rh;

import android.view.View;
public final class a implements View.OnAttachStateChangeListener {
    public final b f46404a;

    public a(b bVar) {
        this.f46404a = bVar;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f46404a.f46407c.e();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f46404a.f46407c.f();
    }
}
