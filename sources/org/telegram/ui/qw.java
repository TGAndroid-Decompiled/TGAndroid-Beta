package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class qw implements RequestDelegate {
    public final int f36947a = 0;
    public final org.telegram.ui.ActionBar.b2 f36948b;
    public final long f36949c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object e;
    public final TLObject f36950f;
    public final Object f36951g;

    public qw(uy uyVar, org.telegram.ui.ActionBar.b2 b2Var, TLRPC.User user, TLRPC.Chat chat, long j3, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.d = uyVar;
        this.f36948b = b2Var;
        this.e = user;
        this.f36950f = chat;
        this.f36949c = j3;
        this.f36951g = tL_messages_checkHistoryImportPeer;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f36947a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ew((uy) this.d, this.f36948b, tLObject, (TLRPC.User) this.e, (TLRPC.Chat) this.f36950f, this.f36949c, tL_error, (TLRPC.TL_messages_checkHistoryImportPeer) this.f36951g));
                return;
            default:
                AndroidUtilities.runOnUIThread(new ew((yh.a4) this.d, (nf.e) this.e, this.f36948b, tLObject, (TL_stars.TL_starGiftUnique) this.f36950f, tL_error, this.f36949c, (CharSequence) this.f36951g));
                return;
        }
    }

    public qw(yh.a4 a4Var, nf.e eVar, org.telegram.ui.ActionBar.b2 b2Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, CharSequence charSequence) {
        this.d = a4Var;
        this.e = eVar;
        this.f36948b = b2Var;
        this.f36950f = tL_starGiftUnique;
        this.f36949c = j3;
        this.f36951g = charSequence;
    }
}
