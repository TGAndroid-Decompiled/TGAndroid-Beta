package p2;

import java.io.File;
public final class b implements Runnable {
    public final int f44341a;
    public final Object f44342b;
    public final Object f44343c;

    public b(int i10, Object obj, Object obj2) {
        this.f44341a = i10;
        this.f44342b = obj;
        this.f44343c = obj2;
    }

    private final void a() {
        r2.c cVar = (r2.c) this.f44342b;
        b bVar = (b) this.f44343c;
        cVar.f45325c.p();
        r2.f fVar = cVar.f45324b;
        synchronized (fVar.f45335a) {
            fVar.b();
            bVar.run();
        }
    }

    private final void b() {
        qa.a aVar;
        r9.p pVar = (r9.p) this.f44342b;
        qa.b bVar = (qa.b) this.f44343c;
        if (pVar.f45572b == r9.p.d) {
            synchronized (pVar) {
                aVar = pVar.f45571a;
                pVar.f45571a = null;
                pVar.f45572b = bVar;
            }
            aVar.h(bVar);
            return;
        }
        throw new IllegalStateException("provide() can be called only once.");
    }

    private final void c() {
        r9.o oVar = (r9.o) this.f44342b;
        qa.b bVar = (qa.b) this.f44343c;
        synchronized (oVar) {
            try {
                if (oVar.f45569b == null) {
                    oVar.f45568a.add(bVar);
                } else {
                    oVar.f45569b.add(bVar.get());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void d() {
        ri.o oVar = (ri.o) this.f44342b;
        File file = (File) this.f44343c;
        synchronized (oVar.f46265m) {
            for (int i10 = 0; i10 < oVar.f46265m.size(); i10++) {
                try {
                    File file2 = (File) oVar.f46265m.get(i10);
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
            oVar.f46265m.clear();
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: p2.b.run():void");
    }
}
