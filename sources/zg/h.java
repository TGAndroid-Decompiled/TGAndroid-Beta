package zg;

import android.graphics.RenderNode;
import g.z;
public final class h {
    public final RenderNode f48130a;
    public final g f48131b;
    public final z f48132c = new Object();
    public long d = 0;
    public int e;
    public int f48133f;

    public h(RenderNode renderNode, g gVar) {
        this.f48130a = renderNode;
        this.f48131b = gVar;
    }

    public final void a() {
        long j3;
        int width = this.f48130a.getWidth();
        int height = this.f48130a.getHeight();
        z zVar = this.f48132c;
        zVar.f8455a = 0L;
        boolean z10 = false;
        zVar.f8456b = false;
        g gVar = this.f48131b;
        gVar.u(zVar);
        if (zVar.f8456b) {
            j3 = -1;
        } else {
            j3 = zVar.f8455a;
        }
        z10 = (this.f48130a.hasDisplayList() && width == this.e && height == this.f48133f && j3 == this.d && j3 != -1) ? true : true;
        this.e = width;
        this.f48133f = height;
        this.d = j3;
        if (z10) {
            gVar.d(this.f48130a.beginRecording());
            this.f48130a.endRecording();
        }
    }
}
