package u9;

import java.io.File;
public final class a implements Runnable {
    public final int f55743a;
    public final Object f55744b;
    public final Object f55745c;

    public a(int i3, Object obj, Object obj2) {
        this.f55743a = i3;
        this.f55744b = obj;
        this.f55745c = obj2;
    }

    private final void a() {
        vi.j jVar = (vi.j) this.f55744b;
        File file = (File) this.f55745c;
        synchronized (jVar.f56991m) {
            for (int i3 = 0; i3 < jVar.f56991m.size(); i3++) {
                try {
                    File file2 = (File) jVar.f56991m.get(i3);
                    if (file != null && file.equals(file2)) {
                    }
                    if (file2.exists() && !file2.delete()) {
                        vi.b bVar = jVar.h;
                        bVar.b("temporary file deletion failed: " + file2.getName());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            jVar.f56991m.clear();
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: u9.a.run():void");
    }
}
