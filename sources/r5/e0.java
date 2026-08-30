package r5;

import java.util.HashSet;
import java.util.Iterator;
public final class e0 {
    public final c f43365a;

    public e0(c cVar) {
        this.f43365a = cVar;
    }

    public final void a() {
        Iterator it = new HashSet(this.f43365a.d).iterator();
        while (it.hasNext()) {
            ((e0) it.next()).a();
        }
    }

    public final void b(int i10) {
        c cVar = this.f43365a;
        c.g(cVar, i10);
        cVar.d(i10);
        Iterator it = new HashSet(cVar.d).iterator();
        while (it.hasNext()) {
            ((e0) it.next()).b(i10);
        }
    }

    public final void c() {
        Iterator it = new HashSet(this.f43365a.d).iterator();
        while (it.hasNext()) {
            ((e0) it.next()).c();
        }
    }

    public final void d() {
        Iterator it = new HashSet(this.f43365a.d).iterator();
        while (it.hasNext()) {
            ((e0) it.next()).d();
        }
    }

    public final void e() {
        Iterator it = new HashSet(this.f43365a.d).iterator();
        while (it.hasNext()) {
            ((e0) it.next()).e();
        }
    }

    public final void f() {
        Iterator it = new HashSet(this.f43365a.d).iterator();
        while (it.hasNext()) {
            ((e0) it.next()).f();
        }
    }
}
