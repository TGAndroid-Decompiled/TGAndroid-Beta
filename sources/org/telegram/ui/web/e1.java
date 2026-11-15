package org.telegram.ui.web;
public final class e1 implements Runnable {
    public final int f52599a;
    public final Object f52600b;
    public final Object f52601c;

    public e1(int i7, Object obj, Object obj2) {
        this.f52599a = i7;
        this.f52600b = obj;
        this.f52601c = obj2;
    }

    private final void a() {
        u2.c cVar = (u2.c) this.f52600b;
        e1 e1Var = (e1) this.f52601c;
        cVar.f57734c.Y();
        u2.f fVar = cVar.f57733b;
        synchronized (fVar.f57747a) {
            fVar.b();
            e1Var.run();
        }
    }

    private final void b() {
        ua.a aVar;
        u9.o oVar = (u9.o) this.f52600b;
        ua.b bVar = (ua.b) this.f52601c;
        if (oVar.f57994b == u9.o.d) {
            synchronized (oVar) {
                aVar = oVar.f57993a;
                oVar.f57993a = null;
                oVar.f57994b = bVar;
            }
            aVar.b(bVar);
            return;
        }
        throw new IllegalStateException("provide() can be called only once.");
    }

    private final void c() {
        u9.n nVar = (u9.n) this.f52600b;
        ua.b bVar = (ua.b) this.f52601c;
        synchronized (nVar) {
            try {
                if (nVar.f57991b == null) {
                    nVar.f57990a.add(bVar);
                } else {
                    nVar.f57991b.add(bVar.get());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.e1.run():void");
    }

    public e1(p4.d0 d0Var, p4.v vVar, Runnable runnable) {
        this.f52599a = 4;
        this.f52600b = d0Var;
        this.f52601c = runnable;
    }
}
