package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d2 implements RequestDelegate {
    public final int f47094a;
    public final a4 f47095b;

    public d2(a4 a4Var, int i10) {
        this.f47094a = i10;
        this.f47095b = a4Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f47094a) {
            case 0:
                final a4 a4Var = this.f47095b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                a4.a0(a4Var, tLObject, tL_error);
                                return;
                            default:
                                a4.z0(a4Var, tLObject, tL_error);
                                return;
                        }
                    }
                });
                return;
            default:
                final a4 a4Var2 = this.f47095b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                a4.a0(a4Var2, tLObject, tL_error);
                                return;
                            default:
                                a4.z0(a4Var2, tLObject, tL_error);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
