package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class qw implements RequestDelegate {
    public final int f39826a = 0;
    public final org.telegram.ui.ActionBar.b2 f39827b;
    public final long f39828c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object f39829e;
    public final TLObject f39830f;
    public final Object f39831g;

    public qw(uy uyVar, org.telegram.ui.ActionBar.b2 b2Var, TLRPC.User user, TLRPC.Chat chat, long j3, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.d = uyVar;
        this.f39827b = b2Var;
        this.f39829e = user;
        this.f39830f = chat;
        this.f39828c = j3;
        this.f39831g = tL_messages_checkHistoryImportPeer;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f39826a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ew((uy) this.d, this.f39827b, tLObject, (TLRPC.User) this.f39829e, (TLRPC.Chat) this.f39830f, this.f39828c, tL_error, (TLRPC.TL_messages_checkHistoryImportPeer) this.f39831g));
                return;
            default:
                AndroidUtilities.runOnUIThread(new ew((yh.x3) this.d, (nf.e) this.f39829e, this.f39827b, tLObject, (TL_stars.TL_starGiftUnique) this.f39830f, tL_error, this.f39828c, (CharSequence) this.f39831g));
                return;
        }
    }

    public qw(yh.x3 x3Var, nf.e eVar, org.telegram.ui.ActionBar.b2 b2Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, CharSequence charSequence) {
        this.d = x3Var;
        this.f39829e = eVar;
        this.f39827b = b2Var;
        this.f39830f = tL_starGiftUnique;
        this.f39828c = j3;
        this.f39831g = charSequence;
    }
}
