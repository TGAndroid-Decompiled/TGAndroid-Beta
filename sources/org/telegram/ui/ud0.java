package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ud0 implements RequestDelegate {
    public final int f42531a;
    public final ee0 f42532b;
    public final String f42533c;

    public ud0(ee0 ee0Var, String str, int i10) {
        this.f42531a = i10;
        this.f42532b = ee0Var;
        this.f42533c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f42531a) {
            case 0:
                AndroidUtilities.runOnUIThread(new wd0(this.f42532b, tL_error, this.f42533c, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new wd0(this.f42532b, tL_error, tLObject, this.f42533c));
                return;
        }
    }
}
