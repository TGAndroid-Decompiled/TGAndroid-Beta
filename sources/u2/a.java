package u2;

import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import v7.t6;
public abstract class a {
    public final ArrayList f49817a = new ArrayList(1);
    public final HashSet f49818b = new HashSet(1);
    public final a5.a f49819c = new a5.a(new CopyOnWriteArrayList(), 0, (Object) null, 22);
    public final n2.j d = new n2.j(new CopyOnWriteArrayList(), 0, null);
    public Looper e;
    public b2.o1 f49820f;
    public j2.l f49821g;

    public boolean a(b2.p0 p0Var) {
        return false;
    }

    public final a5.a b(g0 g0Var) {
        return new a5.a((CopyOnWriteArrayList) this.f49819c.d, 0, g0Var, 22);
    }

    public abstract e0 c(g0 g0Var, android.support.v4.media.session.a0 a0Var, long j10);

    public final void d(h0 h0Var) {
        HashSet hashSet = this.f49818b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.remove(h0Var);
        if (!isEmpty && hashSet.isEmpty()) {
            e();
        }
    }

    public final void f(h0 h0Var) {
        this.e.getClass();
        HashSet hashSet = this.f49818b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(h0Var);
        if (isEmpty) {
            g();
        }
    }

    public b2.o1 h() {
        return null;
    }

    public abstract b2.p0 i();

    public boolean j() {
        return true;
    }

    public abstract void k();

    public final void l(h0 h0Var, g2.d0 d0Var, j2.l lVar) {
        boolean z10;
        Looper myLooper = Looper.myLooper();
        Looper looper = this.e;
        if (looper != null && looper != myLooper) {
            z10 = false;
        } else {
            z10 = true;
        }
        t6.f(z10);
        this.f49821g = lVar;
        b2.o1 o1Var = this.f49820f;
        this.f49817a.add(h0Var);
        if (this.e == null) {
            this.e = myLooper;
            this.f49818b.add(h0Var);
            m(d0Var);
        } else if (o1Var != null) {
            f(h0Var);
            h0Var.a(this, o1Var);
        }
    }

    public abstract void m(g2.d0 d0Var);

    public final void n(b2.o1 o1Var) {
        this.f49820f = o1Var;
        ArrayList arrayList = this.f49817a;
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
        ArrayList arrayList = this.f49817a;
        arrayList.remove(h0Var);
        if (arrayList.isEmpty()) {
            this.e = null;
            this.f49820f = null;
            this.f49821g = null;
            this.f49818b.clear();
            q();
            return;
        }
        d(h0Var);
    }

    public abstract void q();

    public final void r(n2.k kVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.d.f13463c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            n2.i iVar = (n2.i) it.next();
            if (iVar.f13460b == kVar) {
                copyOnWriteArrayList.remove(iVar);
            }
        }
    }

    public final void s(k0 k0Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.f49819c.d;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            j0 j0Var = (j0) it.next();
            if (j0Var.f49902b == k0Var) {
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
