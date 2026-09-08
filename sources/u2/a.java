package u2;

import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
public abstract class a {
    public final ArrayList f46632a = new ArrayList(1);
    public final HashSet f46633b = new HashSet(1);
    public final a5.a f46634c = new a5.a(new CopyOnWriteArrayList(), 0, null, 20);
    public final n2.j d = new n2.j(new CopyOnWriteArrayList(), 0, null);
    public Looper f46635e;
    public b2.k1 f46636f;
    public j2.k f46637g;

    public boolean a(b2.k0 k0Var) {
        return false;
    }

    public final a5.a b(f0 f0Var) {
        return new a5.a((CopyOnWriteArrayList) this.f46634c.d, 0, f0Var, 20);
    }

    public abstract d0 c(f0 f0Var, y2.d dVar, long j3);

    public final void d(g0 g0Var) {
        HashSet hashSet = this.f46633b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.remove(g0Var);
        if (!isEmpty && hashSet.isEmpty()) {
            e();
        }
    }

    public final void f(g0 g0Var) {
        this.f46635e.getClass();
        HashSet hashSet = this.f46633b;
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
        Looper looper = this.f46635e;
        if (looper != null && looper != myLooper) {
            z10 = false;
        } else {
            z10 = true;
        }
        e2.d.b(z10);
        this.f46637g = kVar;
        b2.k1 k1Var = this.f46636f;
        this.f46632a.add(g0Var);
        if (this.f46635e == null) {
            this.f46635e = myLooper;
            this.f46633b.add(g0Var);
            m(c0Var);
        } else if (k1Var != null) {
            f(g0Var);
            g0Var.a(this, k1Var);
        }
    }

    public abstract void m(g2.c0 c0Var);

    public final void n(b2.k1 k1Var) {
        this.f46636f = k1Var;
        ArrayList arrayList = this.f46632a;
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
        ArrayList arrayList = this.f46632a;
        arrayList.remove(g0Var);
        if (arrayList.isEmpty()) {
            this.f46635e = null;
            this.f46636f = null;
            this.f46637g = null;
            this.f46633b.clear();
            q();
            return;
        }
        d(g0Var);
    }

    public abstract void q();

    public final void r(n2.k kVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.d.f16429c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            n2.i iVar = (n2.i) it.next();
            if (iVar.f16426b == kVar) {
                copyOnWriteArrayList.remove(iVar);
            }
        }
    }

    public final void s(k0 k0Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.f46634c.d;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            j0 j0Var = (j0) it.next();
            if (j0Var.f46739b == k0Var) {
                copyOnWriteArrayList.remove(j0Var);
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
