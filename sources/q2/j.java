package q2;

import h2.m0;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.ui.Components.r31;
import org.telegram.ui.h10;
import x2.f0;
public final class j {
    public final int f53748a;
    public final f0 f53749b;
    public final CopyOnWriteArrayList f53750c;

    public j(CopyOnWriteArrayList copyOnWriteArrayList, int i7, f0 f0Var) {
        this.f53750c = copyOnWriteArrayList;
        this.f53748a = i7;
        this.f53749b = f0Var;
    }

    public final void a(qb.a aVar) {
        Iterator it = this.f53750c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            m0.W(iVar.f53746a, new r31(this, iVar.f53747b, aVar, 16));
        }
    }

    public final void b() {
        Iterator it = this.f53750c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            m0.W(iVar.f53746a, new h(this, iVar.f53747b, 1));
        }
    }

    public final void c(int i7) {
        Iterator it = this.f53750c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            m0.W(iVar.f53746a, new h10(this, iVar.f53747b, i7, 21));
        }
    }

    public final void d(Exception exc) {
        Iterator it = this.f53750c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            m0.W(iVar.f53746a, new r31(this, iVar.f53747b, exc, 15));
        }
    }

    public final void e() {
        Iterator it = this.f53750c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            m0.W(iVar.f53746a, new h(this, iVar.f53747b, 0));
        }
    }
}
