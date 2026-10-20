package sh;

import android.view.View;
public final class a implements View.OnAttachStateChangeListener {
    public final b f46525a;

    public a(b bVar) {
        this.f46525a = bVar;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f46525a.f46528c.e();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f46525a.f46528c.f();
    }
}
