package yh;

import android.content.Context;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.jb;
import org.telegram.tgnet.TLRPC;
public final class x4 implements Utilities.Callback {
    public final u5 f48249a;
    public final long f48250b;
    public final boolean[] f48251c;
    public final Utilities.Callback d;
    public final Context e;
    public final org.telegram.ui.ActionBar.f6 f48252f;
    public final boolean f48253g;
    public final String h;
    public final MessageObject f48254i;
    public final TLRPC.InputInvoice f48255j;
    public final TLRPC.TL_payments_paymentFormStars f48256k;
    public final int f48257l;
    public final long f48258m;

    public x4(u5 u5Var, long j3, boolean[] zArr, Utilities.Callback callback, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10, String str, MessageObject messageObject, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, int i10, long j10) {
        this.f48249a = u5Var;
        this.f48250b = j3;
        this.f48251c = zArr;
        this.d = callback;
        this.e = context;
        this.f48252f = f6Var;
        this.f48253g = z10;
        this.h = str;
        this.f48254i = messageObject;
        this.f48255j = inputInvoice;
        this.f48256k = tL_payments_paymentFormStars;
        this.f48257l = i10;
        this.f48258m = j10;
    }

    @Override
    public final void run(Object obj) {
        Utilities.Callback callback = (Utilities.Callback) obj;
        u5 u5Var = this.f48249a;
        long j3 = u5Var.f48114f.amount;
        long j10 = this.f48250b;
        boolean[] zArr = this.f48251c;
        Utilities.Callback callback2 = this.d;
        MessageObject messageObject = this.f48254i;
        TLRPC.InputInvoice inputInvoice = this.f48255j;
        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = this.f48256k;
        int i10 = this.f48257l;
        if (j3 < j10) {
            boolean starsPurchaseAvailable = MessagesController.getInstance(u5Var.f48111a).starsPurchaseAvailable();
            Context context = this.e;
            org.telegram.ui.ActionBar.f6 f6Var = this.f48252f;
            int i11 = 0;
            if (!starsPurchaseAvailable) {
                if (callback != null) {
                    callback.run(Boolean.FALSE);
                }
                if (!zArr[0] && callback2 != null) {
                    callback2.run("cancelled");
                    zArr[0] = true;
                }
                u5.e0(context, f6Var);
                return;
            }
            boolean[] zArr2 = {false};
            if (this.f48253g) {
                i11 = 9;
            }
            l7 l7Var = new l7(context, f6Var, j10, i11, this.h, new jb(u5Var, zArr2, messageObject, inputInvoice, tL_payments_paymentFormStars, zArr, i10, callback2, callback), this.f48258m);
            l7Var.setOnDismissListener(new org.telegram.ui.web.d0(u5Var, callback, zArr2, zArr, callback2, 2));
            l7Var.show();
            return;
        }
        u5Var.a0(messageObject, inputInvoice, tL_payments_paymentFormStars, new b5(u5Var, i10, callback, zArr, callback2));
    }
}
