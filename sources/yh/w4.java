package yh;

import android.content.Context;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.jb;
import org.telegram.tgnet.TLRPC;
public final class w4 implements Utilities.Callback {
    public final s5 f48281a;
    public final long f48282b;
    public final boolean[] f48283c;
    public final Utilities.Callback d;
    public final Context e;
    public final org.telegram.ui.ActionBar.d6 f48284f;
    public final boolean f48285g;
    public final String h;
    public final MessageObject f48286i;
    public final TLRPC.InputInvoice f48287j;
    public final TLRPC.TL_payments_paymentFormStars f48288k;
    public final int f48289l;
    public final long f48290m;

    public w4(s5 s5Var, long j3, boolean[] zArr, Utilities.Callback callback, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10, String str, MessageObject messageObject, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, int i10, long j10) {
        this.f48281a = s5Var;
        this.f48282b = j3;
        this.f48283c = zArr;
        this.d = callback;
        this.e = context;
        this.f48284f = d6Var;
        this.f48285g = z10;
        this.h = str;
        this.f48286i = messageObject;
        this.f48287j = inputInvoice;
        this.f48288k = tL_payments_paymentFormStars;
        this.f48289l = i10;
        this.f48290m = j10;
    }

    @Override
    public final void run(Object obj) {
        Utilities.Callback callback = (Utilities.Callback) obj;
        s5 s5Var = this.f48281a;
        long j3 = s5Var.f48122f.amount;
        long j10 = this.f48282b;
        boolean[] zArr = this.f48283c;
        Utilities.Callback callback2 = this.d;
        MessageObject messageObject = this.f48286i;
        TLRPC.InputInvoice inputInvoice = this.f48287j;
        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = this.f48288k;
        int i10 = this.f48289l;
        if (j3 < j10) {
            boolean starsPurchaseAvailable = MessagesController.getInstance(s5Var.f48119a).starsPurchaseAvailable();
            Context context = this.e;
            org.telegram.ui.ActionBar.d6 d6Var = this.f48284f;
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
            if (this.f48285g) {
                i11 = 9;
            }
            l7 l7Var = new l7(context, d6Var, j10, i11, this.h, new jb(s5Var, zArr2, messageObject, inputInvoice, tL_payments_paymentFormStars, zArr, i10, callback2, callback), this.f48290m);
            l7Var.setOnDismissListener(new org.telegram.ui.web.c0(s5Var, callback, zArr2, zArr, callback2, 2));
            l7Var.show();
            return;
        }
        s5Var.a0(messageObject, inputInvoice, tL_payments_paymentFormStars, new a5(s5Var, i10, callback, zArr, callback2));
    }
}
