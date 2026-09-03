package sh;

import android.content.Context;
import android.os.Bundle;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.y20;
import qh.c4;
public final class e1 extends sa {
    public final int U;
    public final String V;
    public w51 W;
    public final b1 X;
    public boolean Y;
    public boolean Z;
    public final eh.w f47437a0;

    public e1(android.content.Context r27, int r28, long r29, org.telegram.tgnet.TLRPC.TL_messages_preparedInlineMessage r31, java.io.File r32, org.telegram.tgnet.TLRPC.WebPage r33, org.telegram.ui.ActionBar.g6 r34, org.telegram.ui.web.u r35, eh.w r36) {
        throw new UnsupportedOperationException("Method not decompiled: sh.e1.<init>(android.content.Context, int, long, org.telegram.tgnet.TLRPC$TL_messages_preparedInlineMessage, java.io.File, org.telegram.tgnet.TLRPC$WebPage, org.telegram.ui.ActionBar.g6, org.telegram.ui.web.u, eh.w):void");
    }

    public static sh.d1 P(int r4, long r5, org.telegram.tgnet.TLRPC.BotInlineResult r7, org.telegram.tgnet.TLRPC.TL_photo r8, org.telegram.tgnet.TLRPC.TL_document r9, org.telegram.tgnet.TLRPC.WebPage r10) {
        throw new UnsupportedOperationException("Method not decompiled: sh.e1.P(int, long, org.telegram.tgnet.TLRPC$BotInlineResult, org.telegram.tgnet.TLRPC$TL_photo, org.telegram.tgnet.TLRPC$TL_document, org.telegram.tgnet.TLRPC$WebPage):sh.d1");
    }

    public static void Q(Context context, int i10, long j10, String str, g6 g6Var, org.telegram.ui.web.u uVar, eh.w wVar) {
        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(context, 3, null);
        d2Var.q(500L);
        TLRPC.TL_messages_getPreparedInlineMessage tL_messages_getPreparedInlineMessage = new TLRPC.TL_messages_getPreparedInlineMessage();
        tL_messages_getPreparedInlineMessage.bot = MessagesController.getInstance(i10).getInputUser(j10);
        tL_messages_getPreparedInlineMessage.f20943id = str;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getPreparedInlineMessage, new y20(i10, d2Var, context, j10, g6Var, uVar, wVar));
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        if (!this.Y && !this.Z) {
            this.Z = true;
            eh.w wVar = this.f47437a0;
            if (wVar != null) {
                wVar.run("USER_DECLINED", null);
            }
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        int h;
        super.onCreate(bundle);
        sl0 sl0Var = this.d;
        if (sl0Var.getAdapter() == null) {
            h = 0;
        } else {
            h = sl0Var.getAdapter().h();
        }
        sl0Var.u0(Math.max(h - 1, 0));
    }

    @Override
    public final rl0 v(sl0 sl0Var) {
        w51 w51Var = new w51(sl0Var, getContext(), this.U, 0, true, new c4(this, 10), this.resourcesProvider);
        this.W = w51Var;
        return w51Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.BotShareMessage);
    }
}
