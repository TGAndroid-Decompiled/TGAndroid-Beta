package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yd0 implements RequestDelegate {
    public final int f39863a;
    public final ie0 f39864b;
    public final String f39865c;

    public yd0(ie0 ie0Var, String str, int i10) {
        this.f39863a = i10;
        this.f39864b = ie0Var;
        this.f39865c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f39863a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ae0(this.f39864b, tL_error, this.f39865c, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new ae0(this.f39864b, tL_error, tLObject, this.f39865c));
                return;
        }
    }
}
