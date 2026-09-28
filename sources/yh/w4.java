package yh;

import android.content.Context;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.jb;
import org.telegram.tgnet.TLRPC;
public final class w4 implements Utilities.Callback {
    public final s5 f48173a;
    public final long f48174b;
    public final boolean[] f48175c;
    public final Utilities.Callback d;
    public final Context e;
    public final org.telegram.ui.ActionBar.d6 f48176f;
    public final boolean f48177g;
    public final String h;
    public final MessageObject f48178i;
    public final TLRPC.InputInvoice f48179j;
    public final TLRPC.TL_payments_paymentFormStars f48180k;
    public final int f48181l;
    public final long f48182m;

    public w4(s5 s5Var, long j3, boolean[] zArr, Utilities.Callback callback, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10, String str, MessageObject messageObject, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, int i10, long j10) {
        this.f48173a = s5Var;
        this.f48174b = j3;
        this.f48175c = zArr;
        this.d = callback;
        this.e = context;
        this.f48176f = d6Var;
        this.f48177g = z10;
        this.h = str;
        this.f48178i = messageObject;
        this.f48179j = inputInvoice;
        this.f48180k = tL_payments_paymentFormStars;
        this.f48181l = i10;
        this.f48182m = j10;
    }

    @Override
    public final void run(Object obj) {
        Utilities.Callback callback = (Utilities.Callback) obj;
        s5 s5Var = this.f48173a;
        long j3 = s5Var.f48014f.amount;
        long j10 = this.f48174b;
        boolean[] zArr = this.f48175c;
        Utilities.Callback callback2 = this.d;
        MessageObject messageObject = this.f48178i;
        TLRPC.InputInvoice inputInvoice = this.f48179j;
        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = this.f48180k;
        int i10 = this.f48181l;
        if (j3 < j10) {
            boolean starsPurchaseAvailable = MessagesController.getInstance(s5Var.f48011a).starsPurchaseAvailable();
            Context context = this.e;
            org.telegram.ui.ActionBar.d6 d6Var = this.f48176f;
            int i11 = 0;
            if (!starsPurchaseAvailable) {
                if (callback != null) {
                    callback.run(Boolean.FALSE);
                }
                if (!zArr[0] && callback2 != null) {
                    callback2.run("cancelled");
                    zArr[0] = true;
                }
                s5.e0(context, d6Var);
                return;
            }
            boolean[] zArr2 = {false};
            if (this.f48177g) {
                i11 = 9;
            }
            l7 l7Var = new l7(context, d6Var, j10, i11, this.h, new jb(s5Var, zArr2, messageObject, inputInvoice, tL_payments_paymentFormStars, zArr, i10, callback2, callback), this.f48182m);
            l7Var.setOnDismissListener(new org.telegram.ui.web.c0(s5Var, callback, zArr2, zArr, callback2, 2));
            l7Var.show();
            return;
        }
        s5Var.a0(messageObject, inputInvoice, tL_payments_paymentFormStars, new a5(s5Var, i10, callback, zArr, callback2));
    }
}
