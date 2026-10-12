package zh;

import android.content.Context;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ff;
import org.telegram.ui.hl0;
public final class a5 implements Utilities.Callback {
    public final n5 f50272a;
    public final long f50273b;
    public final int f50274c;
    public final boolean[] d;
    public final Utilities.Callback2 e;
    public final Context f50275f;
    public final org.telegram.ui.ActionBar.c6 f50276g;
    public final TLRPC.ChatInvite h;
    public final String f50277i;

    public a5(n5 n5Var, long j10, int i10, boolean[] zArr, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.c6 c6Var, TLRPC.ChatInvite chatInvite, String str) {
        this.f50272a = n5Var;
        this.f50273b = j10;
        this.f50274c = i10;
        this.d = zArr;
        this.e = callback2;
        this.f50275f = context;
        this.f50276g = c6Var;
        this.h = chatInvite;
        this.f50277i = str;
    }

    @Override
    public final void run(Object obj) {
        Utilities.Callback callback = (Utilities.Callback) obj;
        n5 n5Var = this.f50272a;
        long j10 = n5Var.f50867f.amount;
        long j11 = this.f50273b;
        int i10 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1));
        boolean[] zArr = this.d;
        Utilities.Callback2 callback2 = this.e;
        TLRPC.ChatInvite chatInvite = this.h;
        String str = this.f50277i;
        if (i10 < 0) {
            boolean starsPurchaseAvailable = MessagesController.getInstance(this.f50274c).starsPurchaseAvailable();
            Context context = this.f50275f;
            org.telegram.ui.ActionBar.c6 c6Var = this.f50276g;
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
            e7 e7Var = new e7(context, c6Var, j11, 1, chatInvite.title, new ff((Object) n5Var, (Object) zArr2, str, (TLObject) chatInvite, (Object) zArr, (Object) callback2, (Object) callback, 13), 0L);
            e7Var.setOnDismissListener(new hl0(n5Var, callback, zArr2, zArr, callback2, 2));
            e7Var.show();
            return;
        }
        n5Var.Z(str, chatInvite, new z3(callback, zArr, callback2));
    }
}
