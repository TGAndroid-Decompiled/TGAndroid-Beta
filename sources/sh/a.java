package sh;

import android.view.View;
public final class a implements View.OnAttachStateChangeListener {
    public final b f46518a;

    public a(b bVar) {
        this.f46518a = bVar;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f46518a.f46521c.e();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f46518a.f46521c.f();
    }
}
