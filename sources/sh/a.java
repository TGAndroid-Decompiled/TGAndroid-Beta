package sh;

import android.view.View;
public final class a implements View.OnAttachStateChangeListener {
    public final b f46382a;

    public a(b bVar) {
        this.f46382a = bVar;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f46382a.f46385c.e();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f46382a.f46385c.f();
    }
}
