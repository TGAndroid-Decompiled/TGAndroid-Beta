package q2;

import h2.m0;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.ui.Components.r31;
import org.telegram.ui.d10;
import x2.g0;
public final class j {
    public final int f53736a;
    public final g0 f53737b;
    public final CopyOnWriteArrayList f53738c;

    public j(CopyOnWriteArrayList copyOnWriteArrayList, int i7, g0 g0Var) {
        this.f53738c = copyOnWriteArrayList;
        this.f53736a = i7;
        this.f53737b = g0Var;
    }

    public final void a(qb.a aVar) {
        Iterator it = this.f53738c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            m0.W(iVar.f53734a, new r31(this, iVar.f53735b, aVar, 16));
        }
    }

    public final void b() {
        Iterator it = this.f53738c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            m0.W(iVar.f53734a, new h(this, iVar.f53735b, 1));
        }
    }

    public final void c(int i7) {
        Iterator it = this.f53738c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            m0.W(iVar.f53734a, new d10(this, iVar.f53735b, i7, 21));
        }
    }

    public final void d(Exception exc) {
        Iterator it = this.f53738c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            m0.W(iVar.f53734a, new r31(this, iVar.f53735b, exc, 15));
        }
    }

    public final void e() {
        Iterator it = this.f53738c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            m0.W(iVar.f53734a, new h(this, iVar.f53735b, 0));
        }
    }
}
