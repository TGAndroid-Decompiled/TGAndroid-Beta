package ph;

import android.content.Context;
import android.os.Bundle;
import nh.t4;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.xa;
import org.telegram.ui.l20;
public final class e1 extends xa {
    public final int T;
    public final String U;
    public k51 V;
    public final b1 W;
    public boolean X;
    public boolean Y;
    public final bh.v Z;

    public e1(android.content.Context r27, int r28, long r29, org.telegram.tgnet.TLRPC.TL_messages_preparedInlineMessage r31, java.io.File r32, org.telegram.tgnet.TLRPC.WebPage r33, org.telegram.ui.ActionBar.c6 r34, org.telegram.ui.web.u r35, bh.v r36) {
        throw new UnsupportedOperationException("Method not decompiled: ph.e1.<init>(android.content.Context, int, long, org.telegram.tgnet.TLRPC$TL_messages_preparedInlineMessage, java.io.File, org.telegram.tgnet.TLRPC$WebPage, org.telegram.ui.ActionBar.c6, org.telegram.ui.web.u, bh.v):void");
    }

    public static ph.d1 P(int r4, long r5, org.telegram.tgnet.TLRPC.BotInlineResult r7, org.telegram.tgnet.TLRPC.TL_photo r8, org.telegram.tgnet.TLRPC.TL_document r9, org.telegram.tgnet.TLRPC.WebPage r10) {
        throw new UnsupportedOperationException("Method not decompiled: ph.e1.P(int, long, org.telegram.tgnet.TLRPC$BotInlineResult, org.telegram.tgnet.TLRPC$TL_photo, org.telegram.tgnet.TLRPC$TL_document, org.telegram.tgnet.TLRPC$WebPage):ph.d1");
    }

    public static void Q(Context context, int i10, long j10, String str, c6 c6Var, org.telegram.ui.web.u uVar, bh.v vVar) {
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(context, 3, null);
        c2Var.q(500L);
        TLRPC.TL_messages_getPreparedInlineMessage tL_messages_getPreparedInlineMessage = new TLRPC.TL_messages_getPreparedInlineMessage();
        tL_messages_getPreparedInlineMessage.bot = MessagesController.getInstance(i10).getInputUser(j10);
        tL_messages_getPreparedInlineMessage.f22490id = str;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getPreparedInlineMessage, new l20(i10, c2Var, context, j10, c6Var, uVar, vVar));
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        if (!this.X && !this.Y) {
            this.Y = true;
            bh.v vVar = this.Z;
            if (vVar != null) {
                vVar.run("USER_DECLINED", null);
            }
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        int h;
        super.onCreate(bundle);
        jl0 jl0Var = this.d;
        if (jl0Var.getAdapter() == null) {
            h = 0;
        } else {
            h = jl0Var.getAdapter().h();
        }
        jl0Var.u0(Math.max(h - 1, 0));
    }

    @Override
    public final il0 v(jl0 jl0Var) {
        k51 k51Var = new k51(jl0Var, getContext(), this.T, 0, true, new t4(this, 10), this.resourcesProvider);
        this.V = k51Var;
        return k51Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.BotShareMessage);
    }
}
