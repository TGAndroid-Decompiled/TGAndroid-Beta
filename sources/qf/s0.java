package qf;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.y1;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.mc;

public final class s0 implements RequestDelegate {

    public final int f46442a;

    public final w0 f46443b;

    public s0(w0 w0Var, int i10) {
        this.f46442a = i10;
        this.f46443b = w0Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f46442a) {
            case 0:
                final int i10 = 1;
                final w0 w0Var = this.f46443b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i10) {
                            case 0:
                                w0 w0Var2 = w0Var;
                                w0Var2.f46471b.a(0.0f);
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 != null) {
                                    mc.b0(tL_error2);
                                } else if (!(tLObject instanceof TLRPC.TL_boolFalse)) {
                                    w0Var2.finishFragment();
                                } else {
                                    y1.r(R.string.UnknownError, mc.a0(w0Var2), null);
                                }
                                break;
                            default:
                                w0 w0Var3 = w0Var;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null) {
                                    w0Var3.f46471b.a(0.0f);
                                    mc.b0(tL_error3);
                                } else if (!(tLObject instanceof TLRPC.TL_boolFalse)) {
                                    w0Var3.finishFragment();
                                } else {
                                    w0Var3.f46471b.a(0.0f);
                                    y1.r(R.string.UnknownError, mc.a0(w0Var3), null);
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 0;
                final w0 w0Var2 = this.f46443b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i11) {
                            case 0:
                                w0 w0Var3 = w0Var2;
                                w0Var3.f46471b.a(0.0f);
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 != null) {
                                    mc.b0(tL_error2);
                                } else if (!(tLObject instanceof TLRPC.TL_boolFalse)) {
                                    w0Var3.finishFragment();
                                } else {
                                    y1.r(R.string.UnknownError, mc.a0(w0Var3), null);
                                }
                                break;
                            default:
                                w0 w0Var4 = w0Var2;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null) {
                                    w0Var4.f46471b.a(0.0f);
                                    mc.b0(tL_error3);
                                } else if (!(tLObject instanceof TLRPC.TL_boolFalse)) {
                                    w0Var4.finishFragment();
                                } else {
                                    w0Var4.f46471b.a(0.0f);
                                    y1.r(R.string.UnknownError, mc.a0(w0Var4), null);
                                }
                                break;
                        }
                    }
                });
                break;
        }
    }
}
