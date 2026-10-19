package p2;
public final class b implements Runnable {
    public final int f43915a;
    public final Object f43916b;
    public final Object f43917c;

    public b(int i10, Object obj, Object obj2) {
        this.f43915a = i10;
        this.f43916b = obj;
        this.f43917c = obj2;
    }

    private final void a() {
        r2.c cVar = (r2.c) this.f43916b;
        b bVar = (b) this.f43917c;
        cVar.f44902c.n();
        r2.f fVar = cVar.f44901b;
        synchronized (fVar.f44912a) {
            fVar.b();
            bVar.run();
        }
    }

    private final void b() {
        qa.a aVar;
        r9.p pVar = (r9.p) this.f43916b;
        qa.b bVar = (qa.b) this.f43917c;
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
        r9.o oVar = (r9.o) this.f43916b;
        qa.b bVar = (qa.b) this.f43917c;
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
        throw new UnsupportedOperationException("Method not decompiled: p2.b.run():void");
    }
}
