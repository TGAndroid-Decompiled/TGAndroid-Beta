package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class qw implements RequestDelegate {
    public final int f40014a = 0;
    public final org.telegram.ui.ActionBar.b2 f40015b;
    public final long f40016c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object f40017e;
    public final TLObject f40018f;
    public final Object f40019g;

    public qw(uy uyVar, org.telegram.ui.ActionBar.b2 b2Var, TLRPC.User user, TLRPC.Chat chat, long j3, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.d = uyVar;
        this.f40015b = b2Var;
        this.f40017e = user;
        this.f40018f = chat;
        this.f40016c = j3;
        this.f40019g = tL_messages_checkHistoryImportPeer;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f40014a) {
            case 0:
                AndroidUtilities.runOnUIThread(new fw((uy) this.d, this.f40015b, tLObject, (TLRPC.User) this.f40017e, (TLRPC.Chat) this.f40018f, this.f40016c, tL_error, (TLRPC.TL_messages_checkHistoryImportPeer) this.f40019g));
                return;
            default:
                AndroidUtilities.runOnUIThread(new fw((zh.w3) this.d, (of.e) this.f40017e, this.f40015b, tLObject, (TL_stars.TL_starGiftUnique) this.f40018f, tL_error, this.f40016c, (CharSequence) this.f40019g));
                return;
        }
    }

    public qw(zh.w3 w3Var, of.e eVar, org.telegram.ui.ActionBar.b2 b2Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, CharSequence charSequence) {
        this.d = w3Var;
        this.f40017e = eVar;
        this.f40015b = b2Var;
        this.f40018f = tL_starGiftUnique;
        this.f40016c = j3;
        this.f40019g = charSequence;
    }
}
