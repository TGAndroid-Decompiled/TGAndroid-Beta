package p2;

import java.io.File;
public final class b implements Runnable {
    public final int f43927a;
    public final Object f43928b;
    public final Object f43929c;

    public b(int i10, Object obj, Object obj2) {
        this.f43927a = i10;
        this.f43928b = obj;
        this.f43929c = obj2;
    }

    private final void a() {
        r2.c cVar = (r2.c) this.f43928b;
        b bVar = (b) this.f43929c;
        cVar.f44914c.n();
        r2.f fVar = cVar.f44913b;
        synchronized (fVar.f44924a) {
            fVar.b();
            bVar.run();
        }
    }

    private final void b() {
        qa.a aVar;
        r9.p pVar = (r9.p) this.f43928b;
        qa.b bVar = (qa.b) this.f43929c;
        if (pVar.f45161b == r9.p.d) {
            synchronized (pVar) {
                aVar = pVar.f45160a;
                pVar.f45160a = null;
                pVar.f45161b = bVar;
            }
            aVar.h(bVar);
            return;
        }
        throw new IllegalStateException("provide() can be called only once.");
    }

    private final void c() {
        r9.o oVar = (r9.o) this.f43928b;
        qa.b bVar = (qa.b) this.f43929c;
        synchronized (oVar) {
            try {
                if (oVar.f45158b == null) {
                    oVar.f45157a.add(bVar);
                } else {
                    oVar.f45158b.add(bVar.get());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void d() {
        ri.o oVar = (ri.o) this.f43928b;
        File file = (File) this.f43929c;
        synchronized (oVar.f45845m) {
            for (int i10 = 0; i10 < oVar.f45845m.size(); i10++) {
                try {
                    File file2 = (File) oVar.f45845m.get(i10);
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
            oVar.f45845m.clear();
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: p2.b.run():void");
    }
}
