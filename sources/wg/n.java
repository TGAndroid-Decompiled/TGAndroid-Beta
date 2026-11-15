package wg;

import org.telegram.messenger.z10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.lv0;
public final class n implements RequestDelegate {
    public final int f59215a;
    public final z10 f59216b;
    public final z10 f59217c;

    public n(z10 z10Var, z10 z10Var2, int i7) {
        this.f59215a = i7;
        this.f59216b = z10Var;
        this.f59217c = z10Var2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f59215a) {
            case 0:
                org.telegram.messenger.g0.h3(new lv0(tL_error, this.f59216b, this.f59217c, 25));
                return;
            default:
                org.telegram.messenger.g0.h3(new t5.a(tL_error, this.f59216b, tLObject, this.f59217c, 3));
                return;
        }
    }
}
