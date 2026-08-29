package qh;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
public final class l0 implements Utilities.Callback2 {
    public final int f46730a;
    public final o0 f46731b;

    public l0(o0 o0Var, int i10) {
        this.f46730a = i10;
        this.f46731b = o0Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f46730a) {
            case 0:
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                o0 o0Var = this.f46731b;
                o0Var.f46762q.dismiss();
                o0Var.f46762q = null;
                o0Var.f46763r = 0;
                if (tL_error != null) {
                    o0Var.f46750c.d0(tL_error, false);
                    return;
                }
                n0 n0Var = o0Var.h;
                if (n0Var != null) {
                    n0Var.close();
                    return;
                }
                return;
            case 1:
                TL_communities.PeerLinkRequests peerLinkRequests = (TL_communities.PeerLinkRequests) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                o0 o0Var2 = this.f46731b;
                boolean z10 = false;
                o0Var2.f46758m = false;
                if (peerLinkRequests != null) {
                    ArrayList arrayList = o0Var2.f46755j;
                    if (arrayList == null) {
                        o0Var2.f46755j = new ArrayList(peerLinkRequests.requests);
                    } else {
                        arrayList.addAll(peerLinkRequests.requests);
                    }
                    String str = peerLinkRequests.next_offset;
                    o0Var2.f46756k = str;
                    o0Var2.f46757l = peerLinkRequests.total_count;
                    if (str == null) {
                        z10 = true;
                    }
                    o0Var2.f46759n = z10;
                    o0Var2.a();
                    n0 n0Var2 = o0Var2.h;
                    if (n0Var2 != null) {
                        n0Var2.k();
                        return;
                    }
                    return;
                }
                return;
            default:
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                o0 o0Var3 = this.f46731b;
                if (tL_error3 != null) {
                    o0Var3.f46750c.d0(tL_error3, false);
                    return;
                } else {
                    o0Var3.getClass();
                    return;
                }
        }
    }
}
