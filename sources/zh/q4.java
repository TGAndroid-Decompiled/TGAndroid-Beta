package zh;

import android.content.Context;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ob;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.hl0;
public final class q4 implements Utilities.Callback {
    public final n5 f51013a;
    public final long f51014b;
    public final boolean[] f51015c;
    public final Utilities.Callback d;
    public final Context e;
    public final org.telegram.ui.ActionBar.c6 f51016f;
    public final boolean f51017g;
    public final String h;
    public final MessageObject f51018i;
    public final TLRPC.InputInvoice f51019j;
    public final TLRPC.TL_payments_paymentFormStars f51020k;
    public final int f51021l;
    public final long f51022m;

    public q4(n5 n5Var, long j10, boolean[] zArr, Utilities.Callback callback, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10, String str, MessageObject messageObject, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, int i10, long j11) {
        this.f51013a = n5Var;
        this.f51014b = j10;
        this.f51015c = zArr;
        this.d = callback;
        this.e = context;
        this.f51016f = c6Var;
        this.f51017g = z10;
        this.h = str;
        this.f51018i = messageObject;
        this.f51019j = inputInvoice;
        this.f51020k = tL_payments_paymentFormStars;
        this.f51021l = i10;
        this.f51022m = j11;
    }

    @Override
    public final void run(Object obj) {
        Utilities.Callback callback = (Utilities.Callback) obj;
        n5 n5Var = this.f51013a;
        long j10 = n5Var.f50867f.amount;
        long j11 = this.f51014b;
        int i10 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1));
        boolean[] zArr = this.f51015c;
        Utilities.Callback callback2 = this.d;
        MessageObject messageObject = this.f51018i;
        TLRPC.InputInvoice inputInvoice = this.f51019j;
        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = this.f51020k;
        int i11 = this.f51021l;
        if (i10 < 0) {
            boolean starsPurchaseAvailable = MessagesController.getInstance(n5Var.f50864a).starsPurchaseAvailable();
            Context context = this.e;
            org.telegram.ui.ActionBar.c6 c6Var = this.f51016f;
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
            if (this.f51017g) {
                i12 = 9;
            }
            e7 e7Var = new e7(context, c6Var, j11, i12, this.h, new ob(n5Var, zArr2, messageObject, inputInvoice, tL_payments_paymentFormStars, zArr, i11, callback2, callback), this.f51022m);
            e7Var.setOnDismissListener(new hl0(n5Var, callback, zArr2, zArr, callback2, 3));
            e7Var.show();
            return;
        }
        n5Var.a0(messageObject, inputInvoice, tL_payments_paymentFormStars, new v4(n5Var, i11, callback, zArr, callback2));
    }
}
