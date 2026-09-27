package yh;

import android.content.Context;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.jb;
import org.telegram.tgnet.TLRPC;
public final class w4 implements Utilities.Callback {
    public final s5 f48227a;
    public final long f48228b;
    public final boolean[] f48229c;
    public final Utilities.Callback d;
    public final Context e;
    public final org.telegram.ui.ActionBar.e6 f48230f;
    public final boolean f48231g;
    public final String h;
    public final MessageObject f48232i;
    public final TLRPC.InputInvoice f48233j;
    public final TLRPC.TL_payments_paymentFormStars f48234k;
    public final int f48235l;
    public final long f48236m;

    public w4(s5 s5Var, long j3, boolean[] zArr, Utilities.Callback callback, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, String str, MessageObject messageObject, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, int i10, long j10) {
        this.f48227a = s5Var;
        this.f48228b = j3;
        this.f48229c = zArr;
        this.d = callback;
        this.e = context;
        this.f48230f = e6Var;
        this.f48231g = z10;
        this.h = str;
        this.f48232i = messageObject;
        this.f48233j = inputInvoice;
        this.f48234k = tL_payments_paymentFormStars;
        this.f48235l = i10;
        this.f48236m = j10;
    }

    @Override
    public final void run(Object obj) {
        Utilities.Callback callback = (Utilities.Callback) obj;
        s5 s5Var = this.f48227a;
        long j3 = s5Var.f48059f.amount;
        long j10 = this.f48228b;
        boolean[] zArr = this.f48229c;
        Utilities.Callback callback2 = this.d;
        MessageObject messageObject = this.f48232i;
        TLRPC.InputInvoice inputInvoice = this.f48233j;
        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = this.f48234k;
        int i10 = this.f48235l;
        if (j3 < j10) {
            boolean starsPurchaseAvailable = MessagesController.getInstance(s5Var.f48056a).starsPurchaseAvailable();
            Context context = this.e;
            org.telegram.ui.ActionBar.e6 e6Var = this.f48230f;
            int i11 = 0;
            if (!starsPurchaseAvailable) {
                if (callback != null) {
                    callback.run(Boolean.FALSE);
                }
                if (!zArr[0] && callback2 != null) {
                    callback2.run("cancelled");
                    zArr[0] = true;
                }
                s5.e0(context, e6Var);
                return;
            }
            boolean[] zArr2 = {false};
            if (this.f48231g) {
                i11 = 9;
            }
            k7 k7Var = new k7(context, e6Var, j10, i11, this.h, new jb(s5Var, zArr2, messageObject, inputInvoice, tL_payments_paymentFormStars, zArr, i10, callback2, callback), this.f48236m);
            k7Var.setOnDismissListener(new org.telegram.ui.web.c0(s5Var, callback, zArr2, zArr, callback2, 2));
            k7Var.show();
            return;
        }
        s5Var.a0(messageObject, inputInvoice, tL_payments_paymentFormStars, new a5(s5Var, i10, callback, zArr, callback2));
    }
}
