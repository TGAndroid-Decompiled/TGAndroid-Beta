package wg;

import java.io.File;
public final class r implements Runnable {
    public final int f59824a;
    public final Object f59825b;
    public final Object f59826c;

    public r(int i7, Object obj, Object obj2) {
        this.f59824a = i7;
        this.f59825b = obj;
        this.f59826c = obj2;
    }

    private final void a() {
        yi.j jVar = (yi.j) this.f59825b;
        File file = (File) this.f59826c;
        synchronized (jVar.f61337m) {
            for (int i7 = 0; i7 < jVar.f61337m.size(); i7++) {
                try {
                    File file2 = (File) jVar.f61337m.get(i7);
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
            jVar.f61337m.clear();
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: wg.r.run():void");
    }
}
