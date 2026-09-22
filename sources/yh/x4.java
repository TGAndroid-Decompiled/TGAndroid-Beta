package yh;

import android.content.Context;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.jb;
import org.telegram.tgnet.TLRPC;
public final class x4 implements Utilities.Callback {
    public final u5 f48270a;
    public final long f48271b;
    public final boolean[] f48272c;
    public final Utilities.Callback d;
    public final Context e;
    public final org.telegram.ui.ActionBar.f6 f48273f;
    public final boolean f48274g;
    public final String h;
    public final MessageObject f48275i;
    public final TLRPC.InputInvoice f48276j;
    public final TLRPC.TL_payments_paymentFormStars f48277k;
    public final int f48278l;
    public final long f48279m;

    public x4(u5 u5Var, long j3, boolean[] zArr, Utilities.Callback callback, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10, String str, MessageObject messageObject, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, int i10, long j10) {
        this.f48270a = u5Var;
        this.f48271b = j3;
        this.f48272c = zArr;
        this.d = callback;
        this.e = context;
        this.f48273f = f6Var;
        this.f48274g = z10;
        this.h = str;
        this.f48275i = messageObject;
        this.f48276j = inputInvoice;
        this.f48277k = tL_payments_paymentFormStars;
        this.f48278l = i10;
        this.f48279m = j10;
    }

    @Override
    public final void run(Object obj) {
        Utilities.Callback callback = (Utilities.Callback) obj;
        u5 u5Var = this.f48270a;
        long j3 = u5Var.f48135f.amount;
        long j10 = this.f48271b;
        boolean[] zArr = this.f48272c;
        Utilities.Callback callback2 = this.d;
        MessageObject messageObject = this.f48275i;
        TLRPC.InputInvoice inputInvoice = this.f48276j;
        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = this.f48277k;
        int i10 = this.f48278l;
        if (j3 < j10) {
            boolean starsPurchaseAvailable = MessagesController.getInstance(u5Var.f48132a).starsPurchaseAvailable();
            Context context = this.e;
            org.telegram.ui.ActionBar.f6 f6Var = this.f48273f;
            int i11 = 0;
            if (!starsPurchaseAvailable) {
                if (callback != null) {
                    callback.run(Boolean.FALSE);
                }
                if (!zArr[0] && callback2 != null) {
                    callback2.run("cancelled");
                    zArr[0] = true;
                }
                u5.e0(context, f6Var);
                return;
            }
            boolean[] zArr2 = {false};
            if (this.f48274g) {
                i11 = 9;
            }
            l7 l7Var = new l7(context, f6Var, j10, i11, this.h, new jb(u5Var, zArr2, messageObject, inputInvoice, tL_payments_paymentFormStars, zArr, i10, callback2, callback), this.f48279m);
            l7Var.setOnDismissListener(new org.telegram.ui.web.d0(u5Var, callback, zArr2, zArr, callback2, 2));
            l7Var.show();
            return;
        }
        u5Var.a0(messageObject, inputInvoice, tL_payments_paymentFormStars, new b5(u5Var, i10, callback, zArr, callback2));
    }
}
