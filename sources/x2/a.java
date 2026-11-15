package x2;

import a8.ja;
import a8.xa;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
public abstract class a {
    public final ArrayList f59459a = new ArrayList(1);
    public final HashSet f59460b = new HashSet(1);
    public final xa f59461c = new xa(new CopyOnWriteArrayList(), 0, (f0) null);
    public final q2.k d = new q2.k(new CopyOnWriteArrayList(), 0, null);
    public Looper f59462e;
    public e2.l1 f59463f;
    public m2.j f59464g;

    public boolean a(e2.l0 l0Var) {
        return false;
    }

    public final xa b(f0 f0Var) {
        return new xa((CopyOnWriteArrayList) this.f59461c.d, 0, f0Var);
    }

    public abstract d0 c(f0 f0Var, h6.m mVar, long j3);

    public final void d(g0 g0Var) {
        HashSet hashSet = this.f59460b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.remove(g0Var);
        if (!isEmpty && hashSet.isEmpty()) {
            e();
        }
    }

    public final void f(g0 g0Var) {
        this.f59462e.getClass();
        HashSet hashSet = this.f59460b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(g0Var);
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

    public final void l(g0 g0Var, j2.c0 c0Var, m2.j jVar) {
        boolean z10;
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f59462e;
        if (looper != null && looper != myLooper) {
            z10 = false;
        } else {
            z10 = true;
        }
        ja.f(z10);
        this.f59464g = jVar;
        e2.l1 l1Var = this.f59463f;
        this.f59459a.add(g0Var);
        if (this.f59462e == null) {
            this.f59462e = myLooper;
            this.f59460b.add(g0Var);
            m(c0Var);
        } else if (l1Var != null) {
            f(g0Var);
            g0Var.a(this, l1Var);
        }
    }

    public abstract void m(j2.c0 c0Var);

    public final void n(e2.l1 l1Var) {
        this.f59463f = l1Var;
        ArrayList arrayList = this.f59459a;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((g0) obj).a(this, l1Var);
        }
    }

    public abstract void o(d0 d0Var);

    public final void p(g0 g0Var) {
        ArrayList arrayList = this.f59459a;
        arrayList.remove(g0Var);
        if (arrayList.isEmpty()) {
            this.f59462e = null;
            this.f59463f = null;
            this.f59464g = null;
            this.f59460b.clear();
            q();
            return;
        }
        d(g0Var);
    }

    public abstract void q();

    public final void r(q2.l lVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.d.f55187c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            q2.j jVar = (q2.j) it.next();
            if (jVar.f55184b == lVar) {
                copyOnWriteArrayList.remove(jVar);
            }
        }
    }

    public final void s(j0 j0Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.f59461c.d;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            i0 i0Var = (i0) it.next();
            if (i0Var.f59557b == j0Var) {
                copyOnWriteArrayList.remove(i0Var);
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
