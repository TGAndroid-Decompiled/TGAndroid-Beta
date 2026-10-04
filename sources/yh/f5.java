package yh;

import android.content.Context;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.bf;
public final class f5 implements Utilities.Callback {
    public final t5 f51284a;
    public final long f51285b;
    public final int f51286c;
    public final boolean[] d;
    public final Utilities.Callback2 f51287e;
    public final Context f51288f;
    public final org.telegram.ui.ActionBar.d6 f51289g;
    public final TLRPC.ChatInvite h;
    public final String f51290i;

    public f5(t5 t5Var, long j3, int i10, boolean[] zArr, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.d6 d6Var, TLRPC.ChatInvite chatInvite, String str) {
        this.f51284a = t5Var;
        this.f51285b = j3;
        this.f51286c = i10;
        this.d = zArr;
        this.f51287e = callback2;
        this.f51288f = context;
        this.f51289g = d6Var;
        this.h = chatInvite;
        this.f51290i = str;
    }

    @Override
    public final void run(Object obj) {
        Utilities.Callback callback = (Utilities.Callback) obj;
        t5 t5Var = this.f51284a;
        long j3 = t5Var.f52014f.amount;
        long j10 = this.f51285b;
        boolean[] zArr = this.d;
        Utilities.Callback2 callback2 = this.f51287e;
        TLRPC.ChatInvite chatInvite = this.h;
        String str = this.f51290i;
        if (j3 < j10) {
            boolean starsPurchaseAvailable = MessagesController.getInstance(this.f51286c).starsPurchaseAvailable();
            Context context = this.f51288f;
            org.telegram.ui.ActionBar.d6 d6Var = this.f51289g;
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
            m7 m7Var = new m7(context, d6Var, j10, 1, chatInvite.title, new bf((Object) t5Var, (Object) zArr2, str, (TLObject) chatInvite, (Object) zArr, (Object) callback2, (Object) callback, 10), 0L);
            m7Var.setOnDismissListener(new org.telegram.ui.web.d0(t5Var, callback, zArr2, zArr, callback2, 1));
            m7Var.show();
            return;
        }
        t5Var.Z(str, chatInvite, new e4(callback, zArr, callback2));
    }
}
