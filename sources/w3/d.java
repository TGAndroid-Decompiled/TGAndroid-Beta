package w3;

import org.telegram.ui.Components.dr0;
import org.telegram.ui.Components.sc;
import yh.s3;
public final class d implements dr0 {
    public final Object f49856a;

    public d(Object obj) {
        this.f49856a = obj;
    }

    public StringBuilder a() {
        ef.a aVar = (ef.a) this.f49856a;
        if (aVar instanceof ze.m) {
            StringBuilder sb2 = ((ze.m) aVar).f54524b.f54509b;
            if (sb2.length() != 0) {
                return sb2;
            }
            return null;
        }
        return null;
    }

    @Override
    public void q0() {
        sc k10 = ((s3) this.f49856a).getBulletinFactory().k(false);
        k10.f30721t = true;
        k10.j();
    }

    @Override
    public void P() {
    }
}
