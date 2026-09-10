package xh;

import android.content.Context;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.qb;
import org.telegram.tgnet.TLRPC;
public final class w4 implements Utilities.Callback {
    public final v5 f46218a;
    public final long f46219b;
    public final boolean[] f46220c;
    public final Utilities.Callback d;
    public final Context e;
    public final org.telegram.ui.ActionBar.f6 f46221f;
    public final boolean f46222g;
    public final String h;
    public final MessageObject f46223i;
    public final TLRPC.InputInvoice f46224j;
    public final TLRPC.TL_payments_paymentFormStars f46225k;
    public final int f46226l;
    public final long f46227m;

    public w4(v5 v5Var, long j3, boolean[] zArr, Utilities.Callback callback, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10, String str, MessageObject messageObject, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, int i10, long j10) {
        this.f46218a = v5Var;
        this.f46219b = j3;
        this.f46220c = zArr;
        this.d = callback;
        this.e = context;
        this.f46221f = f6Var;
        this.f46222g = z10;
        this.h = str;
        this.f46223i = messageObject;
        this.f46224j = inputInvoice;
        this.f46225k = tL_payments_paymentFormStars;
        this.f46226l = i10;
        this.f46227m = j10;
    }

    @Override
    public final void run(Object obj) {
        Utilities.Callback callback = (Utilities.Callback) obj;
        v5 v5Var = this.f46218a;
        long j3 = v5Var.f46179f.amount;
        long j10 = this.f46219b;
        boolean[] zArr = this.f46220c;
        Utilities.Callback callback2 = this.d;
        MessageObject messageObject = this.f46223i;
        TLRPC.InputInvoice inputInvoice = this.f46224j;
        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = this.f46225k;
        int i10 = this.f46226l;
        if (j3 < j10) {
            boolean starsPurchaseAvailable = MessagesController.getInstance(v5Var.f46176a).starsPurchaseAvailable();
            Context context = this.e;
            org.telegram.ui.ActionBar.f6 f6Var = this.f46221f;
            int i11 = 0;
            if (!starsPurchaseAvailable) {
                if (callback != null) {
                    callback.run(Boolean.FALSE);
                }
                if (!zArr[0] && callback2 != null) {
                    callback2.run("cancelled");
                    zArr[0] = true;
                }
                v5.e0(context, f6Var);
                return;
            }
            boolean[] zArr2 = {false};
            if (this.f46222g) {
                i11 = 9;
            }
            o7 o7Var = new o7(context, f6Var, j10, i11, this.h, new qb(v5Var, zArr2, messageObject, inputInvoice, tL_payments_paymentFormStars, zArr, i10, callback2, callback), this.f46227m);
            o7Var.setOnDismissListener(new org.telegram.ui.web.d0(v5Var, callback, zArr2, zArr, callback2, 2));
            o7Var.show();
            return;
        }
        v5Var.a0(messageObject, inputInvoice, tL_payments_paymentFormStars, new b5(v5Var, i10, callback, zArr, callback2));
    }
}
