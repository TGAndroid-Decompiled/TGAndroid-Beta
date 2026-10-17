package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sd0 implements RequestDelegate {
    public final int f41081a;
    public final ud0 f41082b;
    public final String f41083c;
    public final String d;

    public sd0(ud0 ud0Var, String str, String str2, int i10) {
        this.f41081a = i10;
        this.f41082b = ud0Var;
        this.f41083c = str;
        this.d = str2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f41081a) {
            case 0:
                AndroidUtilities.runOnUIThread(new pd0(this.f41082b, tL_error, this.f41083c, this.d, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new pd0(this.f41082b, tL_error, tLObject, this.f41083c, this.d));
                return;
        }
    }
}
