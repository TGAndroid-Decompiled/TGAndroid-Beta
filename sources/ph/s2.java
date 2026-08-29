package ph;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.c6;
public final class s2 implements Utilities.Callback {
    public final int f46051a;
    public final Object f46052b;
    public final Context f46053c;
    public final int d;
    public final long f46054e;
    public final c6 f46055f;

    public s2(Object obj, Context context, int i10, long j10, c6 c6Var, int i11) {
        this.f46051a = i11;
        this.f46052b = obj;
        this.f46053c = context;
        this.d = i10;
        this.f46054e = j10;
        this.f46055f = c6Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f46051a) {
            case 0:
                final org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f46052b;
                final TLRPC.UserFull userFull = (TLRPC.UserFull) obj;
                final Context context = this.f46053c;
                final int i10 = this.d;
                final long j10 = this.f46054e;
                final c6 c6Var = this.f46055f;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r8) {
                            case 0:
                                TLRPC.UserFull userFull2 = userFull;
                                if (userFull2 != null && userFull2.starref_program != null) {
                                    f3Var.dismiss();
                                    d3.G0(context, i10, userFull2.starref_program, j10, c6Var, true);
                                    return;
                                }
                                return;
                            default:
                                TLRPC.UserFull userFull3 = userFull;
                                if (userFull3 != null && userFull3.starref_program != null) {
                                    f3Var.dismiss();
                                    d3.G0(context, i10, userFull3.starref_program, j10, c6Var, true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 1:
                final org.telegram.ui.ActionBar.f3 f3Var2 = (org.telegram.ui.ActionBar.f3) this.f46052b;
                final TLRPC.UserFull userFull2 = (TLRPC.UserFull) obj;
                final Context context2 = this.f46053c;
                final int i11 = this.d;
                final long j11 = this.f46054e;
                final c6 c6Var2 = this.f46055f;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r8) {
                            case 0:
                                TLRPC.UserFull userFull22 = userFull2;
                                if (userFull22 != null && userFull22.starref_program != null) {
                                    f3Var2.dismiss();
                                    d3.G0(context2, i11, userFull22.starref_program, j11, c6Var2, true);
                                    return;
                                }
                                return;
                            default:
                                TLRPC.UserFull userFull3 = userFull2;
                                if (userFull3 != null && userFull3.starref_program != null) {
                                    f3Var2.dismiss();
                                    d3.G0(context2, i11, userFull3.starref_program, j11, c6Var2, true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                ((org.telegram.ui.ActionBar.f3[]) this.f46052b)[0].dismiss();
                d3.H0(this.f46053c, this.d, (TL_payments.connectedBotStarRef) obj, this.f46054e, this.f46055f);
                return;
        }
    }
}
