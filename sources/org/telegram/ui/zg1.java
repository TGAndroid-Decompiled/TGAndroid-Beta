package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class zg1 implements RequestDelegate {
    public final int f40212a;
    public final gh1 f40213b;

    public zg1(gh1 gh1Var, int i10) {
        this.f40212a = i10;
        this.f40213b = gh1Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f40212a) {
            case 0:
                final gh1 gh1Var = this.f40213b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                gh1.b0(gh1Var, tL_error, tLObject);
                                return;
                            default:
                                gh1.h0(gh1Var, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new ch1(this.f40213b, tL_error, 0));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new ch1(this.f40213b, tL_error, 1));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new ch1(this.f40213b, tL_error, 2));
                return;
            default:
                final gh1 gh1Var2 = this.f40213b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                gh1.b0(gh1Var2, tL_error, tLObject);
                                return;
                            default:
                                gh1.h0(gh1Var2, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
