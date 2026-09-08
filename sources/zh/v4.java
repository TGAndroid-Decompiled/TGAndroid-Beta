package zh;

import android.content.Context;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.jb;
import org.telegram.tgnet.TLRPC;
public final class v4 implements Utilities.Callback {
    public final s5 f52745a;
    public final long f52746b;
    public final boolean[] f52747c;
    public final Utilities.Callback d;
    public final Context f52748e;
    public final org.telegram.ui.ActionBar.f6 f52749f;
    public final boolean f52750g;
    public final String h;
    public final MessageObject f52751i;
    public final TLRPC.InputInvoice f52752j;
    public final TLRPC.TL_payments_paymentFormStars f52753k;
    public final int f52754l;
    public final long f52755m;

    public v4(s5 s5Var, long j3, boolean[] zArr, Utilities.Callback callback, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10, String str, MessageObject messageObject, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, int i10, long j10) {
        this.f52745a = s5Var;
        this.f52746b = j3;
        this.f52747c = zArr;
        this.d = callback;
        this.f52748e = context;
        this.f52749f = f6Var;
        this.f52750g = z10;
        this.h = str;
        this.f52751i = messageObject;
        this.f52752j = inputInvoice;
        this.f52753k = tL_payments_paymentFormStars;
        this.f52754l = i10;
        this.f52755m = j10;
    }

    @Override
    public final void run(Object obj) {
        Utilities.Callback callback = (Utilities.Callback) obj;
        s5 s5Var = this.f52745a;
        long j3 = s5Var.f52601f.amount;
        long j10 = this.f52746b;
        boolean[] zArr = this.f52747c;
        Utilities.Callback callback2 = this.d;
        MessageObject messageObject = this.f52751i;
        TLRPC.InputInvoice inputInvoice = this.f52752j;
        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = this.f52753k;
        int i10 = this.f52754l;
        if (j3 < j10) {
            boolean starsPurchaseAvailable = MessagesController.getInstance(s5Var.f52597a).starsPurchaseAvailable();
            Context context = this.f52748e;
            org.telegram.ui.ActionBar.f6 f6Var = this.f52749f;
            int i11 = 0;
            if (!starsPurchaseAvailable) {
                if (callback != null) {
                    callback.run(Boolean.FALSE);
                }
                if (!zArr[0] && callback2 != null) {
                    callback2.run("cancelled");
                    zArr[0] = true;
                }
                s5.e0(context, f6Var);
                return;
            }
            boolean[] zArr2 = {false};
            if (this.f52750g) {
                i11 = 9;
            }
            k7 k7Var = new k7(context, f6Var, j10, i11, this.h, new jb(s5Var, zArr2, messageObject, inputInvoice, tL_payments_paymentFormStars, zArr, i10, callback2, callback), this.f52755m);
            k7Var.setOnDismissListener(new org.telegram.ui.web.e0(s5Var, callback, zArr2, zArr, callback2, 2));
            k7Var.show();
            return;
        }
        s5Var.a0(messageObject, inputInvoice, tL_payments_paymentFormStars, new z4(s5Var, i10, callback, zArr, callback2));
    }
}
