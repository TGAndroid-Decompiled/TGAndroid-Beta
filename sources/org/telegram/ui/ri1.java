package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class ri1 implements RequestDelegate {
    public final int f40861a;
    public final Object f40862b;
    public final Object f40863c;

    public ri1(int i10, Object obj, Object obj2) {
        this.f40861a = i10;
        this.f40862b = obj;
        this.f40863c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f40861a) {
            case 0:
                AndroidUtilities.runOnUIThread(new bh1(3, (si1) this.f40862b, (int[]) this.f40863c));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.n71((qh.m1) this.f40862b, (String) this.f40863c, tLObject, 12));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.n71((qh.y2) this.f40862b, tLObject, (MessagesController) this.f40863c, 15));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.n71((qh.w7) this.f40862b, tLObject, (MessagesController) this.f40863c, 18));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.n71((boolean[]) this.f40862b, tLObject, (sh.j1) this.f40863c, 22));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.n71((sh.d3) this.f40862b, tLObject, (org.telegram.ui.ActionBar.d2) this.f40863c, 25));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new dy0(21, (uf.c) this.f40862b, tL_error, tLObject, (String) this.f40863c));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.n71((uf.u0) this.f40862b, (String) this.f40863c, tLObject, 28));
                return;
            case 8:
                uf.l1 l1Var = (uf.l1) this.f40862b;
                TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets = (TLRPC.TL_messages_searchStickerSets) this.f40863c;
                if (tLObject instanceof TLRPC.TL_messages_foundStickerSets) {
                    AndroidUtilities.runOnUIThread(new uf.h1(l1Var, tL_messages_searchStickerSets, (TLRPC.TL_messages_foundStickerSets) tLObject, 1));
                    return;
                }
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new uf.h1((vf.t) this.f40862b, tLObject, (TL_account.TL_businessChatLink) this.f40863c, 4));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new qh.l6(29, (vf.e0) this.f40862b, (org.telegram.ui.Components.im) this.f40863c));
                return;
            default:
                AndroidUtilities.runOnUIThread(new uf.h1((vf.s1) this.f40862b, tLObject, (SharedPreferences) this.f40863c, 9));
                return;
        }
    }
}
