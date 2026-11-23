package v9;

import java.io.File;
public final class b implements Runnable {
    public final int f59433a;
    public final Object f59434b;
    public final Object f59435c;

    public b(int i7, Object obj, Object obj2) {
        this.f59433a = i7;
        this.f59434b = obj;
        this.f59435c = obj2;
    }

    private final void a() {
        yi.j jVar = (yi.j) this.f59434b;
        File file = (File) this.f59435c;
        synchronized (jVar.f61456m) {
            for (int i7 = 0; i7 < jVar.f61456m.size(); i7++) {
                try {
                    File file2 = (File) jVar.f61456m.get(i7);
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
            jVar.f61456m.clear();
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: v9.b.run():void");
    }
}
