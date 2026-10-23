package p2;

import java.io.File;
public final class b implements Runnable {
    public final int f44342a;
    public final Object f44343b;
    public final Object f44344c;

    public b(int i10, Object obj, Object obj2) {
        this.f44342a = i10;
        this.f44343b = obj;
        this.f44344c = obj2;
    }

    private final void a() {
        r2.c cVar = (r2.c) this.f44343b;
        b bVar = (b) this.f44344c;
        cVar.f45326c.p();
        r2.f fVar = cVar.f45325b;
        synchronized (fVar.f45336a) {
            fVar.b();
            bVar.run();
        }
    }

    private final void b() {
        qa.a aVar;
        r9.p pVar = (r9.p) this.f44343b;
        qa.b bVar = (qa.b) this.f44344c;
        if (pVar.f45573b == r9.p.d) {
            synchronized (pVar) {
                aVar = pVar.f45572a;
                pVar.f45572a = null;
                pVar.f45573b = bVar;
            }
            aVar.h(bVar);
            return;
        }
        throw new IllegalStateException("provide() can be called only once.");
    }

    private final void c() {
        r9.o oVar = (r9.o) this.f44343b;
        qa.b bVar = (qa.b) this.f44344c;
        synchronized (oVar) {
            try {
                if (oVar.f45570b == null) {
                    oVar.f45569a.add(bVar);
                } else {
                    oVar.f45570b.add(bVar.get());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void d() {
        ri.o oVar = (ri.o) this.f44343b;
        File file = (File) this.f44344c;
        synchronized (oVar.f46266m) {
            for (int i10 = 0; i10 < oVar.f46266m.size(); i10++) {
                try {
                    File file2 = (File) oVar.f46266m.get(i10);
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
            oVar.f46266m.clear();
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: p2.b.run():void");
    }
}
