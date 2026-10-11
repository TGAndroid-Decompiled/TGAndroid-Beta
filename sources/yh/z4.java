package yh;

import android.content.Context;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.bl0;
import org.telegram.ui.ye;
public final class z4 implements Utilities.Callback {
    public final n5 f53586a;
    public final long f53587b;
    public final int f53588c;
    public final boolean[] d;
    public final Utilities.Callback2 f53589e;
    public final Context f53590f;
    public final org.telegram.ui.ActionBar.d6 f53591g;
    public final TLRPC.ChatInvite h;
    public final String f53592i;

    public z4(n5 n5Var, long j3, int i10, boolean[] zArr, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.d6 d6Var, TLRPC.ChatInvite chatInvite, String str) {
        this.f53586a = n5Var;
        this.f53587b = j3;
        this.f53588c = i10;
        this.d = zArr;
        this.f53589e = callback2;
        this.f53590f = context;
        this.f53591g = d6Var;
        this.h = chatInvite;
        this.f53592i = str;
    }

    @Override
    public final void run(Object obj) {
        Utilities.Callback callback = (Utilities.Callback) obj;
        n5 n5Var = this.f53586a;
        long j3 = n5Var.f53035f.amount;
        long j10 = this.f53587b;
        int i10 = (j3 > j10 ? 1 : (j3 == j10 ? 0 : -1));
        boolean[] zArr = this.d;
        Utilities.Callback2 callback2 = this.f53589e;
        TLRPC.ChatInvite chatInvite = this.h;
        String str = this.f53592i;
        if (i10 < 0) {
            boolean starsPurchaseAvailable = MessagesController.getInstance(this.f53588c).starsPurchaseAvailable();
            Context context = this.f53590f;
            org.telegram.ui.ActionBar.d6 d6Var = this.f53591g;
            if (!starsPurchaseAvailable) {
                if (callback != null) {
                    callback.run(Boolean.FALSE);
                }
                if (!zArr[0]) {
                    callback2.run("cancelled", 0L);
                    zArr[0] = true;
                }
                n5.e0(context, d6Var);
                return;
            }
            boolean[] zArr2 = {false};
            e7 e7Var = new e7(context, d6Var, j10, 1, chatInvite.title, new ye((Object) n5Var, (Object) zArr2, str, (TLObject) chatInvite, (Object) zArr, (Object) callback2, (Object) callback, 13), 0L);
            e7Var.setOnDismissListener(new bl0(n5Var, callback, zArr2, zArr, callback2, 2));
            e7Var.show();
            return;
        }
        n5Var.Z(str, chatInvite, new z3(callback, zArr, callback2));
    }
}
