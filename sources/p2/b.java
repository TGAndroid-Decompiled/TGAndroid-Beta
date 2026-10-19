package p2;
public final class b implements Runnable {
    public final int f43913a;
    public final Object f43914b;
    public final Object f43915c;

    public b(int i10, Object obj, Object obj2) {
        this.f43913a = i10;
        this.f43914b = obj;
        this.f43915c = obj2;
    }

    private final void a() {
        r2.c cVar = (r2.c) this.f43914b;
        b bVar = (b) this.f43915c;
        cVar.f44900c.n();
        r2.f fVar = cVar.f44899b;
        synchronized (fVar.f44910a) {
            fVar.b();
            bVar.run();
        }
    }

    private final void b() {
        qa.a aVar;
        r9.p pVar = (r9.p) this.f43914b;
        qa.b bVar = (qa.b) this.f43915c;
        if (pVar.f45147b == r9.p.d) {
            synchronized (pVar) {
                aVar = pVar.f45146a;
                pVar.f45146a = null;
                pVar.f45147b = bVar;
            }
            aVar.h(bVar);
            return;
        }
        throw new IllegalStateException("provide() can be called only once.");
    }

    private final void c() {
        r9.o oVar = (r9.o) this.f43914b;
        qa.b bVar = (qa.b) this.f43915c;
        synchronized (oVar) {
            try {
                if (oVar.f45144b == null) {
                    oVar.f45143a.add(bVar);
                } else {
                    oVar.f45144b.add(bVar.get());
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
