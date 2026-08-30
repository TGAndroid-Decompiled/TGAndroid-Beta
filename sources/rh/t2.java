package rh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.f6;
public final class t2 implements Utilities.Callback {
    public final int f43767a;
    public final Object f43768b;
    public final Context f43769c;
    public final int d;
    public final long e;
    public final f6 f43770f;

    public t2(Object obj, Context context, int i10, long j10, f6 f6Var, int i11) {
        this.f43767a = i11;
        this.f43768b = obj;
        this.f43769c = context;
        this.d = i10;
        this.e = j10;
        this.f43770f = f6Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f43767a) {
            case 0:
                final org.telegram.ui.ActionBar.g3 g3Var = (org.telegram.ui.ActionBar.g3) this.f43768b;
                final TLRPC.UserFull userFull = (TLRPC.UserFull) obj;
                final Context context = this.f43769c;
                final int i10 = this.d;
                final long j10 = this.e;
                final f6 f6Var = this.f43770f;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r8) {
                            case 0:
                                TLRPC.UserFull userFull2 = userFull;
                                if (userFull2 != null && userFull2.starref_program != null) {
                                    g3Var.dismiss();
                                    e3.G0(context, i10, userFull2.starref_program, j10, f6Var, true);
                                    return;
                                }
                                return;
                            default:
                                TLRPC.UserFull userFull3 = userFull;
                                if (userFull3 != null && userFull3.starref_program != null) {
                                    g3Var.dismiss();
                                    e3.G0(context, i10, userFull3.starref_program, j10, f6Var, true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 1:
                final org.telegram.ui.ActionBar.g3 g3Var2 = (org.telegram.ui.ActionBar.g3) this.f43768b;
                final TLRPC.UserFull userFull2 = (TLRPC.UserFull) obj;
                final Context context2 = this.f43769c;
                final int i11 = this.d;
                final long j11 = this.e;
                final f6 f6Var2 = this.f43770f;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r8) {
                            case 0:
                                TLRPC.UserFull userFull22 = userFull2;
                                if (userFull22 != null && userFull22.starref_program != null) {
                                    g3Var2.dismiss();
                                    e3.G0(context2, i11, userFull22.starref_program, j11, f6Var2, true);
                                    return;
                                }
                                return;
                            default:
                                TLRPC.UserFull userFull3 = userFull2;
                                if (userFull3 != null && userFull3.starref_program != null) {
                                    g3Var2.dismiss();
                                    e3.G0(context2, i11, userFull3.starref_program, j11, f6Var2, true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                ((org.telegram.ui.ActionBar.g3[]) this.f43768b)[0].dismiss();
                e3.H0(this.f43769c, this.d, (TL_payments.connectedBotStarRef) obj, this.e, this.f43770f);
                return;
        }
    }
}
