package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class th implements RequestDelegate {
    public final int f40751a;
    public final co f40752b;
    public final TLRPC.TL_attachMenuBot f40753c;
    public final TLRPC.User d;

    public th(co coVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user, int i10) {
        this.f40751a = i10;
        this.f40752b = coVar;
        this.f40753c = tL_attachMenuBot;
        this.d = user;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f40751a) {
            case 0:
                AndroidUtilities.runOnUIThread(new wh(this.f40752b, this.f40753c, tL_error, this.d));
                return;
            default:
                AndroidUtilities.runOnUIThread(new wh(this.f40752b, tL_error, this.f40753c, this.d));
                return;
        }
    }
}
