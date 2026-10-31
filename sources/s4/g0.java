package s4;

import android.database.Observable;
import android.os.Trace;
import android.view.ViewGroup;
import java.util.List;
public abstract class g0 {
    public final h0 f47932a = new Observable();
    public boolean f47933b = false;

    public void B(i0 i0Var) {
        this.f47932a.registerObserver(i0Var);
    }

    public final void C(boolean z10) {
        if (!this.f47932a.a()) {
            this.f47933b = z10;
            return;
        }
        throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
    }

    public final c1 a(ViewGroup viewGroup, int i10) {
        try {
            int i11 = n0.g.f13407a;
            Trace.beginSection("RV CreateView");
            c1 w9 = w(viewGroup, i10);
            if (w9.f47898a.getParent() == null) {
                w9.f47901f = i10;
                Trace.endSection();
                return w9;
            }
            throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
        } catch (Throwable th2) {
            int i12 = n0.g.f13407a;
            Trace.endSection();
            throw th2;
        }
    }

    public abstract int b();

    public long c(int i10) {
        return -1L;
    }

    public int d(int i10) {
        return 0;
    }

    public int e() {
        return b();
    }

    public void f() {
        this.f47932a.b();
    }

    public void g(int i10) {
        this.f47932a.d(i10, 1, null);
    }

    public final void h(int i10, Object obj) {
        this.f47932a.d(i10, 1, obj);
    }

    public void i(int i10) {
        this.f47932a.e(i10, 1);
    }

    public void j(int i10, int i11) {
        this.f47932a.c(i10, i11);
    }

    public void k(int i10, int i11) {
        this.f47932a.d(i10, i11, null);
    }

    public void n(int i10, int i11, Object obj) {
        this.f47932a.d(i10, i11, obj);
    }

    public void o(int i10, int i11) {
        this.f47932a.e(i10, i11);
    }

    public void p(int i10, int i11) {
        this.f47932a.f(i10, i11);
    }

    public void s(int i10) {
        this.f47932a.f(i10, 1);
    }

    public abstract void t(c1 c1Var, int i10);

    public void v(c1 c1Var, int i10, List list) {
        t(c1Var, i10);
    }

    public abstract c1 w(ViewGroup viewGroup, int i10);

    public void A(c1 c1Var) {
    }

    public void y(c1 c1Var) {
    }

    public void z(c1 c1Var) {
    }
}
