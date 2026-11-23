package vg;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
public final class m extends Thread {
    public final SurfaceTexture f59465a;
    public volatile boolean f59466b;
    public boolean f59467c;
    public final n d;

    public m(n nVar, SurfaceTexture surfaceTexture) {
        this.d = nVar;
        this.f59465a = surfaceTexture;
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: vg.m.a():void");
    }

    @Override
    public final void run() {
        synchronized (this.d.d) {
            try {
                if (this.f59466b) {
                    return;
                }
                n nVar = this.d;
                nVar.f59472c = this.f59465a;
                nVar.I = true;
                try {
                    a();
                } catch (Exception e10) {
                    if (!this.f59466b) {
                        a8.g(e10, true);
                        g0.g3(new l(this, 0));
                    }
                }
                n.b(this.d);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
