package sg;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class m extends Thread {
    public final SurfaceTexture f48312a;
    public volatile boolean f48313b;
    public boolean f48314c;
    public final n d;

    public m(n nVar, SurfaceTexture surfaceTexture) {
        this.d = nVar;
        this.f48312a = surfaceTexture;
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: sg.m.a():void");
    }

    @Override
    public final void run() {
        synchronized (this.d.d) {
            try {
                if (this.f48313b) {
                    return;
                }
                n nVar = this.d;
                nVar.f48319c = this.f48312a;
                nVar.H = true;
                try {
                    a();
                } catch (Exception e7) {
                    if (!this.f48313b) {
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
