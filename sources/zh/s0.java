package zh;

import android.view.View;
import org.telegram.ui.Components.r5;
public final class s0 implements View.OnAttachStateChangeListener {
    public final r5 f53238a;

    public s0(r5 r5Var) {
        this.f53238a = r5Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f53238a.a();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f53238a.b();
    }
}
