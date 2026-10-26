package sg;

import android.graphics.Bitmap;
import java.io.File;
public final class u implements Runnable {
    public final int f48523a;
    public final Object f48524b;
    public final Object f48525c;

    public u(int i10, Object obj, Object obj2) {
        this.f48523a = i10;
        this.f48525c = obj;
        this.f48524b = obj2;
    }

    private final void a() {
        ui.o oVar = (ui.o) this.f48525c;
        File file = (File) this.f48524b;
        synchronized (oVar.f49958m) {
            for (int i10 = 0; i10 < oVar.f49958m.size(); i10++) {
                try {
                    File file2 = (File) oVar.f49958m.get(i10);
                    if (file != null && file.equals(file2)) {
                    }
                    if (file2.exists() && !file2.delete()) {
                        ui.b bVar = oVar.h;
                        bVar.b("temporary file deletion failed: " + file2.getName());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            oVar.f49958m.clear();
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: sg.u.run():void");
    }

    public u(z1 z1Var, Bitmap bitmap) {
        this.f48523a = 1;
        this.f48524b = z1Var;
        this.f48525c = bitmap;
    }
}
