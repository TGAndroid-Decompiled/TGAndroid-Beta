package vg;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
public final class l extends Thread {
    public final SurfaceTexture f57407a;
    public volatile boolean f57408b;
    public boolean f57409c;
    public final m d;

    public l(m mVar, SurfaceTexture surfaceTexture) {
        this.d = mVar;
        this.f57407a = surfaceTexture;
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: vg.l.a():void");
    }

    @Override
    public final void run() {
        synchronized (this.d.d) {
            try {
                if (this.f57408b) {
                    return;
                }
                m mVar = this.d;
                mVar.f57414c = this.f57407a;
                mVar.H = true;
                try {
                    a();
                } catch (Exception e10) {
                    if (!this.f57408b) {
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
