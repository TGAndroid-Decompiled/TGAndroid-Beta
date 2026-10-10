package s4;

import android.database.Observable;
import android.os.Trace;
import android.view.ViewGroup;
import java.util.List;
public abstract class i0 {
    public final j0 f47756a = new Observable();
    public boolean f47757b = false;

    public void B(k0 k0Var) {
        this.f47756a.registerObserver(k0Var);
    }

    public final void C(boolean z10) {
        if (!this.f47756a.a()) {
            this.f47757b = z10;
            return;
        }
        throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
    }

    public final d1 e(ViewGroup viewGroup, int i10) {
        try {
            int i11 = n0.g.f16468a;
            Trace.beginSection("RV CreateView");
            d1 x10 = x(viewGroup, i10);
            if (x10.f47702a.getParent() == null) {
                x10.f47706f = i10;
                Trace.endSection();
                return x10;
            }
            throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
        } catch (Throwable th2) {
            int i12 = n0.g.f16468a;
            Trace.endSection();
            throw th2;
        }
    }

    public abstract int h();

    public long i(int i10) {
        return -1L;
    }

    public int j(int i10) {
        return 0;
    }

    public int k() {
        return h();
    }

    public void l() {
        this.f47756a.b();
    }

    public void m(int i10) {
        this.f47756a.d(i10, 1, null);
    }

    public final void n(int i10, Object obj) {
        this.f47756a.d(i10, 1, obj);
    }

    public void o(int i10) {
        this.f47756a.e(i10, 1);
    }

    public void p(int i10, int i11) {
        this.f47756a.c(i10, i11);
    }

    public void q(int i10, int i11) {
        this.f47756a.d(i10, i11, null);
    }

    public void r(int i10, int i11, Object obj) {
        this.f47756a.d(i10, i11, obj);
    }

    public void s(int i10, int i11) {
        this.f47756a.e(i10, i11);
    }

    public void t(int i10, int i11) {
        this.f47756a.f(i10, i11);
    }

    public void u(int i10) {
        this.f47756a.f(i10, 1);
    }

    public abstract void v(d1 d1Var, int i10);

    public void w(d1 d1Var, int i10, List list) {
        v(d1Var, i10);
    }

    public abstract d1 x(ViewGroup viewGroup, int i10);

    public void A(d1 d1Var) {
    }

    public void y(d1 d1Var) {
    }

    public void z(d1 d1Var) {
    }
}
