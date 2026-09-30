package yh;

import android.content.Context;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ye;
public final class f5 implements Utilities.Callback {
    public final t5 f47384a;
    public final long f47385b;
    public final int f47386c;
    public final boolean[] d;
    public final Utilities.Callback2 e;
    public final Context f47387f;
    public final org.telegram.ui.ActionBar.d6 f47388g;
    public final TLRPC.ChatInvite h;
    public final String f47389i;

    public f5(t5 t5Var, long j3, int i10, boolean[] zArr, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.d6 d6Var, TLRPC.ChatInvite chatInvite, String str) {
        this.f47384a = t5Var;
        this.f47385b = j3;
        this.f47386c = i10;
        this.d = zArr;
        this.e = callback2;
        this.f47387f = context;
        this.f47388g = d6Var;
        this.h = chatInvite;
        this.f47389i = str;
    }

    @Override
    public final void run(Object obj) {
        Utilities.Callback callback = (Utilities.Callback) obj;
        t5 t5Var = this.f47384a;
        long j3 = t5Var.f48044f.amount;
        long j10 = this.f47385b;
        boolean[] zArr = this.d;
        Utilities.Callback2 callback2 = this.e;
        TLRPC.ChatInvite chatInvite = this.h;
        String str = this.f47389i;
        if (j3 < j10) {
            boolean starsPurchaseAvailable = MessagesController.getInstance(this.f47386c).starsPurchaseAvailable();
            Context context = this.f47387f;
            org.telegram.ui.ActionBar.d6 d6Var = this.f47388g;
            if (!starsPurchaseAvailable) {
                if (callback != null) {
                    callback.run(Boolean.FALSE);
                }
                if (!zArr[0]) {
                    callback2.run("cancelled", 0L);
                    zArr[0] = true;
                }
                t5.e0(context, d6Var);
                return;
            }
            boolean[] zArr2 = {false};
            l7 l7Var = new l7(context, d6Var, j10, 1, chatInvite.title, new ye((Object) t5Var, (Object) zArr2, str, (TLObject) chatInvite, (Object) zArr, (Object) callback2, (Object) callback, 10), 0L);
            l7Var.setOnDismissListener(new org.telegram.ui.web.c0(t5Var, callback, zArr2, zArr, callback2, 1));
            l7Var.show();
            return;
        }
        t5Var.Z(str, chatInvite, new e4(callback, zArr, callback2));
    }
}
