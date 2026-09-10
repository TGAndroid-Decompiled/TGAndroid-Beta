package org.telegram.ui;

import android.text.TextUtils;
import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class te implements Runnable {
    public final int f36912a = 0;
    public final boolean f36913b;
    public final Object f36914c;
    public final boolean d;
    public final Object e;
    public final Object f36915f;
    public final Object h;
    public final Object f36916n;

    public te(eo eoVar, String str, CharacterStyle characterStyle, MessageObject messageObject, org.telegram.ui.Cells.t1 t1Var, boolean z10, boolean z11) {
        this.e = eoVar;
        this.f36914c = str;
        this.f36915f = characterStyle;
        this.h = messageObject;
        this.f36916n = t1Var;
        this.f36913b = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f36912a) {
            case 0:
                eo eoVar = (eo) this.e;
                String str = (String) this.f36914c;
                CharacterStyle characterStyle = (CharacterStyle) this.f36915f;
                MessageObject messageObject = (MessageObject) this.h;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.f36916n;
                if (str.startsWith("video?")) {
                    eoVar.U7(characterStyle, false, messageObject, t1Var);
                    return;
                } else if (this.f36913b && !this.d) {
                    eoVar.getParentActivity();
                    nf.f.n(str);
                    return;
                } else {
                    eoVar.J9(messageObject, false, false);
                    eoVar.Z9(characterStyle, str, false, t1Var, messageObject);
                    return;
                }
            case 1:
                vh.p pVar = (vh.p) this.e;
                Runnable runnable = (Runnable) this.f36915f;
                String str2 = (String) this.f36914c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.h;
                TLObject tLObject = (TLObject) this.f36916n;
                pVar.f43416w = false;
                pVar.f43419z = true;
                if (this.f36913b) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                }
                vh.p.k(pVar.f43411q, false, false);
                if (TextUtils.equals(str2, pVar.f43414t) && tL_error == null) {
                    pVar.f43419z = true;
                    pVar.g((TLRPC.TL_messages_chatInviteImporters) tLObject, str2, this.d, false);
                    return;
                }
                return;
            default:
                xh.x3.A0((xh.x3) this.e, (TLObject) this.f36914c, this.f36913b, (TLRPC.Document) this.f36915f, this.d, (TLRPC.TL_error) this.h, (TL_stars.saveStarGift) this.f36916n);
                return;
        }
    }

    public te(vh.p pVar, boolean z10, Runnable runnable, String str, TLRPC.TL_error tL_error, TLObject tLObject, boolean z11) {
        this.e = pVar;
        this.f36913b = z10;
        this.f36915f = runnable;
        this.f36914c = str;
        this.h = tL_error;
        this.f36916n = tLObject;
        this.d = z11;
    }

    public te(xh.x3 x3Var, TLObject tLObject, boolean z10, TLRPC.Document document, boolean z11, TLRPC.TL_error tL_error, TL_stars.saveStarGift savestargift) {
        this.e = x3Var;
        this.f36914c = tLObject;
        this.f36913b = z10;
        this.f36915f = document;
        this.d = z11;
        this.h = tL_error;
        this.f36916n = savestargift;
    }
}
