package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class uw implements RequestDelegate {
    public final int f40497a = 0;
    public final org.telegram.ui.ActionBar.a2 f40498b;
    public final long f40499c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object e;
    public final TLObject f40500f;
    public final Object f40501g;

    public uw(yy yyVar, org.telegram.ui.ActionBar.a2 a2Var, TLRPC.User user, TLRPC.Chat chat, long j10, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.d = yyVar;
        this.f40498b = a2Var;
        this.e = user;
        this.f40500f = chat;
        this.f40499c = j10;
        this.f40501g = tL_messages_checkHistoryImportPeer;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f40497a) {
            case 0:
                AndroidUtilities.runOnUIThread(new iw((yy) this.d, this.f40498b, tLObject, (TLRPC.User) this.e, (TLRPC.Chat) this.f40500f, this.f40499c, tL_error, (TLRPC.TL_messages_checkHistoryImportPeer) this.f40501g));
                return;
            default:
                AndroidUtilities.runOnUIThread(new iw((zh.r3) this.d, (pf.c) this.e, this.f40498b, tLObject, (TL_stars.TL_starGiftUnique) this.f40500f, tL_error, this.f40499c, (CharSequence) this.f40501g));
                return;
        }
    }

    public uw(zh.r3 r3Var, pf.c cVar, org.telegram.ui.ActionBar.a2 a2Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, CharSequence charSequence) {
        this.d = r3Var;
        this.e = cVar;
        this.f40498b = a2Var;
        this.f40500f = tL_starGiftUnique;
        this.f40499c = j10;
        this.f40501g = charSequence;
    }
}
