package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class sw implements RequestDelegate {
    public final int f37564a = 0;
    public final org.telegram.ui.ActionBar.c2 f37565b;
    public final long f37566c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object e;
    public final TLObject f37567f;
    public final Object f37568g;

    public sw(wy wyVar, org.telegram.ui.ActionBar.c2 c2Var, TLRPC.User user, TLRPC.Chat chat, long j3, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.d = wyVar;
        this.f37565b = c2Var;
        this.e = user;
        this.f37567f = chat;
        this.f37566c = j3;
        this.f37568g = tL_messages_checkHistoryImportPeer;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f37564a) {
            case 0:
                AndroidUtilities.runOnUIThread(new gw((wy) this.d, this.f37565b, tLObject, (TLRPC.User) this.e, (TLRPC.Chat) this.f37567f, this.f37566c, tL_error, (TLRPC.TL_messages_checkHistoryImportPeer) this.f37568g));
                return;
            default:
                AndroidUtilities.runOnUIThread(new gw((yh.a4) this.d, (nf.e) this.e, this.f37565b, tLObject, (TL_stars.TL_starGiftUnique) this.f37567f, tL_error, this.f37566c, (CharSequence) this.f37568g));
                return;
        }
    }

    public sw(yh.a4 a4Var, nf.e eVar, org.telegram.ui.ActionBar.c2 c2Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, CharSequence charSequence) {
        this.d = a4Var;
        this.e = eVar;
        this.f37565b = c2Var;
        this.f37567f = tL_starGiftUnique;
        this.f37566c = j3;
        this.f37568g = charSequence;
    }
}
