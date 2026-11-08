package th;

import android.view.View;
public final class a implements View.OnAttachStateChangeListener {
    public final b f56033a;

    public a(b bVar) {
        this.f56033a = bVar;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f56033a.f56036c.e();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f56033a.f56036c.f();
    }
}
