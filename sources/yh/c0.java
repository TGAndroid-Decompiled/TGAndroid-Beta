package yh;

import java.util.ArrayList;
import org.telegram.messenger.j20;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
public final class c0 implements j20 {
    public final int f54462a;
    public final e0 f54463b;

    public c0(e0 e0Var, int i10) {
        this.f54462a = i10;
        this.f54463b = e0Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f54462a) {
            case 0:
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                e0 e0Var = this.f54463b;
                e0Var.f54486q.dismiss();
                e0Var.f54486q = null;
                e0Var.f54487r = 0;
                if (tL_error != null) {
                    e0Var.f54475c.f0(tL_error, false);
                    return;
                }
                d0 d0Var = e0Var.h;
                if (d0Var != null) {
                    d0Var.close();
                    return;
                }
                return;
            case 1:
                TL_communities.PeerLinkRequests peerLinkRequests = (TL_communities.PeerLinkRequests) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                e0 e0Var2 = this.f54463b;
                boolean z10 = false;
                e0Var2.f54482m = false;
                if (peerLinkRequests != null) {
                    ArrayList arrayList = e0Var2.f54479j;
                    if (arrayList == null) {
                        e0Var2.f54479j = new ArrayList(peerLinkRequests.requests);
                    } else {
                        arrayList.addAll(peerLinkRequests.requests);
                    }
                    String str = peerLinkRequests.next_offset;
                    e0Var2.f54480k = str;
                    e0Var2.f54481l = peerLinkRequests.total_count;
                    if (str == null) {
                        z10 = true;
                    }
                    e0Var2.f54483n = z10;
                    e0Var2.a();
                    d0 d0Var2 = e0Var2.h;
                    if (d0Var2 != null) {
                        d0Var2.b();
                        return;
                    }
                    return;
                }
                return;
            default:
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                e0 e0Var3 = this.f54463b;
                if (tL_error3 != null) {
                    e0Var3.f54475c.f0(tL_error3, false);
                    return;
                } else {
                    e0Var3.getClass();
                    return;
                }
        }
    }
}
