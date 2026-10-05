package yh;

import android.content.Context;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.jb;
import org.telegram.tgnet.TLRPC;
public final class x4 implements Utilities.Callback {
    public final u5 f52225a;
    public final long f52226b;
    public final boolean[] f52227c;
    public final Utilities.Callback d;
    public final Context f52228e;
    public final org.telegram.ui.ActionBar.d6 f52229f;
    public final boolean f52230g;
    public final String h;
    public final MessageObject f52231i;
    public final TLRPC.InputInvoice f52232j;
    public final TLRPC.TL_payments_paymentFormStars f52233k;
    public final int f52234l;
    public final long f52235m;

    public x4(u5 u5Var, long j3, boolean[] zArr, Utilities.Callback callback, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10, String str, MessageObject messageObject, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, int i10, long j10) {
        this.f52225a = u5Var;
        this.f52226b = j3;
        this.f52227c = zArr;
        this.d = callback;
        this.f52228e = context;
        this.f52229f = d6Var;
        this.f52230g = z10;
        this.h = str;
        this.f52231i = messageObject;
        this.f52232j = inputInvoice;
        this.f52233k = tL_payments_paymentFormStars;
        this.f52234l = i10;
        this.f52235m = j10;
    }

    @Override
    public final void run(Object obj) {
        Utilities.Callback callback = (Utilities.Callback) obj;
        u5 u5Var = this.f52225a;
        long j3 = u5Var.f52089f.amount;
        long j10 = this.f52226b;
        boolean[] zArr = this.f52227c;
        Utilities.Callback callback2 = this.d;
        MessageObject messageObject = this.f52231i;
        TLRPC.InputInvoice inputInvoice = this.f52232j;
        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = this.f52233k;
        int i10 = this.f52234l;
        if (j3 < j10) {
            boolean starsPurchaseAvailable = MessagesController.getInstance(u5Var.f52085a).starsPurchaseAvailable();
            Context context = this.f52228e;
            org.telegram.ui.ActionBar.d6 d6Var = this.f52229f;
            int i11 = 0;
            if (!starsPurchaseAvailable) {
                if (callback != null) {
                    callback.run(Boolean.FALSE);
                }
                if (!zArr[0] && callback2 != null) {
                    callback2.run("cancelled");
                    zArr[0] = true;
                }
                u5.e0(context, d6Var);
                return;
            }
            boolean[] zArr2 = {false};
            if (this.f52230g) {
                i11 = 9;
            }
            n7 n7Var = new n7(context, d6Var, j10, i11, this.h, new jb(u5Var, zArr2, messageObject, inputInvoice, tL_payments_paymentFormStars, zArr, i10, callback2, callback), this.f52235m);
            n7Var.setOnDismissListener(new org.telegram.ui.web.d0(u5Var, callback, zArr2, zArr, callback2, 2));
            n7Var.show();
            return;
        }
        u5Var.a0(messageObject, inputInvoice, tL_payments_paymentFormStars, new b5(u5Var, i10, callback, zArr, callback2));
    }
}
