package org.telegram.ui;

import android.text.TextUtils;
import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class re implements Runnable {
    public final int f40149a = 0;
    public final boolean f40150b;
    public final Object f40151c;
    public final boolean d;
    public final Object f40152e;
    public final Object f40153f;
    public final Object h;
    public final Object f40154n;

    public re(co coVar, String str, CharacterStyle characterStyle, MessageObject messageObject, org.telegram.ui.Cells.t1 t1Var, boolean z10, boolean z11) {
        this.f40152e = coVar;
        this.f40151c = str;
        this.f40153f = characterStyle;
        this.h = messageObject;
        this.f40154n = t1Var;
        this.f40150b = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f40149a) {
            case 0:
                co coVar = (co) this.f40152e;
                String str = (String) this.f40151c;
                CharacterStyle characterStyle = (CharacterStyle) this.f40153f;
                MessageObject messageObject = (MessageObject) this.h;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.f40154n;
                if (str.startsWith("video?")) {
                    coVar.U7(characterStyle, false, messageObject, t1Var);
                    return;
                } else if (this.f40150b && !this.d) {
                    coVar.getParentActivity();
                    of.f.n(str);
                    return;
                } else {
                    coVar.J9(messageObject, false, false);
                    coVar.Z9(characterStyle, str, false, t1Var, messageObject);
                    return;
                }
            case 1:
                xh.n nVar = (xh.n) this.f40152e;
                Runnable runnable = (Runnable) this.f40153f;
                String str2 = (String) this.f40151c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.h;
                TLObject tLObject = (TLObject) this.f40154n;
                nVar.f49461w = false;
                nVar.f49464z = true;
                if (this.f40150b) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                }
                xh.n.k(nVar.f49456q, false, false);
                if (TextUtils.equals(str2, nVar.f49459t) && tL_error == null) {
                    nVar.f49464z = true;
                    nVar.g((TLRPC.TL_messages_chatInviteImporters) tLObject, str2, this.d, false);
                    return;
                }
                return;
            default:
                zh.w3.A0((zh.w3) this.f40152e, (TLObject) this.f40151c, this.f40150b, (TLRPC.Document) this.f40153f, this.d, (TLRPC.TL_error) this.h, (TL_stars.saveStarGift) this.f40154n);
                return;
        }
    }

    public re(xh.n nVar, boolean z10, Runnable runnable, String str, TLRPC.TL_error tL_error, TLObject tLObject, boolean z11) {
        this.f40152e = nVar;
        this.f40150b = z10;
        this.f40153f = runnable;
        this.f40151c = str;
        this.h = tL_error;
        this.f40154n = tLObject;
        this.d = z11;
    }

    public re(zh.w3 w3Var, TLObject tLObject, boolean z10, TLRPC.Document document, boolean z11, TLRPC.TL_error tL_error, TL_stars.saveStarGift savestargift) {
        this.f40152e = w3Var;
        this.f40151c = tLObject;
        this.f40150b = z10;
        this.f40153f = document;
        this.d = z11;
        this.h = tL_error;
        this.f40154n = savestargift;
    }
}
