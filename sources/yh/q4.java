package yh;

import android.content.Context;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ob;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.dl0;
public final class q4 implements Utilities.Callback {
    public final n5 f53290a;
    public final long f53291b;
    public final boolean[] f53292c;
    public final Utilities.Callback d;
    public final Context f53293e;
    public final org.telegram.ui.ActionBar.c6 f53294f;
    public final boolean f53295g;
    public final String h;
    public final MessageObject f53296i;
    public final TLRPC.InputInvoice f53297j;
    public final TLRPC.TL_payments_paymentFormStars f53298k;
    public final int f53299l;
    public final long f53300m;

    public q4(n5 n5Var, long j3, boolean[] zArr, Utilities.Callback callback, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10, String str, MessageObject messageObject, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, int i10, long j10) {
        this.f53290a = n5Var;
        this.f53291b = j3;
        this.f53292c = zArr;
        this.d = callback;
        this.f53293e = context;
        this.f53294f = c6Var;
        this.f53295g = z10;
        this.h = str;
        this.f53296i = messageObject;
        this.f53297j = inputInvoice;
        this.f53298k = tL_payments_paymentFormStars;
        this.f53299l = i10;
        this.f53300m = j10;
    }

    @Override
    public final void run(Object obj) {
        Utilities.Callback callback = (Utilities.Callback) obj;
        n5 n5Var = this.f53290a;
        long j3 = n5Var.f53138f.amount;
        long j10 = this.f53291b;
        int i10 = (j3 > j10 ? 1 : (j3 == j10 ? 0 : -1));
        boolean[] zArr = this.f53292c;
        Utilities.Callback callback2 = this.d;
        MessageObject messageObject = this.f53296i;
        TLRPC.InputInvoice inputInvoice = this.f53297j;
        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = this.f53298k;
        int i11 = this.f53299l;
        if (i10 < 0) {
            boolean starsPurchaseAvailable = MessagesController.getInstance(n5Var.f53134a).starsPurchaseAvailable();
            Context context = this.f53293e;
            org.telegram.ui.ActionBar.c6 c6Var = this.f53294f;
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
            if (this.f53295g) {
                i12 = 9;
            }
            e7 e7Var = new e7(context, c6Var, j10, i12, this.h, new ob(n5Var, zArr2, messageObject, inputInvoice, tL_payments_paymentFormStars, zArr, i11, callback2, callback), this.f53300m);
            e7Var.setOnDismissListener(new dl0(n5Var, callback, zArr2, zArr, callback2, 3));
            e7Var.show();
            return;
        }
        n5Var.a0(messageObject, inputInvoice, tL_payments_paymentFormStars, new u4(n5Var, i11, callback, zArr, callback2));
    }
}
