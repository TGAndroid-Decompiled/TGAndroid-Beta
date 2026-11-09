package q2;

import h2.m0;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.ui.Components.s31;
import org.telegram.ui.f10;
import x2.g0;
public final class j {
    public final int f53749a;
    public final g0 f53750b;
    public final CopyOnWriteArrayList f53751c;

    public j(CopyOnWriteArrayList copyOnWriteArrayList, int i7, g0 g0Var) {
        this.f53751c = copyOnWriteArrayList;
        this.f53749a = i7;
        this.f53750b = g0Var;
    }

    public final void a(qb.a aVar) {
        Iterator it = this.f53751c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            m0.W(iVar.f53747a, new s31(this, iVar.f53748b, aVar, 16));
        }
    }

    public final void b() {
        Iterator it = this.f53751c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            m0.W(iVar.f53747a, new h(this, iVar.f53748b, 1));
        }
    }

    public final void c(int i7) {
        Iterator it = this.f53751c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            m0.W(iVar.f53747a, new f10(this, iVar.f53748b, i7, 21));
        }
    }

    public final void d(Exception exc) {
        Iterator it = this.f53751c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            m0.W(iVar.f53747a, new s31(this, iVar.f53748b, exc, 15));
        }
    }

    public final void e() {
        Iterator it = this.f53751c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            m0.W(iVar.f53747a, new h(this, iVar.f53748b, 0));
        }
    }
}
