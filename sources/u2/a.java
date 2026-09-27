package u2;

import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
public abstract class a {
    public final ArrayList f43629a = new ArrayList(1);
    public final HashSet f43630b = new HashSet(1);
    public final a5.a f43631c = new a5.a(new CopyOnWriteArrayList(), 0, null, 20);
    public final n2.j d = new n2.j(new CopyOnWriteArrayList(), 0, null);
    public Looper e;
    public b2.k1 f43632f;
    public j2.k f43633g;

    public boolean a(b2.k0 k0Var) {
        return false;
    }

    public final a5.a b(f0 f0Var) {
        return new a5.a((CopyOnWriteArrayList) this.f43631c.d, 0, f0Var, 20);
    }

    public abstract d0 c(f0 f0Var, y2.d dVar, long j3);

    public final void d(g0 g0Var) {
        HashSet hashSet = this.f43630b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.remove(g0Var);
        if (!isEmpty && hashSet.isEmpty()) {
            e();
        }
    }

    public final void f(g0 g0Var) {
        this.e.getClass();
        HashSet hashSet = this.f43630b;
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
        this.f43633g = kVar;
        b2.k1 k1Var = this.f43632f;
        this.f43629a.add(g0Var);
        if (this.e == null) {
            this.e = myLooper;
            this.f43630b.add(g0Var);
            m(c0Var);
        } else if (k1Var != null) {
            f(g0Var);
            g0Var.a(this, k1Var);
        }
    }

    public abstract void m(g2.c0 c0Var);

    public final void n(b2.k1 k1Var) {
        this.f43632f = k1Var;
        ArrayList arrayList = this.f43629a;
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
        ArrayList arrayList = this.f43629a;
        arrayList.remove(g0Var);
        if (arrayList.isEmpty()) {
            this.e = null;
            this.f43632f = null;
            this.f43633g = null;
            this.f43630b.clear();
            q();
            return;
        }
        d(g0Var);
    }

    public abstract void q();

    public final void r(n2.k kVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.d.f15170c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            n2.i iVar = (n2.i) it.next();
            if (iVar.f15167b == kVar) {
                copyOnWriteArrayList.remove(iVar);
            }
        }
    }

    public final void s(j0 j0Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.f43631c.d;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            i0 i0Var = (i0) it.next();
            if (i0Var.f43719b == j0Var) {
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
