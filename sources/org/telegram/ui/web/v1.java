package org.telegram.ui.web;
public final class v1 implements Runnable {
    public final int f43020a;
    public final Object f43021b;
    public final Object f43022c;

    public v1(int i10, Object obj, Object obj2) {
        this.f43020a = i10;
        this.f43021b = obj;
        this.f43022c = obj2;
    }

    private final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.v1.a():void");
    }

    private final void b() {
        r2.c cVar = (r2.c) this.f43021b;
        v1 v1Var = (v1) this.f43022c;
        cVar.f46220c.x();
        r2.f fVar = cVar.f46219b;
        synchronized (fVar.f46230a) {
            fVar.b();
            v1Var.run();
        }
    }

    private final void c() {
        qa.a aVar;
        r9.p pVar = (r9.p) this.f43021b;
        qa.b bVar = (qa.b) this.f43022c;
        if (pVar.f46463b == r9.p.d) {
            synchronized (pVar) {
                aVar = pVar.f46462a;
                pVar.f46462a = null;
                pVar.f46463b = bVar;
            }
            aVar.i(bVar);
            return;
        }
        throw new IllegalStateException("provide() can be called only once.");
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.v1.run():void");
    }
}
