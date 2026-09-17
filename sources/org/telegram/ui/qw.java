package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class qw implements RequestDelegate {
    public final int f39988a = 0;
    public final org.telegram.ui.ActionBar.b2 f39989b;
    public final long f39990c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object f39991e;
    public final TLObject f39992f;
    public final Object f39993g;

    public qw(uy uyVar, org.telegram.ui.ActionBar.b2 b2Var, TLRPC.User user, TLRPC.Chat chat, long j3, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.d = uyVar;
        this.f39989b = b2Var;
        this.f39991e = user;
        this.f39992f = chat;
        this.f39990c = j3;
        this.f39993g = tL_messages_checkHistoryImportPeer;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f39988a) {
            case 0:
                AndroidUtilities.runOnUIThread(new fw((uy) this.d, this.f39989b, tLObject, (TLRPC.User) this.f39991e, (TLRPC.Chat) this.f39992f, this.f39990c, tL_error, (TLRPC.TL_messages_checkHistoryImportPeer) this.f39993g));
                return;
            default:
                AndroidUtilities.runOnUIThread(new fw((zh.w3) this.d, (of.e) this.f39991e, this.f39989b, tLObject, (TL_stars.TL_starGiftUnique) this.f39992f, tL_error, this.f39990c, (CharSequence) this.f39993g));
                return;
        }
    }

    public qw(zh.w3 w3Var, of.e eVar, org.telegram.ui.ActionBar.b2 b2Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, CharSequence charSequence) {
        this.d = w3Var;
        this.f39991e = eVar;
        this.f39989b = b2Var;
        this.f39992f = tL_starGiftUnique;
        this.f39990c = j3;
        this.f39993g = charSequence;
    }
}
