package org.telegram.ui.web;
public final class g2 implements Runnable {
    public final int f42596a;
    public final Object f42597b;
    public final Object f42598c;

    public g2(int i10, Object obj, Object obj2) {
        this.f42596a = i10;
        this.f42597b = obj;
        this.f42598c = obj2;
    }

    private final void a() {
        r2.c cVar = (r2.c) this.f42597b;
        g2 g2Var = (g2) this.f42598c;
        cVar.f44902c.C();
        r2.f fVar = cVar.f44901b;
        synchronized (fVar.f44912a) {
            fVar.b();
            g2Var.run();
        }
    }

    private final void b() {
        qa.a aVar;
        r9.p pVar = (r9.p) this.f42597b;
        qa.b bVar = (qa.b) this.f42598c;
        if (pVar.f45149b == r9.p.d) {
            synchronized (pVar) {
                aVar = pVar.f45148a;
                pVar.f45148a = null;
                pVar.f45149b = bVar;
            }
            aVar.h(bVar);
            return;
        }
        throw new IllegalStateException("provide() can be called only once.");
    }

    private final void c() {
        r9.o oVar = (r9.o) this.f42597b;
        qa.b bVar = (qa.b) this.f42598c;
        synchronized (oVar) {
            try {
                if (oVar.f45146b == null) {
                    oVar.f45145a.add(bVar);
                } else {
                    oVar.f45146b.add(bVar.get());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.g2.run():void");
    }
}
