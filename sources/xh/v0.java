package xh;

import org.telegram.messenger.us;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
public final class v0 implements us {
    public final long f54077a;
    public final us[] f54078b;
    public final int f54079c;
    public final u0 d;

    public v0(long j10, us[] usVarArr, int i10, u0 u0Var) {
        this.f54077a = j10;
        this.f54078b = usVarArr;
        this.f54079c = i10;
        this.d = u0Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        a0.h hVar;
        int i12 = zs.f19711w0;
        if (i10 == i12 && (hVar = (a0.h) objArr[0]) != null) {
            long j10 = this.f54077a;
            if (hVar.d(j10)) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) hVar.f(j10);
                us[] usVarArr = this.f54078b;
                if (usVarArr[0] != null) {
                    zs.f(this.f54079c).n(usVarArr[0], i12);
                    usVarArr[0] = null;
                }
                if (!(webPage instanceof TLRPC.TL_webPage)) {
                    webPage = null;
                }
                this.d.a(webPage);
            }
        }
    }
}
