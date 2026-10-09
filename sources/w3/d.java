package w3;

import org.telegram.ui.Components.br0;
import org.telegram.ui.Components.tc;
import yh.s3;
public final class d implements br0 {
    public final Object f49769a;

    public d(Object obj) {
        this.f49769a = obj;
    }

    public StringBuilder a() {
        ef.a aVar = (ef.a) this.f49769a;
        if (aVar instanceof ze.m) {
            StringBuilder sb2 = ((ze.m) aVar).f54437b.f54422b;
            if (sb2.length() != 0) {
                return sb2;
            }
            return null;
        }
        return null;
    }

    @Override
    public void q0() {
        tc k10 = ((s3) this.f49769a).getBulletinFactory().k(false);
        k10.f31140t = true;
        k10.j();
    }

    @Override
    public void P() {
    }
}
