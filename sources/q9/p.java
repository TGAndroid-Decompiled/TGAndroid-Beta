package q9;

import org.telegram.ui.ds0;
public final class p implements pa.b {
    public static final org.webrtc.audio.b f41591c = new org.webrtc.audio.b(11);
    public static final f d = new f(1);
    public pa.a f41592a;
    public volatile pa.b f41593b;

    public p(org.webrtc.audio.b bVar, pa.b bVar2) {
        this.f41592a = bVar;
        this.f41593b = bVar2;
    }

    public final void a(pa.a aVar) {
        pa.b bVar;
        pa.b bVar2;
        pa.b bVar3 = this.f41593b;
        f fVar = d;
        if (bVar3 != fVar) {
            aVar.g(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.f41593b;
            if (bVar != fVar) {
                bVar2 = bVar;
            } else {
                this.f41592a = new ds0(25, this.f41592a, aVar);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            aVar.g(bVar);
        }
    }

    @Override
    public final Object get() {
        return this.f41593b.get();
    }
}
