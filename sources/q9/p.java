package q9;

import org.telegram.ui.ds0;
public final class p implements pa.b {
    public static final org.webrtc.audio.b f41493c = new org.webrtc.audio.b(11);
    public static final f d = new f(1);
    public pa.a f41494a;
    public volatile pa.b f41495b;

    public p(org.webrtc.audio.b bVar, pa.b bVar2) {
        this.f41494a = bVar;
        this.f41495b = bVar2;
    }

    public final void a(pa.a aVar) {
        pa.b bVar;
        pa.b bVar2;
        pa.b bVar3 = this.f41495b;
        f fVar = d;
        if (bVar3 != fVar) {
            aVar.g(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.f41495b;
            if (bVar != fVar) {
                bVar2 = bVar;
            } else {
                this.f41494a = new ds0(25, this.f41494a, aVar);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            aVar.g(bVar);
        }
    }

    @Override
    public final Object get() {
        return this.f41495b.get();
    }
}
