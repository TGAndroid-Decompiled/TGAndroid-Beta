package yh;

import java.util.ArrayList;
import org.telegram.messenger.k20;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
public final class b0 implements k20 {
    public final int f54463a;
    public final d0 f54464b;

    public b0(d0 d0Var, int i10) {
        this.f54463a = i10;
        this.f54464b = d0Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f54463a) {
            case 0:
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                d0 d0Var = this.f54464b;
                d0Var.f54484q.dismiss();
                d0Var.f54484q = null;
                d0Var.f54485r = 0;
                if (tL_error != null) {
                    d0Var.f54473c.f0(tL_error, false);
                    return;
                }
                c0 c0Var = d0Var.h;
                if (c0Var != null) {
                    c0Var.close();
                    return;
                }
                return;
            case 1:
                TL_communities.PeerLinkRequests peerLinkRequests = (TL_communities.PeerLinkRequests) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                d0 d0Var2 = this.f54464b;
                boolean z10 = false;
                d0Var2.f54480m = false;
                if (peerLinkRequests != null) {
                    ArrayList arrayList = d0Var2.f54477j;
                    if (arrayList == null) {
                        d0Var2.f54477j = new ArrayList(peerLinkRequests.requests);
                    } else {
                        arrayList.addAll(peerLinkRequests.requests);
                    }
                    String str = peerLinkRequests.next_offset;
                    d0Var2.f54478k = str;
                    d0Var2.f54479l = peerLinkRequests.total_count;
                    if (str == null) {
                        z10 = true;
                    }
                    d0Var2.f54481n = z10;
                    d0Var2.a();
                    c0 c0Var2 = d0Var2.h;
                    if (c0Var2 != null) {
                        c0Var2.b();
                        return;
                    }
                    return;
                }
                return;
            default:
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                d0 d0Var3 = this.f54464b;
                if (tL_error3 != null) {
                    d0Var3.f54473c.f0(tL_error3, false);
                    return;
                } else {
                    d0Var3.getClass();
                    return;
                }
        }
    }
}
