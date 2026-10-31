package r0;

import android.view.View;
import java.lang.ref.WeakReference;
import org.telegram.ui.Components.iw0;
public final class k0 {
    public final WeakReference f46133a;

    public k0(View view) {
        this.f46133a = new WeakReference(view);
    }

    public final void a(float f7) {
        View view = (View) this.f46133a.get();
        if (view != null) {
            view.animate().alpha(f7);
        }
    }

    public final void b() {
        View view = (View) this.f46133a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j10) {
        View view = (View) this.f46133a.get();
        if (view != null) {
            view.animate().setDuration(j10);
        }
    }

    public final void d(l0 l0Var) {
        View view = (View) this.f46133a.get();
        if (view != null) {
            if (l0Var != null) {
                view.animate().setListener(new iw0(14, view, (Object) l0Var));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void e(float f7) {
        View view = (View) this.f46133a.get();
        if (view != null) {
            view.animate().translationY(f7);
        }
    }
}
