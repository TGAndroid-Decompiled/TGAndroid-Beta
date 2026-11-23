package vg;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
public final class l extends Thread {
    public final SurfaceTexture f59500a;
    public volatile boolean f59501b;
    public boolean f59502c;
    public final m d;

    public l(m mVar, SurfaceTexture surfaceTexture) {
        this.d = mVar;
        this.f59500a = surfaceTexture;
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: vg.l.a():void");
    }

    @Override
    public final void run() {
        synchronized (this.d.d) {
            try {
                if (this.f59501b) {
                    return;
                }
                m mVar = this.d;
                mVar.f59507c = this.f59500a;
                mVar.I = true;
                try {
                    a();
                } catch (Exception e10) {
                    if (!this.f59501b) {
                        a8.g(e10, true);
                        g0.g3(new k(this, 0));
                    }
                }
                m.b(this.d);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
