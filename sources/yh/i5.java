package yh;

import android.content.Context;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.af;
public final class i5 implements Utilities.Callback {
    public final v5 f47320a;
    public final long f47321b;
    public final int f47322c;
    public final boolean[] d;
    public final Utilities.Callback2 e;
    public final Context f47323f;
    public final org.telegram.ui.ActionBar.f6 f47324g;
    public final TLRPC.ChatInvite h;
    public final String f47325i;

    public i5(v5 v5Var, long j3, int i10, boolean[] zArr, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.f6 f6Var, TLRPC.ChatInvite chatInvite, String str) {
        this.f47320a = v5Var;
        this.f47321b = j3;
        this.f47322c = i10;
        this.d = zArr;
        this.e = callback2;
        this.f47323f = context;
        this.f47324g = f6Var;
        this.h = chatInvite;
        this.f47325i = str;
    }

    @Override
    public final void run(Object obj) {
        Utilities.Callback callback = (Utilities.Callback) obj;
        v5 v5Var = this.f47320a;
        long j3 = v5Var.f47921f.amount;
        long j10 = this.f47321b;
        boolean[] zArr = this.d;
        Utilities.Callback2 callback2 = this.e;
        TLRPC.ChatInvite chatInvite = this.h;
        String str = this.f47325i;
        if (j3 < j10) {
            boolean starsPurchaseAvailable = MessagesController.getInstance(this.f47322c).starsPurchaseAvailable();
            Context context = this.f47323f;
            org.telegram.ui.ActionBar.f6 f6Var = this.f47324g;
            if (!starsPurchaseAvailable) {
                if (callback != null) {
                    callback.run(Boolean.FALSE);
                }
                if (!zArr[0]) {
                    callback2.run("cancelled", 0L);
                    zArr[0] = true;
                }
                v5.e0(context, f6Var);
                return;
            }
            boolean[] zArr2 = {false};
            n7 n7Var = new n7(context, f6Var, j10, 1, chatInvite.title, new af((Object) v5Var, (Object) zArr2, str, (TLObject) chatInvite, (Object) zArr, (Object) callback2, (Object) callback, 10), 0L);
            n7Var.setOnDismissListener(new org.telegram.ui.web.d0(v5Var, callback, zArr2, zArr, callback2, 1));
            n7Var.show();
            return;
        }
        v5Var.Z(str, chatInvite, new h4(callback, zArr, callback2));
    }
}
