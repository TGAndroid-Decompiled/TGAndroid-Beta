package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class th implements RequestDelegate {
    public final int f40752a;
    public final co f40753b;
    public final TLRPC.TL_attachMenuBot f40754c;
    public final TLRPC.User d;

    public th(co coVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user, int i10) {
        this.f40752a = i10;
        this.f40753b = coVar;
        this.f40754c = tL_attachMenuBot;
        this.d = user;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f40752a) {
            case 0:
                AndroidUtilities.runOnUIThread(new wh(this.f40753b, this.f40754c, tL_error, this.d));
                return;
            default:
                AndroidUtilities.runOnUIThread(new wh(this.f40753b, tL_error, this.f40754c, this.d));
                return;
        }
    }
}
