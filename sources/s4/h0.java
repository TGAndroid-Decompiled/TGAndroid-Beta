package s4;

import android.database.Observable;
import android.os.Trace;
import android.view.ViewGroup;
import java.util.List;
public abstract class h0 {
    public final i0 f43008a = new Observable();
    public boolean f43009b = false;

    public void B(j0 j0Var) {
        this.f43008a.registerObserver(j0Var);
    }

    public final void C(boolean z10) {
        if (!this.f43008a.a()) {
            this.f43009b = z10;
            return;
        }
        throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
    }

    public final c1 g(ViewGroup viewGroup, int i10) {
        try {
            int i11 = n0.g.f15079a;
            Trace.beginSection("RV CreateView");
            c1 x10 = x(viewGroup, i10);
            if (x10.f42959a.getParent() == null) {
                x10.f42962f = i10;
                Trace.endSection();
                return x10;
            }
            throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
        } catch (Throwable th2) {
            int i12 = n0.g.f15079a;
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
        this.f43008a.b();
    }

    public void m(int i10) {
        this.f43008a.d(i10, 1, null);
    }

    public final void n(int i10, Object obj) {
        this.f43008a.d(i10, 1, obj);
    }

    public void o(int i10) {
        this.f43008a.e(i10, 1);
    }

    public void p(int i10, int i11) {
        this.f43008a.c(i10, i11);
    }

    public void q(int i10, int i11) {
        this.f43008a.d(i10, i11, null);
    }

    public void r(int i10, int i11, Object obj) {
        this.f43008a.d(i10, i11, obj);
    }

    public void s(int i10, int i11) {
        this.f43008a.e(i10, i11);
    }

    public void t(int i10, int i11) {
        this.f43008a.f(i10, i11);
    }

    public void u(int i10) {
        this.f43008a.f(i10, 1);
    }

    public abstract void v(c1 c1Var, int i10);

    public void w(c1 c1Var, int i10, List list) {
        v(c1Var, i10);
    }

    public abstract c1 x(ViewGroup viewGroup, int i10);

    public void A(c1 c1Var) {
    }

    public void y(c1 c1Var) {
    }

    public void z(c1 c1Var) {
    }
}
