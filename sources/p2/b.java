package p2;

import java.io.File;
public final class b implements Runnable {
    public final int f43923a;
    public final Object f43924b;
    public final Object f43925c;

    public b(int i10, Object obj, Object obj2) {
        this.f43923a = i10;
        this.f43924b = obj;
        this.f43925c = obj2;
    }

    private final void a() {
        r2.c cVar = (r2.c) this.f43924b;
        b bVar = (b) this.f43925c;
        cVar.f44910c.n();
        r2.f fVar = cVar.f44909b;
        synchronized (fVar.f44920a) {
            fVar.b();
            bVar.run();
        }
    }

    private final void b() {
        qa.a aVar;
        r9.p pVar = (r9.p) this.f43924b;
        qa.b bVar = (qa.b) this.f43925c;
        if (pVar.f45157b == r9.p.d) {
            synchronized (pVar) {
                aVar = pVar.f45156a;
                pVar.f45156a = null;
                pVar.f45157b = bVar;
            }
            aVar.h(bVar);
            return;
        }
        throw new IllegalStateException("provide() can be called only once.");
    }

    private final void c() {
        r9.o oVar = (r9.o) this.f43924b;
        qa.b bVar = (qa.b) this.f43925c;
        synchronized (oVar) {
            try {
                if (oVar.f45154b == null) {
                    oVar.f45153a.add(bVar);
                } else {
                    oVar.f45154b.add(bVar.get());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void d() {
        ri.o oVar = (ri.o) this.f43924b;
        File file = (File) this.f43925c;
        synchronized (oVar.f45841m) {
            for (int i10 = 0; i10 < oVar.f45841m.size(); i10++) {
                try {
                    File file2 = (File) oVar.f45841m.get(i10);
                    if (file != null && file.equals(file2)) {
                    }
                    if (file2.exists() && !file2.delete()) {
                        ri.b bVar = oVar.h;
                        bVar.b("temporary file deletion failed: " + file2.getName());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            oVar.f45841m.clear();
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: p2.b.run():void");
    }
}
