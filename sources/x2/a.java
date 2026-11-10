package x2;

import a8.ia;
import a8.wa;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
public abstract class a {
    public final ArrayList f58278a = new ArrayList(1);
    public final HashSet f58279b = new HashSet(1);
    public final wa f58280c = new wa(new CopyOnWriteArrayList(), 0, (f0) null);
    public final q2.j d = new q2.j(new CopyOnWriteArrayList(), 0, null);
    public Looper f58281e;
    public e2.l1 f58282f;
    public m2.j f58283g;

    public boolean a(e2.l0 l0Var) {
        return false;
    }

    public final wa b(f0 f0Var) {
        return new wa((CopyOnWriteArrayList) this.f58280c.d, 0, f0Var);
    }

    public abstract d0 c(f0 f0Var, h6.m mVar, long j3);

    public final void d(g0 g0Var) {
        HashSet hashSet = this.f58279b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.remove(g0Var);
        if (!isEmpty && hashSet.isEmpty()) {
            e();
        }
    }

    public final void f(g0 g0Var) {
        this.f58281e.getClass();
        HashSet hashSet = this.f58279b;
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

    public final void l(g0 g0Var, j2.d0 d0Var, m2.j jVar) {
        boolean z9;
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f58281e;
        if (looper != null && looper != myLooper) {
            z9 = false;
        } else {
            z9 = true;
        }
        ia.f(z9);
        this.f58283g = jVar;
        e2.l1 l1Var = this.f58282f;
        this.f58278a.add(g0Var);
        if (this.f58281e == null) {
            this.f58281e = myLooper;
            this.f58279b.add(g0Var);
            m(d0Var);
        } else if (l1Var != null) {
            f(g0Var);
            g0Var.a(this, l1Var);
        }
    }

    public abstract void m(j2.d0 d0Var);

    public final void n(e2.l1 l1Var) {
        this.f58282f = l1Var;
        ArrayList arrayList = this.f58278a;
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
        ArrayList arrayList = this.f58278a;
        arrayList.remove(g0Var);
        if (arrayList.isEmpty()) {
            this.f58281e = null;
            this.f58282f = null;
            this.f58283g = null;
            this.f58279b.clear();
            q();
            return;
        }
        d(g0Var);
    }

    public abstract void q();

    public final void r(q2.k kVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.d.f53750c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            q2.i iVar = (q2.i) it.next();
            if (iVar.f53747b == kVar) {
                copyOnWriteArrayList.remove(iVar);
            }
        }
    }

    public final void s(j0 j0Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.f58280c.d;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            i0 i0Var = (i0) it.next();
            if (i0Var.f58376b == j0Var) {
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
