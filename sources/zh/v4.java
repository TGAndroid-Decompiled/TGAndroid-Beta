package zh;

import android.content.Context;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ib;
import org.telegram.tgnet.TLRPC;
public final class v4 implements Utilities.Callback {
    public final s5 f52715a;
    public final long f52716b;
    public final boolean[] f52717c;
    public final Utilities.Callback d;
    public final Context f52718e;
    public final org.telegram.ui.ActionBar.f6 f52719f;
    public final boolean f52720g;
    public final String h;
    public final MessageObject f52721i;
    public final TLRPC.InputInvoice f52722j;
    public final TLRPC.TL_payments_paymentFormStars f52723k;
    public final int f52724l;
    public final long f52725m;

    public v4(s5 s5Var, long j3, boolean[] zArr, Utilities.Callback callback, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10, String str, MessageObject messageObject, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, int i10, long j10) {
        this.f52715a = s5Var;
        this.f52716b = j3;
        this.f52717c = zArr;
        this.d = callback;
        this.f52718e = context;
        this.f52719f = f6Var;
        this.f52720g = z10;
        this.h = str;
        this.f52721i = messageObject;
        this.f52722j = inputInvoice;
        this.f52723k = tL_payments_paymentFormStars;
        this.f52724l = i10;
        this.f52725m = j10;
    }

    @Override
    public final void run(Object obj) {
        Utilities.Callback callback = (Utilities.Callback) obj;
        s5 s5Var = this.f52715a;
        long j3 = s5Var.f52571f.amount;
        long j10 = this.f52716b;
        boolean[] zArr = this.f52717c;
        Utilities.Callback callback2 = this.d;
        MessageObject messageObject = this.f52721i;
        TLRPC.InputInvoice inputInvoice = this.f52722j;
        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = this.f52723k;
        int i10 = this.f52724l;
        if (j3 < j10) {
            boolean starsPurchaseAvailable = MessagesController.getInstance(s5Var.f52567a).starsPurchaseAvailable();
            Context context = this.f52718e;
            org.telegram.ui.ActionBar.f6 f6Var = this.f52719f;
            int i11 = 0;
            if (!starsPurchaseAvailable) {
                if (callback != null) {
                    callback.run(Boolean.FALSE);
                }
                if (!zArr[0] && callback2 != null) {
                    callback2.run("cancelled");
                    zArr[0] = true;
                }
                s5.e0(context, f6Var);
                return;
            }
            boolean[] zArr2 = {false};
            if (this.f52720g) {
                i11 = 9;
            }
            k7 k7Var = new k7(context, f6Var, j10, i11, this.h, new ib(s5Var, zArr2, messageObject, inputInvoice, tL_payments_paymentFormStars, zArr, i10, callback2, callback), this.f52725m);
            k7Var.setOnDismissListener(new org.telegram.ui.web.e0(s5Var, callback, zArr2, zArr, callback2, 2));
            k7Var.show();
            return;
        }
        s5Var.a0(messageObject, inputInvoice, tL_payments_paymentFormStars, new z4(s5Var, i10, callback, zArr, callback2));
    }
}
