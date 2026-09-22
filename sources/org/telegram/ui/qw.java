package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class qw implements RequestDelegate {
    public final int f36996a = 0;
    public final org.telegram.ui.ActionBar.b2 f36997b;
    public final long f36998c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object e;
    public final TLObject f36999f;
    public final Object f37000g;

    public qw(uy uyVar, org.telegram.ui.ActionBar.b2 b2Var, TLRPC.User user, TLRPC.Chat chat, long j3, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.d = uyVar;
        this.f36997b = b2Var;
        this.e = user;
        this.f36999f = chat;
        this.f36998c = j3;
        this.f37000g = tL_messages_checkHistoryImportPeer;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f36996a) {
            case 0:
                AndroidUtilities.runOnUIThread(new fw((uy) this.d, this.f36997b, tLObject, (TLRPC.User) this.e, (TLRPC.Chat) this.f36999f, this.f36998c, tL_error, (TLRPC.TL_messages_checkHistoryImportPeer) this.f37000g));
                return;
            default:
                AndroidUtilities.runOnUIThread(new fw((yh.y3) this.d, (nf.e) this.e, this.f36997b, tLObject, (TL_stars.TL_starGiftUnique) this.f36999f, tL_error, this.f36998c, (CharSequence) this.f37000g));
                return;
        }
    }

    public qw(yh.y3 y3Var, nf.e eVar, org.telegram.ui.ActionBar.b2 b2Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, CharSequence charSequence) {
        this.d = y3Var;
        this.e = eVar;
        this.f36997b = b2Var;
        this.f36999f = tL_starGiftUnique;
        this.f36998c = j3;
        this.f37000g = charSequence;
    }
}
