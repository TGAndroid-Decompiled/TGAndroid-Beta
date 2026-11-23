package th;

import android.view.View;
public final class a implements View.OnAttachStateChangeListener {
    public final b f58243a;

    public a(b bVar) {
        this.f58243a = bVar;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f58243a.f58246c.e();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f58243a.f58246c.f();
    }
}
