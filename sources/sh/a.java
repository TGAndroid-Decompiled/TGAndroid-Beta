package sh;

import android.view.View;
public final class a implements View.OnAttachStateChangeListener {
    public final b f46381a;

    public a(b bVar) {
        this.f46381a = bVar;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f46381a.f46384c.e();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f46381a.f46384c.f();
    }
}
