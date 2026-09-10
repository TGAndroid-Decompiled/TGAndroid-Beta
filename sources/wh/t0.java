package wh;

import android.view.View;
import org.telegram.ui.Components.n5;
public final class t0 implements View.OnAttachStateChangeListener {
    public final n5 f44352a;

    public t0(n5 n5Var) {
        this.f44352a = n5Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f44352a.a();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f44352a.b();
    }
}
