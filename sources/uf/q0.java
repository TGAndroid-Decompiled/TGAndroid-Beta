package uf;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.y3;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.qc;
public final class q0 implements RequestDelegate {
    public final int f45420a;
    public final u0 f45421b;

    public q0(u0 u0Var, int i10) {
        this.f45420a = i10;
        this.f45421b = u0Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f45420a) {
            case 0:
                final u0 u0Var = this.f45421b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                u0 u0Var2 = u0Var;
                                u0Var2.f45446b.a(0.0f);
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 != null) {
                                    qc.b0(tL_error2);
                                    return;
                                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                                    y3.s(R.string.UnknownError, qc.a0(u0Var2), null);
                                    return;
                                } else {
                                    u0Var2.finishFragment();
                                    return;
                                }
                            default:
                                u0 u0Var3 = u0Var;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null) {
                                    u0Var3.f45446b.a(0.0f);
                                    qc.b0(tL_error3);
                                    return;
                                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                                    u0Var3.f45446b.a(0.0f);
                                    y3.s(R.string.UnknownError, qc.a0(u0Var3), null);
                                    return;
                                } else {
                                    u0Var3.finishFragment();
                                    return;
                                }
                        }
                    }
                });
                return;
            default:
                final u0 u0Var2 = this.f45421b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                u0 u0Var22 = u0Var2;
                                u0Var22.f45446b.a(0.0f);
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 != null) {
                                    qc.b0(tL_error2);
                                    return;
                                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                                    y3.s(R.string.UnknownError, qc.a0(u0Var22), null);
                                    return;
                                } else {
                                    u0Var22.finishFragment();
                                    return;
                                }
                            default:
                                u0 u0Var3 = u0Var2;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null) {
                                    u0Var3.f45446b.a(0.0f);
                                    qc.b0(tL_error3);
                                    return;
                                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                                    u0Var3.f45446b.a(0.0f);
                                    y3.s(R.string.UnknownError, qc.a0(u0Var3), null);
                                    return;
                                } else {
                                    u0Var3.finishFragment();
                                    return;
                                }
                        }
                    }
                });
                return;
        }
    }
}
