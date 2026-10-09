package yh;

import android.content.Context;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.lb;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.cl0;
public final class q4 implements Utilities.Callback {
    public final m5 f53066a;
    public final long f53067b;
    public final boolean[] f53068c;
    public final Utilities.Callback d;
    public final Context f53069e;
    public final org.telegram.ui.ActionBar.e6 f53070f;
    public final boolean f53071g;
    public final String h;
    public final MessageObject f53072i;
    public final TLRPC.InputInvoice f53073j;
    public final TLRPC.TL_payments_paymentFormStars f53074k;
    public final int f53075l;
    public final long f53076m;

    public q4(m5 m5Var, long j3, boolean[] zArr, Utilities.Callback callback, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, String str, MessageObject messageObject, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, int i10, long j10) {
        this.f53066a = m5Var;
        this.f53067b = j3;
        this.f53068c = zArr;
        this.d = callback;
        this.f53069e = context;
        this.f53070f = e6Var;
        this.f53071g = z10;
        this.h = str;
        this.f53072i = messageObject;
        this.f53073j = inputInvoice;
        this.f53074k = tL_payments_paymentFormStars;
        this.f53075l = i10;
        this.f53076m = j10;
    }

    @Override
    public final void run(Object obj) {
        Utilities.Callback callback = (Utilities.Callback) obj;
        m5 m5Var = this.f53066a;
        long j3 = m5Var.f52884f.amount;
        long j10 = this.f53067b;
        int i10 = (j3 > j10 ? 1 : (j3 == j10 ? 0 : -1));
        boolean[] zArr = this.f53068c;
        Utilities.Callback callback2 = this.d;
        MessageObject messageObject = this.f53072i;
        TLRPC.InputInvoice inputInvoice = this.f53073j;
        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = this.f53074k;
        int i11 = this.f53075l;
        if (i10 < 0) {
            boolean starsPurchaseAvailable = MessagesController.getInstance(m5Var.f52880a).starsPurchaseAvailable();
            Context context = this.f53069e;
            org.telegram.ui.ActionBar.e6 e6Var = this.f53070f;
            int i12 = 0;
            if (!starsPurchaseAvailable) {
                if (callback != null) {
                    callback.run(Boolean.FALSE);
                }
                if (!zArr[0] && callback2 != null) {
                    callback2.run("cancelled");
                    zArr[0] = true;
                }
                m5.e0(context, e6Var);
                return;
            }
            boolean[] zArr2 = {false};
            if (this.f53071g) {
                i12 = 9;
            }
            e7 e7Var = new e7(context, e6Var, j10, i12, this.h, new lb(m5Var, zArr2, messageObject, inputInvoice, tL_payments_paymentFormStars, zArr, i11, callback2, callback), this.f53076m);
            e7Var.setOnDismissListener(new cl0(m5Var, callback, zArr2, zArr, callback2, 3));
            e7Var.show();
            return;
        }
        m5Var.a0(messageObject, inputInvoice, tL_payments_paymentFormStars, new u4(m5Var, i11, callback, zArr, callback2));
    }
}
