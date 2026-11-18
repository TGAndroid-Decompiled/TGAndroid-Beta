package wg;

import java.io.File;
public final class r implements Runnable {
    public final int f59813a;
    public final Object f59814b;
    public final Object f59815c;

    public r(int i7, Object obj, Object obj2) {
        this.f59813a = i7;
        this.f59814b = obj;
        this.f59815c = obj2;
    }

    private final void a() {
        yi.j jVar = (yi.j) this.f59814b;
        File file = (File) this.f59815c;
        synchronized (jVar.f61326m) {
            for (int i7 = 0; i7 < jVar.f61326m.size(); i7++) {
                try {
                    File file2 = (File) jVar.f61326m.get(i7);
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
            jVar.f61326m.clear();
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: wg.r.run():void");
    }
}
