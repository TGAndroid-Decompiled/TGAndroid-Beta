package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class qw implements RequestDelegate {
    public final int f39831a = 0;
    public final org.telegram.ui.ActionBar.b2 f39832b;
    public final long f39833c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object f39834e;
    public final TLObject f39835f;
    public final Object f39836g;

    public qw(uy uyVar, org.telegram.ui.ActionBar.b2 b2Var, TLRPC.User user, TLRPC.Chat chat, long j3, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.d = uyVar;
        this.f39832b = b2Var;
        this.f39834e = user;
        this.f39835f = chat;
        this.f39833c = j3;
        this.f39836g = tL_messages_checkHistoryImportPeer;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f39831a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ew((uy) this.d, this.f39832b, tLObject, (TLRPC.User) this.f39834e, (TLRPC.Chat) this.f39835f, this.f39833c, tL_error, (TLRPC.TL_messages_checkHistoryImportPeer) this.f39836g));
                return;
            default:
                AndroidUtilities.runOnUIThread(new ew((yh.x3) this.d, (nf.e) this.f39834e, this.f39832b, tLObject, (TL_stars.TL_starGiftUnique) this.f39835f, tL_error, this.f39833c, (CharSequence) this.f39836g));
                return;
        }
    }

    public qw(yh.x3 x3Var, nf.e eVar, org.telegram.ui.ActionBar.b2 b2Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, CharSequence charSequence) {
        this.d = x3Var;
        this.f39834e = eVar;
        this.f39832b = b2Var;
        this.f39835f = tL_starGiftUnique;
        this.f39833c = j3;
        this.f39836g = charSequence;
    }
}
