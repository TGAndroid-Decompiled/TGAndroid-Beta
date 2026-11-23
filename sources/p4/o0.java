package p4;
public final class o0 implements Runnable {
    public final int f55387a;
    public final Object f55388b;
    public final Object f55389c;

    public o0(int i7, Object obj, Object obj2) {
        this.f55387a = i7;
        this.f55388b = obj;
        this.f55389c = obj2;
    }

    private final void a() {
        u2.c cVar = (u2.c) this.f55388b;
        o0 o0Var = (o0) this.f55389c;
        cVar.f58312c.j();
        u2.f fVar = cVar.f58311b;
        synchronized (fVar.f58325a) {
            fVar.b();
            o0Var.run();
        }
    }

    private final void b() {
        ua.a aVar;
        u9.o oVar = (u9.o) this.f55388b;
        ua.b bVar = (ua.b) this.f55389c;
        if (oVar.f58570b == u9.o.d) {
            synchronized (oVar) {
                aVar = oVar.f58569a;
                oVar.f58569a = null;
                oVar.f58570b = bVar;
            }
            aVar.b(bVar);
            return;
        }
        throw new IllegalStateException("provide() can be called only once.");
    }

    private final void c() {
        u9.n nVar = (u9.n) this.f55388b;
        ua.b bVar = (ua.b) this.f55389c;
        synchronized (nVar) {
            try {
                if (nVar.f58567b == null) {
                    nVar.f58566a.add(bVar);
                } else {
                    nVar.f58567b.add(bVar.get());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: p4.o0.run():void");
    }
}
