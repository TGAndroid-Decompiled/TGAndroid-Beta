package sh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.g6;
public final class s2 implements Utilities.Callback {
    public final int f47712a;
    public final Object f47713b;
    public final Context f47714c;
    public final int d;
    public final long f47715e;
    public final g6 f47716f;

    public s2(Object obj, Context context, int i10, long j10, g6 g6Var, int i11) {
        this.f47712a = i11;
        this.f47713b = obj;
        this.f47714c = context;
        this.d = i10;
        this.f47715e = j10;
        this.f47716f = g6Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f47712a) {
            case 0:
                final org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) this.f47713b;
                final TLRPC.UserFull userFull = (TLRPC.UserFull) obj;
                final Context context = this.f47714c;
                final int i10 = this.d;
                final long j10 = this.f47715e;
                final g6 g6Var = this.f47716f;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r8) {
                            case 0:
                                TLRPC.UserFull userFull2 = userFull;
                                if (userFull2 != null && userFull2.starref_program != null) {
                                    h3Var.dismiss();
                                    d3.G0(context, i10, userFull2.starref_program, j10, g6Var, true);
                                    return;
                                }
                                return;
                            default:
                                TLRPC.UserFull userFull3 = userFull;
                                if (userFull3 != null && userFull3.starref_program != null) {
                                    h3Var.dismiss();
                                    d3.G0(context, i10, userFull3.starref_program, j10, g6Var, true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 1:
                final org.telegram.ui.ActionBar.h3 h3Var2 = (org.telegram.ui.ActionBar.h3) this.f47713b;
                final TLRPC.UserFull userFull2 = (TLRPC.UserFull) obj;
                final Context context2 = this.f47714c;
                final int i11 = this.d;
                final long j11 = this.f47715e;
                final g6 g6Var2 = this.f47716f;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r8) {
                            case 0:
                                TLRPC.UserFull userFull22 = userFull2;
                                if (userFull22 != null && userFull22.starref_program != null) {
                                    h3Var2.dismiss();
                                    d3.G0(context2, i11, userFull22.starref_program, j11, g6Var2, true);
                                    return;
                                }
                                return;
                            default:
                                TLRPC.UserFull userFull3 = userFull2;
                                if (userFull3 != null && userFull3.starref_program != null) {
                                    h3Var2.dismiss();
                                    d3.G0(context2, i11, userFull3.starref_program, j11, g6Var2, true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                ((org.telegram.ui.ActionBar.h3[]) this.f47713b)[0].dismiss();
                d3.H0(this.f47714c, this.d, (TL_payments.connectedBotStarRef) obj, this.f47715e, this.f47716f);
                return;
        }
    }
}
