package w3;

import org.telegram.ui.Components.cr0;
import org.telegram.ui.Components.tc;
import yh.s3;
public final class d implements cr0 {
    public final Object f49813a;

    public d(Object obj) {
        this.f49813a = obj;
    }

    public StringBuilder a() {
        ef.a aVar = (ef.a) this.f49813a;
        if (aVar instanceof ze.m) {
            StringBuilder sb2 = ((ze.m) aVar).f54481b.f54466b;
            if (sb2.length() != 0) {
                return sb2;
            }
            return null;
        }
        return null;
    }

    @Override
    public void q0() {
        tc k10 = ((s3) this.f49813a).getBulletinFactory().k(false);
        k10.f31106t = true;
        k10.j();
    }

    @Override
    public void P() {
    }
}
