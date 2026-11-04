package u4;

import android.database.Observable;
import android.os.Trace;
import android.view.ViewGroup;
import java.util.List;
public abstract class h0 {
    public final i0 f55579a = new Observable();
    public boolean f55580b = false;

    public void B(j0 j0Var) {
        this.f55579a.registerObserver(j0Var);
    }

    public final void C(boolean z10) {
        if (!this.f55579a.a()) {
            this.f55580b = z10;
            return;
        }
        throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
    }

    public final d1 a(ViewGroup viewGroup, int i3) {
        try {
            int i10 = n0.g.f20114a;
            Trace.beginSection("RV CreateView");
            d1 x10 = x(viewGroup, i3);
            if (x10.f55540a.getParent() == null) {
                x10.f55544f = i3;
                Trace.endSection();
                return x10;
            }
            throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
        } catch (Throwable th2) {
            int i11 = n0.g.f20114a;
            Trace.endSection();
            throw th2;
        }
    }

    public abstract int b();

    public long c(int i3) {
        return -1L;
    }

    public int d(int i3) {
        return 0;
    }

    public int e() {
        return b();
    }

    public void f() {
        this.f55579a.b();
    }

    public void g(int i3) {
        this.f55579a.d(i3, 1, null);
    }

    public final void h(int i3, Object obj) {
        this.f55579a.d(i3, 1, obj);
    }

    public void i(int i3) {
        this.f55579a.e(i3, 1);
    }

    public void j(int i3, int i10) {
        this.f55579a.c(i3, i10);
    }

    public void k(int i3, int i10) {
        this.f55579a.d(i3, i10, null);
    }

    public void n(int i3, int i10, Object obj) {
        this.f55579a.d(i3, i10, obj);
    }

    public void o(int i3, int i10) {
        this.f55579a.e(i3, i10);
    }

    public void p(int i3, int i10) {
        this.f55579a.f(i3, i10);
    }

    public void s(int i3) {
        this.f55579a.f(i3, 1);
    }

    public abstract void t(d1 d1Var, int i3);

    public void v(d1 d1Var, int i3, List list) {
        t(d1Var, i3);
    }

    public abstract d1 x(ViewGroup viewGroup, int i3);

    public void A(d1 d1Var) {
    }

    public void y(d1 d1Var) {
    }

    public void z(d1 d1Var) {
    }
}
