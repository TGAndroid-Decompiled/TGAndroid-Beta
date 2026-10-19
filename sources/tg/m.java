package tg;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class m extends Thread {
    public final SurfaceTexture f47098a;
    public volatile boolean f47099b;
    public boolean f47100c;
    public final n d;

    public m(n nVar, SurfaceTexture surfaceTexture) {
        this.d = nVar;
        this.f47098a = surfaceTexture;
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: tg.m.a():void");
    }

    @Override
    public final void run() {
        synchronized (this.d.d) {
            try {
                if (this.f47099b) {
                    return;
                }
                n nVar = this.d;
                nVar.f47105c = this.f47098a;
                nVar.H = true;
                try {
                    a();
                } catch (Exception e) {
                    if (!this.f47099b) {
                        FileLog.e(e);
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
