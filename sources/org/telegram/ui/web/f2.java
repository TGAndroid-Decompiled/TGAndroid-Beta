package org.telegram.ui.web;
public final class f2 implements Runnable {
    public final int f43524a;
    public final Object f43525b;
    public final Object f43526c;

    public f2(int i10, Object obj, Object obj2) {
        this.f43524a = i10;
        this.f43525b = obj;
        this.f43526c = obj2;
    }

    private final void a() {
        pa.a aVar;
        q9.q qVar = (q9.q) this.f43525b;
        pa.b bVar = (pa.b) this.f43526c;
        if (qVar.f46152b == q9.q.d) {
            synchronized (qVar) {
                aVar = qVar.f46151a;
                qVar.f46151a = null;
                qVar.f46152b = bVar;
            }
            aVar.g(bVar);
            return;
        }
        throw new IllegalStateException("provide() can be called only once.");
    }

    private final void b() {
        q9.o oVar = (q9.o) this.f43525b;
        pa.b bVar = (pa.b) this.f43526c;
        synchronized (oVar) {
            try {
                if (oVar.f46146b == null) {
                    oVar.f46145a.add(bVar);
                } else {
                    oVar.f46146b.add(bVar.get());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.f2.run():void");
    }
}
