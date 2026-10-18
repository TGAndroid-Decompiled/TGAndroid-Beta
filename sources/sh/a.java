package sh;

import android.view.View;
public final class a implements View.OnAttachStateChangeListener {
    public final b f46565a;

    public a(b bVar) {
        this.f46565a = bVar;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f46565a.f46568c.e();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f46565a.f46568c.f();
    }
}
