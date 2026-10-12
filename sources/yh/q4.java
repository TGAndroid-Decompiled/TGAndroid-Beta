package yh;

import android.content.Context;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ob;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.dl0;
public final class q4 implements Utilities.Callback {
    public final n5 f53302a;
    public final long f53303b;
    public final boolean[] f53304c;
    public final Utilities.Callback d;
    public final Context f53305e;
    public final org.telegram.ui.ActionBar.c6 f53306f;
    public final boolean f53307g;
    public final String h;
    public final MessageObject f53308i;
    public final TLRPC.InputInvoice f53309j;
    public final TLRPC.TL_payments_paymentFormStars f53310k;
    public final int f53311l;
    public final long f53312m;

    public q4(n5 n5Var, long j3, boolean[] zArr, Utilities.Callback callback, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10, String str, MessageObject messageObject, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, int i10, long j10) {
        this.f53302a = n5Var;
        this.f53303b = j3;
        this.f53304c = zArr;
        this.d = callback;
        this.f53305e = context;
        this.f53306f = c6Var;
        this.f53307g = z10;
        this.h = str;
        this.f53308i = messageObject;
        this.f53309j = inputInvoice;
        this.f53310k = tL_payments_paymentFormStars;
        this.f53311l = i10;
        this.f53312m = j10;
    }

    @Override
    public final void run(Object obj) {
        Utilities.Callback callback = (Utilities.Callback) obj;
        n5 n5Var = this.f53302a;
        long j3 = n5Var.f53150f.amount;
        long j10 = this.f53303b;
        int i10 = (j3 > j10 ? 1 : (j3 == j10 ? 0 : -1));
        boolean[] zArr = this.f53304c;
        Utilities.Callback callback2 = this.d;
        MessageObject messageObject = this.f53308i;
        TLRPC.InputInvoice inputInvoice = this.f53309j;
        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = this.f53310k;
        int i11 = this.f53311l;
        if (i10 < 0) {
            boolean starsPurchaseAvailable = MessagesController.getInstance(n5Var.f53146a).starsPurchaseAvailable();
            Context context = this.f53305e;
            org.telegram.ui.ActionBar.c6 c6Var = this.f53306f;
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
            if (this.f53307g) {
                i12 = 9;
            }
            e7 e7Var = new e7(context, c6Var, j10, i12, this.h, new ob(n5Var, zArr2, messageObject, inputInvoice, tL_payments_paymentFormStars, zArr, i11, callback2, callback), this.f53312m);
            e7Var.setOnDismissListener(new dl0(n5Var, callback, zArr2, zArr, callback2, 3));
            e7Var.show();
            return;
        }
        n5Var.a0(messageObject, inputInvoice, tL_payments_paymentFormStars, new u4(n5Var, i11, callback, zArr, callback2));
    }
}
