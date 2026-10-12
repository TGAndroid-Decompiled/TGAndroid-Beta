package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wf0 implements RequestDelegate {
    public final int f41585a;
    public final eg0 f41586b;
    public final Bundle f41587c;

    public wf0(eg0 eg0Var, Bundle bundle, int i10) {
        this.f41585a = i10;
        this.f41586b = eg0Var;
        this.f41587c = bundle;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f41585a) {
            case 0:
                eg0 eg0Var = this.f41586b;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new uf0(eg0Var, this.f41587c, tLObject, 1));
                    return;
                } else if (tL_error != null && tL_error.text != null) {
                    AndroidUtilities.runOnUIThread(new wc0(10, eg0Var, tL_error));
                    return;
                } else {
                    return;
                }
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.gq0(this.f41586b, tL_error, this.f41587c, tLObject, 19));
                return;
        }
    }
}
