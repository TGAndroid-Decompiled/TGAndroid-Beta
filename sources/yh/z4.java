package yh;

import android.content.Context;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.jb;
import org.telegram.tgnet.TLRPC;
public final class z4 implements Utilities.Callback {
    public final v5 f48077a;
    public final long f48078b;
    public final boolean[] f48079c;
    public final Utilities.Callback d;
    public final Context e;
    public final org.telegram.ui.ActionBar.f6 f48080f;
    public final boolean f48081g;
    public final String h;
    public final MessageObject f48082i;
    public final TLRPC.InputInvoice f48083j;
    public final TLRPC.TL_payments_paymentFormStars f48084k;
    public final int f48085l;
    public final long f48086m;

    public z4(v5 v5Var, long j3, boolean[] zArr, Utilities.Callback callback, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10, String str, MessageObject messageObject, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, int i10, long j10) {
        this.f48077a = v5Var;
        this.f48078b = j3;
        this.f48079c = zArr;
        this.d = callback;
        this.e = context;
        this.f48080f = f6Var;
        this.f48081g = z10;
        this.h = str;
        this.f48082i = messageObject;
        this.f48083j = inputInvoice;
        this.f48084k = tL_payments_paymentFormStars;
        this.f48085l = i10;
        this.f48086m = j10;
    }

    @Override
    public final void run(Object obj) {
        Utilities.Callback callback = (Utilities.Callback) obj;
        v5 v5Var = this.f48077a;
        long j3 = v5Var.f47921f.amount;
        long j10 = this.f48078b;
        boolean[] zArr = this.f48079c;
        Utilities.Callback callback2 = this.d;
        MessageObject messageObject = this.f48082i;
        TLRPC.InputInvoice inputInvoice = this.f48083j;
        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = this.f48084k;
        int i10 = this.f48085l;
        if (j3 < j10) {
            boolean starsPurchaseAvailable = MessagesController.getInstance(v5Var.f47918a).starsPurchaseAvailable();
            Context context = this.e;
            org.telegram.ui.ActionBar.f6 f6Var = this.f48080f;
            int i11 = 0;
            if (!starsPurchaseAvailable) {
                if (callback != null) {
                    callback.run(Boolean.FALSE);
                }
                if (!zArr[0] && callback2 != null) {
                    callback2.run("cancelled");
                    zArr[0] = true;
                }
                v5.e0(context, f6Var);
                return;
            }
            boolean[] zArr2 = {false};
            if (this.f48081g) {
                i11 = 9;
            }
            n7 n7Var = new n7(context, f6Var, j10, i11, this.h, new jb(v5Var, zArr2, messageObject, inputInvoice, tL_payments_paymentFormStars, zArr, i10, callback2, callback), this.f48086m);
            n7Var.setOnDismissListener(new org.telegram.ui.web.d0(v5Var, callback, zArr2, zArr, callback2, 2));
            n7Var.show();
            return;
        }
        v5Var.a0(messageObject, inputInvoice, tL_payments_paymentFormStars, new d5(v5Var, i10, callback, zArr, callback2));
    }
}
