package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class td0 implements RequestDelegate {
    public final int f37759a;
    public final de0 f37760b;
    public final String f37761c;

    public td0(de0 de0Var, String str, int i10) {
        this.f37759a = i10;
        this.f37760b = de0Var;
        this.f37761c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f37759a) {
            case 0:
                AndroidUtilities.runOnUIThread(new vd0(this.f37760b, tL_error, this.f37761c, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new vd0(this.f37760b, tL_error, tLObject, this.f37761c));
                return;
        }
    }
}
