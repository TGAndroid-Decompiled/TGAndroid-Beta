package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sd0 implements RequestDelegate {
    public final int f43471a;
    public final ud0 f43472b;
    public final String f43473c;
    public final String d;

    public sd0(ud0 ud0Var, String str, String str2, int i10) {
        this.f43471a = i10;
        this.f43472b = ud0Var;
        this.f43473c = str;
        this.d = str2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f43471a) {
            case 0:
                AndroidUtilities.runOnUIThread(new pd0(this.f43472b, tL_error, this.f43473c, this.d, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new pd0(this.f43472b, tL_error, tLObject, this.f43473c, this.d));
                return;
        }
    }
}
