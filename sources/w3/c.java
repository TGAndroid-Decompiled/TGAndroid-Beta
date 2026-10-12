package w3;

import org.telegram.ui.Components.hr0;
import org.telegram.ui.Components.sc;
import yh.s3;
public final class c implements hr0 {
    public final Object f50004a;

    public c(Object obj) {
        this.f50004a = obj;
    }

    public StringBuilder a() {
        ef.a aVar = (ef.a) this.f50004a;
        if (aVar instanceof ze.m) {
            StringBuilder sb2 = ((ze.m) aVar).f54669b.f54654b;
            if (sb2.length() != 0) {
                return sb2;
            }
            return null;
        }
        return null;
    }

    @Override
    public void q0() {
        sc k10 = ((s3) this.f50004a).getBulletinFactory().k(false);
        k10.f30546t = true;
        k10.j();
    }

    @Override
    public void U() {
    }
}
