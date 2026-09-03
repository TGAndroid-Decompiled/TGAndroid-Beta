package sh;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
public final class w0 implements Utilities.Callback {
    public final org.telegram.ui.ActionBar.d2 f47796a;
    public final Context f47797b;
    public final int f47798c;
    public final long d;
    public final TLRPC.TL_messages_preparedInlineMessage f47799e;
    public final g6 f47800f;
    public final org.telegram.ui.web.u f47801g;
    public final eh.w h;

    public w0(org.telegram.ui.ActionBar.d2 d2Var, Context context, int i10, long j10, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, g6 g6Var, org.telegram.ui.web.u uVar, eh.w wVar) {
        this.f47796a = d2Var;
        this.f47797b = context;
        this.f47798c = i10;
        this.d = j10;
        this.f47799e = tL_messages_preparedInlineMessage;
        this.f47800f = g6Var;
        this.f47801g = uVar;
        this.h = wVar;
    }

    @Override
    public final void run(Object obj) {
        this.f47796a.dismiss();
        new e1(this.f47797b, this.f47798c, this.d, this.f47799e, null, (TLRPC.WebPage) obj, this.f47800f, this.f47801g, this.h).show();
    }
}
