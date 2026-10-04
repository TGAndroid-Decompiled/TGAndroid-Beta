package yh;

import android.content.Context;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.jb;
import org.telegram.tgnet.TLRPC;
public final class w4 implements Utilities.Callback {
    public final t5 f52154a;
    public final long f52155b;
    public final boolean[] f52156c;
    public final Utilities.Callback d;
    public final Context f52157e;
    public final org.telegram.ui.ActionBar.d6 f52158f;
    public final boolean f52159g;
    public final String h;
    public final MessageObject f52160i;
    public final TLRPC.InputInvoice f52161j;
    public final TLRPC.TL_payments_paymentFormStars f52162k;
    public final int f52163l;
    public final long f52164m;

    public w4(t5 t5Var, long j3, boolean[] zArr, Utilities.Callback callback, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10, String str, MessageObject messageObject, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, int i10, long j10) {
        this.f52154a = t5Var;
        this.f52155b = j3;
        this.f52156c = zArr;
        this.d = callback;
        this.f52157e = context;
        this.f52158f = d6Var;
        this.f52159g = z10;
        this.h = str;
        this.f52160i = messageObject;
        this.f52161j = inputInvoice;
        this.f52162k = tL_payments_paymentFormStars;
        this.f52163l = i10;
        this.f52164m = j10;
    }

    @Override
    public final void run(Object obj) {
        Utilities.Callback callback = (Utilities.Callback) obj;
        t5 t5Var = this.f52154a;
        long j3 = t5Var.f52014f.amount;
        long j10 = this.f52155b;
        boolean[] zArr = this.f52156c;
        Utilities.Callback callback2 = this.d;
        MessageObject messageObject = this.f52160i;
        TLRPC.InputInvoice inputInvoice = this.f52161j;
        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = this.f52162k;
        int i10 = this.f52163l;
        if (j3 < j10) {
            boolean starsPurchaseAvailable = MessagesController.getInstance(t5Var.f52010a).starsPurchaseAvailable();
            Context context = this.f52157e;
            org.telegram.ui.ActionBar.d6 d6Var = this.f52158f;
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
            if (this.f52159g) {
                i11 = 9;
            }
            m7 m7Var = new m7(context, d6Var, j10, i11, this.h, new jb(t5Var, zArr2, messageObject, inputInvoice, tL_payments_paymentFormStars, zArr, i10, callback2, callback), this.f52164m);
            m7Var.setOnDismissListener(new org.telegram.ui.web.d0(t5Var, callback, zArr2, zArr, callback2, 2));
            m7Var.show();
            return;
        }
        t5Var.a0(messageObject, inputInvoice, tL_payments_paymentFormStars, new a5(t5Var, i10, callback, zArr, callback2));
    }
}
