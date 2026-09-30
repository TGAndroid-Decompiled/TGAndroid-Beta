package org.telegram.ui;

import android.text.TextUtils;
import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class re implements Runnable {
    public final int f37407a = 0;
    public final boolean f37408b;
    public final Object f37409c;
    public final boolean d;
    public final Object e;
    public final Object f37410f;
    public final Object h;
    public final Object f37411n;

    public re(wn wnVar, String str, CharacterStyle characterStyle, MessageObject messageObject, org.telegram.ui.Cells.u1 u1Var, boolean z10, boolean z11) {
        this.e = wnVar;
        this.f37409c = str;
        this.f37410f = characterStyle;
        this.h = messageObject;
        this.f37411n = u1Var;
        this.f37408b = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f37407a) {
            case 0:
                wn wnVar = (wn) this.e;
                String str = (String) this.f37409c;
                CharacterStyle characterStyle = (CharacterStyle) this.f37410f;
                MessageObject messageObject = (MessageObject) this.h;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f37411n;
                if (str.startsWith("video?")) {
                    wnVar.U7(characterStyle, false, messageObject, u1Var);
                    return;
                } else if (this.f37408b && !this.d) {
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
                Runnable runnable = (Runnable) this.f37410f;
                String str2 = (String) this.f37409c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.h;
                TLObject tLObject = (TLObject) this.f37411n;
                nVar.f45515w = false;
                nVar.f45518z = true;
                if (this.f37408b) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                }
                wh.n.k(nVar.f45510q, false, false);
                if (TextUtils.equals(str2, nVar.f45513t) && tL_error == null) {
                    nVar.f45518z = true;
                    nVar.g((TLRPC.TL_messages_chatInviteImporters) tLObject, str2, this.d, false);
                    return;
                }
                return;
            default:
                yh.x3.A0((yh.x3) this.e, (TLObject) this.f37409c, this.f37408b, (TLRPC.Document) this.f37410f, this.d, (TLRPC.TL_error) this.h, (TL_stars.saveStarGift) this.f37411n);
                return;
        }
    }

    public re(wh.n nVar, boolean z10, Runnable runnable, String str, TLRPC.TL_error tL_error, TLObject tLObject, boolean z11) {
        this.e = nVar;
        this.f37408b = z10;
        this.f37410f = runnable;
        this.f37409c = str;
        this.h = tL_error;
        this.f37411n = tLObject;
        this.d = z11;
    }

    public re(yh.x3 x3Var, TLObject tLObject, boolean z10, TLRPC.Document document, boolean z11, TLRPC.TL_error tL_error, TL_stars.saveStarGift savestargift) {
        this.e = x3Var;
        this.f37409c = tLObject;
        this.f37408b = z10;
        this.f37410f = document;
        this.d = z11;
        this.h = tL_error;
        this.f37411n = savestargift;
    }
}
