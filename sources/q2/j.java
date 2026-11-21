package q2;

import h2.l0;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.ui.Components.es0;
import org.telegram.ui.Components.j01;
import x2.g0;
public final class j {
    public final int f55800a;
    public final g0 f55801b;
    public final CopyOnWriteArrayList f55802c;

    public j(CopyOnWriteArrayList copyOnWriteArrayList, int i7, g0 g0Var) {
        this.f55802c = copyOnWriteArrayList;
        this.f55800a = i7;
        this.f55801b = g0Var;
    }

    public final void a(nb.a aVar) {
        Iterator it = this.f55802c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            l0.W(iVar.f55798a, new es0(this, iVar.f55799b, aVar, 25));
        }
    }

    public final void b() {
        Iterator it = this.f55802c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            l0.W(iVar.f55798a, new h(this, iVar.f55799b, 1));
        }
    }

    public final void c(int i7) {
        Iterator it = this.f55802c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            l0.W(iVar.f55798a, new j01(this, iVar.f55799b, i7, 25));
        }
    }

    public final void d(Exception exc) {
        Iterator it = this.f55802c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            l0.W(iVar.f55798a, new es0((Object) this, iVar.f55799b, (Object) exc, 24));
        }
    }

    public final void e() {
        Iterator it = this.f55802c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            l0.W(iVar.f55798a, new h(this, iVar.f55799b, 0));
        }
    }
}
