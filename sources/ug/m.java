package ug;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class m extends Thread {
    public final SurfaceTexture f49846a;
    public volatile boolean f49847b;
    public boolean f49848c;
    public final n d;

    public m(n nVar, SurfaceTexture surfaceTexture) {
        this.d = nVar;
        this.f49846a = surfaceTexture;
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: ug.m.a():void");
    }

    @Override
    public final void run() {
        synchronized (this.d.d) {
            try {
                if (this.f49847b) {
                    return;
                }
                n nVar = this.d;
                nVar.f49853c = this.f49846a;
                nVar.H = true;
                try {
                    a();
                } catch (Exception e) {
                    if (!this.f49847b) {
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
