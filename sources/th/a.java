package th;

import android.view.View;
public final class a implements View.OnAttachStateChangeListener {
    public final b f49137a;

    public a(b bVar) {
        this.f49137a = bVar;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f49137a.f49140c.e();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f49137a.f49140c.f();
    }
}
