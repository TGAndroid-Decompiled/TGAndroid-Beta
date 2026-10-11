package sg;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class m extends Thread {
    public final SurfaceTexture f48163a;
    public volatile boolean f48164b;
    public boolean f48165c;
    public final n d;

    public m(n nVar, SurfaceTexture surfaceTexture) {
        this.d = nVar;
        this.f48163a = surfaceTexture;
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: sg.m.a():void");
    }

    @Override
    public final void run() {
        synchronized (this.d.d) {
            try {
                if (this.f48164b) {
                    return;
                }
                n nVar = this.d;
                nVar.f48170c = this.f48163a;
                nVar.H = true;
                try {
                    a();
                } catch (Exception e7) {
                    if (!this.f48164b) {
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
