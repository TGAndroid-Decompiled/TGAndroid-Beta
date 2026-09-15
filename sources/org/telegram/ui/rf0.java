package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rf0 implements RequestDelegate {
    public final int f37096a;
    public final zf0 f37097b;
    public final Bundle f37098c;

    public rf0(zf0 zf0Var, Bundle bundle, int i10) {
        this.f37096a = i10;
        this.f37097b = zf0Var;
        this.f37098c = bundle;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f37096a) {
            case 0:
                zf0 zf0Var = this.f37097b;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new pf0(zf0Var, this.f37098c, tLObject, 1));
                    return;
                } else if (tL_error != null && tL_error.text != null) {
                    AndroidUtilities.runOnUIThread(new ma0(18, zf0Var, tL_error));
                    return;
                } else {
                    return;
                }
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jn0(this.f37097b, tL_error, this.f37098c, tLObject, 20));
                return;
        }
    }
}
