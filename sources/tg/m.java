package tg;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class m extends Thread {
    public final SurfaceTexture f45735a;
    public volatile boolean f45736b;
    public boolean f45737c;
    public final n d;

    public m(n nVar, SurfaceTexture surfaceTexture) {
        this.d = nVar;
        this.f45735a = surfaceTexture;
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: tg.m.a():void");
    }

    @Override
    public final void run() {
        synchronized (this.d.d) {
            try {
                if (this.f45736b) {
                    return;
                }
                n nVar = this.d;
                nVar.f45742c = this.f45735a;
                nVar.H = true;
                try {
                    a();
                } catch (Exception e) {
                    if (!this.f45736b) {
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
