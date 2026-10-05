package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d2 implements RequestDelegate {
    public final int f51210a;
    public final y3 f51211b;

    public d2(y3 y3Var, int i10) {
        this.f51210a = i10;
        this.f51211b = y3Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f51210a) {
            case 0:
                final y3 y3Var = this.f51211b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                y3.Z(y3Var, tLObject, tL_error);
                                return;
                            default:
                                y3.z0(y3Var, tLObject, tL_error);
                                return;
                        }
                    }
                });
                return;
            default:
                final y3 y3Var2 = this.f51211b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                y3.Z(y3Var2, tLObject, tL_error);
                                return;
                            default:
                                y3.z0(y3Var2, tLObject, tL_error);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
