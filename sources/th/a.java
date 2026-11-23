package th;

import android.view.View;
public final class a implements View.OnAttachStateChangeListener {
    public final b f58208a;

    public a(b bVar) {
        this.f58208a = bVar;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f58208a.f58211c.e();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f58208a.f58211c.f();
    }
}
