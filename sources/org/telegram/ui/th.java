package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class th implements RequestDelegate {
    public final int f40779a;
    public final co f40780b;
    public final TLRPC.TL_attachMenuBot f40781c;
    public final TLRPC.User d;

    public th(co coVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user, int i10) {
        this.f40779a = i10;
        this.f40780b = coVar;
        this.f40781c = tL_attachMenuBot;
        this.d = user;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f40779a) {
            case 0:
                AndroidUtilities.runOnUIThread(new wh(this.f40780b, this.f40781c, tL_error, this.d));
                return;
            default:
                AndroidUtilities.runOnUIThread(new wh(this.f40780b, tL_error, this.f40781c, this.d));
                return;
        }
    }
}
