package yh;

import android.content.Context;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ye;
public final class f5 implements Utilities.Callback {
    public final s5 f47382a;
    public final long f47383b;
    public final int f47384c;
    public final boolean[] d;
    public final Utilities.Callback2 e;
    public final Context f47385f;
    public final org.telegram.ui.ActionBar.d6 f47386g;
    public final TLRPC.ChatInvite h;
    public final String f47387i;

    public f5(s5 s5Var, long j3, int i10, boolean[] zArr, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.d6 d6Var, TLRPC.ChatInvite chatInvite, String str) {
        this.f47382a = s5Var;
        this.f47383b = j3;
        this.f47384c = i10;
        this.d = zArr;
        this.e = callback2;
        this.f47385f = context;
        this.f47386g = d6Var;
        this.h = chatInvite;
        this.f47387i = str;
    }

    @Override
    public final void run(Object obj) {
        Utilities.Callback callback = (Utilities.Callback) obj;
        s5 s5Var = this.f47382a;
        long j3 = s5Var.f48014f.amount;
        long j10 = this.f47383b;
        boolean[] zArr = this.d;
        Utilities.Callback2 callback2 = this.e;
        TLRPC.ChatInvite chatInvite = this.h;
        String str = this.f47387i;
        if (j3 < j10) {
            boolean starsPurchaseAvailable = MessagesController.getInstance(this.f47384c).starsPurchaseAvailable();
            Context context = this.f47385f;
            org.telegram.ui.ActionBar.d6 d6Var = this.f47386g;
            if (!starsPurchaseAvailable) {
                if (callback != null) {
                    callback.run(Boolean.FALSE);
                }
                if (!zArr[0]) {
                    callback2.run("cancelled", 0L);
                    zArr[0] = true;
                }
                s5.e0(context, d6Var);
                return;
            }
            boolean[] zArr2 = {false};
            l7 l7Var = new l7(context, d6Var, j10, 1, chatInvite.title, new ye((Object) s5Var, (Object) zArr2, str, (TLObject) chatInvite, (Object) zArr, (Object) callback2, (Object) callback, 10), 0L);
            l7Var.setOnDismissListener(new org.telegram.ui.web.c0(s5Var, callback, zArr2, zArr, callback2, 1));
            l7Var.show();
            return;
        }
        s5Var.Z(str, chatInvite, new e4(callback, zArr, callback2));
    }
}
