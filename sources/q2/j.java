package q2;

import h2.m0;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.ui.Components.r31;
import org.telegram.ui.d10;
import x2.g0;
public final class j {
    public final int f53737a;
    public final g0 f53738b;
    public final CopyOnWriteArrayList f53739c;

    public j(CopyOnWriteArrayList copyOnWriteArrayList, int i7, g0 g0Var) {
        this.f53739c = copyOnWriteArrayList;
        this.f53737a = i7;
        this.f53738b = g0Var;
    }

    public final void a(qb.a aVar) {
        Iterator it = this.f53739c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            m0.W(iVar.f53735a, new r31(this, iVar.f53736b, aVar, 16));
        }
    }

    public final void b() {
        Iterator it = this.f53739c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            m0.W(iVar.f53735a, new h(this, iVar.f53736b, 1));
        }
    }

    public final void c(int i7) {
        Iterator it = this.f53739c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            m0.W(iVar.f53735a, new d10(this, iVar.f53736b, i7, 21));
        }
    }

    public final void d(Exception exc) {
        Iterator it = this.f53739c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            m0.W(iVar.f53735a, new r31(this, iVar.f53736b, exc, 15));
        }
    }

    public final void e() {
        Iterator it = this.f53739c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            m0.W(iVar.f53735a, new h(this, iVar.f53736b, 0));
        }
    }
}
