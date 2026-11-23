package p4;
public final class z implements Runnable {
    public final int f55505a;
    public final Object f55506b;
    public final Object f55507c;

    public z(int i7, Object obj, Object obj2) {
        this.f55505a = i7;
        this.f55506b = obj;
        this.f55507c = obj2;
    }

    private final void a() {
        u2.c cVar = (u2.c) this.f55506b;
        z zVar = (z) this.f55507c;
        cVar.f58347c.j();
        u2.f fVar = cVar.f58346b;
        synchronized (fVar.f58360a) {
            fVar.b();
            zVar.run();
        }
    }

    private final void b() {
        ua.a aVar;
        u9.o oVar = (u9.o) this.f55506b;
        ua.b bVar = (ua.b) this.f55507c;
        if (oVar.f58605b == u9.o.d) {
            synchronized (oVar) {
                aVar = oVar.f58604a;
                oVar.f58604a = null;
                oVar.f58605b = bVar;
            }
            aVar.b(bVar);
            return;
        }
        throw new IllegalStateException("provide() can be called only once.");
    }

    private final void c() {
        u9.n nVar = (u9.n) this.f55506b;
        ua.b bVar = (ua.b) this.f55507c;
        synchronized (nVar) {
            try {
                if (nVar.f58602b == null) {
                    nVar.f58601a.add(bVar);
                } else {
                    nVar.f58602b.add(bVar.get());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: p4.z.run():void");
    }
}
