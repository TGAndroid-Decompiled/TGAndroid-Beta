package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class c2 implements RequestDelegate {
    public final int f47251a;
    public final x3 f47252b;

    public c2(x3 x3Var, int i10) {
        this.f47251a = i10;
        this.f47252b = x3Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f47251a) {
            case 0:
                final x3 x3Var = this.f47252b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                x3.a0(x3Var, tLObject, tL_error);
                                return;
                            default:
                                x3.z0(x3Var, tLObject, tL_error);
                                return;
                        }
                    }
                });
                return;
            default:
                final x3 x3Var2 = this.f47252b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                x3.a0(x3Var2, tLObject, tL_error);
                                return;
                            default:
                                x3.z0(x3Var2, tLObject, tL_error);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
