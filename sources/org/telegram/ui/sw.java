package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class sw implements RequestDelegate {
    public final int f36768a = 0;
    public final org.telegram.ui.ActionBar.d2 f36769b;
    public final long f36770c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object e;
    public final TLObject f36771f;
    public final Object f36772g;

    public sw(wy wyVar, org.telegram.ui.ActionBar.d2 d2Var, TLRPC.User user, TLRPC.Chat chat, long j3, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.d = wyVar;
        this.f36769b = d2Var;
        this.e = user;
        this.f36771f = chat;
        this.f36770c = j3;
        this.f36772g = tL_messages_checkHistoryImportPeer;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f36768a) {
            case 0:
                AndroidUtilities.runOnUIThread(new gw((wy) this.d, this.f36769b, tLObject, (TLRPC.User) this.e, (TLRPC.Chat) this.f36771f, this.f36770c, tL_error, (TLRPC.TL_messages_checkHistoryImportPeer) this.f36772g));
                return;
            default:
                AndroidUtilities.runOnUIThread(new gw((xh.x3) this.d, (nf.e) this.e, this.f36769b, tLObject, (TL_stars.TL_starGiftUnique) this.f36771f, tL_error, this.f36770c, (CharSequence) this.f36772g));
                return;
        }
    }

    public sw(xh.x3 x3Var, nf.e eVar, org.telegram.ui.ActionBar.d2 d2Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, CharSequence charSequence) {
        this.d = x3Var;
        this.e = eVar;
        this.f36769b = d2Var;
        this.f36771f = tL_starGiftUnique;
        this.f36770c = j3;
        this.f36772g = charSequence;
    }
}
