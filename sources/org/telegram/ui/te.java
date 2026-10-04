package org.telegram.ui;

import android.text.TextUtils;
import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class te implements Runnable {
    public final int f40798a = 0;
    public final boolean f40799b;
    public final Object f40800c;
    public final boolean d;
    public final Object f40801e;
    public final Object f40802f;
    public final Object h;
    public final Object f40803n;

    public te(yn ynVar, String str, CharacterStyle characterStyle, MessageObject messageObject, org.telegram.ui.Cells.u1 u1Var, boolean z10, boolean z11) {
        this.f40801e = ynVar;
        this.f40800c = str;
        this.f40802f = characterStyle;
        this.h = messageObject;
        this.f40803n = u1Var;
        this.f40799b = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f40798a) {
            case 0:
                yn ynVar = (yn) this.f40801e;
                String str = (String) this.f40800c;
                CharacterStyle characterStyle = (CharacterStyle) this.f40802f;
                MessageObject messageObject = (MessageObject) this.h;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f40803n;
                if (str.startsWith("video?")) {
                    ynVar.U7(characterStyle, false, messageObject, u1Var);
                    return;
                } else if (this.f40799b && !this.d) {
                    ynVar.getParentActivity();
                    nf.f.n(str);
                    return;
                } else {
                    ynVar.I9(messageObject, false, false);
                    ynVar.Y9(characterStyle, str, false, u1Var, messageObject);
                    return;
                }
            case 1:
                wh.n nVar = (wh.n) this.f40801e;
                Runnable runnable = (Runnable) this.f40802f;
                String str2 = (String) this.f40800c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.h;
                TLObject tLObject = (TLObject) this.f40803n;
                nVar.f49154w = false;
                nVar.f49157z = true;
                if (this.f40799b) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                }
                wh.n.k(nVar.f49149q, false, false);
                if (TextUtils.equals(str2, nVar.f49152t) && tL_error == null) {
                    nVar.f49157z = true;
                    nVar.g((TLRPC.TL_messages_chatInviteImporters) tLObject, str2, this.d, false);
                    return;
                }
                return;
            default:
                yh.x3.A0((yh.x3) this.f40801e, (TLObject) this.f40800c, this.f40799b, (TLRPC.Document) this.f40802f, this.d, (TLRPC.TL_error) this.h, (TL_stars.saveStarGift) this.f40803n);
                return;
        }
    }

    public te(wh.n nVar, boolean z10, Runnable runnable, String str, TLRPC.TL_error tL_error, TLObject tLObject, boolean z11) {
        this.f40801e = nVar;
        this.f40799b = z10;
        this.f40802f = runnable;
        this.f40800c = str;
        this.h = tL_error;
        this.f40803n = tLObject;
        this.d = z11;
    }

    public te(yh.x3 x3Var, TLObject tLObject, boolean z10, TLRPC.Document document, boolean z11, TLRPC.TL_error tL_error, TL_stars.saveStarGift savestargift) {
        this.f40801e = x3Var;
        this.f40800c = tLObject;
        this.f40799b = z10;
        this.f40802f = document;
        this.d = z11;
        this.h = tL_error;
        this.f40803n = savestargift;
    }
}
