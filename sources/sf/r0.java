package sf;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.x3;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.tc;
public final class r0 implements RequestDelegate {
    public final int f47933a;
    public final v0 f47934b;

    public r0(v0 v0Var, int i10) {
        this.f47933a = i10;
        this.f47934b = v0Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f47933a) {
            case 0:
                final v0 v0Var = this.f47934b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                v0 v0Var2 = v0Var;
                                v0Var2.f47970b.a(0.0f);
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 != null) {
                                    tc.b0(tL_error2);
                                    return;
                                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                                    x3.s(R.string.UnknownError, tc.a0(v0Var2), null);
                                    return;
                                } else {
                                    v0Var2.finishFragment();
                                    return;
                                }
                            default:
                                v0 v0Var3 = v0Var;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null) {
                                    v0Var3.f47970b.a(0.0f);
                                    tc.b0(tL_error3);
                                    return;
                                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                                    v0Var3.f47970b.a(0.0f);
                                    x3.s(R.string.UnknownError, tc.a0(v0Var3), null);
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
                final v0 v0Var2 = this.f47934b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                v0 v0Var22 = v0Var2;
                                v0Var22.f47970b.a(0.0f);
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 != null) {
                                    tc.b0(tL_error2);
                                    return;
                                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                                    x3.s(R.string.UnknownError, tc.a0(v0Var22), null);
                                    return;
                                } else {
                                    v0Var22.finishFragment();
                                    return;
                                }
                            default:
                                v0 v0Var3 = v0Var2;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null) {
                                    v0Var3.f47970b.a(0.0f);
                                    tc.b0(tL_error3);
                                    return;
                                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                                    v0Var3.f47970b.a(0.0f);
                                    x3.s(R.string.UnknownError, tc.a0(v0Var3), null);
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
