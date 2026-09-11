package zh;

import android.content.Context;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ib;
import org.telegram.tgnet.TLRPC;
public final class v4 implements Utilities.Callback {
    public final s5 f52714a;
    public final long f52715b;
    public final boolean[] f52716c;
    public final Utilities.Callback d;
    public final Context f52717e;
    public final org.telegram.ui.ActionBar.f6 f52718f;
    public final boolean f52719g;
    public final String h;
    public final MessageObject f52720i;
    public final TLRPC.InputInvoice f52721j;
    public final TLRPC.TL_payments_paymentFormStars f52722k;
    public final int f52723l;
    public final long f52724m;

    public v4(s5 s5Var, long j3, boolean[] zArr, Utilities.Callback callback, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10, String str, MessageObject messageObject, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, int i10, long j10) {
        this.f52714a = s5Var;
        this.f52715b = j3;
        this.f52716c = zArr;
        this.d = callback;
        this.f52717e = context;
        this.f52718f = f6Var;
        this.f52719g = z10;
        this.h = str;
        this.f52720i = messageObject;
        this.f52721j = inputInvoice;
        this.f52722k = tL_payments_paymentFormStars;
        this.f52723l = i10;
        this.f52724m = j10;
    }

    @Override
    public final void run(Object obj) {
        Utilities.Callback callback = (Utilities.Callback) obj;
        s5 s5Var = this.f52714a;
        long j3 = s5Var.f52570f.amount;
        long j10 = this.f52715b;
        boolean[] zArr = this.f52716c;
        Utilities.Callback callback2 = this.d;
        MessageObject messageObject = this.f52720i;
        TLRPC.InputInvoice inputInvoice = this.f52721j;
        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = this.f52722k;
        int i10 = this.f52723l;
        if (j3 < j10) {
            boolean starsPurchaseAvailable = MessagesController.getInstance(s5Var.f52566a).starsPurchaseAvailable();
            Context context = this.f52717e;
            org.telegram.ui.ActionBar.f6 f6Var = this.f52718f;
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
            if (this.f52719g) {
                i11 = 9;
            }
            k7 k7Var = new k7(context, f6Var, j10, i11, this.h, new ib(s5Var, zArr2, messageObject, inputInvoice, tL_payments_paymentFormStars, zArr, i10, callback2, callback), this.f52724m);
            k7Var.setOnDismissListener(new org.telegram.ui.web.e0(s5Var, callback, zArr2, zArr, callback2, 2));
            k7Var.show();
            return;
        }
        s5Var.a0(messageObject, inputInvoice, tL_payments_paymentFormStars, new z4(s5Var, i10, callback, zArr, callback2));
    }
}
