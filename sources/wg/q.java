package wg;

import java.io.File;
public final class q implements Runnable {
    public final int f59853a;
    public final Object f59854b;
    public final Object f59855c;

    public q(int i7, Object obj, Object obj2) {
        this.f59853a = i7;
        this.f59854b = obj;
        this.f59855c = obj2;
    }

    private final void a() {
        yi.j jVar = (yi.j) this.f59854b;
        File file = (File) this.f59855c;
        synchronized (jVar.f61368m) {
            for (int i7 = 0; i7 < jVar.f61368m.size(); i7++) {
                try {
                    File file2 = (File) jVar.f61368m.get(i7);
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
            jVar.f61368m.clear();
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: wg.q.run():void");
    }
}
