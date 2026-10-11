package yh;

import android.content.Context;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.lb;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.bl0;
public final class q4 implements Utilities.Callback {
    public final n5 f53153a;
    public final long f53154b;
    public final boolean[] f53155c;
    public final Utilities.Callback d;
    public final Context f53156e;
    public final org.telegram.ui.ActionBar.d6 f53157f;
    public final boolean f53158g;
    public final String h;
    public final MessageObject f53159i;
    public final TLRPC.InputInvoice f53160j;
    public final TLRPC.TL_payments_paymentFormStars f53161k;
    public final int f53162l;
    public final long f53163m;

    public q4(n5 n5Var, long j3, boolean[] zArr, Utilities.Callback callback, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10, String str, MessageObject messageObject, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, int i10, long j10) {
        this.f53153a = n5Var;
        this.f53154b = j3;
        this.f53155c = zArr;
        this.d = callback;
        this.f53156e = context;
        this.f53157f = d6Var;
        this.f53158g = z10;
        this.h = str;
        this.f53159i = messageObject;
        this.f53160j = inputInvoice;
        this.f53161k = tL_payments_paymentFormStars;
        this.f53162l = i10;
        this.f53163m = j10;
    }

    @Override
    public final void run(Object obj) {
        Utilities.Callback callback = (Utilities.Callback) obj;
        n5 n5Var = this.f53153a;
        long j3 = n5Var.f53001f.amount;
        long j10 = this.f53154b;
        int i10 = (j3 > j10 ? 1 : (j3 == j10 ? 0 : -1));
        boolean[] zArr = this.f53155c;
        Utilities.Callback callback2 = this.d;
        MessageObject messageObject = this.f53159i;
        TLRPC.InputInvoice inputInvoice = this.f53160j;
        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = this.f53161k;
        int i11 = this.f53162l;
        if (i10 < 0) {
            boolean starsPurchaseAvailable = MessagesController.getInstance(n5Var.f52997a).starsPurchaseAvailable();
            Context context = this.f53156e;
            org.telegram.ui.ActionBar.d6 d6Var = this.f53157f;
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
            if (this.f53158g) {
                i12 = 9;
            }
            e7 e7Var = new e7(context, d6Var, j10, i12, this.h, new lb(n5Var, zArr2, messageObject, inputInvoice, tL_payments_paymentFormStars, zArr, i11, callback2, callback), this.f53163m);
            e7Var.setOnDismissListener(new bl0(n5Var, callback, zArr2, zArr, callback2, 3));
            e7Var.show();
            return;
        }
        n5Var.a0(messageObject, inputInvoice, tL_payments_paymentFormStars, new u4(n5Var, i11, callback, zArr, callback2));
    }
}
