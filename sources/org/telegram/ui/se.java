package org.telegram.ui;

import android.text.TextUtils;
import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class se implements Runnable {
    public final int f37257a = 0;
    public final boolean f37258b;
    public final Object f37259c;
    public final boolean d;
    public final Object e;
    public final Object f37260f;
    public final Object h;
    public final Object f37261n;

    public se(zn znVar, String str, CharacterStyle characterStyle, MessageObject messageObject, org.telegram.ui.Cells.u1 u1Var, boolean z10, boolean z11) {
        this.e = znVar;
        this.f37259c = str;
        this.f37260f = characterStyle;
        this.h = messageObject;
        this.f37261n = u1Var;
        this.f37258b = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f37257a) {
            case 0:
                zn znVar = (zn) this.e;
                String str = (String) this.f37259c;
                CharacterStyle characterStyle = (CharacterStyle) this.f37260f;
                MessageObject messageObject = (MessageObject) this.h;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f37261n;
                if (str.startsWith("video?")) {
                    znVar.U7(characterStyle, false, messageObject, u1Var);
                    return;
                } else if (this.f37258b && !this.d) {
                    znVar.getParentActivity();
                    nf.f.n(str);
                    return;
                } else {
                    znVar.J9(messageObject, false, false);
                    znVar.Z9(characterStyle, str, false, u1Var, messageObject);
                    return;
                }
            case 1:
                wh.n nVar = (wh.n) this.e;
                Runnable runnable = (Runnable) this.f37260f;
                String str2 = (String) this.f37259c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.h;
                TLObject tLObject = (TLObject) this.f37261n;
                nVar.f45380w = false;
                nVar.f45383z = true;
                if (this.f37258b) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                }
                wh.n.k(nVar.f45375q, false, false);
                if (TextUtils.equals(str2, nVar.f45378t) && tL_error == null) {
                    nVar.f45383z = true;
                    nVar.g((TLRPC.TL_messages_chatInviteImporters) tLObject, str2, this.d, false);
                    return;
                }
                return;
            default:
                yh.y3.A0((yh.y3) this.e, (TLObject) this.f37259c, this.f37258b, (TLRPC.Document) this.f37260f, this.d, (TLRPC.TL_error) this.h, (TL_stars.saveStarGift) this.f37261n);
                return;
        }
    }

    public se(wh.n nVar, boolean z10, Runnable runnable, String str, TLRPC.TL_error tL_error, TLObject tLObject, boolean z11) {
        this.e = nVar;
        this.f37258b = z10;
        this.f37260f = runnable;
        this.f37259c = str;
        this.h = tL_error;
        this.f37261n = tLObject;
        this.d = z11;
    }

    public se(yh.y3 y3Var, TLObject tLObject, boolean z10, TLRPC.Document document, boolean z11, TLRPC.TL_error tL_error, TL_stars.saveStarGift savestargift) {
        this.e = y3Var;
        this.f37259c = tLObject;
        this.f37258b = z10;
        this.f37260f = document;
        this.d = z11;
        this.h = tL_error;
        this.f37261n = savestargift;
    }
}
