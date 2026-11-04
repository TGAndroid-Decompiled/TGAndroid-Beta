package p2;

import g2.n0;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.ui.Components.iv0;
import org.telegram.ui.rw;
import w2.g0;
public final class j {
    public final int f53115a;
    public final g0 f53116b;
    public final CopyOnWriteArrayList f53117c;

    public j(CopyOnWriteArrayList copyOnWriteArrayList, int i3, g0 g0Var) {
        this.f53117c = copyOnWriteArrayList;
        this.f53115a = i3;
        this.f53116b = g0Var;
    }

    public final void a(v7.s sVar) {
        Iterator it = this.f53117c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            n0.W(iVar.f53113a, new iv0(this, iVar.f53114b, sVar, 18));
        }
    }

    public final void b() {
        Iterator it = this.f53117c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            n0.W(iVar.f53113a, new h(this, iVar.f53114b, 1));
        }
    }

    public final void c(int i3) {
        Iterator it = this.f53117c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            n0.W(iVar.f53113a, new rw(this, iVar.f53114b, i3, 22));
        }
    }

    public final void d(Exception exc) {
        Iterator it = this.f53117c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            n0.W(iVar.f53113a, new iv0(this, iVar.f53114b, exc, 17));
        }
    }

    public final void e() {
        Iterator it = this.f53117c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            n0.W(iVar.f53113a, new h(this, iVar.f53114b, 0));
        }
    }
}
