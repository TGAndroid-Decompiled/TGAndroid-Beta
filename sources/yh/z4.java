package yh;

import android.content.Context;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.df;
import org.telegram.ui.dl0;
public final class z4 implements Utilities.Callback {
    public final n5 f53689a;
    public final long f53690b;
    public final int f53691c;
    public final boolean[] d;
    public final Utilities.Callback2 f53692e;
    public final Context f53693f;
    public final org.telegram.ui.ActionBar.c6 f53694g;
    public final TLRPC.ChatInvite h;
    public final String f53695i;

    public z4(n5 n5Var, long j3, int i10, boolean[] zArr, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.c6 c6Var, TLRPC.ChatInvite chatInvite, String str) {
        this.f53689a = n5Var;
        this.f53690b = j3;
        this.f53691c = i10;
        this.d = zArr;
        this.f53692e = callback2;
        this.f53693f = context;
        this.f53694g = c6Var;
        this.h = chatInvite;
        this.f53695i = str;
    }

    @Override
    public final void run(Object obj) {
        Utilities.Callback callback = (Utilities.Callback) obj;
        n5 n5Var = this.f53689a;
        long j3 = n5Var.f53138f.amount;
        long j10 = this.f53690b;
        int i10 = (j3 > j10 ? 1 : (j3 == j10 ? 0 : -1));
        boolean[] zArr = this.d;
        Utilities.Callback2 callback2 = this.f53692e;
        TLRPC.ChatInvite chatInvite = this.h;
        String str = this.f53695i;
        if (i10 < 0) {
            boolean starsPurchaseAvailable = MessagesController.getInstance(this.f53691c).starsPurchaseAvailable();
            Context context = this.f53693f;
            org.telegram.ui.ActionBar.c6 c6Var = this.f53694g;
            if (!starsPurchaseAvailable) {
                if (callback != null) {
                    callback.run(Boolean.FALSE);
                }
                if (!zArr[0]) {
                    callback2.run("cancelled", 0L);
                    zArr[0] = true;
                }
                n5.e0(context, c6Var);
                return;
            }
            boolean[] zArr2 = {false};
            e7 e7Var = new e7(context, c6Var, j10, 1, chatInvite.title, new df((Object) n5Var, (Object) zArr2, str, (TLObject) chatInvite, (Object) zArr, (Object) callback2, (Object) callback, 13), 0L);
            e7Var.setOnDismissListener(new dl0(n5Var, callback, zArr2, zArr, callback2, 2));
            e7Var.show();
            return;
        }
        n5Var.Z(str, chatInvite, new z3(callback, zArr, callback2));
    }
}
