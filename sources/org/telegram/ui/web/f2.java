package org.telegram.ui.web;
public final class f2 implements Runnable {
    public final int f43490a;
    public final Object f43491b;
    public final Object f43492c;

    public f2(int i10, Object obj, Object obj2) {
        this.f43490a = i10;
        this.f43491b = obj;
        this.f43492c = obj2;
    }

    private final void a() {
        pa.a aVar;
        q9.q qVar = (q9.q) this.f43491b;
        pa.b bVar = (pa.b) this.f43492c;
        if (qVar.f46118b == q9.q.d) {
            synchronized (qVar) {
                aVar = qVar.f46117a;
                qVar.f46117a = null;
                qVar.f46118b = bVar;
            }
            aVar.g(bVar);
            return;
        }
        throw new IllegalStateException("provide() can be called only once.");
    }

    private final void b() {
        q9.o oVar = (q9.o) this.f43491b;
        pa.b bVar = (pa.b) this.f43492c;
        synchronized (oVar) {
            try {
                if (oVar.f46112b == null) {
                    oVar.f46111a.add(bVar);
                } else {
                    oVar.f46112b.add(bVar.get());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.f2.run():void");
    }
}
