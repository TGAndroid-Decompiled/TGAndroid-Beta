package xh;

import android.content.Context;
import org.telegram.messenger.q20;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.p6;
public final class u0 implements q20 {
    public final org.telegram.ui.ActionBar.x1 f54067a;
    public final Context f54068b;
    public final int f54069c;
    public final long d;
    public final TLRPC.TL_messages_preparedInlineMessage e;
    public final p6 f54070f;
    public final org.telegram.ui.web.q f54071g;
    public final org.telegram.tgnet.e h;

    public u0(org.telegram.ui.ActionBar.x1 x1Var, Context context, int i10, long j10, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, p6 p6Var, org.telegram.ui.web.q qVar, org.telegram.tgnet.e eVar) {
        this.f54067a = x1Var;
        this.f54068b = context;
        this.f54069c = i10;
        this.d = j10;
        this.e = tL_messages_preparedInlineMessage;
        this.f54070f = p6Var;
        this.f54071g = qVar;
        this.h = eVar;
    }

    @Override
    public final void a(Object obj) {
        this.f54067a.dismiss();
        new c1(this.f54068b, this.f54069c, this.d, this.e, null, (TLRPC.WebPage) obj, this.f54070f, this.f54071g, this.h).show();
    }
}
