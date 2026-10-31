package rh;

import android.content.Context;
import org.telegram.messenger.jj;
import org.telegram.messenger.q20;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.aj0;
import org.telegram.ui.t70;
public final class p5 implements q20 {
    public final e6 f47317a;
    public final long f47318b;
    public final boolean[] f47319c;
    public final q20 d;
    public final Context e;
    public final org.telegram.ui.ActionBar.p6 f47320f;
    public final boolean f47321g;
    public final String h;
    public final jj f47322i;
    public final TLRPC.InputInvoice f47323j;
    public final TLRPC.TL_payments_paymentFormStars f47324k;
    public final int f47325l;
    public final long f47326m;

    public p5(e6 e6Var, long j10, boolean[] zArr, q20 q20Var, Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10, String str, jj jjVar, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, int i10, long j11) {
        this.f47317a = e6Var;
        this.f47318b = j10;
        this.f47319c = zArr;
        this.d = q20Var;
        this.e = context;
        this.f47320f = p6Var;
        this.f47321g = z10;
        this.h = str;
        this.f47322i = jjVar;
        this.f47323j = inputInvoice;
        this.f47324k = tL_payments_paymentFormStars;
        this.f47325l = i10;
        this.f47326m = j11;
    }

    @Override
    public final void a(Object obj) {
        q20 q20Var = (q20) obj;
        e6 e6Var = this.f47317a;
        long j10 = e6Var.f46852f.amount;
        long j11 = this.f47318b;
        int i10 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1));
        boolean[] zArr = this.f47319c;
        q20 q20Var2 = this.d;
        jj jjVar = this.f47322i;
        TLRPC.InputInvoice inputInvoice = this.f47323j;
        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = this.f47324k;
        int i11 = this.f47325l;
        if (i10 < 0) {
            boolean z10 = vp.r1(e6Var.f46849a).f18831k7;
            Context context = this.e;
            org.telegram.ui.ActionBar.p6 p6Var = this.f47320f;
            int i12 = 0;
            if (z10) {
                if (q20Var != null) {
                    q20Var.a(Boolean.FALSE);
                }
                if (!zArr[0] && q20Var2 != null) {
                    q20Var2.a("cancelled");
                    zArr[0] = true;
                }
                e6.c0(context, p6Var);
                return;
            }
            boolean[] zArr2 = {false};
            if (this.f47321g) {
                i12 = 9;
            }
            x7 x7Var = new x7(context, p6Var, j11, i12, this.h, new t70(e6Var, zArr2, jjVar, inputInvoice, tL_payments_paymentFormStars, zArr, i11, q20Var2, q20Var), this.f47326m);
            x7Var.setOnDismissListener(new aj0(e6Var, q20Var, zArr2, zArr, q20Var2, 3));
            x7Var.show();
            return;
        }
        e6Var.Z(jjVar, inputInvoice, tL_payments_paymentFormStars, new n4(e6Var, i11, q20Var, zArr, q20Var2));
    }
}
