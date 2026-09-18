package yh;

import android.content.Context;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.jb;
import org.telegram.tgnet.TLRPC;
public final class x4 implements Utilities.Callback {
    public final t5 f48207a;
    public final long f48208b;
    public final boolean[] f48209c;
    public final Utilities.Callback d;
    public final Context e;
    public final org.telegram.ui.ActionBar.e6 f48210f;
    public final boolean f48211g;
    public final String h;
    public final MessageObject f48212i;
    public final TLRPC.InputInvoice f48213j;
    public final TLRPC.TL_payments_paymentFormStars f48214k;
    public final int f48215l;
    public final long f48216m;

    public x4(t5 t5Var, long j3, boolean[] zArr, Utilities.Callback callback, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, String str, MessageObject messageObject, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, int i10, long j10) {
        this.f48207a = t5Var;
        this.f48208b = j3;
        this.f48209c = zArr;
        this.d = callback;
        this.e = context;
        this.f48210f = e6Var;
        this.f48211g = z10;
        this.h = str;
        this.f48212i = messageObject;
        this.f48213j = inputInvoice;
        this.f48214k = tL_payments_paymentFormStars;
        this.f48215l = i10;
        this.f48216m = j10;
    }

    @Override
    public final void run(Object obj) {
        Utilities.Callback callback = (Utilities.Callback) obj;
        t5 t5Var = this.f48207a;
        long j3 = t5Var.f48045f.amount;
        long j10 = this.f48208b;
        boolean[] zArr = this.f48209c;
        Utilities.Callback callback2 = this.d;
        MessageObject messageObject = this.f48212i;
        TLRPC.InputInvoice inputInvoice = this.f48213j;
        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = this.f48214k;
        int i10 = this.f48215l;
        if (j3 < j10) {
            boolean starsPurchaseAvailable = MessagesController.getInstance(t5Var.f48042a).starsPurchaseAvailable();
            Context context = this.e;
            org.telegram.ui.ActionBar.e6 e6Var = this.f48210f;
            int i11 = 0;
            if (!starsPurchaseAvailable) {
                if (callback != null) {
                    callback.run(Boolean.FALSE);
                }
                if (!zArr[0] && callback2 != null) {
                    callback2.run("cancelled");
                    zArr[0] = true;
                }
                t5.e0(context, e6Var);
                return;
            }
            boolean[] zArr2 = {false};
            if (this.f48211g) {
                i11 = 9;
            }
            k7 k7Var = new k7(context, e6Var, j10, i11, this.h, new jb(t5Var, zArr2, messageObject, inputInvoice, tL_payments_paymentFormStars, zArr, i10, callback2, callback), this.f48216m);
            k7Var.setOnDismissListener(new org.telegram.ui.web.d0(t5Var, callback, zArr2, zArr, callback2, 2));
            k7Var.show();
            return;
        }
        t5Var.a0(messageObject, inputInvoice, tL_payments_paymentFormStars, new b5(t5Var, i10, callback, zArr, callback2));
    }
}
