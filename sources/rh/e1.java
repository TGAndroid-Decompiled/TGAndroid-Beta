package rh;

import android.content.Context;
import android.os.Bundle;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.ql0;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.w51;
import org.telegram.ui.z20;
import ph.d4;
public final class e1 extends sa {
    public final int U;
    public final String V;
    public w51 W;
    public final b1 X;
    public boolean Y;
    public boolean Z;
    public final kh.a0 f43566a0;

    public e1(android.content.Context r27, int r28, long r29, org.telegram.tgnet.TLRPC.TL_messages_preparedInlineMessage r31, java.io.File r32, org.telegram.tgnet.TLRPC.WebPage r33, org.telegram.ui.ActionBar.f6 r34, org.telegram.ui.web.t r35, kh.a0 r36) {
        throw new UnsupportedOperationException("Method not decompiled: rh.e1.<init>(android.content.Context, int, long, org.telegram.tgnet.TLRPC$TL_messages_preparedInlineMessage, java.io.File, org.telegram.tgnet.TLRPC$WebPage, org.telegram.ui.ActionBar.f6, org.telegram.ui.web.t, kh.a0):void");
    }

    public static rh.d1 P(int r4, long r5, org.telegram.tgnet.TLRPC.BotInlineResult r7, org.telegram.tgnet.TLRPC.TL_photo r8, org.telegram.tgnet.TLRPC.TL_document r9, org.telegram.tgnet.TLRPC.WebPage r10) {
        throw new UnsupportedOperationException("Method not decompiled: rh.e1.P(int, long, org.telegram.tgnet.TLRPC$BotInlineResult, org.telegram.tgnet.TLRPC$TL_photo, org.telegram.tgnet.TLRPC$TL_document, org.telegram.tgnet.TLRPC$WebPage):rh.d1");
    }

    public static void Q(Context context, int i10, long j10, String str, f6 f6Var, org.telegram.ui.web.t tVar, kh.a0 a0Var) {
        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(context, 3, null);
        d2Var.q(500L);
        TLRPC.TL_messages_getPreparedInlineMessage tL_messages_getPreparedInlineMessage = new TLRPC.TL_messages_getPreparedInlineMessage();
        tL_messages_getPreparedInlineMessage.bot = MessagesController.getInstance(i10).getInputUser(j10);
        tL_messages_getPreparedInlineMessage.f19257id = str;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getPreparedInlineMessage, new z20(i10, d2Var, context, j10, f6Var, tVar, a0Var));
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        if (!this.Y && !this.Z) {
            this.Z = true;
            kh.a0 a0Var = this.f43566a0;
            if (a0Var != null) {
                a0Var.run("USER_DECLINED", null);
            }
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        int h;
        super.onCreate(bundle);
        rl0 rl0Var = this.d;
        if (rl0Var.getAdapter() == null) {
            h = 0;
        } else {
            h = rl0Var.getAdapter().h();
        }
        rl0Var.u0(Math.max(h - 1, 0));
    }

    @Override
    public final ql0 v(rl0 rl0Var) {
        w51 w51Var = new w51(rl0Var, getContext(), this.U, 0, true, new d4(this, 10), this.resourcesProvider);
        this.W = w51Var;
        return w51Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.BotShareMessage);
    }
}
