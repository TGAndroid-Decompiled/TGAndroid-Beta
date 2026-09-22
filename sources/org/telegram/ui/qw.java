package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class qw implements RequestDelegate {
    public final int f36949a = 0;
    public final org.telegram.ui.ActionBar.b2 f36950b;
    public final long f36951c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object e;
    public final TLObject f36952f;
    public final Object f36953g;

    public qw(uy uyVar, org.telegram.ui.ActionBar.b2 b2Var, TLRPC.User user, TLRPC.Chat chat, long j3, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.d = uyVar;
        this.f36950b = b2Var;
        this.e = user;
        this.f36952f = chat;
        this.f36951c = j3;
        this.f36953g = tL_messages_checkHistoryImportPeer;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f36949a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ew((uy) this.d, this.f36950b, tLObject, (TLRPC.User) this.e, (TLRPC.Chat) this.f36952f, this.f36951c, tL_error, (TLRPC.TL_messages_checkHistoryImportPeer) this.f36953g));
                return;
            default:
                AndroidUtilities.runOnUIThread(new ew((yh.z3) this.d, (nf.e) this.e, this.f36950b, tLObject, (TL_stars.TL_starGiftUnique) this.f36952f, tL_error, this.f36951c, (CharSequence) this.f36953g));
                return;
        }
    }

    public qw(yh.z3 z3Var, nf.e eVar, org.telegram.ui.ActionBar.b2 b2Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, CharSequence charSequence) {
        this.d = z3Var;
        this.e = eVar;
        this.f36950b = b2Var;
        this.f36952f = tL_starGiftUnique;
        this.f36951c = j3;
        this.f36953g = charSequence;
    }
}
