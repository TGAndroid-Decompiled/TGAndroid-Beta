package xh;

import org.telegram.messenger.q20;
import org.telegram.tgnet.TLRPC;
public final class a implements q20 {
    public final int f53677a;
    public final i f53678b;

    public a(i iVar, int i10) {
        this.f53677a = i10;
        this.f53678b = iVar;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f53677a) {
            case 0:
                org.telegram.messenger.i0.g3(new vh.d1(22, this.f53678b, (TLRPC.UserFull) obj));
                return;
            case 1:
                i iVar = this.f53678b;
                iVar.f53796a0.commission_permille = ((Integer) obj).intValue();
                iVar.K0();
                return;
            default:
                i iVar2 = this.f53678b;
                iVar2.f53796a0.duration_months = ((Integer) iVar2.f53798c0.get(((Integer) obj).intValue())).intValue();
                iVar2.K0();
                return;
        }
    }
}
