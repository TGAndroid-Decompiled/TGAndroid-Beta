package sh;

import android.view.View;
public final class a implements View.OnAttachStateChangeListener {
    public final b f46409a;

    public a(b bVar) {
        this.f46409a = bVar;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f46409a.f46412c.e();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f46409a.f46412c.f();
    }
}
