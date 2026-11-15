package q2;

import h2.l0;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.ui.Components.lv0;
import org.telegram.ui.Components.u11;
import x2.f0;
public final class k {
    public final int f55185a;
    public final f0 f55186b;
    public final CopyOnWriteArrayList f55187c;

    public k(CopyOnWriteArrayList copyOnWriteArrayList, int i7, f0 f0Var) {
        this.f55187c = copyOnWriteArrayList;
        this.f55185a = i7;
        this.f55186b = f0Var;
    }

    public final void a(nb.a aVar) {
        Iterator it = this.f55187c.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            l0.W(jVar.f55183a, new lv0(this, jVar.f55184b, aVar, 20));
        }
    }

    public final void b() {
        Iterator it = this.f55187c.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            l0.W(jVar.f55183a, new i(this, jVar.f55184b, 1));
        }
    }

    public final void c(int i7) {
        Iterator it = this.f55187c.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            l0.W(jVar.f55183a, new u11(this, jVar.f55184b, i7, 24));
        }
    }

    public final void d(Exception exc) {
        Iterator it = this.f55187c.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            l0.W(jVar.f55183a, new lv0(this, jVar.f55184b, exc, 19));
        }
    }

    public final void e() {
        Iterator it = this.f55187c.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            l0.W(jVar.f55183a, new i(this, jVar.f55184b, 0));
        }
    }
}
