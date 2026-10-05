package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class qw implements RequestDelegate {
    public final int f39892a = 0;
    public final org.telegram.ui.ActionBar.b2 f39893b;
    public final long f39894c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object f39895e;
    public final TLObject f39896f;
    public final Object f39897g;

    public qw(uy uyVar, org.telegram.ui.ActionBar.b2 b2Var, TLRPC.User user, TLRPC.Chat chat, long j3, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.d = uyVar;
        this.f39893b = b2Var;
        this.f39895e = user;
        this.f39896f = chat;
        this.f39894c = j3;
        this.f39897g = tL_messages_checkHistoryImportPeer;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f39892a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ew((uy) this.d, this.f39893b, tLObject, (TLRPC.User) this.f39895e, (TLRPC.Chat) this.f39896f, this.f39894c, tL_error, (TLRPC.TL_messages_checkHistoryImportPeer) this.f39897g));
                return;
            default:
                AndroidUtilities.runOnUIThread(new ew((yh.y3) this.d, (nf.e) this.f39895e, this.f39893b, tLObject, (TL_stars.TL_starGiftUnique) this.f39896f, tL_error, this.f39894c, (CharSequence) this.f39897g));
                return;
        }
    }

    public qw(yh.y3 y3Var, nf.e eVar, org.telegram.ui.ActionBar.b2 b2Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, CharSequence charSequence) {
        this.d = y3Var;
        this.f39895e = eVar;
        this.f39893b = b2Var;
        this.f39896f = tL_starGiftUnique;
        this.f39894c = j3;
        this.f39897g = charSequence;
    }
}
