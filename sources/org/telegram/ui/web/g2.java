package org.telegram.ui.web;
public final class g2 implements Runnable {
    public final int f39018a;
    public final Object f39019b;
    public final Object f39020c;

    public g2(int i10, Object obj, Object obj2) {
        this.f39018a = i10;
        this.f39019b = obj;
        this.f39020c = obj2;
    }

    private final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.g2.a():void");
    }

    private final void b() {
        pa.a aVar;
        q9.p pVar = (q9.p) this.f39019b;
        pa.b bVar = (pa.b) this.f39020c;
        if (pVar.f41524b == q9.p.d) {
            synchronized (pVar) {
                aVar = pVar.f41523a;
                pVar.f41523a = null;
                pVar.f41524b = bVar;
            }
            aVar.g(bVar);
            return;
        }
        throw new IllegalStateException("provide() can be called only once.");
    }

    private final void c() {
        q9.o oVar = (q9.o) this.f39019b;
        pa.b bVar = (pa.b) this.f39020c;
        synchronized (oVar) {
            try {
                if (oVar.f41521b == null) {
                    oVar.f41520a.add(bVar);
                } else {
                    oVar.f41521b.add(bVar.get());
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
