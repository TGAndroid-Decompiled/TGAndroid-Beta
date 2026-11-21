package p4;
public final class z implements Runnable {
    public final int f55501a;
    public final Object f55502b;
    public final Object f55503c;

    public z(int i7, Object obj, Object obj2) {
        this.f55501a = i7;
        this.f55502b = obj;
        this.f55503c = obj2;
    }

    private final void a() {
        u2.c cVar = (u2.c) this.f55502b;
        z zVar = (z) this.f55503c;
        cVar.f58343c.j();
        u2.f fVar = cVar.f58342b;
        synchronized (fVar.f58356a) {
            fVar.b();
            zVar.run();
        }
    }

    private final void b() {
        ua.a aVar;
        u9.o oVar = (u9.o) this.f55502b;
        ua.b bVar = (ua.b) this.f55503c;
        if (oVar.f58601b == u9.o.d) {
            synchronized (oVar) {
                aVar = oVar.f58600a;
                oVar.f58600a = null;
                oVar.f58601b = bVar;
            }
            aVar.b(bVar);
            return;
        }
        throw new IllegalStateException("provide() can be called only once.");
    }

    private final void c() {
        u9.n nVar = (u9.n) this.f55502b;
        ua.b bVar = (ua.b) this.f55503c;
        synchronized (nVar) {
            try {
                if (nVar.f58598b == null) {
                    nVar.f58597a.add(bVar);
                } else {
                    nVar.f58598b.add(bVar.get());
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
