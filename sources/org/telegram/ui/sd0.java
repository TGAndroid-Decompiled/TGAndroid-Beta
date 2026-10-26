package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sd0 implements RequestDelegate {
    public final int f43474a;
    public final ud0 f43475b;
    public final String f43476c;
    public final String d;

    public sd0(ud0 ud0Var, String str, String str2, int i10) {
        this.f43474a = i10;
        this.f43475b = ud0Var;
        this.f43476c = str;
        this.d = str2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f43474a) {
            case 0:
                AndroidUtilities.runOnUIThread(new pd0(this.f43475b, tL_error, this.f43476c, this.d, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new pd0(this.f43475b, tL_error, tLObject, this.f43476c, this.d));
                return;
        }
    }
}
