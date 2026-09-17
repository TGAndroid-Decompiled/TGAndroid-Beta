package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class qw implements RequestDelegate {
    public final int f40015a = 0;
    public final org.telegram.ui.ActionBar.b2 f40016b;
    public final long f40017c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object f40018e;
    public final TLObject f40019f;
    public final Object f40020g;

    public qw(uy uyVar, org.telegram.ui.ActionBar.b2 b2Var, TLRPC.User user, TLRPC.Chat chat, long j3, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.d = uyVar;
        this.f40016b = b2Var;
        this.f40018e = user;
        this.f40019f = chat;
        this.f40017c = j3;
        this.f40020g = tL_messages_checkHistoryImportPeer;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f40015a) {
            case 0:
                AndroidUtilities.runOnUIThread(new fw((uy) this.d, this.f40016b, tLObject, (TLRPC.User) this.f40018e, (TLRPC.Chat) this.f40019f, this.f40017c, tL_error, (TLRPC.TL_messages_checkHistoryImportPeer) this.f40020g));
                return;
            default:
                AndroidUtilities.runOnUIThread(new fw((zh.w3) this.d, (of.e) this.f40018e, this.f40016b, tLObject, (TL_stars.TL_starGiftUnique) this.f40019f, tL_error, this.f40017c, (CharSequence) this.f40020g));
                return;
        }
    }

    public qw(zh.w3 w3Var, of.e eVar, org.telegram.ui.ActionBar.b2 b2Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, CharSequence charSequence) {
        this.d = w3Var;
        this.f40018e = eVar;
        this.f40016b = b2Var;
        this.f40019f = tL_starGiftUnique;
        this.f40017c = j3;
        this.f40020g = charSequence;
    }
}
