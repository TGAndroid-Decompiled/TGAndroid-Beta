package th;

import android.view.View;
public final class a implements View.OnAttachStateChangeListener {
    public final b f49175a;

    public a(b bVar) {
        this.f49175a = bVar;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f49175a.f49178c.e();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f49175a.f49178c.f();
    }
}
