package org.telegram.ui;

import android.text.TextUtils;
import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class te implements Runnable {
    public final int f41984a = 0;
    public final boolean f41985b;
    public final Object f41986c;
    public final boolean d;
    public final Object f41987e;
    public final Object f41988f;
    public final Object h;
    public final Object f41989n;

    public te(zn znVar, String str, CharacterStyle characterStyle, MessageObject messageObject, org.telegram.ui.Cells.u1 u1Var, boolean z10, boolean z11) {
        this.f41987e = znVar;
        this.f41986c = str;
        this.f41988f = characterStyle;
        this.h = messageObject;
        this.f41989n = u1Var;
        this.f41985b = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f41984a) {
            case 0:
                zn znVar = (zn) this.f41987e;
                String str = (String) this.f41986c;
                CharacterStyle characterStyle = (CharacterStyle) this.f41988f;
                MessageObject messageObject = (MessageObject) this.h;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f41989n;
                if (str.startsWith("video?")) {
                    znVar.X7(characterStyle, false, messageObject, u1Var);
                    return;
                } else if (this.f41985b && !this.d) {
                    znVar.getParentActivity();
                    of.f.n(str);
                    return;
                } else {
                    znVar.O9(messageObject, false, false);
                    znVar.ea(characterStyle, str, false, u1Var, messageObject);
                    return;
                }
            case 1:
                wh.l lVar = (wh.l) this.f41987e;
                Runnable runnable = (Runnable) this.f41988f;
                String str2 = (String) this.f41986c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.h;
                TLObject tLObject = (TLObject) this.f41989n;
                lVar.f50447w = false;
                lVar.f50450z = true;
                if (this.f41985b) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                }
                wh.l.k(lVar.f50442q, false, false);
                if (TextUtils.equals(str2, lVar.f50445t) && tL_error == null) {
                    lVar.f50450z = true;
                    lVar.g((TLRPC.TL_messages_chatInviteImporters) tLObject, str2, this.d, false);
                    return;
                }
                return;
            default:
                yh.s3.B0((yh.s3) this.f41987e, (TLObject) this.f41986c, this.f41985b, (TLRPC.Document) this.f41988f, this.d, (TLRPC.TL_error) this.h, (TL_stars.saveStarGift) this.f41989n);
                return;
        }
    }

    public te(wh.l lVar, boolean z10, Runnable runnable, String str, TLRPC.TL_error tL_error, TLObject tLObject, boolean z11) {
        this.f41987e = lVar;
        this.f41985b = z10;
        this.f41988f = runnable;
        this.f41986c = str;
        this.h = tL_error;
        this.f41989n = tLObject;
        this.d = z11;
    }

    public te(yh.s3 s3Var, TLObject tLObject, boolean z10, TLRPC.Document document, boolean z11, TLRPC.TL_error tL_error, TL_stars.saveStarGift savestargift) {
        this.f41987e = s3Var;
        this.f41986c = tLObject;
        this.f41985b = z10;
        this.f41988f = document;
        this.d = z11;
        this.h = tL_error;
        this.f41989n = savestargift;
    }
}
