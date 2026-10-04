package yh;

import android.content.Context;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.jb;
import org.telegram.tgnet.TLRPC;
public final class w4 implements Utilities.Callback {
    public final t5 f52160a;
    public final long f52161b;
    public final boolean[] f52162c;
    public final Utilities.Callback d;
    public final Context f52163e;
    public final org.telegram.ui.ActionBar.d6 f52164f;
    public final boolean f52165g;
    public final String h;
    public final MessageObject f52166i;
    public final TLRPC.InputInvoice f52167j;
    public final TLRPC.TL_payments_paymentFormStars f52168k;
    public final int f52169l;
    public final long f52170m;

    public w4(t5 t5Var, long j3, boolean[] zArr, Utilities.Callback callback, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10, String str, MessageObject messageObject, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, int i10, long j10) {
        this.f52160a = t5Var;
        this.f52161b = j3;
        this.f52162c = zArr;
        this.d = callback;
        this.f52163e = context;
        this.f52164f = d6Var;
        this.f52165g = z10;
        this.h = str;
        this.f52166i = messageObject;
        this.f52167j = inputInvoice;
        this.f52168k = tL_payments_paymentFormStars;
        this.f52169l = i10;
        this.f52170m = j10;
    }

    @Override
    public final void run(Object obj) {
        Utilities.Callback callback = (Utilities.Callback) obj;
        t5 t5Var = this.f52160a;
        long j3 = t5Var.f52020f.amount;
        long j10 = this.f52161b;
        boolean[] zArr = this.f52162c;
        Utilities.Callback callback2 = this.d;
        MessageObject messageObject = this.f52166i;
        TLRPC.InputInvoice inputInvoice = this.f52167j;
        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = this.f52168k;
        int i10 = this.f52169l;
        if (j3 < j10) {
            boolean starsPurchaseAvailable = MessagesController.getInstance(t5Var.f52016a).starsPurchaseAvailable();
            Context context = this.f52163e;
            org.telegram.ui.ActionBar.d6 d6Var = this.f52164f;
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
            if (this.f52165g) {
                i11 = 9;
            }
            m7 m7Var = new m7(context, d6Var, j10, i11, this.h, new jb(t5Var, zArr2, messageObject, inputInvoice, tL_payments_paymentFormStars, zArr, i10, callback2, callback), this.f52170m);
            m7Var.setOnDismissListener(new org.telegram.ui.web.d0(t5Var, callback, zArr2, zArr, callback2, 2));
            m7Var.show();
            return;
        }
        t5Var.a0(messageObject, inputInvoice, tL_payments_paymentFormStars, new a5(t5Var, i10, callback, zArr, callback2));
    }
}
