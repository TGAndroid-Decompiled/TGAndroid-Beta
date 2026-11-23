package wg;

import java.io.File;
public final class q implements Runnable {
    public final int f59857a;
    public final Object f59858b;
    public final Object f59859c;

    public q(int i7, Object obj, Object obj2) {
        this.f59857a = i7;
        this.f59858b = obj;
        this.f59859c = obj2;
    }

    private final void a() {
        yi.j jVar = (yi.j) this.f59858b;
        File file = (File) this.f59859c;
        synchronized (jVar.f61372m) {
            for (int i7 = 0; i7 < jVar.f61372m.size(); i7++) {
                try {
                    File file2 = (File) jVar.f61372m.get(i7);
                    if (file != null && file.equals(file2)) {
                    }
                    if (file2.exists() && !file2.delete()) {
                        yi.b bVar = jVar.h;
                        bVar.b("temporary file deletion failed: " + file2.getName());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            jVar.f61372m.clear();
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: wg.q.run():void");
    }
}
