package zf;

import org.telegram.messenger.hs;
import org.telegram.messenger.vp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.mb;
public final class p0 implements Runnable {
    public final String f55610a;
    public final String f55611b;
    public final vp f55612c;
    public final hs d;
    public final x0 e;

    public p0(x0 x0Var, String str, String str2, vp vpVar, hs hsVar) {
        this.e = x0Var;
        this.f55610a = str;
        this.f55611b = str2;
        this.f55612c = vpVar;
        this.d = hsVar;
    }

    @Override
    public final void run() {
        x0 x0Var = this.e;
        if (x0Var.f55676y0 == this) {
            x0Var.f55676y0 = null;
            TLRPC.User user = x0Var.f55672w0;
            if (user == null && !x0Var.f55670v0) {
                String str = this.f55611b;
                x0Var.f55663q0 = str;
                vp vpVar = this.f55612c;
                TLObject e22 = vpVar.e2(str);
                if (e22 instanceof TLRPC.User) {
                    x0Var.R((TLRPC.User) e22);
                    return;
                }
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                tL_contacts_resolveUsername.username = x0Var.f55663q0;
                x0Var.f55668t0 = ConnectionsManager.getInstance(x0Var.f55651f).sendRequest(tL_contacts_resolveUsername, new mb(this, str, vpVar, this.d, 19));
            } else if (x0Var.f55670v0) {
            } else {
                x0Var.T(true, user, this.f55610a, "");
            }
        }
    }
}
