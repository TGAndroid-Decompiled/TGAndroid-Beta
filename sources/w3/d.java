package w3;

import org.telegram.ui.Components.cr0;
import org.telegram.ui.Components.sc;
import yh.s3;
public final class d implements cr0 {
    public final Object f49890a;

    public d(Object obj) {
        this.f49890a = obj;
    }

    public StringBuilder a() {
        ef.a aVar = (ef.a) this.f49890a;
        if (aVar instanceof ze.m) {
            StringBuilder sb2 = ((ze.m) aVar).f54558b.f54543b;
            if (sb2.length() != 0) {
                return sb2;
            }
            return null;
        }
        return null;
    }

    @Override
    public void q0() {
        sc k10 = ((s3) this.f49890a).getBulletinFactory().k(false);
        k10.f30843t = true;
        k10.j();
    }

    @Override
    public void P() {
    }
}
