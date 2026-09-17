package org.telegram.ui;

import android.text.TextUtils;
import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class se implements Runnable {
    public final int f37470a = 0;
    public final boolean f37471b;
    public final Object f37472c;
    public final boolean d;
    public final Object e;
    public final Object f37473f;
    public final Object h;
    public final Object f37474n;

    public se(bo boVar, String str, CharacterStyle characterStyle, MessageObject messageObject, org.telegram.ui.Cells.t1 t1Var, boolean z10, boolean z11) {
        this.e = boVar;
        this.f37472c = str;
        this.f37473f = characterStyle;
        this.h = messageObject;
        this.f37474n = t1Var;
        this.f37471b = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f37470a) {
            case 0:
                bo boVar = (bo) this.e;
                String str = (String) this.f37472c;
                CharacterStyle characterStyle = (CharacterStyle) this.f37473f;
                MessageObject messageObject = (MessageObject) this.h;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.f37474n;
                if (str.startsWith("video?")) {
                    boVar.U7(characterStyle, false, messageObject, t1Var);
                    return;
                } else if (this.f37471b && !this.d) {
                    boVar.getParentActivity();
                    nf.f.n(str);
                    return;
                } else {
                    boVar.J9(messageObject, false, false);
                    boVar.Z9(characterStyle, str, false, t1Var, messageObject);
                    return;
                }
            case 1:
                wh.n nVar = (wh.n) this.e;
                Runnable runnable = (Runnable) this.f37473f;
                String str2 = (String) this.f37472c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.h;
                TLObject tLObject = (TLObject) this.f37474n;
                nVar.f45152w = false;
                nVar.f45155z = true;
                if (this.f37471b) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                }
                wh.n.k(nVar.f45147q, false, false);
                if (TextUtils.equals(str2, nVar.f45150t) && tL_error == null) {
                    nVar.f45155z = true;
                    nVar.g((TLRPC.TL_messages_chatInviteImporters) tLObject, str2, this.d, false);
                    return;
                }
                return;
            default:
                yh.a4.A0((yh.a4) this.e, (TLObject) this.f37472c, this.f37471b, (TLRPC.Document) this.f37473f, this.d, (TLRPC.TL_error) this.h, (TL_stars.saveStarGift) this.f37474n);
                return;
        }
    }

    public se(wh.n nVar, boolean z10, Runnable runnable, String str, TLRPC.TL_error tL_error, TLObject tLObject, boolean z11) {
        this.e = nVar;
        this.f37471b = z10;
        this.f37473f = runnable;
        this.f37472c = str;
        this.h = tL_error;
        this.f37474n = tLObject;
        this.d = z11;
    }

    public se(yh.a4 a4Var, TLObject tLObject, boolean z10, TLRPC.Document document, boolean z11, TLRPC.TL_error tL_error, TL_stars.saveStarGift savestargift) {
        this.e = a4Var;
        this.f37472c = tLObject;
        this.f37471b = z10;
        this.f37473f = document;
        this.d = z11;
        this.h = tL_error;
        this.f37474n = savestargift;
    }
}
