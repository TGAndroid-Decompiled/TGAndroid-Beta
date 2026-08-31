package sh;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
public final class w0 implements Utilities.Callback {
    public final org.telegram.ui.ActionBar.d2 f47760a;
    public final Context f47761b;
    public final int f47762c;
    public final long d;
    public final TLRPC.TL_messages_preparedInlineMessage f47763e;
    public final g6 f47764f;
    public final org.telegram.ui.web.u f47765g;
    public final eh.w h;

    public w0(org.telegram.ui.ActionBar.d2 d2Var, Context context, int i10, long j10, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, g6 g6Var, org.telegram.ui.web.u uVar, eh.w wVar) {
        this.f47760a = d2Var;
        this.f47761b = context;
        this.f47762c = i10;
        this.d = j10;
        this.f47763e = tL_messages_preparedInlineMessage;
        this.f47764f = g6Var;
        this.f47765g = uVar;
        this.h = wVar;
    }

    @Override
    public final void run(Object obj) {
        this.f47760a.dismiss();
        new e1(this.f47761b, this.f47762c, this.d, this.f47763e, null, (TLRPC.WebPage) obj, this.f47764f, this.f47765g, this.h).show();
    }
}
