package yh;

import android.content.Context;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.jb;
import org.telegram.tgnet.TLRPC;
public final class w4 implements Utilities.Callback {
    public final t5 f52155a;
    public final long f52156b;
    public final boolean[] f52157c;
    public final Utilities.Callback d;
    public final Context f52158e;
    public final org.telegram.ui.ActionBar.d6 f52159f;
    public final boolean f52160g;
    public final String h;
    public final MessageObject f52161i;
    public final TLRPC.InputInvoice f52162j;
    public final TLRPC.TL_payments_paymentFormStars f52163k;
    public final int f52164l;
    public final long f52165m;

    public w4(t5 t5Var, long j3, boolean[] zArr, Utilities.Callback callback, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10, String str, MessageObject messageObject, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, int i10, long j10) {
        this.f52155a = t5Var;
        this.f52156b = j3;
        this.f52157c = zArr;
        this.d = callback;
        this.f52158e = context;
        this.f52159f = d6Var;
        this.f52160g = z10;
        this.h = str;
        this.f52161i = messageObject;
        this.f52162j = inputInvoice;
        this.f52163k = tL_payments_paymentFormStars;
        this.f52164l = i10;
        this.f52165m = j10;
    }

    @Override
    public final void run(Object obj) {
        Utilities.Callback callback = (Utilities.Callback) obj;
        t5 t5Var = this.f52155a;
        long j3 = t5Var.f52015f.amount;
        long j10 = this.f52156b;
        boolean[] zArr = this.f52157c;
        Utilities.Callback callback2 = this.d;
        MessageObject messageObject = this.f52161i;
        TLRPC.InputInvoice inputInvoice = this.f52162j;
        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = this.f52163k;
        int i10 = this.f52164l;
        if (j3 < j10) {
            boolean starsPurchaseAvailable = MessagesController.getInstance(t5Var.f52011a).starsPurchaseAvailable();
            Context context = this.f52158e;
            org.telegram.ui.ActionBar.d6 d6Var = this.f52159f;
            int i11 = 0;
            if (!starsPurchaseAvailable) {
                if (callback != null) {
                    callback.run(Boolean.FALSE);
                }
                if (!zArr[0] && callback2 != null) {
                    callback2.run("cancelled");
                    zArr[0] = true;
                }
                t5.e0(context, d6Var);
                return;
            }
            boolean[] zArr2 = {false};
            if (this.f52160g) {
                i11 = 9;
            }
            m7 m7Var = new m7(context, d6Var, j10, i11, this.h, new jb(t5Var, zArr2, messageObject, inputInvoice, tL_payments_paymentFormStars, zArr, i10, callback2, callback), this.f52165m);
            m7Var.setOnDismissListener(new org.telegram.ui.web.d0(t5Var, callback, zArr2, zArr, callback2, 2));
            m7Var.show();
            return;
        }
        t5Var.a0(messageObject, inputInvoice, tL_payments_paymentFormStars, new a5(t5Var, i10, callback, zArr, callback2));
    }
}
