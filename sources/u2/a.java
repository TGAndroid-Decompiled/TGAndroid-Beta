package u2;

import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
public abstract class a {
    public final ArrayList f43584a = new ArrayList(1);
    public final HashSet f43585b = new HashSet(1);
    public final a5.a f43586c = new a5.a(new CopyOnWriteArrayList(), 0, null, 20);
    public final n2.k d = new n2.k(new CopyOnWriteArrayList(), 0, null);
    public Looper e;
    public b2.k1 f43587f;
    public j2.k f43588g;

    public boolean a(b2.k0 k0Var) {
        return false;
    }

    public final a5.a b(f0 f0Var) {
        return new a5.a((CopyOnWriteArrayList) this.f43586c.d, 0, f0Var, 20);
    }

    public abstract d0 c(f0 f0Var, y2.d dVar, long j3);

    public final void d(g0 g0Var) {
        HashSet hashSet = this.f43585b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.remove(g0Var);
        if (!isEmpty && hashSet.isEmpty()) {
            e();
        }
    }

    public final void f(g0 g0Var) {
        this.e.getClass();
        HashSet hashSet = this.f43585b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(g0Var);
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

    public final void l(g0 g0Var, g2.c0 c0Var, j2.k kVar) {
        boolean z10;
        Looper myLooper = Looper.myLooper();
        Looper looper = this.e;
        if (looper != null && looper != myLooper) {
            z10 = false;
        } else {
            z10 = true;
        }
        e2.d.b(z10);
        this.f43588g = kVar;
        b2.k1 k1Var = this.f43587f;
        this.f43584a.add(g0Var);
        if (this.e == null) {
            this.e = myLooper;
            this.f43585b.add(g0Var);
            m(c0Var);
        } else if (k1Var != null) {
            f(g0Var);
            g0Var.a(this, k1Var);
        }
    }

    public abstract void m(g2.c0 c0Var);

    public final void n(b2.k1 k1Var) {
        this.f43587f = k1Var;
        ArrayList arrayList = this.f43584a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((g0) obj).a(this, k1Var);
        }
    }

    public abstract void o(d0 d0Var);

    public final void p(g0 g0Var) {
        ArrayList arrayList = this.f43584a;
        arrayList.remove(g0Var);
        if (arrayList.isEmpty()) {
            this.e = null;
            this.f43587f = null;
            this.f43588g = null;
            this.f43585b.clear();
            q();
            return;
        }
        d(g0Var);
    }

    public abstract void q();

    public final void r(n2.l lVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.d.f15135c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            n2.j jVar = (n2.j) it.next();
            if (jVar.f15132b == lVar) {
                copyOnWriteArrayList.remove(jVar);
            }
        }
    }

    public final void s(j0 j0Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.f43586c.d;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            i0 i0Var = (i0) it.next();
            if (i0Var.f43674b == j0Var) {
                copyOnWriteArrayList.remove(i0Var);
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
