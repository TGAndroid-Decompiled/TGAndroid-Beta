package v4;

import android.database.Observable;
import android.os.Trace;
import android.view.ViewGroup;
import java.util.List;
public abstract class h0 {
    public final i0 f58570a = new Observable();
    public boolean f58571b = false;

    public void B(j0 j0Var) {
        this.f58570a.registerObserver(j0Var);
    }

    public final void C(boolean z10) {
        if (!this.f58570a.a()) {
            this.f58571b = z10;
            return;
        }
        throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
    }

    public final e1 a(ViewGroup viewGroup, int i7) {
        try {
            int i10 = n0.g.f20692a;
            Trace.beginSection("RV CreateView");
            e1 x10 = x(viewGroup, i7);
            if (x10.f58535a.getParent() == null) {
                x10.f58539f = i7;
                Trace.endSection();
                return x10;
            }
            throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
        } catch (Throwable th2) {
            int i11 = n0.g.f20692a;
            Trace.endSection();
            throw th2;
        }
    }

    public abstract int b();

    public long c(int i7) {
        return -1L;
    }

    public int d(int i7) {
        return 0;
    }

    public int e() {
        return b();
    }

    public void f() {
        this.f58570a.b();
    }

    public void g(int i7) {
        this.f58570a.d(i7, 1, null);
    }

    public final void h(int i7, Object obj) {
        this.f58570a.d(i7, 1, obj);
    }

    public void i(int i7) {
        this.f58570a.e(i7, 1);
    }

    public void j(int i7, int i10) {
        this.f58570a.c(i7, i10);
    }

    public void k(int i7, int i10) {
        this.f58570a.d(i7, i10, null);
    }

    public void n(int i7, int i10, Object obj) {
        this.f58570a.d(i7, i10, obj);
    }

    public void o(int i7, int i10) {
        this.f58570a.e(i7, i10);
    }

    public void p(int i7, int i10) {
        this.f58570a.f(i7, i10);
    }

    public void s(int i7) {
        this.f58570a.f(i7, 1);
    }

    public abstract void t(e1 e1Var, int i7);

    public void v(e1 e1Var, int i7, List list) {
        t(e1Var, i7);
    }

    public abstract e1 x(ViewGroup viewGroup, int i7);

    public void A(e1 e1Var) {
    }

    public void y(e1 e1Var) {
    }

    public void z(e1 e1Var) {
    }
}
