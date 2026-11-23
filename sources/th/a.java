package th;

import android.view.View;
public final class a implements View.OnAttachStateChangeListener {
    public final b f58323a;

    public a(b bVar) {
        this.f58323a = bVar;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f58323a.f58326c.e();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f58323a.f58326c.f();
    }
}
