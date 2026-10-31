package rh;

import android.content.Context;
import org.telegram.messenger.j20;
import org.telegram.messenger.q20;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.aj0;
public final class r5 implements q20 {
    public final e6 f47407a;
    public final long f47408b;
    public final int f47409c;
    public final boolean[] d;
    public final j20 e;
    public final Context f47410f;
    public final org.telegram.ui.ActionBar.p6 f47411g;
    public final TLRPC.ChatInvite h;
    public final String f47412i;

    public r5(e6 e6Var, long j10, int i10, boolean[] zArr, j20 j20Var, Context context, org.telegram.ui.ActionBar.p6 p6Var, TLRPC.ChatInvite chatInvite, String str) {
        this.f47407a = e6Var;
        this.f47408b = j10;
        this.f47409c = i10;
        this.d = zArr;
        this.e = j20Var;
        this.f47410f = context;
        this.f47411g = p6Var;
        this.h = chatInvite;
        this.f47412i = str;
    }

    @Override
    public final void a(Object obj) {
        q20 q20Var = (q20) obj;
        e6 e6Var = this.f47407a;
        long j10 = e6Var.f46852f.amount;
        long j11 = this.f47408b;
        int i10 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1));
        boolean[] zArr = this.d;
        j20 j20Var = this.e;
        TLRPC.ChatInvite chatInvite = this.h;
        String str = this.f47412i;
        if (i10 < 0) {
            boolean z10 = vp.r1(this.f47409c).f18831k7;
            Context context = this.f47410f;
            org.telegram.ui.ActionBar.p6 p6Var = this.f47411g;
            if (z10) {
                if (q20Var != null) {
                    q20Var.a(Boolean.FALSE);
                }
                if (!zArr[0]) {
                    j20Var.a("cancelled", 0L);
                    zArr[0] = true;
                }
                e6.c0(context, p6Var);
                return;
            }
            boolean[] zArr2 = {false};
            x7 x7Var = new x7(context, p6Var, j11, 1, chatInvite.title, new mg.c0(e6Var, zArr2, str, chatInvite, zArr, j20Var, q20Var, 14), 0L);
            x7Var.setOnDismissListener(new aj0(e6Var, q20Var, zArr2, zArr, j20Var, 2));
            x7Var.show();
            return;
        }
        e6Var.Y(str, chatInvite, new j4(q20Var, zArr, j20Var));
    }
}
