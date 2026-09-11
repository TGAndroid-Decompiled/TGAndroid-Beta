package zh;

import android.content.Context;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ze;
public final class e5 implements Utilities.Callback {
    public final s5 f51828a;
    public final long f51829b;
    public final int f51830c;
    public final boolean[] d;
    public final Utilities.Callback2 f51831e;
    public final Context f51832f;
    public final org.telegram.ui.ActionBar.f6 f51833g;
    public final TLRPC.ChatInvite h;
    public final String f51834i;

    public e5(s5 s5Var, long j3, int i10, boolean[] zArr, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.f6 f6Var, TLRPC.ChatInvite chatInvite, String str) {
        this.f51828a = s5Var;
        this.f51829b = j3;
        this.f51830c = i10;
        this.d = zArr;
        this.f51831e = callback2;
        this.f51832f = context;
        this.f51833g = f6Var;
        this.h = chatInvite;
        this.f51834i = str;
    }

    @Override
    public final void run(Object obj) {
        Utilities.Callback callback = (Utilities.Callback) obj;
        s5 s5Var = this.f51828a;
        long j3 = s5Var.f52570f.amount;
        long j10 = this.f51829b;
        boolean[] zArr = this.d;
        Utilities.Callback2 callback2 = this.f51831e;
        TLRPC.ChatInvite chatInvite = this.h;
        String str = this.f51834i;
        if (j3 < j10) {
            boolean starsPurchaseAvailable = MessagesController.getInstance(this.f51830c).starsPurchaseAvailable();
            Context context = this.f51832f;
            org.telegram.ui.ActionBar.f6 f6Var = this.f51833g;
            if (!starsPurchaseAvailable) {
                if (callback != null) {
                    callback.run(Boolean.FALSE);
                }
                if (!zArr[0]) {
                    callback2.run("cancelled", 0L);
                    zArr[0] = true;
                }
                s5.e0(context, f6Var);
                return;
            }
            boolean[] zArr2 = {false};
            k7 k7Var = new k7(context, f6Var, j10, 1, chatInvite.title, new ze((Object) s5Var, (Object) zArr2, str, (TLObject) chatInvite, (Object) zArr, (Object) callback2, (Object) callback, 10), 0L);
            k7Var.setOnDismissListener(new org.telegram.ui.web.e0(s5Var, callback, zArr2, zArr, callback2, 1));
            k7Var.show();
            return;
        }
        s5Var.Z(str, chatInvite, new d4(callback, zArr, callback2));
    }
}
