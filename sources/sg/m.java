package sg;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class m extends Thread {
    public final SurfaceTexture f48071a;
    public volatile boolean f48072b;
    public boolean f48073c;
    public final n d;

    public m(n nVar, SurfaceTexture surfaceTexture) {
        this.d = nVar;
        this.f48071a = surfaceTexture;
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: sg.m.a():void");
    }

    @Override
    public final void run() {
        synchronized (this.d.d) {
            try {
                if (this.f48072b) {
                    return;
                }
                n nVar = this.d;
                nVar.f48078c = this.f48071a;
                nVar.H = true;
                try {
                    a();
                } catch (Exception e7) {
                    if (!this.f48072b) {
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
