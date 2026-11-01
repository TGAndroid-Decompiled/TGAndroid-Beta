package vh;

import android.graphics.Rect;
import android.view.View;
import java.util.WeakHashMap;
import org.telegram.messenger.r20;
public class r2 {
    public final View f51824a;
    public View f51825b;
    public final r20 f51826c;
    public boolean d;
    public boolean e;
    public boolean f51827f;
    public boolean f51828g;
    public final Rect h = new Rect();
    public final dg.c f51829i;
    public final jf.d f51830j;
    public int f51831k;
    public int f51832l;

    public r2(View view, boolean z10, r20 r20Var) {
        dg.c cVar = new dg.c(this, 2);
        this.f51829i = cVar;
        jf.d dVar = new jf.d(this, 1);
        this.f51830j = dVar;
        this.f51824a = view;
        this.f51826c = r20Var;
        this.f51825b = view;
        if (view.isAttachedToWindow()) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(dVar);
            view.addOnLayoutChangeListener(cVar);
        }
        view.addOnAttachStateChangeListener(new q2(this, z10, view));
    }

    public final void a() {
        if (this.e) {
            if (this.f51832l >= org.telegram.messenger.i0.L(20.0f) + org.telegram.messenger.i0.f16167n) {
                this.e = false;
            } else {
                return;
            }
        }
        r20 r20Var = this.f51826c;
        if (r20Var != null) {
            r20Var.a(Integer.valueOf(this.f51832l));
        }
    }

    public void b(boolean z10) {
        this.d = z10;
        d();
    }

    public final boolean c() {
        if (this.f51832l <= org.telegram.messenger.i0.L(20.0f) + org.telegram.messenger.i0.f16167n && !this.e) {
            return false;
        }
        return true;
    }

    public final void d() {
        int i10;
        if (!this.d) {
            boolean z10 = this.f51827f;
            boolean z11 = false;
            View view = this.f51824a;
            if (z10) {
                View view2 = this.f51825b;
                if (view2 != null) {
                    view = view2;
                }
                WeakHashMap weakHashMap = r0.h0.f46134a;
                r0.j1 a2 = r0.a0.a(view);
                if (a2 != null) {
                    i10 = a2.f46143a.f(8).d;
                } else {
                    i10 = 0;
                }
                this.f51832l = i10;
            } else {
                Rect rect = this.h;
                view.getWindowVisibleDisplayFrame(rect);
                View view3 = this.f51825b;
                if (view3 != null) {
                    view = view3;
                }
                this.f51832l = view.getHeight() - rect.bottom;
            }
            if (this.f51828g) {
                this.f51832l = Math.max(0, this.f51832l - org.telegram.messenger.i0.f16167n);
            }
            int i11 = this.f51831k;
            int i12 = this.f51832l;
            if (i11 != i12) {
                z11 = true;
            }
            this.f51831k = i12;
            if (z11) {
                a();
            }
        }
    }
}
