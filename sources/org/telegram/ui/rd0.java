package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rd0 implements RequestDelegate {
    public final int f36799a;
    public final be0 f36800b;
    public final String f36801c;

    public rd0(be0 be0Var, String str, int i10) {
        this.f36799a = i10;
        this.f36800b = be0Var;
        this.f36801c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f36799a) {
            case 0:
                AndroidUtilities.runOnUIThread(new td0(this.f36800b, tL_error, this.f36801c, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new td0(this.f36800b, tL_error, tLObject, this.f36801c));
                return;
        }
    }
}
