package th;

import android.view.View;
public final class a implements View.OnAttachStateChangeListener {
    public final b f57630a;

    public a(b bVar) {
        this.f57630a = bVar;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f57630a.f57633c.e();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f57630a.f57633c.f();
    }
}
