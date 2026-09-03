package rh;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
public final class w0 implements Utilities.Callback {
    public final org.telegram.ui.ActionBar.d2 f43893a;
    public final Context f43894b;
    public final int f43895c;
    public final long d;
    public final TLRPC.TL_messages_preparedInlineMessage e;
    public final f6 f43896f;
    public final org.telegram.ui.web.t f43897g;
    public final kh.a0 h;

    public w0(org.telegram.ui.ActionBar.d2 d2Var, Context context, int i10, long j10, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, f6 f6Var, org.telegram.ui.web.t tVar, kh.a0 a0Var) {
        this.f43893a = d2Var;
        this.f43894b = context;
        this.f43895c = i10;
        this.d = j10;
        this.e = tL_messages_preparedInlineMessage;
        this.f43896f = f6Var;
        this.f43897g = tVar;
        this.h = a0Var;
    }

    @Override
    public final void run(Object obj) {
        this.f43893a.dismiss();
        new e1(this.f43894b, this.f43895c, this.d, this.e, null, (TLRPC.WebPage) obj, this.f43896f, this.f43897g, this.h).show();
    }
}
