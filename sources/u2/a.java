package u2;

import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import v7.u6;
public abstract class a {
    public final ArrayList f45859a = new ArrayList(1);
    public final HashSet f45860b = new HashSet(1);
    public final a5.a f45861c = new a5.a(new CopyOnWriteArrayList(), 0, null, 21);
    public final n2.k d = new n2.k(new CopyOnWriteArrayList(), 0, null);
    public Looper e;
    public b2.p1 f45862f;
    public j2.k f45863g;

    public boolean a(b2.p0 p0Var) {
        return false;
    }

    public final a5.a b(g0 g0Var) {
        return new a5.a((CopyOnWriteArrayList) this.f45861c.d, 0, g0Var, 21);
    }

    public abstract e0 c(g0 g0Var, androidx.biometric.e eVar, long j10);

    public final void d(h0 h0Var) {
        HashSet hashSet = this.f45860b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.remove(h0Var);
        if (!isEmpty && hashSet.isEmpty()) {
            e();
        }
    }

    public final void f(h0 h0Var) {
        this.e.getClass();
        HashSet hashSet = this.f45860b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(h0Var);
        if (isEmpty) {
            g();
        }
    }

    public b2.p1 h() {
        return null;
    }

    public abstract b2.p0 i();

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
        this.f45863g = kVar;
        b2.p1 p1Var = this.f45862f;
        this.f45859a.add(h0Var);
        if (this.e == null) {
            this.e = myLooper;
            this.f45860b.add(h0Var);
            m(c0Var);
        } else if (p1Var != null) {
            f(h0Var);
            h0Var.a(this, p1Var);
        }
    }

    public abstract void m(g2.c0 c0Var);

    public final void n(b2.p1 p1Var) {
        this.f45862f = p1Var;
        ArrayList arrayList = this.f45859a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((h0) obj).a(this, p1Var);
        }
    }

    public abstract void o(e0 e0Var);

    public final void p(h0 h0Var) {
        ArrayList arrayList = this.f45859a;
        arrayList.remove(h0Var);
        if (arrayList.isEmpty()) {
            this.e = null;
            this.f45862f = null;
            this.f45863g = null;
            this.f45860b.clear();
            q();
            return;
        }
        d(h0Var);
    }

    public abstract void q();

    public final void r(n2.l lVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.d.f15965c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            n2.j jVar = (n2.j) it.next();
            if (jVar.f15962b == lVar) {
                copyOnWriteArrayList.remove(jVar);
            }
        }
    }

    public final void s(k0 k0Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.f45861c.d;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            j0 j0Var = (j0) it.next();
            if (j0Var.f45944b == k0Var) {
                copyOnWriteArrayList.remove(j0Var);
            }
        }
    }

    public void e() {
    }

    public void g() {
    }

    public void t(b2.p0 p0Var) {
    }
}
