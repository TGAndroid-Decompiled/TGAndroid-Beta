package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class qw implements RequestDelegate {
    public final int f41444a = 0;
    public final org.telegram.ui.ActionBar.a2 f41445b;
    public final long f41446c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object f41447e;
    public final TLObject f41448f;
    public final Object f41449g;

    public qw(vy vyVar, org.telegram.ui.ActionBar.a2 a2Var, TLRPC.User user, TLRPC.Chat chat, long j3, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.d = vyVar;
        this.f41445b = a2Var;
        this.f41447e = user;
        this.f41448f = chat;
        this.f41446c = j3;
        this.f41449g = tL_messages_checkHistoryImportPeer;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f41444a) {
            case 0:
                AndroidUtilities.runOnUIThread(new fw((vy) this.d, this.f41445b, tLObject, (TLRPC.User) this.f41447e, (TLRPC.Chat) this.f41448f, this.f41446c, tL_error, (TLRPC.TL_messages_checkHistoryImportPeer) this.f41449g));
                return;
            default:
                AndroidUtilities.runOnUIThread(new fw((yh.s3) this.d, (of.e) this.f41447e, this.f41445b, tLObject, (TL_stars.TL_starGiftUnique) this.f41448f, tL_error, this.f41446c, (CharSequence) this.f41449g));
                return;
        }
    }

    public qw(yh.s3 s3Var, of.e eVar, org.telegram.ui.ActionBar.a2 a2Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, CharSequence charSequence) {
        this.d = s3Var;
        this.f41447e = eVar;
        this.f41445b = a2Var;
        this.f41448f = tL_starGiftUnique;
        this.f41446c = j3;
        this.f41449g = charSequence;
    }
}
