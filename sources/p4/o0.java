package p4;
public final class o0 implements Runnable {
    public final int f55377a;
    public final Object f55378b;
    public final Object f55379c;

    public o0(int i7, Object obj, Object obj2) {
        this.f55377a = i7;
        this.f55378b = obj;
        this.f55379c = obj2;
    }

    private final void a() {
        u2.c cVar = (u2.c) this.f55378b;
        o0 o0Var = (o0) this.f55379c;
        cVar.f58301c.j();
        u2.f fVar = cVar.f58300b;
        synchronized (fVar.f58314a) {
            fVar.b();
            o0Var.run();
        }
    }

    private final void b() {
        ua.a aVar;
        u9.o oVar = (u9.o) this.f55378b;
        ua.b bVar = (ua.b) this.f55379c;
        if (oVar.f58559b == u9.o.d) {
            synchronized (oVar) {
                aVar = oVar.f58558a;
                oVar.f58558a = null;
                oVar.f58559b = bVar;
            }
            aVar.b(bVar);
            return;
        }
        throw new IllegalStateException("provide() can be called only once.");
    }

    private final void c() {
        u9.n nVar = (u9.n) this.f55378b;
        ua.b bVar = (ua.b) this.f55379c;
        synchronized (nVar) {
            try {
                if (nVar.f58556b == null) {
                    nVar.f58555a.add(bVar);
                } else {
                    nVar.f58556b.add(bVar.get());
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
