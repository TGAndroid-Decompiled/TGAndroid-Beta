package rh;

import android.content.Context;
import org.telegram.messenger.k20;
import org.telegram.messenger.r20;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.yi0;
public final class r5 implements r20 {
    public final e6 f47419a;
    public final long f47420b;
    public final int f47421c;
    public final boolean[] d;
    public final k20 e;
    public final Context f47422f;
    public final org.telegram.ui.ActionBar.p6 f47423g;
    public final TLRPC.ChatInvite h;
    public final String f47424i;

    public r5(e6 e6Var, long j10, int i10, boolean[] zArr, k20 k20Var, Context context, org.telegram.ui.ActionBar.p6 p6Var, TLRPC.ChatInvite chatInvite, String str) {
        this.f47419a = e6Var;
        this.f47420b = j10;
        this.f47421c = i10;
        this.d = zArr;
        this.e = k20Var;
        this.f47422f = context;
        this.f47423g = p6Var;
        this.h = chatInvite;
        this.f47424i = str;
    }

    @Override
    public final void a(Object obj) {
        r20 r20Var = (r20) obj;
        e6 e6Var = this.f47419a;
        long j10 = e6Var.f46866f.amount;
        long j11 = this.f47420b;
        int i10 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1));
        boolean[] zArr = this.d;
        k20 k20Var = this.e;
        TLRPC.ChatInvite chatInvite = this.h;
        String str = this.f47424i;
        if (i10 < 0) {
            boolean z10 = wp.r1(this.f47421c).f19174k7;
            Context context = this.f47422f;
            org.telegram.ui.ActionBar.p6 p6Var = this.f47423g;
            if (z10) {
                if (r20Var != null) {
                    r20Var.a(Boolean.FALSE);
                }
                if (!zArr[0]) {
                    k20Var.a("cancelled", 0L);
                    zArr[0] = true;
                }
                e6.c0(context, p6Var);
                return;
            }
            boolean[] zArr2 = {false};
            x7 x7Var = new x7(context, p6Var, j11, 1, chatInvite.title, new mg.c0(e6Var, zArr2, str, chatInvite, zArr, k20Var, r20Var, 14), 0L);
            x7Var.setOnDismissListener(new yi0(e6Var, r20Var, zArr2, zArr, k20Var, 2));
            x7Var.show();
            return;
        }
        e6Var.Y(str, chatInvite, new j4(r20Var, zArr, k20Var));
    }
}
