package zf;

import org.telegram.messenger.is;
import org.telegram.messenger.wp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.mb;
public final class p0 implements Runnable {
    public final String f55628a;
    public final String f55629b;
    public final wp f55630c;
    public final is d;
    public final x0 e;

    public p0(x0 x0Var, String str, String str2, wp wpVar, is isVar) {
        this.e = x0Var;
        this.f55628a = str;
        this.f55629b = str2;
        this.f55630c = wpVar;
        this.d = isVar;
    }

    @Override
    public final void run() {
        x0 x0Var = this.e;
        if (x0Var.f55694y0 == this) {
            x0Var.f55694y0 = null;
            TLRPC.User user = x0Var.f55690w0;
            if (user == null && !x0Var.f55688v0) {
                String str = this.f55629b;
                x0Var.f55681q0 = str;
                wp wpVar = this.f55630c;
                TLObject e22 = wpVar.e2(str);
                if (e22 instanceof TLRPC.User) {
                    x0Var.R((TLRPC.User) e22);
                    return;
                }
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                tL_contacts_resolveUsername.username = x0Var.f55681q0;
                x0Var.f55686t0 = ConnectionsManager.getInstance(x0Var.f55669f).sendRequest(tL_contacts_resolveUsername, new mb(this, str, wpVar, this.d, 19));
            } else if (x0Var.f55688v0) {
            } else {
                x0Var.T(true, user, this.f55628a, "");
            }
        }
    }
}
