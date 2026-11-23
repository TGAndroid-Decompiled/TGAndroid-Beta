package q2;

import h2.l0;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.ui.Components.es0;
import org.telegram.ui.Components.f21;
import x2.g0;
public final class j {
    public final int f55769a;
    public final g0 f55770b;
    public final CopyOnWriteArrayList f55771c;

    public j(CopyOnWriteArrayList copyOnWriteArrayList, int i7, g0 g0Var) {
        this.f55771c = copyOnWriteArrayList;
        this.f55769a = i7;
        this.f55770b = g0Var;
    }

    public final void a(nb.a aVar) {
        Iterator it = this.f55771c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            l0.W(iVar.f55767a, new es0(this, iVar.f55768b, aVar, 25));
        }
    }

    public final void b() {
        Iterator it = this.f55771c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            l0.W(iVar.f55767a, new h(this, iVar.f55768b, 1));
        }
    }

    public final void c(int i7) {
        Iterator it = this.f55771c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            l0.W(iVar.f55767a, new f21(this, iVar.f55768b, i7, 24));
        }
    }

    public final void d(Exception exc) {
        Iterator it = this.f55771c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            l0.W(iVar.f55767a, new es0((Object) this, iVar.f55768b, (Object) exc, 24));
        }
    }

    public final void e() {
        Iterator it = this.f55771c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            l0.W(iVar.f55767a, new h(this, iVar.f55768b, 0));
        }
    }
}
