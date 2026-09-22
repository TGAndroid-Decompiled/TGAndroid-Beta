package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class c2 implements RequestDelegate {
    public final int f46980a;
    public final z3 f46981b;

    public c2(z3 z3Var, int i10) {
        this.f46980a = i10;
        this.f46981b = z3Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f46980a) {
            case 0:
                final z3 z3Var = this.f46981b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                z3.a0(z3Var, tLObject, tL_error);
                                return;
                            default:
                                z3.z0(z3Var, tLObject, tL_error);
                                return;
                        }
                    }
                });
                return;
            default:
                final z3 z3Var2 = this.f46981b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                z3.a0(z3Var2, tLObject, tL_error);
                                return;
                            default:
                                z3.z0(z3Var2, tLObject, tL_error);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
