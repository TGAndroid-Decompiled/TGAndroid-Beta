package vf;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.y3;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.qc;
public final class r0 implements RequestDelegate {
    public final int f49218a;
    public final v0 f49219b;

    public r0(v0 v0Var, int i10) {
        this.f49218a = i10;
        this.f49219b = v0Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f49218a) {
            case 0:
                final v0 v0Var = this.f49219b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                v0 v0Var2 = v0Var;
                                v0Var2.f49256b.a(0.0f);
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 != null) {
                                    qc.b0(tL_error2);
                                    return;
                                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                                    y3.s(R.string.UnknownError, qc.a0(v0Var2), null);
                                    return;
                                } else {
                                    v0Var2.finishFragment();
                                    return;
                                }
                            default:
                                v0 v0Var3 = v0Var;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null) {
                                    v0Var3.f49256b.a(0.0f);
                                    qc.b0(tL_error3);
                                    return;
                                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                                    v0Var3.f49256b.a(0.0f);
                                    y3.s(R.string.UnknownError, qc.a0(v0Var3), null);
                                    return;
                                } else {
                                    v0Var3.finishFragment();
                                    return;
                                }
                        }
                    }
                });
                return;
            default:
                final v0 v0Var2 = this.f49219b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                v0 v0Var22 = v0Var2;
                                v0Var22.f49256b.a(0.0f);
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 != null) {
                                    qc.b0(tL_error2);
                                    return;
                                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                                    y3.s(R.string.UnknownError, qc.a0(v0Var22), null);
                                    return;
                                } else {
                                    v0Var22.finishFragment();
                                    return;
                                }
                            default:
                                v0 v0Var3 = v0Var2;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null) {
                                    v0Var3.f49256b.a(0.0f);
                                    qc.b0(tL_error3);
                                    return;
                                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                                    v0Var3.f49256b.a(0.0f);
                                    y3.s(R.string.UnknownError, qc.a0(v0Var3), null);
                                    return;
                                } else {
                                    v0Var3.finishFragment();
                                    return;
                                }
                        }
                    }
                });
                return;
        }
    }
}
