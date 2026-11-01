package xh;

import org.telegram.messenger.r20;
import org.telegram.tgnet.TLRPC;
public final class a implements r20 {
    public final int f53695a;
    public final i f53696b;

    public a(i iVar, int i10) {
        this.f53695a = i10;
        this.f53696b = iVar;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f53695a) {
            case 0:
                org.telegram.messenger.i0.g3(new vh.r0(23, this.f53696b, (TLRPC.UserFull) obj));
                return;
            case 1:
                i iVar = this.f53696b;
                iVar.f53805a0.commission_permille = ((Integer) obj).intValue();
                iVar.L0();
                return;
            default:
                i iVar2 = this.f53696b;
                iVar2.f53805a0.duration_months = ((Integer) iVar2.f53807c0.get(((Integer) obj).intValue())).intValue();
                iVar2.L0();
                return;
        }
    }
}
