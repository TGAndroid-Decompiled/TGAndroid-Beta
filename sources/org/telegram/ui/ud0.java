package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ud0 implements RequestDelegate {
    public final int f41154a;
    public final ee0 f41155b;
    public final String f41156c;

    public ud0(ee0 ee0Var, String str, int i10) {
        this.f41154a = i10;
        this.f41155b = ee0Var;
        this.f41156c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f41154a) {
            case 0:
                AndroidUtilities.runOnUIThread(new wd0(this.f41155b, tL_error, this.f41156c, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new wd0(this.f41155b, tL_error, tLObject, this.f41156c));
                return;
        }
    }
}
