package org.telegram.ui;

import android.text.TextUtils;
import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class te implements Runnable {
    public final int f40804a = 0;
    public final boolean f40805b;
    public final Object f40806c;
    public final boolean d;
    public final Object f40807e;
    public final Object f40808f;
    public final Object h;
    public final Object f40809n;

    public te(yn ynVar, String str, CharacterStyle characterStyle, MessageObject messageObject, org.telegram.ui.Cells.u1 u1Var, boolean z10, boolean z11) {
        this.f40807e = ynVar;
        this.f40806c = str;
        this.f40808f = characterStyle;
        this.h = messageObject;
        this.f40809n = u1Var;
        this.f40805b = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f40804a) {
            case 0:
                yn ynVar = (yn) this.f40807e;
                String str = (String) this.f40806c;
                CharacterStyle characterStyle = (CharacterStyle) this.f40808f;
                MessageObject messageObject = (MessageObject) this.h;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f40809n;
                if (str.startsWith("video?")) {
                    ynVar.U7(characterStyle, false, messageObject, u1Var);
                    return;
                } else if (this.f40805b && !this.d) {
                    ynVar.getParentActivity();
                    nf.f.n(str);
                    return;
                } else {
                    ynVar.I9(messageObject, false, false);
                    ynVar.Y9(characterStyle, str, false, u1Var, messageObject);
                    return;
                }
            case 1:
                wh.n nVar = (wh.n) this.f40807e;
                Runnable runnable = (Runnable) this.f40808f;
                String str2 = (String) this.f40806c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.h;
                TLObject tLObject = (TLObject) this.f40809n;
                nVar.f49162w = false;
                nVar.f49165z = true;
                if (this.f40805b) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                }
                wh.n.k(nVar.f49157q, false, false);
                if (TextUtils.equals(str2, nVar.f49160t) && tL_error == null) {
                    nVar.f49165z = true;
                    nVar.g((TLRPC.TL_messages_chatInviteImporters) tLObject, str2, this.d, false);
                    return;
                }
                return;
            default:
                yh.x3.A0((yh.x3) this.f40807e, (TLObject) this.f40806c, this.f40805b, (TLRPC.Document) this.f40808f, this.d, (TLRPC.TL_error) this.h, (TL_stars.saveStarGift) this.f40809n);
                return;
        }
    }

    public te(wh.n nVar, boolean z10, Runnable runnable, String str, TLRPC.TL_error tL_error, TLObject tLObject, boolean z11) {
        this.f40807e = nVar;
        this.f40805b = z10;
        this.f40808f = runnable;
        this.f40806c = str;
        this.h = tL_error;
        this.f40809n = tLObject;
        this.d = z11;
    }

    public te(yh.x3 x3Var, TLObject tLObject, boolean z10, TLRPC.Document document, boolean z11, TLRPC.TL_error tL_error, TL_stars.saveStarGift savestargift) {
        this.f40807e = x3Var;
        this.f40806c = tLObject;
        this.f40805b = z10;
        this.f40808f = document;
        this.d = z11;
        this.h = tL_error;
        this.f40809n = savestargift;
    }
}
