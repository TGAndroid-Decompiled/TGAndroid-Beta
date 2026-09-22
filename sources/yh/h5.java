package yh;

import android.content.Context;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ye;
public final class h5 implements Utilities.Callback {
    public final u5 f47196a;
    public final long f47197b;
    public final int f47198c;
    public final boolean[] d;
    public final Utilities.Callback2 e;
    public final Context f47199f;
    public final org.telegram.ui.ActionBar.e6 f47200g;
    public final TLRPC.ChatInvite h;
    public final String f47201i;

    public h5(u5 u5Var, long j3, int i10, boolean[] zArr, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.e6 e6Var, TLRPC.ChatInvite chatInvite, String str) {
        this.f47196a = u5Var;
        this.f47197b = j3;
        this.f47198c = i10;
        this.d = zArr;
        this.e = callback2;
        this.f47199f = context;
        this.f47200g = e6Var;
        this.h = chatInvite;
        this.f47201i = str;
    }

    @Override
    public final void run(Object obj) {
        Utilities.Callback callback = (Utilities.Callback) obj;
        u5 u5Var = this.f47196a;
        long j3 = u5Var.f47804f.amount;
        long j10 = this.f47197b;
        boolean[] zArr = this.d;
        Utilities.Callback2 callback2 = this.e;
        TLRPC.ChatInvite chatInvite = this.h;
        String str = this.f47201i;
        if (j3 < j10) {
            boolean starsPurchaseAvailable = MessagesController.getInstance(this.f47198c).starsPurchaseAvailable();
            Context context = this.f47199f;
            org.telegram.ui.ActionBar.e6 e6Var = this.f47200g;
            if (!starsPurchaseAvailable) {
                if (callback != null) {
                    callback.run(Boolean.FALSE);
                }
                if (!zArr[0]) {
                    callback2.run("cancelled", 0L);
                    zArr[0] = true;
                }
                u5.e0(context, e6Var);
                return;
            }
            boolean[] zArr2 = {false};
            m7 m7Var = new m7(context, e6Var, j10, 1, chatInvite.title, new ye((Object) u5Var, (Object) zArr2, str, (TLObject) chatInvite, (Object) zArr, (Object) callback2, (Object) callback, 10), 0L);
            m7Var.setOnDismissListener(new org.telegram.ui.web.d0(u5Var, callback, zArr2, zArr, callback2, 1));
            m7Var.show();
            return;
        }
        u5Var.Z(str, chatInvite, new g4(callback, zArr, callback2));
    }
}
