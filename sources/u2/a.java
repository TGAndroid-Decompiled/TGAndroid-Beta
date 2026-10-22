package u2;

import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import v7.u6;
public abstract class a {
    public final ArrayList f47253a = new ArrayList(1);
    public final HashSet f47254b = new HashSet(1);
    public final a5.a f47255c = new a5.a(new CopyOnWriteArrayList(), 0, null, 21);
    public final n2.k d = new n2.k(new CopyOnWriteArrayList(), 0, null);
    public Looper e;
    public b2.o1 f47256f;
    public j2.k f47257g;

    public boolean a(b2.o0 o0Var) {
        return false;
    }

    public final a5.a b(g0 g0Var) {
        return new a5.a((CopyOnWriteArrayList) this.f47255c.d, 0, g0Var, 21);
    }

    public abstract e0 c(g0 g0Var, androidx.biometric.e eVar, long j10);

    public final void d(h0 h0Var) {
        HashSet hashSet = this.f47254b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.remove(h0Var);
        if (!isEmpty && hashSet.isEmpty()) {
            e();
        }
    }

    public final void f(h0 h0Var) {
        this.e.getClass();
        HashSet hashSet = this.f47254b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(h0Var);
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

    public final void l(h0 h0Var, g2.c0 c0Var, j2.k kVar) {
        boolean z10;
        Looper myLooper = Looper.myLooper();
        Looper looper = this.e;
        if (looper != null && looper != myLooper) {
            z10 = false;
        } else {
            z10 = true;
        }
        u6.g(z10);
        this.f47257g = kVar;
        b2.o1 o1Var = this.f47256f;
        this.f47253a.add(h0Var);
        if (this.e == null) {
            this.e = myLooper;
            this.f47254b.add(h0Var);
            m(c0Var);
        } else if (o1Var != null) {
            f(h0Var);
            h0Var.a(this, o1Var);
        }
    }

    public abstract void m(g2.c0 c0Var);

    public final void n(b2.o1 o1Var) {
        this.f47256f = o1Var;
        ArrayList arrayList = this.f47253a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((h0) obj).a(this, o1Var);
        }
    }

    public abstract void o(e0 e0Var);

    public final void p(h0 h0Var) {
        ArrayList arrayList = this.f47253a;
        arrayList.remove(h0Var);
        if (arrayList.isEmpty()) {
            this.e = null;
            this.f47256f = null;
            this.f47257g = null;
            this.f47254b.clear();
            q();
            return;
        }
        d(h0Var);
    }

    public abstract void q();

    public final void r(n2.l lVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.d.f17059c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            n2.j jVar = (n2.j) it.next();
            if (jVar.f17056b == lVar) {
                copyOnWriteArrayList.remove(jVar);
            }
        }
    }

    public final void s(l0 l0Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.f47255c.d;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            k0 k0Var = (k0) it.next();
            if (k0Var.f47347b == l0Var) {
                copyOnWriteArrayList.remove(k0Var);
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
