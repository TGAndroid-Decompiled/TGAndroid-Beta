package rh;

import android.content.Context;
import org.telegram.messenger.kj;
import org.telegram.messenger.r20;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.s70;
import org.telegram.ui.yi0;
public final class p5 implements r20 {
    public final e6 f47331a;
    public final long f47332b;
    public final boolean[] f47333c;
    public final r20 d;
    public final Context e;
    public final org.telegram.ui.ActionBar.p6 f47334f;
    public final boolean f47335g;
    public final String h;
    public final kj f47336i;
    public final TLRPC.InputInvoice f47337j;
    public final TLRPC.TL_payments_paymentFormStars f47338k;
    public final int f47339l;
    public final long f47340m;

    public p5(e6 e6Var, long j10, boolean[] zArr, r20 r20Var, Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10, String str, kj kjVar, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, int i10, long j11) {
        this.f47331a = e6Var;
        this.f47332b = j10;
        this.f47333c = zArr;
        this.d = r20Var;
        this.e = context;
        this.f47334f = p6Var;
        this.f47335g = z10;
        this.h = str;
        this.f47336i = kjVar;
        this.f47337j = inputInvoice;
        this.f47338k = tL_payments_paymentFormStars;
        this.f47339l = i10;
        this.f47340m = j11;
    }

    @Override
    public final void a(Object obj) {
        r20 r20Var = (r20) obj;
        e6 e6Var = this.f47331a;
        long j10 = e6Var.f46866f.amount;
        long j11 = this.f47332b;
        int i10 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1));
        boolean[] zArr = this.f47333c;
        r20 r20Var2 = this.d;
        kj kjVar = this.f47336i;
        TLRPC.InputInvoice inputInvoice = this.f47337j;
        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = this.f47338k;
        int i11 = this.f47339l;
        if (i10 < 0) {
            boolean z10 = wp.r1(e6Var.f46863a).f19174k7;
            Context context = this.e;
            org.telegram.ui.ActionBar.p6 p6Var = this.f47334f;
            int i12 = 0;
            if (z10) {
                if (r20Var != null) {
                    r20Var.a(Boolean.FALSE);
                }
                if (!zArr[0] && r20Var2 != null) {
                    r20Var2.a("cancelled");
                    zArr[0] = true;
                }
                e6.c0(context, p6Var);
                return;
            }
            boolean[] zArr2 = {false};
            if (this.f47335g) {
                i12 = 9;
            }
            x7 x7Var = new x7(context, p6Var, j11, i12, this.h, new s70(e6Var, zArr2, kjVar, inputInvoice, tL_payments_paymentFormStars, zArr, i11, r20Var2, r20Var), this.f47340m);
            x7Var.setOnDismissListener(new yi0(e6Var, r20Var, zArr2, zArr, r20Var2, 3));
            x7Var.show();
            return;
        }
        e6Var.Z(kjVar, inputInvoice, tL_payments_paymentFormStars, new n4(e6Var, i11, r20Var, zArr, r20Var2));
    }
}
