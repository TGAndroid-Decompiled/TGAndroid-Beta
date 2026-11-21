package th;

import android.view.View;
public final class a implements View.OnAttachStateChangeListener {
    public final b f58239a;

    public a(b bVar) {
        this.f58239a = bVar;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f58239a.f58242c.e();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f58239a.f58242c.f();
    }
}
