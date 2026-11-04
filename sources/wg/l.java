package wg;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
public final class l extends Thread {
    public final SurfaceTexture f57661a;
    public volatile boolean f57662b;
    public boolean f57663c;
    public final m d;

    public l(m mVar, SurfaceTexture surfaceTexture) {
        this.d = mVar;
        this.f57661a = surfaceTexture;
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: wg.l.a():void");
    }

    @Override
    public final void run() {
        synchronized (this.d.d) {
            try {
                if (this.f57662b) {
                    return;
                }
                m mVar = this.d;
                mVar.f57668c = this.f57661a;
                mVar.I = true;
                try {
                    a();
                } catch (Exception e10) {
                    if (!this.f57662b) {
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
