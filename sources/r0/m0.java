package r0;

import android.view.View;
import java.lang.ref.WeakReference;
import org.telegram.ui.te1;
public final class m0 {
    public final WeakReference f46927a;

    public m0(View view) {
        this.f46927a = new WeakReference(view);
    }

    public final void a(float f10) {
        View view = (View) this.f46927a.get();
        if (view != null) {
            view.animate().alpha(f10);
        }
    }

    public final void b() {
        View view = (View) this.f46927a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j10) {
        View view = (View) this.f46927a.get();
        if (view != null) {
            view.animate().setDuration(j10);
        }
    }

    public final void d(n0 n0Var) {
        View view = (View) this.f46927a.get();
        if (view != null) {
            if (n0Var != null) {
                view.animate().setListener(new te1(n0Var, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void e(float f10) {
        View view = (View) this.f46927a.get();
        if (view != null) {
            view.animate().translationY(f10);
        }
    }
}
