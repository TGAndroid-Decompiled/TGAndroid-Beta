package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class uw implements RequestDelegate {
    public final int f40804a = 0;
    public final org.telegram.ui.ActionBar.a2 f40805b;
    public final long f40806c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object e;
    public final TLObject f40807f;
    public final Object f40808g;

    public uw(yy yyVar, org.telegram.ui.ActionBar.a2 a2Var, TLRPC.User user, TLRPC.Chat chat, long j10, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.d = yyVar;
        this.f40805b = a2Var;
        this.e = user;
        this.f40807f = chat;
        this.f40806c = j10;
        this.f40808g = tL_messages_checkHistoryImportPeer;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f40804a) {
            case 0:
                AndroidUtilities.runOnUIThread(new jw((yy) this.d, this.f40805b, tLObject, (TLRPC.User) this.e, (TLRPC.Chat) this.f40807f, this.f40806c, tL_error, (TLRPC.TL_messages_checkHistoryImportPeer) this.f40808g));
                return;
            default:
                AndroidUtilities.runOnUIThread(new jw((zh.r3) this.d, (pf.c) this.e, this.f40805b, tLObject, (TL_stars.TL_starGiftUnique) this.f40807f, tL_error, this.f40806c, (CharSequence) this.f40808g));
                return;
        }
    }

    public uw(zh.r3 r3Var, pf.c cVar, org.telegram.ui.ActionBar.a2 a2Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, CharSequence charSequence) {
        this.d = r3Var;
        this.e = cVar;
        this.f40805b = a2Var;
        this.f40807f = tL_starGiftUnique;
        this.f40806c = j10;
        this.f40808g = charSequence;
    }
}
