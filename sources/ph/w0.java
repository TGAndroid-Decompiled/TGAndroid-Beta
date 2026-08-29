package ph;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
public final class w0 implements Utilities.Callback {
    public final org.telegram.ui.ActionBar.c2 f46135a;
    public final Context f46136b;
    public final int f46137c;
    public final long d;
    public final TLRPC.TL_messages_preparedInlineMessage f46138e;
    public final c6 f46139f;
    public final org.telegram.ui.web.u f46140g;
    public final bh.v h;

    public w0(org.telegram.ui.ActionBar.c2 c2Var, Context context, int i10, long j10, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, c6 c6Var, org.telegram.ui.web.u uVar, bh.v vVar) {
        this.f46135a = c2Var;
        this.f46136b = context;
        this.f46137c = i10;
        this.d = j10;
        this.f46138e = tL_messages_preparedInlineMessage;
        this.f46139f = c6Var;
        this.f46140g = uVar;
        this.h = vVar;
    }

    @Override
    public final void run(Object obj) {
        this.f46135a.dismiss();
        new e1(this.f46136b, this.f46137c, this.d, this.f46138e, null, (TLRPC.WebPage) obj, this.f46139f, this.f46140g, this.h).show();
    }
}
