package sg;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class m extends Thread {
    public final SurfaceTexture f48117a;
    public volatile boolean f48118b;
    public boolean f48119c;
    public final n d;

    public m(n nVar, SurfaceTexture surfaceTexture) {
        this.d = nVar;
        this.f48117a = surfaceTexture;
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: sg.m.a():void");
    }

    @Override
    public final void run() {
        synchronized (this.d.d) {
            try {
                if (this.f48118b) {
                    return;
                }
                n nVar = this.d;
                nVar.f48124c = this.f48117a;
                nVar.H = true;
                try {
                    a();
                } catch (Exception e7) {
                    if (!this.f48118b) {
                        FileLog.e(e7);
                        AndroidUtilities.runOnUIThread(new l(this, 0));
                    }
                }
                n.b(this.d);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
