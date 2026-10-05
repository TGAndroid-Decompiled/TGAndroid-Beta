package yh;

import android.content.Context;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.bf;
public final class g5 implements Utilities.Callback {
    public final u5 f51350a;
    public final long f51351b;
    public final int f51352c;
    public final boolean[] d;
    public final Utilities.Callback2 f51353e;
    public final Context f51354f;
    public final org.telegram.ui.ActionBar.d6 f51355g;
    public final TLRPC.ChatInvite h;
    public final String f51356i;

    public g5(u5 u5Var, long j3, int i10, boolean[] zArr, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.d6 d6Var, TLRPC.ChatInvite chatInvite, String str) {
        this.f51350a = u5Var;
        this.f51351b = j3;
        this.f51352c = i10;
        this.d = zArr;
        this.f51353e = callback2;
        this.f51354f = context;
        this.f51355g = d6Var;
        this.h = chatInvite;
        this.f51356i = str;
    }

    @Override
    public final void run(Object obj) {
        Utilities.Callback callback = (Utilities.Callback) obj;
        u5 u5Var = this.f51350a;
        long j3 = u5Var.f52089f.amount;
        long j10 = this.f51351b;
        boolean[] zArr = this.d;
        Utilities.Callback2 callback2 = this.f51353e;
        TLRPC.ChatInvite chatInvite = this.h;
        String str = this.f51356i;
        if (j3 < j10) {
            boolean starsPurchaseAvailable = MessagesController.getInstance(this.f51352c).starsPurchaseAvailable();
            Context context = this.f51354f;
            org.telegram.ui.ActionBar.d6 d6Var = this.f51355g;
            if (!starsPurchaseAvailable) {
                if (callback != null) {
                    callback.run(Boolean.FALSE);
                }
                if (!zArr[0]) {
                    callback2.run("cancelled", 0L);
                    zArr[0] = true;
                }
                u5.e0(context, d6Var);
                return;
            }
            boolean[] zArr2 = {false};
            n7 n7Var = new n7(context, d6Var, j10, 1, chatInvite.title, new bf((Object) u5Var, (Object) zArr2, str, (TLObject) chatInvite, (Object) zArr, (Object) callback2, (Object) callback, 10), 0L);
            n7Var.setOnDismissListener(new org.telegram.ui.web.d0(u5Var, callback, zArr2, zArr, callback2, 1));
            n7Var.show();
            return;
        }
        u5Var.Z(str, chatInvite, new f4(callback, zArr, callback2));
    }
}
