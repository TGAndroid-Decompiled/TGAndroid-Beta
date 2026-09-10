package xh;

import android.content.Context;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.bf;
public final class h5 implements Utilities.Callback {
    public final v5 f45510a;
    public final long f45511b;
    public final int f45512c;
    public final boolean[] d;
    public final Utilities.Callback2 e;
    public final Context f45513f;
    public final org.telegram.ui.ActionBar.f6 f45514g;
    public final TLRPC.ChatInvite h;
    public final String f45515i;

    public h5(v5 v5Var, long j3, int i10, boolean[] zArr, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.f6 f6Var, TLRPC.ChatInvite chatInvite, String str) {
        this.f45510a = v5Var;
        this.f45511b = j3;
        this.f45512c = i10;
        this.d = zArr;
        this.e = callback2;
        this.f45513f = context;
        this.f45514g = f6Var;
        this.h = chatInvite;
        this.f45515i = str;
    }

    @Override
    public final void run(Object obj) {
        Utilities.Callback callback = (Utilities.Callback) obj;
        v5 v5Var = this.f45510a;
        long j3 = v5Var.f46179f.amount;
        long j10 = this.f45511b;
        boolean[] zArr = this.d;
        Utilities.Callback2 callback2 = this.e;
        TLRPC.ChatInvite chatInvite = this.h;
        String str = this.f45515i;
        if (j3 < j10) {
            boolean starsPurchaseAvailable = MessagesController.getInstance(this.f45512c).starsPurchaseAvailable();
            Context context = this.f45513f;
            org.telegram.ui.ActionBar.f6 f6Var = this.f45514g;
            if (!starsPurchaseAvailable) {
                if (callback != null) {
                    callback.run(Boolean.FALSE);
                }
                if (!zArr[0]) {
                    callback2.run("cancelled", 0L);
                    zArr[0] = true;
                }
                v5.e0(context, f6Var);
                return;
            }
            boolean[] zArr2 = {false};
            o7 o7Var = new o7(context, f6Var, j10, 1, chatInvite.title, new bf((Object) v5Var, (Object) zArr2, str, (TLObject) chatInvite, (Object) zArr, (Object) callback2, (Object) callback, 10), 0L);
            o7Var.setOnDismissListener(new org.telegram.ui.web.d0(v5Var, callback, zArr2, zArr, callback2, 1));
            o7Var.show();
            return;
        }
        v5Var.Z(str, chatInvite, new e4(callback, zArr, callback2));
    }
}
