package org.telegram.ui;

import android.text.TextUtils;
import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class re implements Runnable {
    public final int f37305a = 0;
    public final boolean f37306b;
    public final Object f37307c;
    public final boolean d;
    public final Object e;
    public final Object f37308f;
    public final Object h;
    public final Object f37309n;

    public re(wn wnVar, String str, CharacterStyle characterStyle, MessageObject messageObject, org.telegram.ui.Cells.u1 u1Var, boolean z10, boolean z11) {
        this.e = wnVar;
        this.f37307c = str;
        this.f37308f = characterStyle;
        this.h = messageObject;
        this.f37309n = u1Var;
        this.f37306b = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f37305a) {
            case 0:
                wn wnVar = (wn) this.e;
                String str = (String) this.f37307c;
                CharacterStyle characterStyle = (CharacterStyle) this.f37308f;
                MessageObject messageObject = (MessageObject) this.h;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f37309n;
                if (str.startsWith("video?")) {
                    wnVar.U7(characterStyle, false, messageObject, u1Var);
                    return;
                } else if (this.f37306b && !this.d) {
                    wnVar.getParentActivity();
                    nf.f.n(str);
                    return;
                } else {
                    wnVar.J9(messageObject, false, false);
                    wnVar.Z9(characterStyle, str, false, u1Var, messageObject);
                    return;
                }
            case 1:
                wh.n nVar = (wh.n) this.e;
                Runnable runnable = (Runnable) this.f37308f;
                String str2 = (String) this.f37307c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.h;
                TLObject tLObject = (TLObject) this.f37309n;
                nVar.f45407w = false;
                nVar.f45410z = true;
                if (this.f37306b) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                }
                wh.n.k(nVar.f45402q, false, false);
                if (TextUtils.equals(str2, nVar.f45405t) && tL_error == null) {
                    nVar.f45410z = true;
                    nVar.g((TLRPC.TL_messages_chatInviteImporters) tLObject, str2, this.d, false);
                    return;
                }
                return;
            default:
                yh.x3.A0((yh.x3) this.e, (TLObject) this.f37307c, this.f37306b, (TLRPC.Document) this.f37308f, this.d, (TLRPC.TL_error) this.h, (TL_stars.saveStarGift) this.f37309n);
                return;
        }
    }

    public re(wh.n nVar, boolean z10, Runnable runnable, String str, TLRPC.TL_error tL_error, TLObject tLObject, boolean z11) {
        this.e = nVar;
        this.f37306b = z10;
        this.f37308f = runnable;
        this.f37307c = str;
        this.h = tL_error;
        this.f37309n = tLObject;
        this.d = z11;
    }

    public re(yh.x3 x3Var, TLObject tLObject, boolean z10, TLRPC.Document document, boolean z11, TLRPC.TL_error tL_error, TL_stars.saveStarGift savestargift) {
        this.e = x3Var;
        this.f37307c = tLObject;
        this.f37306b = z10;
        this.f37308f = document;
        this.d = z11;
        this.h = tL_error;
        this.f37309n = savestargift;
    }
}
