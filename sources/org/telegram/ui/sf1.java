package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class sf1 implements RequestDelegate {

    public final int f42630a;

    public final zf1 f42631b;

    public sf1(zf1 zf1Var, int i10) {
        this.f42630a = i10;
        this.f42631b = zf1Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f42630a) {
            case 0:
                final int i10 = 0;
                final zf1 zf1Var = this.f42631b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i10) {
                            case 0:
                                zf1.b0(zf1Var, tL_error, tLObject);
                                break;
                            default:
                                zf1.h0(zf1Var, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new vf1(this.f42631b, tL_error, 0));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new vf1(this.f42631b, tL_error, 1));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new vf1(this.f42631b, tL_error, 2));
                break;
            default:
                final int i11 = 1;
                final zf1 zf1Var2 = this.f42631b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i11) {
                            case 0:
                                zf1.b0(zf1Var2, tL_error, tLObject);
                                break;
                            default:
                                zf1.h0(zf1Var2, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
