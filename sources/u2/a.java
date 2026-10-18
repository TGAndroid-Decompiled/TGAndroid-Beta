package u2;

import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import v7.u6;
public abstract class a {
    public final ArrayList f47291a = new ArrayList(1);
    public final HashSet f47292b = new HashSet(1);
    public final a5.a f47293c = new a5.a(new CopyOnWriteArrayList(), 0, null, 21);
    public final n2.k d = new n2.k(new CopyOnWriteArrayList(), 0, null);
    public Looper e;
    public b2.o1 f47294f;
    public j2.k f47295g;

    public boolean a(b2.o0 o0Var) {
        return false;
    }

    public final a5.a b(f0 f0Var) {
        return new a5.a((CopyOnWriteArrayList) this.f47293c.d, 0, f0Var, 21);
    }

    public abstract d0 c(f0 f0Var, androidx.biometric.e eVar, long j10);

    public final void d(g0 g0Var) {
        HashSet hashSet = this.f47292b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.remove(g0Var);
        if (!isEmpty && hashSet.isEmpty()) {
            e();
        }
    }

    public final void f(g0 g0Var) {
        this.e.getClass();
        HashSet hashSet = this.f47292b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(g0Var);
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

    public final void l(g0 g0Var, g2.c0 c0Var, j2.k kVar) {
        boolean z10;
        Looper myLooper = Looper.myLooper();
        Looper looper = this.e;
        if (looper != null && looper != myLooper) {
            z10 = false;
        } else {
            z10 = true;
        }
        u6.g(z10);
        this.f47295g = kVar;
        b2.o1 o1Var = this.f47294f;
        this.f47291a.add(g0Var);
        if (this.e == null) {
            this.e = myLooper;
            this.f47292b.add(g0Var);
            m(c0Var);
        } else if (o1Var != null) {
            f(g0Var);
            g0Var.a(this, o1Var);
        }
    }

    public abstract void m(g2.c0 c0Var);

    public final void n(b2.o1 o1Var) {
        this.f47294f = o1Var;
        ArrayList arrayList = this.f47291a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((g0) obj).a(this, o1Var);
        }
    }

    public abstract void o(d0 d0Var);

    public final void p(g0 g0Var) {
        ArrayList arrayList = this.f47291a;
        arrayList.remove(g0Var);
        if (arrayList.isEmpty()) {
            this.e = null;
            this.f47294f = null;
            this.f47295g = null;
            this.f47292b.clear();
            q();
            return;
        }
        d(g0Var);
    }

    public abstract void q();

    public final void r(n2.l lVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.d.f17062c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            n2.j jVar = (n2.j) it.next();
            if (jVar.f17059b == lVar) {
                copyOnWriteArrayList.remove(jVar);
            }
        }
    }

    public final void s(j0 j0Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.f47293c.d;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            i0 i0Var = (i0) it.next();
            if (i0Var.f47371b == j0Var) {
                copyOnWriteArrayList.remove(i0Var);
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
