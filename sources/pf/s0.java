package pf;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.ll;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.oc;
public final class s0 implements RequestDelegate {
    public final int f45773a;
    public final w0 f45774b;

    public s0(w0 w0Var, int i9) {
        this.f45773a = i9;
        this.f45774b = w0Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f45773a) {
            case 0:
                final w0 w0Var = this.f45774b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                w0 w0Var2 = w0Var;
                                w0Var2.f45803b.a(0.0f);
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 != null) {
                                    oc.b0(tL_error2);
                                    return;
                                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                                    ll.p(R.string.UnknownError, oc.a0(w0Var2), null);
                                    return;
                                } else {
                                    w0Var2.finishFragment();
                                    return;
                                }
                            default:
                                w0 w0Var3 = w0Var;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null) {
                                    w0Var3.f45803b.a(0.0f);
                                    oc.b0(tL_error3);
                                    return;
                                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                                    w0Var3.f45803b.a(0.0f);
                                    ll.p(R.string.UnknownError, oc.a0(w0Var3), null);
                                    return;
                                } else {
                                    w0Var3.finishFragment();
                                    return;
                                }
                        }
                    }
                });
                return;
            default:
                final w0 w0Var2 = this.f45774b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                w0 w0Var22 = w0Var2;
                                w0Var22.f45803b.a(0.0f);
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 != null) {
                                    oc.b0(tL_error2);
                                    return;
                                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                                    ll.p(R.string.UnknownError, oc.a0(w0Var22), null);
                                    return;
                                } else {
                                    w0Var22.finishFragment();
                                    return;
                                }
                            default:
                                w0 w0Var3 = w0Var2;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null) {
                                    w0Var3.f45803b.a(0.0f);
                                    oc.b0(tL_error3);
                                    return;
                                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                                    w0Var3.f45803b.a(0.0f);
                                    ll.p(R.string.UnknownError, oc.a0(w0Var3), null);
                                    return;
                                } else {
                                    w0Var3.finishFragment();
                                    return;
                                }
                        }
                    }
                });
                return;
        }
    }
}
