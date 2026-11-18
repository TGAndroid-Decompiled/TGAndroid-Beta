package wg;

import java.io.File;
public final class r implements Runnable {
    public final int f59814a;
    public final Object f59815b;
    public final Object f59816c;

    public r(int i7, Object obj, Object obj2) {
        this.f59814a = i7;
        this.f59815b = obj;
        this.f59816c = obj2;
    }

    private final void a() {
        yi.j jVar = (yi.j) this.f59815b;
        File file = (File) this.f59816c;
        synchronized (jVar.f61327m) {
            for (int i7 = 0; i7 < jVar.f61327m.size(); i7++) {
                try {
                    File file2 = (File) jVar.f61327m.get(i7);
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
            jVar.f61327m.clear();
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: wg.r.run():void");
    }
}
