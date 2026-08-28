package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rz implements RequestDelegate {
    public final int f42514a;
    public final n00 f42515b;

    public rz(n00 n00Var, int i9) {
        this.f42514a = i9;
        this.f42515b = n00Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f42514a) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.p61(22, this.f42515b, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new jq(this.f42515b, tL_error, tLObject, 6));
                return;
        }
    }
}
