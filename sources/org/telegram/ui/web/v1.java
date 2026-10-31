package org.telegram.ui.web;
public final class v1 implements Runnable {
    public final int f43218a;
    public final Object f43219b;
    public final Object f43220c;

    public v1(int i10, Object obj, Object obj2) {
        this.f43218a = i10;
        this.f43219b = obj;
        this.f43220c = obj2;
    }

    private final void a() {
        r2.c cVar = (r2.c) this.f43219b;
        v1 v1Var = (v1) this.f43220c;
        cVar.f46209c.x();
        r2.f fVar = cVar.f46208b;
        synchronized (fVar.f46219a) {
            fVar.b();
            v1Var.run();
        }
    }

    private final void b() {
        qa.a aVar;
        r9.p pVar = (r9.p) this.f43219b;
        qa.b bVar = (qa.b) this.f43220c;
        if (pVar.f46452b == r9.p.d) {
            synchronized (pVar) {
                aVar = pVar.f46451a;
                pVar.f46451a = null;
                pVar.f46452b = bVar;
            }
            aVar.i(bVar);
            return;
        }
        throw new IllegalStateException("provide() can be called only once.");
    }

    private final void c() {
        r9.o oVar = (r9.o) this.f43219b;
        qa.b bVar = (qa.b) this.f43220c;
        synchronized (oVar) {
            try {
                if (oVar.f46449b == null) {
                    oVar.f46448a.add(bVar);
                } else {
                    oVar.f46449b.add(bVar.get());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.v1.run():void");
    }
}
