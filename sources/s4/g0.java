package s4;

import android.database.Observable;
import android.os.Trace;
import android.view.ViewGroup;
import java.util.List;
public abstract class g0 {
    public final h0 f45966a = new Observable();
    public boolean f45967b = false;

    public void B(i0 i0Var) {
        this.f45966a.registerObserver(i0Var);
    }

    public final void C(boolean z10) {
        if (!this.f45966a.a()) {
            this.f45967b = z10;
            return;
        }
        throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
    }

    public final b1 d(ViewGroup viewGroup, int i10) {
        try {
            int i11 = n0.g.f17000a;
            Trace.beginSection("RV CreateView");
            b1 x10 = x(viewGroup, i10);
            if (x10.f45921a.getParent() == null) {
                x10.f45924f = i10;
                Trace.endSection();
                return x10;
            }
            throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
        } catch (Throwable th2) {
            int i12 = n0.g.f17000a;
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
        this.f45966a.b();
    }

    public void m(int i10) {
        this.f45966a.d(i10, 1, null);
    }

    public final void n(int i10, Object obj) {
        this.f45966a.d(i10, 1, obj);
    }

    public void o(int i10) {
        this.f45966a.e(i10, 1);
    }

    public void p(int i10, int i11) {
        this.f45966a.c(i10, i11);
    }

    public void q(int i10, int i11) {
        this.f45966a.d(i10, i11, null);
    }

    public void r(int i10, int i11, Object obj) {
        this.f45966a.d(i10, i11, obj);
    }

    public void s(int i10, int i11) {
        this.f45966a.e(i10, i11);
    }

    public void t(int i10, int i11) {
        this.f45966a.f(i10, i11);
    }

    public void u(int i10) {
        this.f45966a.f(i10, 1);
    }

    public abstract void v(b1 b1Var, int i10);

    public void w(b1 b1Var, int i10, List list) {
        v(b1Var, i10);
    }

    public abstract b1 x(ViewGroup viewGroup, int i10);

    public void A(b1 b1Var) {
    }

    public void y(b1 b1Var) {
    }

    public void z(b1 b1Var) {
    }
}
