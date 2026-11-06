package q2;

import h2.m0;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.ui.Components.q31;
import org.telegram.ui.d10;
import x2.g0;
public final class j {
    public final int f53644a;
    public final g0 f53645b;
    public final CopyOnWriteArrayList f53646c;

    public j(CopyOnWriteArrayList copyOnWriteArrayList, int i7, g0 g0Var) {
        this.f53646c = copyOnWriteArrayList;
        this.f53644a = i7;
        this.f53645b = g0Var;
    }

    public final void a(qb.a aVar) {
        Iterator it = this.f53646c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            m0.W(iVar.f53642a, new q31(this, iVar.f53643b, aVar, 16));
        }
    }

    public final void b() {
        Iterator it = this.f53646c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            m0.W(iVar.f53642a, new h(this, iVar.f53643b, 1));
        }
    }

    public final void c(int i7) {
        Iterator it = this.f53646c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            m0.W(iVar.f53642a, new d10(this, iVar.f53643b, i7, 22));
        }
    }

    public final void d(Exception exc) {
        Iterator it = this.f53646c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            m0.W(iVar.f53642a, new q31(this, iVar.f53643b, exc, 15));
        }
    }

    public final void e() {
        Iterator it = this.f53646c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            m0.W(iVar.f53642a, new h(this, iVar.f53643b, 0));
        }
    }
}
