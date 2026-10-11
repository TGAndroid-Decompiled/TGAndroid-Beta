package yh;

import android.content.Context;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.lb;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.bl0;
public final class q4 implements Utilities.Callback {
    public final n5 f53187a;
    public final long f53188b;
    public final boolean[] f53189c;
    public final Utilities.Callback d;
    public final Context f53190e;
    public final org.telegram.ui.ActionBar.d6 f53191f;
    public final boolean f53192g;
    public final String h;
    public final MessageObject f53193i;
    public final TLRPC.InputInvoice f53194j;
    public final TLRPC.TL_payments_paymentFormStars f53195k;
    public final int f53196l;
    public final long f53197m;

    public q4(n5 n5Var, long j3, boolean[] zArr, Utilities.Callback callback, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10, String str, MessageObject messageObject, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, int i10, long j10) {
        this.f53187a = n5Var;
        this.f53188b = j3;
        this.f53189c = zArr;
        this.d = callback;
        this.f53190e = context;
        this.f53191f = d6Var;
        this.f53192g = z10;
        this.h = str;
        this.f53193i = messageObject;
        this.f53194j = inputInvoice;
        this.f53195k = tL_payments_paymentFormStars;
        this.f53196l = i10;
        this.f53197m = j10;
    }

    @Override
    public final void run(Object obj) {
        Utilities.Callback callback = (Utilities.Callback) obj;
        n5 n5Var = this.f53187a;
        long j3 = n5Var.f53035f.amount;
        long j10 = this.f53188b;
        int i10 = (j3 > j10 ? 1 : (j3 == j10 ? 0 : -1));
        boolean[] zArr = this.f53189c;
        Utilities.Callback callback2 = this.d;
        MessageObject messageObject = this.f53193i;
        TLRPC.InputInvoice inputInvoice = this.f53194j;
        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = this.f53195k;
        int i11 = this.f53196l;
        if (i10 < 0) {
            boolean starsPurchaseAvailable = MessagesController.getInstance(n5Var.f53031a).starsPurchaseAvailable();
            Context context = this.f53190e;
            org.telegram.ui.ActionBar.d6 d6Var = this.f53191f;
            int i12 = 0;
            if (!starsPurchaseAvailable) {
                if (callback != null) {
                    callback.run(Boolean.FALSE);
                }
                if (!zArr[0] && callback2 != null) {
                    callback2.run("cancelled");
                    zArr[0] = true;
                }
                n5.e0(context, d6Var);
                return;
            }
            boolean[] zArr2 = {false};
            if (this.f53192g) {
                i12 = 9;
            }
            e7 e7Var = new e7(context, d6Var, j10, i12, this.h, new lb(n5Var, zArr2, messageObject, inputInvoice, tL_payments_paymentFormStars, zArr, i11, callback2, callback), this.f53197m);
            e7Var.setOnDismissListener(new bl0(n5Var, callback, zArr2, zArr, callback2, 3));
            e7Var.show();
            return;
        }
        n5Var.a0(messageObject, inputInvoice, tL_payments_paymentFormStars, new u4(n5Var, i11, callback, zArr, callback2));
    }
}
