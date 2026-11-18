package x2;

import a8.la;
import a8.xa;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
public abstract class a {
    public final ArrayList f60023a = new ArrayList(1);
    public final HashSet f60024b = new HashSet(1);
    public final xa f60025c = new xa(new CopyOnWriteArrayList(), 0, (g0) null);
    public final q2.j d = new q2.j(new CopyOnWriteArrayList(), 0, null);
    public Looper f60026e;
    public e2.l1 f60027f;
    public m2.i f60028g;

    public boolean a(e2.l0 l0Var) {
        return false;
    }

    public final xa b(g0 g0Var) {
        return new xa((CopyOnWriteArrayList) this.f60025c.d, 0, g0Var);
    }

    public abstract e0 c(g0 g0Var, h6.m mVar, long j3);

    public final void d(h0 h0Var) {
        HashSet hashSet = this.f60024b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.remove(h0Var);
        if (!isEmpty && hashSet.isEmpty()) {
            e();
        }
    }

    public final void f(h0 h0Var) {
        this.f60026e.getClass();
        HashSet hashSet = this.f60024b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(h0Var);
        if (isEmpty) {
            g();
        }
    }

    public e2.l1 h() {
        return null;
    }

    public abstract e2.l0 i();

    public boolean j() {
        return true;
    }

    public abstract void k();

    public final void l(h0 h0Var, j2.c0 c0Var, m2.i iVar) {
        boolean z10;
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f60026e;
        if (looper != null && looper != myLooper) {
            z10 = false;
        } else {
            z10 = true;
        }
        la.f(z10);
        this.f60028g = iVar;
        e2.l1 l1Var = this.f60027f;
        this.f60023a.add(h0Var);
        if (this.f60026e == null) {
            this.f60026e = myLooper;
            this.f60024b.add(h0Var);
            m(c0Var);
        } else if (l1Var != null) {
            f(h0Var);
            h0Var.a(this, l1Var);
        }
    }

    public abstract void m(j2.c0 c0Var);

    public final void n(e2.l1 l1Var) {
        this.f60027f = l1Var;
        ArrayList arrayList = this.f60023a;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((h0) obj).a(this, l1Var);
        }
    }

    public abstract void o(e0 e0Var);

    public final void p(h0 h0Var) {
        ArrayList arrayList = this.f60023a;
        arrayList.remove(h0Var);
        if (arrayList.isEmpty()) {
            this.f60026e = null;
            this.f60027f = null;
            this.f60028g = null;
            this.f60024b.clear();
            q();
            return;
        }
        d(h0Var);
    }

    public abstract void q();

    public final void r(q2.k kVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.d.f55761c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            q2.i iVar = (q2.i) it.next();
            if (iVar.f55758b == kVar) {
                copyOnWriteArrayList.remove(iVar);
            }
        }
    }

    public final void s(k0 k0Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.f60025c.d;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            j0 j0Var = (j0) it.next();
            if (j0Var.f60115b == k0Var) {
                copyOnWriteArrayList.remove(j0Var);
            }
        }
    }

    public void e() {
    }

    public void g() {
    }

    public void t(e2.l0 l0Var) {
    }
}
