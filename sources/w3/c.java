package w3;

import org.telegram.ui.Components.hr0;
import org.telegram.ui.Components.sc;
import yh.s3;
public final class c implements hr0 {
    public final Object f49996a;

    public c(Object obj) {
        this.f49996a = obj;
    }

    public StringBuilder a() {
        ef.a aVar = (ef.a) this.f49996a;
        if (aVar instanceof ze.m) {
            StringBuilder sb2 = ((ze.m) aVar).f54661b.f54646b;
            if (sb2.length() != 0) {
                return sb2;
            }
            return null;
        }
        return null;
    }

    @Override
    public void q0() {
        sc k10 = ((s3) this.f49996a).getBulletinFactory().k(false);
        k10.f30550t = true;
        k10.j();
    }

    @Override
    public void U() {
    }
}
