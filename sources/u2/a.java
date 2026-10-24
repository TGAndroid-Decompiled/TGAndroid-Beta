package u2;

import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import v7.u6;
public abstract class a {
    public final ArrayList f47688a = new ArrayList(1);
    public final HashSet f47689b = new HashSet(1);
    public final a5.a f47690c = new a5.a(new CopyOnWriteArrayList(), 0, null, 21);
    public final n2.k d = new n2.k(new CopyOnWriteArrayList(), 0, null);
    public Looper e;
    public b2.o1 f47691f;
    public j2.j f47692g;

    public boolean a(b2.o0 o0Var) {
        return false;
    }

    public final a5.a b(h0 h0Var) {
        return new a5.a((CopyOnWriteArrayList) this.f47690c.d, 0, h0Var, 21);
    }

    public abstract f0 c(h0 h0Var, androidx.biometric.e eVar, long j10);

    public final void d(i0 i0Var) {
        HashSet hashSet = this.f47689b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.remove(i0Var);
        if (!isEmpty && hashSet.isEmpty()) {
            e();
        }
    }

    public final void f(i0 i0Var) {
        this.e.getClass();
        HashSet hashSet = this.f47689b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(i0Var);
        if (isEmpty) {
            g();
        }
    }

    public b2.o1 h() {
        return null;
    }

    public abstract b2.o0 i();

    public boolean j() {
        return true;
    }

    public abstract void k();

    public final void l(i0 i0Var, g2.c0 c0Var, j2.j jVar) {
        boolean z10;
        Looper myLooper = Looper.myLooper();
        Looper looper = this.e;
        if (looper != null && looper != myLooper) {
            z10 = false;
        } else {
            z10 = true;
        }
        u6.g(z10);
        this.f47692g = jVar;
        b2.o1 o1Var = this.f47691f;
        this.f47688a.add(i0Var);
        if (this.e == null) {
            this.e = myLooper;
            this.f47689b.add(i0Var);
            m(c0Var);
        } else if (o1Var != null) {
            f(i0Var);
            i0Var.a(this, o1Var);
        }
    }

    public abstract void m(g2.c0 c0Var);

    public final void n(b2.o1 o1Var) {
        this.f47691f = o1Var;
        ArrayList arrayList = this.f47688a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((i0) obj).a(this, o1Var);
        }
    }

    public abstract void o(f0 f0Var);

    public final void p(i0 i0Var) {
        ArrayList arrayList = this.f47688a;
        arrayList.remove(i0Var);
        if (arrayList.isEmpty()) {
            this.e = null;
            this.f47691f = null;
            this.f47692g = null;
            this.f47689b.clear();
            q();
            return;
        }
        d(i0Var);
    }

    public abstract void q();

    public final void r(n2.l lVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.d.f17122c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            n2.j jVar = (n2.j) it.next();
            if (jVar.f17119b == lVar) {
                copyOnWriteArrayList.remove(jVar);
            }
        }
    }

    public final void s(m0 m0Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.f47690c.d;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            l0 l0Var = (l0) it.next();
            if (l0Var.f47799b == m0Var) {
                copyOnWriteArrayList.remove(l0Var);
            }
        }
    }

    public void e() {
    }

    public void g() {
    }

    public void t(b2.o0 o0Var) {
    }
}
