package org.telegram.ui;

import android.text.TextUtils;
import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class te implements Runnable {
    public final int f40858a = 0;
    public final boolean f40859b;
    public final Object f40860c;
    public final boolean d;
    public final Object f40861e;
    public final Object f40862f;
    public final Object h;
    public final Object f40863n;

    public te(yn ynVar, String str, CharacterStyle characterStyle, MessageObject messageObject, org.telegram.ui.Cells.u1 u1Var, boolean z10, boolean z11) {
        this.f40861e = ynVar;
        this.f40860c = str;
        this.f40862f = characterStyle;
        this.h = messageObject;
        this.f40863n = u1Var;
        this.f40859b = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f40858a) {
            case 0:
                yn ynVar = (yn) this.f40861e;
                String str = (String) this.f40860c;
                CharacterStyle characterStyle = (CharacterStyle) this.f40862f;
                MessageObject messageObject = (MessageObject) this.h;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f40863n;
                if (str.startsWith("video?")) {
                    ynVar.U7(characterStyle, false, messageObject, u1Var);
                    return;
                } else if (this.f40859b && !this.d) {
                    ynVar.getParentActivity();
                    nf.f.n(str);
                    return;
                } else {
                    ynVar.I9(messageObject, false, false);
                    ynVar.Y9(characterStyle, str, false, u1Var, messageObject);
                    return;
                }
            case 1:
                wh.n nVar = (wh.n) this.f40861e;
                Runnable runnable = (Runnable) this.f40862f;
                String str2 = (String) this.f40860c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.h;
                TLObject tLObject = (TLObject) this.f40863n;
                nVar.f49169w = false;
                nVar.f49172z = true;
                if (this.f40859b) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                }
                wh.n.k(nVar.f49164q, false, false);
                if (TextUtils.equals(str2, nVar.f49167t) && tL_error == null) {
                    nVar.f49172z = true;
                    nVar.g((TLRPC.TL_messages_chatInviteImporters) tLObject, str2, this.d, false);
                    return;
                }
                return;
            default:
                yh.y3.A0((yh.y3) this.f40861e, (TLObject) this.f40860c, this.f40859b, (TLRPC.Document) this.f40862f, this.d, (TLRPC.TL_error) this.h, (TL_stars.saveStarGift) this.f40863n);
                return;
        }
    }

    public te(wh.n nVar, boolean z10, Runnable runnable, String str, TLRPC.TL_error tL_error, TLObject tLObject, boolean z11) {
        this.f40861e = nVar;
        this.f40859b = z10;
        this.f40862f = runnable;
        this.f40860c = str;
        this.h = tL_error;
        this.f40863n = tLObject;
        this.d = z11;
    }

    public te(yh.y3 y3Var, TLObject tLObject, boolean z10, TLRPC.Document document, boolean z11, TLRPC.TL_error tL_error, TL_stars.saveStarGift savestargift) {
        this.f40861e = y3Var;
        this.f40860c = tLObject;
        this.f40859b = z10;
        this.f40862f = document;
        this.d = z11;
        this.h = tL_error;
        this.f40863n = savestargift;
    }
}
