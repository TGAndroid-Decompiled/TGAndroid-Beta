package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sh implements RequestDelegate {
    public final int f37388a;
    public final bo f37389b;
    public final TLRPC.TL_attachMenuBot f37390c;
    public final TLRPC.User d;

    public sh(bo boVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user, int i10) {
        this.f37388a = i10;
        this.f37389b = boVar;
        this.f37390c = tL_attachMenuBot;
        this.d = user;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f37388a) {
            case 0:
                AndroidUtilities.runOnUIThread(new wh(this.f37389b, this.f37390c, tL_error, this.d));
                return;
            default:
                AndroidUtilities.runOnUIThread(new wh(this.f37389b, tL_error, this.f37390c, this.d));
                return;
        }
    }
}
