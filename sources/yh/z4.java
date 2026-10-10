package yh;

import android.content.Context;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.cl0;
import org.telegram.ui.ze;
public final class z4 implements Utilities.Callback {
    public final m5 f53509a;
    public final long f53510b;
    public final int f53511c;
    public final boolean[] d;
    public final Utilities.Callback2 f53512e;
    public final Context f53513f;
    public final org.telegram.ui.ActionBar.e6 f53514g;
    public final TLRPC.ChatInvite h;
    public final String f53515i;

    public z4(m5 m5Var, long j3, int i10, boolean[] zArr, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.e6 e6Var, TLRPC.ChatInvite chatInvite, String str) {
        this.f53509a = m5Var;
        this.f53510b = j3;
        this.f53511c = i10;
        this.d = zArr;
        this.f53512e = callback2;
        this.f53513f = context;
        this.f53514g = e6Var;
        this.h = chatInvite;
        this.f53515i = str;
    }

    @Override
    public final void run(Object obj) {
        Utilities.Callback callback = (Utilities.Callback) obj;
        m5 m5Var = this.f53509a;
        long j3 = m5Var.f52928f.amount;
        long j10 = this.f53510b;
        int i10 = (j3 > j10 ? 1 : (j3 == j10 ? 0 : -1));
        boolean[] zArr = this.d;
        Utilities.Callback2 callback2 = this.f53512e;
        TLRPC.ChatInvite chatInvite = this.h;
        String str = this.f53515i;
        if (i10 < 0) {
            boolean starsPurchaseAvailable = MessagesController.getInstance(this.f53511c).starsPurchaseAvailable();
            Context context = this.f53513f;
            org.telegram.ui.ActionBar.e6 e6Var = this.f53514g;
            if (!starsPurchaseAvailable) {
                if (callback != null) {
                    callback.run(Boolean.FALSE);
                }
                if (!zArr[0]) {
                    callback2.run("cancelled", 0L);
                    zArr[0] = true;
                }
                m5.e0(context, e6Var);
                return;
            }
            boolean[] zArr2 = {false};
            e7 e7Var = new e7(context, e6Var, j10, 1, chatInvite.title, new ze((Object) m5Var, (Object) zArr2, str, (TLObject) chatInvite, (Object) zArr, (Object) callback2, (Object) callback, 13), 0L);
            e7Var.setOnDismissListener(new cl0(m5Var, callback, zArr2, zArr, callback2, 2));
            e7Var.show();
            return;
        }
        m5Var.Z(str, chatInvite, new z3(callback, zArr, callback2));
    }
}
