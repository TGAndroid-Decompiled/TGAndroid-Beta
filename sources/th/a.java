package th;

import android.view.View;
public final class a implements View.OnAttachStateChangeListener {
    public final b f58197a;

    public a(b bVar) {
        this.f58197a = bVar;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f58197a.f58200c.e();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f58197a.f58200c.f();
    }
}
