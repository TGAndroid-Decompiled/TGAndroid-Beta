package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sh implements RequestDelegate {
    public final int f37396a;
    public final bo f37397b;
    public final TLRPC.TL_attachMenuBot f37398c;
    public final TLRPC.User d;

    public sh(bo boVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user, int i10) {
        this.f37396a = i10;
        this.f37397b = boVar;
        this.f37398c = tL_attachMenuBot;
        this.d = user;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f37396a) {
            case 0:
                AndroidUtilities.runOnUIThread(new wh(this.f37397b, this.f37398c, tL_error, this.d));
                return;
            default:
                AndroidUtilities.runOnUIThread(new wh(this.f37397b, tL_error, this.f37398c, this.d));
                return;
        }
    }
}
