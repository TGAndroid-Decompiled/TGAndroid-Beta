package yh;

import android.content.Context;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.jb;
import org.telegram.tgnet.TLRPC;
public final class y4 implements Utilities.Callback {
    public final u5 f47963a;
    public final long f47964b;
    public final boolean[] f47965c;
    public final Utilities.Callback d;
    public final Context e;
    public final org.telegram.ui.ActionBar.e6 f47966f;
    public final boolean f47967g;
    public final String h;
    public final MessageObject f47968i;
    public final TLRPC.InputInvoice f47969j;
    public final TLRPC.TL_payments_paymentFormStars f47970k;
    public final int f47971l;
    public final long f47972m;

    public y4(u5 u5Var, long j3, boolean[] zArr, Utilities.Callback callback, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, String str, MessageObject messageObject, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, int i10, long j10) {
        this.f47963a = u5Var;
        this.f47964b = j3;
        this.f47965c = zArr;
        this.d = callback;
        this.e = context;
        this.f47966f = e6Var;
        this.f47967g = z10;
        this.h = str;
        this.f47968i = messageObject;
        this.f47969j = inputInvoice;
        this.f47970k = tL_payments_paymentFormStars;
        this.f47971l = i10;
        this.f47972m = j10;
    }

    @Override
    public final void run(Object obj) {
        Utilities.Callback callback = (Utilities.Callback) obj;
        u5 u5Var = this.f47963a;
        long j3 = u5Var.f47804f.amount;
        long j10 = this.f47964b;
        boolean[] zArr = this.f47965c;
        Utilities.Callback callback2 = this.d;
        MessageObject messageObject = this.f47968i;
        TLRPC.InputInvoice inputInvoice = this.f47969j;
        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = this.f47970k;
        int i10 = this.f47971l;
        if (j3 < j10) {
            boolean starsPurchaseAvailable = MessagesController.getInstance(u5Var.f47801a).starsPurchaseAvailable();
            Context context = this.e;
            org.telegram.ui.ActionBar.e6 e6Var = this.f47966f;
            int i11 = 0;
            if (!starsPurchaseAvailable) {
                if (callback != null) {
                    callback.run(Boolean.FALSE);
                }
                if (!zArr[0] && callback2 != null) {
                    callback2.run("cancelled");
                    zArr[0] = true;
                }
                u5.e0(context, e6Var);
                return;
            }
            boolean[] zArr2 = {false};
            if (this.f47967g) {
                i11 = 9;
            }
            m7 m7Var = new m7(context, e6Var, j10, i11, this.h, new jb(u5Var, zArr2, messageObject, inputInvoice, tL_payments_paymentFormStars, zArr, i10, callback2, callback), this.f47972m);
            m7Var.setOnDismissListener(new org.telegram.ui.web.d0(u5Var, callback, zArr2, zArr, callback2, 2));
            m7Var.show();
            return;
        }
        u5Var.a0(messageObject, inputInvoice, tL_payments_paymentFormStars, new c5(u5Var, i10, callback, zArr, callback2));
    }
}
