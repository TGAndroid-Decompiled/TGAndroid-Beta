package org.telegram.ui.web;
public final class t1 implements Runnable {
    public final int f53552a;
    public final Object f53553b;
    public final Object f53554c;

    public t1(int i7, Object obj, Object obj2) {
        this.f53552a = i7;
        this.f53553b = obj;
        this.f53554c = obj2;
    }

    private final void a() {
        u2.c cVar = (u2.c) this.f53553b;
        t1 t1Var = (t1) this.f53554c;
        cVar.f58427c.w1();
        u2.f fVar = cVar.f58426b;
        synchronized (fVar.f58440a) {
            fVar.b();
            t1Var.run();
        }
    }

    private final void b() {
        ua.a aVar;
        u9.o oVar = (u9.o) this.f53553b;
        ua.b bVar = (ua.b) this.f53554c;
        if (oVar.f58685b == u9.o.d) {
            synchronized (oVar) {
                aVar = oVar.f58684a;
                oVar.f58684a = null;
                oVar.f58685b = bVar;
            }
            aVar.b(bVar);
            return;
        }
        throw new IllegalStateException("provide() can be called only once.");
    }

    private final void c() {
        u9.n nVar = (u9.n) this.f53553b;
        ua.b bVar = (ua.b) this.f53554c;
        synchronized (nVar) {
            try {
                if (nVar.f58682b == null) {
                    nVar.f58681a.add(bVar);
                } else {
                    nVar.f58682b.add(bVar.get());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.t1.run():void");
    }

    public t1(p4.d0 d0Var, p4.v vVar, Runnable runnable) {
        this.f53552a = 2;
        this.f53553b = d0Var;
        this.f53554c = runnable;
    }
}
