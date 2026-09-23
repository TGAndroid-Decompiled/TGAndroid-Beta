package yh;

import android.content.Context;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.jb;
import org.telegram.tgnet.TLRPC;
public final class x4 implements Utilities.Callback {
    public final t5 f47896a;
    public final long f47897b;
    public final boolean[] f47898c;
    public final Utilities.Callback d;
    public final Context e;
    public final org.telegram.ui.ActionBar.d6 f47899f;
    public final boolean f47900g;
    public final String h;
    public final MessageObject f47901i;
    public final TLRPC.InputInvoice f47902j;
    public final TLRPC.TL_payments_paymentFormStars f47903k;
    public final int f47904l;
    public final long f47905m;

    public x4(t5 t5Var, long j3, boolean[] zArr, Utilities.Callback callback, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10, String str, MessageObject messageObject, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, int i10, long j10) {
        this.f47896a = t5Var;
        this.f47897b = j3;
        this.f47898c = zArr;
        this.d = callback;
        this.e = context;
        this.f47899f = d6Var;
        this.f47900g = z10;
        this.h = str;
        this.f47901i = messageObject;
        this.f47902j = inputInvoice;
        this.f47903k = tL_payments_paymentFormStars;
        this.f47904l = i10;
        this.f47905m = j10;
    }

    @Override
    public final void run(Object obj) {
        Utilities.Callback callback = (Utilities.Callback) obj;
        t5 t5Var = this.f47896a;
        long j3 = t5Var.f47735f.amount;
        long j10 = this.f47897b;
        boolean[] zArr = this.f47898c;
        Utilities.Callback callback2 = this.d;
        MessageObject messageObject = this.f47901i;
        TLRPC.InputInvoice inputInvoice = this.f47902j;
        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = this.f47903k;
        int i10 = this.f47904l;
        if (j3 < j10) {
            boolean starsPurchaseAvailable = MessagesController.getInstance(t5Var.f47732a).starsPurchaseAvailable();
            Context context = this.e;
            org.telegram.ui.ActionBar.d6 d6Var = this.f47899f;
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
            if (this.f47900g) {
                i11 = 9;
            }
            l7 l7Var = new l7(context, d6Var, j10, i11, this.h, new jb(t5Var, zArr2, messageObject, inputInvoice, tL_payments_paymentFormStars, zArr, i10, callback2, callback), this.f47905m);
            l7Var.setOnDismissListener(new org.telegram.ui.web.c0(t5Var, callback, zArr2, zArr, callback2, 2));
            l7Var.show();
            return;
        }
        t5Var.a0(messageObject, inputInvoice, tL_payments_paymentFormStars, new b5(t5Var, i10, callback, zArr, callback2));
    }
}
