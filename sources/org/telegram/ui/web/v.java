package org.telegram.ui.web;
public final class v implements Runnable {
    public final int f41196a;
    public final Object f41197b;
    public final Object f41198c;

    public v(int i10, Object obj, Object obj2) {
        this.f41196a = i10;
        this.f41197b = obj;
        this.f41198c = obj2;
    }

    private final void a() {
        r2.c cVar = (r2.c) this.f41197b;
        v vVar = (v) this.f41198c;
        cVar.f43572c.s0();
        r2.f fVar = cVar.f43571b;
        synchronized (fVar.f43582a) {
            fVar.b();
            vVar.run();
        }
    }

    private final void b() {
        qa.a aVar;
        r9.p pVar = (r9.p) this.f41197b;
        qa.b bVar = (qa.b) this.f41198c;
        if (pVar.f43819b == r9.p.d) {
            synchronized (pVar) {
                aVar = pVar.f43818a;
                pVar.f43818a = null;
                pVar.f43819b = bVar;
            }
            aVar.h(bVar);
            return;
        }
        throw new IllegalStateException("provide() can be called only once.");
    }

    private final void c() {
        r9.o oVar = (r9.o) this.f41197b;
        qa.b bVar = (qa.b) this.f41198c;
        synchronized (oVar) {
            try {
                if (oVar.f43816b == null) {
                    oVar.f43815a.add(bVar);
                } else {
                    oVar.f43816b.add(bVar.get());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.v.run():void");
    }
}
