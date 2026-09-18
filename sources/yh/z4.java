package yh;

import android.content.Context;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.jb;
import org.telegram.tgnet.TLRPC;
public final class z4 implements Utilities.Callback {
    public final v5 f48082a;
    public final long f48083b;
    public final boolean[] f48084c;
    public final Utilities.Callback d;
    public final Context e;
    public final org.telegram.ui.ActionBar.f6 f48085f;
    public final boolean f48086g;
    public final String h;
    public final MessageObject f48087i;
    public final TLRPC.InputInvoice f48088j;
    public final TLRPC.TL_payments_paymentFormStars f48089k;
    public final int f48090l;
    public final long f48091m;

    public z4(v5 v5Var, long j3, boolean[] zArr, Utilities.Callback callback, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10, String str, MessageObject messageObject, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, int i10, long j10) {
        this.f48082a = v5Var;
        this.f48083b = j3;
        this.f48084c = zArr;
        this.d = callback;
        this.e = context;
        this.f48085f = f6Var;
        this.f48086g = z10;
        this.h = str;
        this.f48087i = messageObject;
        this.f48088j = inputInvoice;
        this.f48089k = tL_payments_paymentFormStars;
        this.f48090l = i10;
        this.f48091m = j10;
    }

    @Override
    public final void run(Object obj) {
        Utilities.Callback callback = (Utilities.Callback) obj;
        v5 v5Var = this.f48082a;
        long j3 = v5Var.f47926f.amount;
        long j10 = this.f48083b;
        boolean[] zArr = this.f48084c;
        Utilities.Callback callback2 = this.d;
        MessageObject messageObject = this.f48087i;
        TLRPC.InputInvoice inputInvoice = this.f48088j;
        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = this.f48089k;
        int i10 = this.f48090l;
        if (j3 < j10) {
            boolean starsPurchaseAvailable = MessagesController.getInstance(v5Var.f47923a).starsPurchaseAvailable();
            Context context = this.e;
            org.telegram.ui.ActionBar.f6 f6Var = this.f48085f;
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
            if (this.f48086g) {
                i11 = 9;
            }
            n7 n7Var = new n7(context, f6Var, j10, i11, this.h, new jb(v5Var, zArr2, messageObject, inputInvoice, tL_payments_paymentFormStars, zArr, i10, callback2, callback), this.f48091m);
            n7Var.setOnDismissListener(new org.telegram.ui.web.d0(v5Var, callback, zArr2, zArr, callback2, 2));
            n7Var.show();
            return;
        }
        v5Var.a0(messageObject, inputInvoice, tL_payments_paymentFormStars, new d5(v5Var, i10, callback, zArr, callback2));
    }
}
