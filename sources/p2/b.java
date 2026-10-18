package p2;
public final class b implements Runnable {
    public final int f43961a;
    public final Object f43962b;
    public final Object f43963c;

    public b(int i10, Object obj, Object obj2) {
        this.f43961a = i10;
        this.f43962b = obj;
        this.f43963c = obj2;
    }

    private final void a() {
        r2.c cVar = (r2.c) this.f43962b;
        b bVar = (b) this.f43963c;
        cVar.f44948c.C();
        r2.f fVar = cVar.f44947b;
        synchronized (fVar.f44958a) {
            fVar.b();
            bVar.run();
        }
    }

    private final void b() {
        qa.a aVar;
        r9.p pVar = (r9.p) this.f43962b;
        qa.b bVar = (qa.b) this.f43963c;
        if (pVar.f45195b == r9.p.d) {
            synchronized (pVar) {
                aVar = pVar.f45194a;
                pVar.f45194a = null;
                pVar.f45195b = bVar;
            }
            aVar.h(bVar);
            return;
        }
        throw new IllegalStateException("provide() can be called only once.");
    }

    private final void c() {
        r9.o oVar = (r9.o) this.f43962b;
        qa.b bVar = (qa.b) this.f43963c;
        synchronized (oVar) {
            try {
                if (oVar.f45192b == null) {
                    oVar.f45191a.add(bVar);
                } else {
                    oVar.f45192b.add(bVar.get());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: p2.b.run():void");
    }
}
