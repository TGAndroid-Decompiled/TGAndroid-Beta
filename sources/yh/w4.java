package yh;

import android.content.Context;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.jb;
import org.telegram.tgnet.TLRPC;
public final class w4 implements Utilities.Callback {
    public final s5 f48172a;
    public final long f48173b;
    public final boolean[] f48174c;
    public final Utilities.Callback d;
    public final Context e;
    public final org.telegram.ui.ActionBar.d6 f48175f;
    public final boolean f48176g;
    public final String h;
    public final MessageObject f48177i;
    public final TLRPC.InputInvoice f48178j;
    public final TLRPC.TL_payments_paymentFormStars f48179k;
    public final int f48180l;
    public final long f48181m;

    public w4(s5 s5Var, long j3, boolean[] zArr, Utilities.Callback callback, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10, String str, MessageObject messageObject, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, int i10, long j10) {
        this.f48172a = s5Var;
        this.f48173b = j3;
        this.f48174c = zArr;
        this.d = callback;
        this.e = context;
        this.f48175f = d6Var;
        this.f48176g = z10;
        this.h = str;
        this.f48177i = messageObject;
        this.f48178j = inputInvoice;
        this.f48179k = tL_payments_paymentFormStars;
        this.f48180l = i10;
        this.f48181m = j10;
    }

    @Override
    public final void run(Object obj) {
        Utilities.Callback callback = (Utilities.Callback) obj;
        s5 s5Var = this.f48172a;
        long j3 = s5Var.f48013f.amount;
        long j10 = this.f48173b;
        boolean[] zArr = this.f48174c;
        Utilities.Callback callback2 = this.d;
        MessageObject messageObject = this.f48177i;
        TLRPC.InputInvoice inputInvoice = this.f48178j;
        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = this.f48179k;
        int i10 = this.f48180l;
        if (j3 < j10) {
            boolean starsPurchaseAvailable = MessagesController.getInstance(s5Var.f48010a).starsPurchaseAvailable();
            Context context = this.e;
            org.telegram.ui.ActionBar.d6 d6Var = this.f48175f;
            int i11 = 0;
            if (!starsPurchaseAvailable) {
                if (callback != null) {
                    callback.run(Boolean.FALSE);
                }
                if (!zArr[0] && callback2 != null) {
                    callback2.run("cancelled");
                    zArr[0] = true;
                }
                s5.e0(context, d6Var);
                return;
            }
            boolean[] zArr2 = {false};
            if (this.f48176g) {
                i11 = 9;
            }
            l7 l7Var = new l7(context, d6Var, j10, i11, this.h, new jb(s5Var, zArr2, messageObject, inputInvoice, tL_payments_paymentFormStars, zArr, i10, callback2, callback), this.f48181m);
            l7Var.setOnDismissListener(new org.telegram.ui.web.c0(s5Var, callback, zArr2, zArr, callback2, 2));
            l7Var.show();
            return;
        }
        s5Var.a0(messageObject, inputInvoice, tL_payments_paymentFormStars, new a5(s5Var, i10, callback, zArr, callback2));
    }
}
