package yh;

import android.content.Context;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.jb;
import org.telegram.tgnet.TLRPC;
public final class w4 implements Utilities.Callback {
    public final t5 f48162a;
    public final long f48163b;
    public final boolean[] f48164c;
    public final Utilities.Callback d;
    public final Context e;
    public final org.telegram.ui.ActionBar.d6 f48165f;
    public final boolean f48166g;
    public final String h;
    public final MessageObject f48167i;
    public final TLRPC.InputInvoice f48168j;
    public final TLRPC.TL_payments_paymentFormStars f48169k;
    public final int f48170l;
    public final long f48171m;

    public w4(t5 t5Var, long j3, boolean[] zArr, Utilities.Callback callback, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10, String str, MessageObject messageObject, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, int i10, long j10) {
        this.f48162a = t5Var;
        this.f48163b = j3;
        this.f48164c = zArr;
        this.d = callback;
        this.e = context;
        this.f48165f = d6Var;
        this.f48166g = z10;
        this.h = str;
        this.f48167i = messageObject;
        this.f48168j = inputInvoice;
        this.f48169k = tL_payments_paymentFormStars;
        this.f48170l = i10;
        this.f48171m = j10;
    }

    @Override
    public final void run(Object obj) {
        Utilities.Callback callback = (Utilities.Callback) obj;
        t5 t5Var = this.f48162a;
        long j3 = t5Var.f48031f.amount;
        long j10 = this.f48163b;
        boolean[] zArr = this.f48164c;
        Utilities.Callback callback2 = this.d;
        MessageObject messageObject = this.f48167i;
        TLRPC.InputInvoice inputInvoice = this.f48168j;
        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = this.f48169k;
        int i10 = this.f48170l;
        if (j3 < j10) {
            boolean starsPurchaseAvailable = MessagesController.getInstance(t5Var.f48028a).starsPurchaseAvailable();
            Context context = this.e;
            org.telegram.ui.ActionBar.d6 d6Var = this.f48165f;
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
            if (this.f48166g) {
                i11 = 9;
            }
            l7 l7Var = new l7(context, d6Var, j10, i11, this.h, new jb(t5Var, zArr2, messageObject, inputInvoice, tL_payments_paymentFormStars, zArr, i10, callback2, callback), this.f48171m);
            l7Var.setOnDismissListener(new org.telegram.ui.web.c0(t5Var, callback, zArr2, zArr, callback2, 2));
            l7Var.show();
            return;
        }
        t5Var.a0(messageObject, inputInvoice, tL_payments_paymentFormStars, new a5(t5Var, i10, callback, zArr, callback2));
    }
}
