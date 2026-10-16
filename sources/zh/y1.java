package zh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y1 implements RequestDelegate {
    public final int f51319a;
    public final r3 f51320b;

    public y1(r3 r3Var, int i10) {
        this.f51319a = i10;
        this.f51320b = r3Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f51319a) {
            case 0:
                final r3 r3Var = this.f51320b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                r3.b0(r3Var, tLObject, tL_error);
                                return;
                            default:
                                r3.A0(r3Var, tLObject, tL_error);
                                return;
                        }
                    }
                });
                return;
            default:
                final r3 r3Var2 = this.f51320b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                r3.b0(r3Var2, tLObject, tL_error);
                                return;
                            default:
                                r3.A0(r3Var2, tLObject, tL_error);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
