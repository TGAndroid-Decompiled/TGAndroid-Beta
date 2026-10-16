package zh;

import android.content.Context;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ob;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.gl0;
public final class q4 implements Utilities.Callback {
    public final n5 f51014a;
    public final long f51015b;
    public final boolean[] f51016c;
    public final Utilities.Callback d;
    public final Context e;
    public final org.telegram.ui.ActionBar.c6 f51017f;
    public final boolean f51018g;
    public final String h;
    public final MessageObject f51019i;
    public final TLRPC.InputInvoice f51020j;
    public final TLRPC.TL_payments_paymentFormStars f51021k;
    public final int f51022l;
    public final long f51023m;

    public q4(n5 n5Var, long j10, boolean[] zArr, Utilities.Callback callback, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10, String str, MessageObject messageObject, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, int i10, long j11) {
        this.f51014a = n5Var;
        this.f51015b = j10;
        this.f51016c = zArr;
        this.d = callback;
        this.e = context;
        this.f51017f = c6Var;
        this.f51018g = z10;
        this.h = str;
        this.f51019i = messageObject;
        this.f51020j = inputInvoice;
        this.f51021k = tL_payments_paymentFormStars;
        this.f51022l = i10;
        this.f51023m = j11;
    }

    @Override
    public final void run(Object obj) {
        Utilities.Callback callback = (Utilities.Callback) obj;
        n5 n5Var = this.f51014a;
        long j10 = n5Var.f50868f.amount;
        long j11 = this.f51015b;
        int i10 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1));
        boolean[] zArr = this.f51016c;
        Utilities.Callback callback2 = this.d;
        MessageObject messageObject = this.f51019i;
        TLRPC.InputInvoice inputInvoice = this.f51020j;
        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = this.f51021k;
        int i11 = this.f51022l;
        if (i10 < 0) {
            boolean starsPurchaseAvailable = MessagesController.getInstance(n5Var.f50865a).starsPurchaseAvailable();
            Context context = this.e;
            org.telegram.ui.ActionBar.c6 c6Var = this.f51017f;
            int i12 = 0;
            if (!starsPurchaseAvailable) {
                if (callback != null) {
                    callback.run(Boolean.FALSE);
                }
                if (!zArr[0] && callback2 != null) {
                    callback2.run("cancelled");
                    zArr[0] = true;
                }
                n5.e0(context, c6Var);
                return;
            }
            boolean[] zArr2 = {false};
            if (this.f51018g) {
                i12 = 9;
            }
            e7 e7Var = new e7(context, c6Var, j11, i12, this.h, new ob(n5Var, zArr2, messageObject, inputInvoice, tL_payments_paymentFormStars, zArr, i11, callback2, callback), this.f51023m);
            e7Var.setOnDismissListener(new gl0(n5Var, callback, zArr2, zArr, callback2, 3));
            e7Var.show();
            return;
        }
        n5Var.a0(messageObject, inputInvoice, tL_payments_paymentFormStars, new v4(n5Var, i11, callback, zArr, callback2));
    }
}
