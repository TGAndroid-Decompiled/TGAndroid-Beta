package rh;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
public final class x0 implements Utilities.Callback {
    public final org.telegram.ui.ActionBar.d2 f43841a;
    public final Context f43842b;
    public final int f43843c;
    public final long d;
    public final TLRPC.TL_messages_preparedInlineMessage e;
    public final f6 f43844f;
    public final org.telegram.ui.web.u f43845g;
    public final dh.v h;

    public x0(org.telegram.ui.ActionBar.d2 d2Var, Context context, int i10, long j10, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, f6 f6Var, org.telegram.ui.web.u uVar, dh.v vVar) {
        this.f43841a = d2Var;
        this.f43842b = context;
        this.f43843c = i10;
        this.d = j10;
        this.e = tL_messages_preparedInlineMessage;
        this.f43844f = f6Var;
        this.f43845g = uVar;
        this.h = vVar;
    }

    @Override
    public final void run(Object obj) {
        this.f43841a.dismiss();
        new f1(this.f43842b, this.f43843c, this.d, this.e, null, (TLRPC.WebPage) obj, this.f43844f, this.f43845g, this.h).show();
    }
}
