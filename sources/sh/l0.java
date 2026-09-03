package sh;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
public final class l0 implements Utilities.Callback2 {
    public final int f44432a;
    public final n0 f44433b;

    public l0(n0 n0Var, int i10) {
        this.f44432a = i10;
        this.f44433b = n0Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f44432a) {
            case 0:
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                n0 n0Var = this.f44433b;
                n0Var.f44458q.dismiss();
                n0Var.f44458q = null;
                n0Var.f44459r = 0;
                if (tL_error != null) {
                    n0Var.f44447c.d0(tL_error, false);
                    return;
                }
                m0 m0Var = n0Var.h;
                if (m0Var != null) {
                    m0Var.close();
                    return;
                }
                return;
            case 1:
                TL_communities.PeerLinkRequests peerLinkRequests = (TL_communities.PeerLinkRequests) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                n0 n0Var2 = this.f44433b;
                boolean z4 = false;
                n0Var2.f44454m = false;
                if (peerLinkRequests != null) {
                    ArrayList arrayList = n0Var2.f44451j;
                    if (arrayList == null) {
                        n0Var2.f44451j = new ArrayList(peerLinkRequests.requests);
                    } else {
                        arrayList.addAll(peerLinkRequests.requests);
                    }
                    String str = peerLinkRequests.next_offset;
                    n0Var2.f44452k = str;
                    n0Var2.f44453l = peerLinkRequests.total_count;
                    if (str == null) {
                        z4 = true;
                    }
                    n0Var2.f44455n = z4;
                    n0Var2.a();
                    m0 m0Var2 = n0Var2.h;
                    if (m0Var2 != null) {
                        m0Var2.f();
                        return;
                    }
                    return;
                }
                return;
            default:
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                n0 n0Var3 = this.f44433b;
                if (tL_error3 != null) {
                    n0Var3.f44447c.d0(tL_error3, false);
                    return;
                } else {
                    n0Var3.getClass();
                    return;
                }
        }
    }
}
