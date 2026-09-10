package u2;

import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
public abstract class a {
    public final ArrayList f42266a = new ArrayList(1);
    public final HashSet f42267b = new HashSet(1);
    public final a5.a f42268c = new a5.a(new CopyOnWriteArrayList(), 0, null, 20);
    public final n2.j d = new n2.j(new CopyOnWriteArrayList(), 0, null);
    public Looper e;
    public b2.k1 f42269f;
    public j2.k f42270g;

    public boolean a(b2.k0 k0Var) {
        return false;
    }

    public final a5.a b(g0 g0Var) {
        return new a5.a((CopyOnWriteArrayList) this.f42268c.d, 0, g0Var, 20);
    }

    public abstract e0 c(g0 g0Var, y2.d dVar, long j3);

    public final void d(h0 h0Var) {
        HashSet hashSet = this.f42267b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.remove(h0Var);
        if (!isEmpty && hashSet.isEmpty()) {
            e();
        }
    }

    public final void f(h0 h0Var) {
        this.e.getClass();
        HashSet hashSet = this.f42267b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(h0Var);
        if (isEmpty) {
            g();
        }
    }

    public b2.k1 h() {
        return null;
    }

    public abstract b2.k0 i();

    public boolean j() {
        return true;
    }

    public abstract void k();

    public final void l(h0 h0Var, g2.c0 c0Var, j2.k kVar) {
        boolean z10;
        Looper myLooper = Looper.myLooper();
        Looper looper = this.e;
        if (looper != null && looper != myLooper) {
            z10 = false;
        } else {
            z10 = true;
        }
        e2.d.b(z10);
        this.f42270g = kVar;
        b2.k1 k1Var = this.f42269f;
        this.f42266a.add(h0Var);
        if (this.e == null) {
            this.e = myLooper;
            this.f42267b.add(h0Var);
            m(c0Var);
        } else if (k1Var != null) {
            f(h0Var);
            h0Var.a(this, k1Var);
        }
    }

    public abstract void m(g2.c0 c0Var);

    public final void n(b2.k1 k1Var) {
        this.f42269f = k1Var;
        ArrayList arrayList = this.f42266a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((h0) obj).a(this, k1Var);
        }
    }

    public abstract void o(e0 e0Var);

    public final void p(h0 h0Var) {
        ArrayList arrayList = this.f42266a;
        arrayList.remove(h0Var);
        if (arrayList.isEmpty()) {
            this.e = null;
            this.f42269f = null;
            this.f42270g = null;
            this.f42267b.clear();
            q();
            return;
        }
        d(h0Var);
    }

    public abstract void q();

    public final void r(n2.k kVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.d.f13736c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            n2.i iVar = (n2.i) it.next();
            if (iVar.f13733b == kVar) {
                copyOnWriteArrayList.remove(iVar);
            }
        }
    }

    public final void s(m0 m0Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.f42268c.d;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            l0 l0Var = (l0) it.next();
            if (l0Var.f42374b == m0Var) {
                copyOnWriteArrayList.remove(l0Var);
            }
        }
    }

    public void e() {
    }

    public void g() {
    }

    public void t(b2.k0 k0Var) {
    }
}
