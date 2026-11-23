package q2;

import h2.l0;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.ui.Components.as0;
import org.telegram.ui.Components.e21;
import x2.g0;
public final class j {
    public final int f55882a;
    public final g0 f55883b;
    public final CopyOnWriteArrayList f55884c;

    public j(CopyOnWriteArrayList copyOnWriteArrayList, int i7, g0 g0Var) {
        this.f55884c = copyOnWriteArrayList;
        this.f55882a = i7;
        this.f55883b = g0Var;
    }

    public final void a(nb.a aVar) {
        Iterator it = this.f55884c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            l0.W(iVar.f55880a, new as0(this, iVar.f55881b, aVar, 26));
        }
    }

    public final void b() {
        Iterator it = this.f55884c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            l0.W(iVar.f55880a, new h(this, iVar.f55881b, 1));
        }
    }

    public final void c(int i7) {
        Iterator it = this.f55884c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            l0.W(iVar.f55880a, new e21(this, iVar.f55881b, i7, 24));
        }
    }

    public final void d(Exception exc) {
        Iterator it = this.f55884c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            l0.W(iVar.f55880a, new as0(this, iVar.f55881b, exc, 25));
        }
    }

    public final void e() {
        Iterator it = this.f55884c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            l0.W(iVar.f55880a, new h(this, iVar.f55881b, 0));
        }
    }
}
