package xh;

import android.content.Context;
import org.telegram.messenger.r20;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.p6;
public final class u0 implements r20 {
    public final org.telegram.ui.ActionBar.x1 f54088a;
    public final Context f54089b;
    public final int f54090c;
    public final long d;
    public final TLRPC.TL_messages_preparedInlineMessage e;
    public final p6 f54091f;
    public final org.telegram.ui.web.q f54092g;
    public final org.telegram.tgnet.e h;

    public u0(org.telegram.ui.ActionBar.x1 x1Var, Context context, int i10, long j10, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, p6 p6Var, org.telegram.ui.web.q qVar, org.telegram.tgnet.e eVar) {
        this.f54088a = x1Var;
        this.f54089b = context;
        this.f54090c = i10;
        this.d = j10;
        this.e = tL_messages_preparedInlineMessage;
        this.f54091f = p6Var;
        this.f54092g = qVar;
        this.h = eVar;
    }

    @Override
    public final void a(Object obj) {
        this.f54088a.dismiss();
        new c1(this.f54089b, this.f54090c, this.d, this.e, null, (TLRPC.WebPage) obj, this.f54091f, this.f54092g, this.h).show();
    }
}
