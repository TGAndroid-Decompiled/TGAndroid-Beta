package xh;

import android.content.Context;
import org.telegram.messenger.q20;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.p6;
public final class q2 implements q20 {
    public final int f53989a;
    public final Object f53990b;
    public final Context f53991c;
    public final int d;
    public final long e;
    public final p6 f53992f;

    public q2(Object obj, Context context, int i10, long j10, p6 p6Var, int i11) {
        this.f53989a = i11;
        this.f53990b = obj;
        this.f53991c = context;
        this.d = i10;
        this.e = j10;
        this.f53992f = p6Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f53989a) {
            case 0:
                final org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) this.f53990b;
                final TLRPC.UserFull userFull = (TLRPC.UserFull) obj;
                final Context context = this.f53991c;
                final int i10 = this.d;
                final long j10 = this.e;
                final p6 p6Var = this.f53992f;
                org.telegram.messenger.i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r8) {
                            case 0:
                                TLRPC.UserFull userFull2 = userFull;
                                if (userFull2 != null && userFull2.starref_program != null) {
                                    z2Var.dismiss();
                                    z2.I0(context, i10, userFull2.starref_program, j10, p6Var, true);
                                    return;
                                }
                                return;
                            default:
                                TLRPC.UserFull userFull3 = userFull;
                                if (userFull3 != null && userFull3.starref_program != null) {
                                    z2Var.dismiss();
                                    z2.I0(context, i10, userFull3.starref_program, j10, p6Var, true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 1:
                final org.telegram.ui.ActionBar.z2 z2Var2 = (org.telegram.ui.ActionBar.z2) this.f53990b;
                final TLRPC.UserFull userFull2 = (TLRPC.UserFull) obj;
                final Context context2 = this.f53991c;
                final int i11 = this.d;
                final long j11 = this.e;
                final p6 p6Var2 = this.f53992f;
                org.telegram.messenger.i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r8) {
                            case 0:
                                TLRPC.UserFull userFull22 = userFull2;
                                if (userFull22 != null && userFull22.starref_program != null) {
                                    z2Var2.dismiss();
                                    z2.I0(context2, i11, userFull22.starref_program, j11, p6Var2, true);
                                    return;
                                }
                                return;
                            default:
                                TLRPC.UserFull userFull3 = userFull2;
                                if (userFull3 != null && userFull3.starref_program != null) {
                                    z2Var2.dismiss();
                                    z2.I0(context2, i11, userFull3.starref_program, j11, p6Var2, true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                ((org.telegram.ui.ActionBar.z2[]) this.f53990b)[0].dismiss();
                z2.J0(this.f53991c, this.d, (TL_payments.connectedBotStarRef) obj, this.e, this.f53992f);
                return;
        }
    }
}
