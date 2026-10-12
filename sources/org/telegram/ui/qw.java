package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class qw implements RequestDelegate {
    public final int f41440a = 0;
    public final org.telegram.ui.ActionBar.a2 f41441b;
    public final long f41442c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object f41443e;
    public final TLObject f41444f;
    public final Object f41445g;

    public qw(vy vyVar, org.telegram.ui.ActionBar.a2 a2Var, TLRPC.User user, TLRPC.Chat chat, long j3, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.d = vyVar;
        this.f41441b = a2Var;
        this.f41443e = user;
        this.f41444f = chat;
        this.f41442c = j3;
        this.f41445g = tL_messages_checkHistoryImportPeer;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f41440a) {
            case 0:
                AndroidUtilities.runOnUIThread(new fw((vy) this.d, this.f41441b, tLObject, (TLRPC.User) this.f41443e, (TLRPC.Chat) this.f41444f, this.f41442c, tL_error, (TLRPC.TL_messages_checkHistoryImportPeer) this.f41445g));
                return;
            default:
                AndroidUtilities.runOnUIThread(new fw((yh.s3) this.d, (of.e) this.f41443e, this.f41441b, tLObject, (TL_stars.TL_starGiftUnique) this.f41444f, tL_error, this.f41442c, (CharSequence) this.f41445g));
                return;
        }
    }

    public qw(yh.s3 s3Var, of.e eVar, org.telegram.ui.ActionBar.a2 a2Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, CharSequence charSequence) {
        this.d = s3Var;
        this.f41443e = eVar;
        this.f41441b = a2Var;
        this.f41444f = tL_starGiftUnique;
        this.f41442c = j3;
        this.f41445g = charSequence;
    }
}
