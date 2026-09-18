package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class qw implements RequestDelegate {
    public final int f36887a = 0;
    public final org.telegram.ui.ActionBar.b2 f36888b;
    public final long f36889c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object e;
    public final TLObject f36890f;
    public final Object f36891g;

    public qw(uy uyVar, org.telegram.ui.ActionBar.b2 b2Var, TLRPC.User user, TLRPC.Chat chat, long j3, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.d = uyVar;
        this.f36888b = b2Var;
        this.e = user;
        this.f36890f = chat;
        this.f36889c = j3;
        this.f36891g = tL_messages_checkHistoryImportPeer;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f36887a) {
            case 0:
                AndroidUtilities.runOnUIThread(new fw((uy) this.d, this.f36888b, tLObject, (TLRPC.User) this.e, (TLRPC.Chat) this.f36890f, this.f36889c, tL_error, (TLRPC.TL_messages_checkHistoryImportPeer) this.f36891g));
                return;
            default:
                AndroidUtilities.runOnUIThread(new fw((yh.y3) this.d, (nf.e) this.e, this.f36888b, tLObject, (TL_stars.TL_starGiftUnique) this.f36890f, tL_error, this.f36889c, (CharSequence) this.f36891g));
                return;
        }
    }

    public qw(yh.y3 y3Var, nf.e eVar, org.telegram.ui.ActionBar.b2 b2Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, CharSequence charSequence) {
        this.d = y3Var;
        this.e = eVar;
        this.f36888b = b2Var;
        this.f36890f = tL_starGiftUnique;
        this.f36889c = j3;
        this.f36891g = charSequence;
    }
}
