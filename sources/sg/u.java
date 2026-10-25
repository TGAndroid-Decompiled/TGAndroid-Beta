package sg;

import android.graphics.Bitmap;
import java.io.File;
public final class u implements Runnable {
    public final int f48520a;
    public final Object f48521b;
    public final Object f48522c;

    public u(int i10, Object obj, Object obj2) {
        this.f48520a = i10;
        this.f48522c = obj;
        this.f48521b = obj2;
    }

    private final void a() {
        ui.o oVar = (ui.o) this.f48522c;
        File file = (File) this.f48521b;
        synchronized (oVar.f49955m) {
            for (int i10 = 0; i10 < oVar.f49955m.size(); i10++) {
                try {
                    File file2 = (File) oVar.f49955m.get(i10);
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
            oVar.f49955m.clear();
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: sg.u.run():void");
    }

    public u(z1 z1Var, Bitmap bitmap) {
        this.f48520a = 1;
        this.f48521b = z1Var;
        this.f48522c = bitmap;
    }
}
