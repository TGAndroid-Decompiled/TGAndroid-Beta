package ug;

import java.io.File;
public final class t1 implements Runnable {
    public final int f58338a;
    public final Object f58339b;
    public final Object f58340c;

    public t1(int i7, Object obj, Object obj2) {
        this.f58338a = i7;
        this.f58339b = obj;
        this.f58340c = obj2;
    }

    private final void a() {
        yi.j jVar = (yi.j) this.f58339b;
        File file = (File) this.f58340c;
        synchronized (jVar.f60762m) {
            for (int i7 = 0; i7 < jVar.f60762m.size(); i7++) {
                try {
                    File file2 = (File) jVar.f60762m.get(i7);
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
            jVar.f60762m.clear();
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ug.t1.run():void");
    }
}
