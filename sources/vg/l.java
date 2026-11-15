package vg;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
public final class l extends Thread {
    public final SurfaceTexture f58888a;
    public volatile boolean f58889b;
    public boolean f58890c;
    public final m d;

    public l(m mVar, SurfaceTexture surfaceTexture) {
        this.d = mVar;
        this.f58888a = surfaceTexture;
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: vg.l.a():void");
    }

    @Override
    public final void run() {
        synchronized (this.d.d) {
            try {
                if (this.f58889b) {
                    return;
                }
                m mVar = this.d;
                mVar.f58895c = this.f58888a;
                mVar.I = true;
                try {
                    a();
                } catch (Exception e10) {
                    if (!this.f58889b) {
                        a8.g(e10, true);
                        g0.h3(new k(this, 0));
                    }
                }
                m.b(this.d);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
