package zh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b2 implements RequestDelegate {
    public final int f51707a;
    public final w3 f51708b;

    public b2(w3 w3Var, int i10) {
        this.f51707a = i10;
        this.f51708b = w3Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f51707a) {
            case 0:
                final w3 w3Var = this.f51708b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                w3.a0(w3Var, tLObject, tL_error);
                                return;
                            default:
                                w3.z0(w3Var, tLObject, tL_error);
                                return;
                        }
                    }
                });
                return;
            default:
                final w3 w3Var2 = this.f51708b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                w3.a0(w3Var2, tLObject, tL_error);
                                return;
                            default:
                                w3.z0(w3Var2, tLObject, tL_error);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
