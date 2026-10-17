package r0;

import android.view.View;
import java.lang.ref.WeakReference;
import org.telegram.ui.Components.ml0;
public final class l0 {
    public final WeakReference f44854a;

    public l0(View view) {
        this.f44854a = new WeakReference(view);
    }

    public final void a(float f7) {
        View view = (View) this.f44854a.get();
        if (view != null) {
            view.animate().alpha(f7);
        }
    }

    public final void b() {
        View view = (View) this.f44854a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j10) {
        View view = (View) this.f44854a.get();
        if (view != null) {
            view.animate().setDuration(j10);
        }
    }

    public final void d(m0 m0Var) {
        View view = (View) this.f44854a.get();
        if (view != null) {
            if (m0Var != null) {
                view.animate().setListener(new ml0(m0Var, view, 18));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void e(float f7) {
        View view = (View) this.f44854a.get();
        if (view != null) {
            view.animate().translationY(f7);
        }
    }
}
