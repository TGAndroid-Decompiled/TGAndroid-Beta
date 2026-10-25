package u2;

import a8.ng;
import a8.yb;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
public abstract class a {
    public final ArrayList f49236a = new ArrayList(1);
    public final HashSet f49237b = new HashSet(1);
    public final ng f49238c = new ng(new CopyOnWriteArrayList(), 0, (g0) null);
    public final n2.j d = new n2.j(new CopyOnWriteArrayList(), 0, null);
    public Looper e;
    public b2.p1 f49239f;
    public j2.j f49240g;

    public boolean a(b2.p0 p0Var) {
        return false;
    }

    public final ng b(g0 g0Var) {
        return new ng((CopyOnWriteArrayList) this.f49238c.d, 0, g0Var);
    }

    public abstract e0 c(g0 g0Var, a8.h0 h0Var, long j10);

    public final void d(h0 h0Var) {
        HashSet hashSet = this.f49237b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.remove(h0Var);
        if (!isEmpty && hashSet.isEmpty()) {
            e();
        }
    }

    public final void f(h0 h0Var) {
        this.e.getClass();
        HashSet hashSet = this.f49237b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(h0Var);
        if (isEmpty) {
            g();
        }
    }

    public b2.p1 h() {
        return null;
    }

    public abstract b2.p0 i();

    public boolean j() {
        return true;
    }

    public abstract void k();

    public final void l(h0 h0Var, g2.c0 c0Var, j2.j jVar) {
        boolean z10;
        Looper myLooper = Looper.myLooper();
        Looper looper = this.e;
        if (looper != null && looper != myLooper) {
            z10 = false;
        } else {
            z10 = true;
        }
        yb.g(z10);
        this.f49240g = jVar;
        b2.p1 p1Var = this.f49239f;
        this.f49236a.add(h0Var);
        if (this.e == null) {
            this.e = myLooper;
            this.f49237b.add(h0Var);
            m(c0Var);
        } else if (p1Var != null) {
            f(h0Var);
            h0Var.a(this, p1Var);
        }
    }

    public abstract void m(g2.c0 c0Var);

    public final void n(b2.p1 p1Var) {
        this.f49239f = p1Var;
        ArrayList arrayList = this.f49236a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((h0) obj).a(this, p1Var);
        }
    }

    public abstract void o(e0 e0Var);

    public final void p(h0 h0Var) {
        ArrayList arrayList = this.f49236a;
        arrayList.remove(h0Var);
        if (arrayList.isEmpty()) {
            this.e = null;
            this.f49239f = null;
            this.f49240g = null;
            this.f49237b.clear();
            q();
            return;
        }
        d(h0Var);
    }

    public abstract void q();

    public final void r(n2.k kVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.d.f18627c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            n2.i iVar = (n2.i) it.next();
            if (iVar.f18624b == kVar) {
                copyOnWriteArrayList.remove(iVar);
            }
        }
    }

    public final void s(k0 k0Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.f49238c.d;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            j0 j0Var = (j0) it.next();
            if (j0Var.f49321b == k0Var) {
                copyOnWriteArrayList.remove(j0Var);
            }
        }
    }

    public void e() {
    }

    public void g() {
    }

    public void t(b2.p0 p0Var) {
    }
}
