package xh;

import org.telegram.messenger.at;
import org.telegram.messenger.vs;
import org.telegram.tgnet.TLRPC;
public final class v0 implements vs {
    public final long f54098a;
    public final vs[] f54099b;
    public final int f54100c;
    public final u0 d;

    public v0(long j10, vs[] vsVarArr, int i10, u0 u0Var) {
        this.f54098a = j10;
        this.f54099b = vsVarArr;
        this.f54100c = i10;
        this.d = u0Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        a0.h hVar;
        int i12 = at.f14807w0;
        if (i10 == i12 && (hVar = (a0.h) objArr[0]) != null) {
            long j10 = this.f54098a;
            if (hVar.d(j10)) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) hVar.f(j10);
                vs[] vsVarArr = this.f54099b;
                if (vsVarArr[0] != null) {
                    at.f(this.f54100c).n(vsVarArr[0], i12);
                    vsVarArr[0] = null;
                }
                if (!(webPage instanceof TLRPC.TL_webPage)) {
                    webPage = null;
                }
                this.d.a(webPage);
            }
        }
    }
}
