package org.telegram.ui;

import android.text.TextUtils;
import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class se implements Runnable {
    public final int f41748a = 0;
    public final boolean f41749b;
    public final Object f41750c;
    public final boolean d;
    public final Object f41751e;
    public final Object f41752f;
    public final Object h;
    public final Object f41753n;

    public se(zn znVar, String str, CharacterStyle characterStyle, MessageObject messageObject, org.telegram.ui.Cells.u1 u1Var, boolean z10, boolean z11) {
        this.f41751e = znVar;
        this.f41750c = str;
        this.f41752f = characterStyle;
        this.h = messageObject;
        this.f41753n = u1Var;
        this.f41749b = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f41748a) {
            case 0:
                zn znVar = (zn) this.f41751e;
                String str = (String) this.f41750c;
                CharacterStyle characterStyle = (CharacterStyle) this.f41752f;
                MessageObject messageObject = (MessageObject) this.h;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f41753n;
                if (str.startsWith("video?")) {
                    znVar.X7(characterStyle, false, messageObject, u1Var);
                    return;
                } else if (this.f41749b && !this.d) {
                    znVar.getParentActivity();
                    of.f.n(str);
                    return;
                } else {
                    znVar.O9(messageObject, false, false);
                    znVar.ea(characterStyle, str, false, u1Var, messageObject);
                    return;
                }
            case 1:
                wh.l lVar = (wh.l) this.f41751e;
                Runnable runnable = (Runnable) this.f41752f;
                String str2 = (String) this.f41750c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.h;
                TLObject tLObject = (TLObject) this.f41753n;
                lVar.f50569w = false;
                lVar.f50572z = true;
                if (this.f41749b) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                }
                wh.l.k(lVar.f50564q, false, false);
                if (TextUtils.equals(str2, lVar.f50567t) && tL_error == null) {
                    lVar.f50572z = true;
                    lVar.g((TLRPC.TL_messages_chatInviteImporters) tLObject, str2, this.d, false);
                    return;
                }
                return;
            default:
                yh.s3.B0((yh.s3) this.f41751e, (TLObject) this.f41750c, this.f41749b, (TLRPC.Document) this.f41752f, this.d, (TLRPC.TL_error) this.h, (TL_stars.saveStarGift) this.f41753n);
                return;
        }
    }

    public se(wh.l lVar, boolean z10, Runnable runnable, String str, TLRPC.TL_error tL_error, TLObject tLObject, boolean z11) {
        this.f41751e = lVar;
        this.f41749b = z10;
        this.f41752f = runnable;
        this.f41750c = str;
        this.h = tL_error;
        this.f41753n = tLObject;
        this.d = z11;
    }

    public se(yh.s3 s3Var, TLObject tLObject, boolean z10, TLRPC.Document document, boolean z11, TLRPC.TL_error tL_error, TL_stars.saveStarGift savestargift) {
        this.f41751e = s3Var;
        this.f41750c = tLObject;
        this.f41749b = z10;
        this.f41752f = document;
        this.d = z11;
        this.h = tL_error;
        this.f41753n = savestargift;
    }
}
