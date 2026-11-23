package r0;

import android.view.View;
import java.lang.ref.WeakReference;
import org.telegram.ui.Components.f10;
public final class l0 {
    public final WeakReference f56379a;

    public l0(View view) {
        this.f56379a = new WeakReference(view);
    }

    public final void a(float f10) {
        View view = (View) this.f56379a.get();
        if (view != null) {
            view.animate().alpha(f10);
        }
    }

    public final void b() {
        View view = (View) this.f56379a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j3) {
        View view = (View) this.f56379a.get();
        if (view != null) {
            view.animate().setDuration(j3);
        }
    }

    public final void d(m0 m0Var) {
        View view = (View) this.f56379a.get();
        if (view != null) {
            if (m0Var != null) {
                view.animate().setListener(new f10(m0Var, view, 19));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void e(float f10) {
        View view = (View) this.f56379a.get();
        if (view != null) {
            view.animate().translationY(f10);
        }
    }
}
