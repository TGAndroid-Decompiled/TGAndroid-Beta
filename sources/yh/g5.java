package yh;

import android.content.Context;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ze;
public final class g5 implements Utilities.Callback {
    public final t5 f47439a;
    public final long f47440b;
    public final int f47441c;
    public final boolean[] d;
    public final Utilities.Callback2 e;
    public final Context f47442f;
    public final org.telegram.ui.ActionBar.e6 f47443g;
    public final TLRPC.ChatInvite h;
    public final String f47444i;

    public g5(t5 t5Var, long j3, int i10, boolean[] zArr, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.e6 e6Var, TLRPC.ChatInvite chatInvite, String str) {
        this.f47439a = t5Var;
        this.f47440b = j3;
        this.f47441c = i10;
        this.d = zArr;
        this.e = callback2;
        this.f47442f = context;
        this.f47443g = e6Var;
        this.h = chatInvite;
        this.f47444i = str;
    }

    @Override
    public final void run(Object obj) {
        Utilities.Callback callback = (Utilities.Callback) obj;
        t5 t5Var = this.f47439a;
        long j3 = t5Var.f48045f.amount;
        long j10 = this.f47440b;
        boolean[] zArr = this.d;
        Utilities.Callback2 callback2 = this.e;
        TLRPC.ChatInvite chatInvite = this.h;
        String str = this.f47444i;
        if (j3 < j10) {
            boolean starsPurchaseAvailable = MessagesController.getInstance(this.f47441c).starsPurchaseAvailable();
            Context context = this.f47442f;
            org.telegram.ui.ActionBar.e6 e6Var = this.f47443g;
            if (!starsPurchaseAvailable) {
                if (callback != null) {
                    callback.run(Boolean.FALSE);
                }
                if (!zArr[0]) {
                    callback2.run("cancelled", 0L);
                    zArr[0] = true;
                }
                t5.e0(context, e6Var);
                return;
            }
            boolean[] zArr2 = {false};
            k7 k7Var = new k7(context, e6Var, j10, 1, chatInvite.title, new ze((Object) t5Var, (Object) zArr2, str, (TLObject) chatInvite, (Object) zArr, (Object) callback2, (Object) callback, 10), 0L);
            k7Var.setOnDismissListener(new org.telegram.ui.web.d0(t5Var, callback, zArr2, zArr, callback2, 1));
            k7Var.show();
            return;
        }
        t5Var.Z(str, chatInvite, new f4(callback, zArr, callback2));
    }
}
