package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sf0 implements RequestDelegate {
    public final int f37278a;
    public final ag0 f37279b;
    public final Bundle f37280c;

    public sf0(ag0 ag0Var, Bundle bundle, int i10) {
        this.f37278a = i10;
        this.f37279b = ag0Var;
        this.f37280c = bundle;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f37278a) {
            case 0:
                ag0 ag0Var = this.f37279b;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new qf0(ag0Var, this.f37280c, tLObject, 1));
                    return;
                } else if (tL_error != null && tL_error.text != null) {
                    AndroidUtilities.runOnUIThread(new y80(22, ag0Var, tL_error));
                    return;
                } else {
                    return;
                }
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.wn0(this.f37279b, tL_error, this.f37280c, tLObject, 20));
                return;
        }
    }
}
