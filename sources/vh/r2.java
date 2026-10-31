package vh;

import android.graphics.Rect;
import android.view.View;
import java.util.WeakHashMap;
import org.telegram.messenger.q20;
public class r2 {
    public final View f51839a;
    public View f51840b;
    public final q20 f51841c;
    public boolean d;
    public boolean e;
    public boolean f51842f;
    public boolean f51843g;
    public final Rect h = new Rect();
    public final dg.c f51844i;
    public final jf.d f51845j;
    public int f51846k;
    public int f51847l;

    public r2(View view, boolean z10, q20 q20Var) {
        dg.c cVar = new dg.c(this, 2);
        this.f51844i = cVar;
        jf.d dVar = new jf.d(this, 1);
        this.f51845j = dVar;
        this.f51839a = view;
        this.f51841c = q20Var;
        this.f51840b = view;
        if (view.isAttachedToWindow()) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(dVar);
            view.addOnLayoutChangeListener(cVar);
        }
        view.addOnAttachStateChangeListener(new q2(this, z10, view));
    }

    public final void a() {
        if (this.e) {
            if (this.f51847l >= org.telegram.messenger.i0.L(20.0f) + org.telegram.messenger.i0.f16021n) {
                this.e = false;
            } else {
                return;
            }
        }
        q20 q20Var = this.f51841c;
        if (q20Var != null) {
            q20Var.a(Integer.valueOf(this.f51847l));
        }
    }

    public void b(boolean z10) {
        this.d = z10;
        d();
    }

    public final boolean c() {
        if (this.f51847l <= org.telegram.messenger.i0.L(20.0f) + org.telegram.messenger.i0.f16021n && !this.e) {
            return false;
        }
        return true;
    }

    public final void d() {
        int i10;
        if (!this.d) {
            boolean z10 = this.f51842f;
            boolean z11 = false;
            View view = this.f51839a;
            if (z10) {
                View view2 = this.f51840b;
                if (view2 != null) {
                    view = view2;
                }
                WeakHashMap weakHashMap = r0.h0.f46123a;
                r0.j1 a2 = r0.a0.a(view);
                if (a2 != null) {
                    i10 = a2.f46132a.f(8).d;
                } else {
                    i10 = 0;
                }
                this.f51847l = i10;
            } else {
                Rect rect = this.h;
                view.getWindowVisibleDisplayFrame(rect);
                View view3 = this.f51840b;
                if (view3 != null) {
                    view = view3;
                }
                this.f51847l = view.getHeight() - rect.bottom;
            }
            if (this.f51843g) {
                this.f51847l = Math.max(0, this.f51847l - org.telegram.messenger.i0.f16021n);
            }
            int i11 = this.f51846k;
            int i12 = this.f51847l;
            if (i11 != i12) {
                z11 = true;
            }
            this.f51846k = i12;
            if (z11) {
                a();
            }
        }
    }
}
