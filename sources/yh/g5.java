package yh;

import android.content.Context;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ze;
public final class g5 implements Utilities.Callback {
    public final u5 f47484a;
    public final long f47485b;
    public final int f47486c;
    public final boolean[] d;
    public final Utilities.Callback2 e;
    public final Context f47487f;
    public final org.telegram.ui.ActionBar.f6 f47488g;
    public final TLRPC.ChatInvite h;
    public final String f47489i;

    public g5(u5 u5Var, long j3, int i10, boolean[] zArr, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.f6 f6Var, TLRPC.ChatInvite chatInvite, String str) {
        this.f47484a = u5Var;
        this.f47485b = j3;
        this.f47486c = i10;
        this.d = zArr;
        this.e = callback2;
        this.f47487f = context;
        this.f47488g = f6Var;
        this.h = chatInvite;
        this.f47489i = str;
    }

    @Override
    public final void run(Object obj) {
        Utilities.Callback callback = (Utilities.Callback) obj;
        u5 u5Var = this.f47484a;
        long j3 = u5Var.f48114f.amount;
        long j10 = this.f47485b;
        boolean[] zArr = this.d;
        Utilities.Callback2 callback2 = this.e;
        TLRPC.ChatInvite chatInvite = this.h;
        String str = this.f47489i;
        if (j3 < j10) {
            boolean starsPurchaseAvailable = MessagesController.getInstance(this.f47486c).starsPurchaseAvailable();
            Context context = this.f47487f;
            org.telegram.ui.ActionBar.f6 f6Var = this.f47488g;
            if (!starsPurchaseAvailable) {
                if (callback != null) {
                    callback.run(Boolean.FALSE);
                }
                if (!zArr[0]) {
                    callback2.run("cancelled", 0L);
                    zArr[0] = true;
                }
                u5.e0(context, f6Var);
                return;
            }
            boolean[] zArr2 = {false};
            l7 l7Var = new l7(context, f6Var, j10, 1, chatInvite.title, new ze((Object) u5Var, (Object) zArr2, str, (TLObject) chatInvite, (Object) zArr, (Object) callback2, (Object) callback, 10), 0L);
            l7Var.setOnDismissListener(new org.telegram.ui.web.d0(u5Var, callback, zArr2, zArr, callback2, 1));
            l7Var.show();
            return;
        }
        u5Var.Z(str, chatInvite, new f4(callback, zArr, callback2));
    }
}
