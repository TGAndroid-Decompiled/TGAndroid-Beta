package q2;

import h2.l0;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.ui.Components.h01;
import org.telegram.ui.Components.sv0;
import x2.g0;
public final class j {
    public final int f55759a;
    public final g0 f55760b;
    public final CopyOnWriteArrayList f55761c;

    public j(CopyOnWriteArrayList copyOnWriteArrayList, int i7, g0 g0Var) {
        this.f55761c = copyOnWriteArrayList;
        this.f55759a = i7;
        this.f55760b = g0Var;
    }

    public final void a(nb.a aVar) {
        Iterator it = this.f55761c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            l0.W(iVar.f55757a, new sv0(this, iVar.f55758b, aVar, 24));
        }
    }

    public final void b() {
        Iterator it = this.f55761c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            l0.W(iVar.f55757a, new h(this, iVar.f55758b, 1));
        }
    }

    public final void c(int i7) {
        Iterator it = this.f55761c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            l0.W(iVar.f55757a, new h01(this, iVar.f55758b, i7, 25));
        }
    }

    public final void d(Exception exc) {
        Iterator it = this.f55761c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            l0.W(iVar.f55757a, new sv0(this, iVar.f55758b, exc, 23));
        }
    }

    public final void e() {
        Iterator it = this.f55761c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            l0.W(iVar.f55757a, new h(this, iVar.f55758b, 0));
        }
    }
}
