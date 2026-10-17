package p2;
public final class b implements Runnable {
    public final int f43941a;
    public final Object f43942b;
    public final Object f43943c;

    public b(int i10, Object obj, Object obj2) {
        this.f43941a = i10;
        this.f43942b = obj;
        this.f43943c = obj2;
    }

    private final void a() {
        r2.c cVar = (r2.c) this.f43942b;
        b bVar = (b) this.f43943c;
        cVar.f44928c.C();
        r2.f fVar = cVar.f44927b;
        synchronized (fVar.f44938a) {
            fVar.b();
            bVar.run();
        }
    }

    private final void b() {
        qa.a aVar;
        r9.p pVar = (r9.p) this.f43942b;
        qa.b bVar = (qa.b) this.f43943c;
        if (pVar.f45175b == r9.p.d) {
            synchronized (pVar) {
                aVar = pVar.f45174a;
                pVar.f45174a = null;
                pVar.f45175b = bVar;
            }
            aVar.h(bVar);
            return;
        }
        throw new IllegalStateException("provide() can be called only once.");
    }

    private final void c() {
        r9.o oVar = (r9.o) this.f43942b;
        qa.b bVar = (qa.b) this.f43943c;
        synchronized (oVar) {
            try {
                if (oVar.f45172b == null) {
                    oVar.f45171a.add(bVar);
                } else {
                    oVar.f45172b.add(bVar.get());
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
