package q2;

import h2.m0;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.ui.Components.l31;
import org.telegram.ui.d10;
import x2.g0;
public final class j {
    public final int f53619a;
    public final g0 f53620b;
    public final CopyOnWriteArrayList f53621c;

    public j(CopyOnWriteArrayList copyOnWriteArrayList, int i7, g0 g0Var) {
        this.f53621c = copyOnWriteArrayList;
        this.f53619a = i7;
        this.f53620b = g0Var;
    }

    public final void a(qb.a aVar) {
        Iterator it = this.f53621c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            m0.W(iVar.f53617a, new l31(this, iVar.f53618b, aVar, 16));
        }
    }

    public final void b() {
        Iterator it = this.f53621c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            m0.W(iVar.f53617a, new h(this, iVar.f53618b, 1));
        }
    }

    public final void c(int i7) {
        Iterator it = this.f53621c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            m0.W(iVar.f53617a, new d10(this, iVar.f53618b, i7, 22));
        }
    }

    public final void d(Exception exc) {
        Iterator it = this.f53621c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            m0.W(iVar.f53617a, new l31(this, iVar.f53618b, exc, 15));
        }
    }

    public final void e() {
        Iterator it = this.f53621c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            m0.W(iVar.f53617a, new h(this, iVar.f53618b, 0));
        }
    }
}
