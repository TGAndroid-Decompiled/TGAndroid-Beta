package org.telegram.ui;

import android.text.TextUtils;
import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class te implements Runnable {
    public final int f41982a = 0;
    public final boolean f41983b;
    public final Object f41984c;
    public final boolean d;
    public final Object f41985e;
    public final Object f41986f;
    public final Object h;
    public final Object f41987n;

    public te(zn znVar, String str, CharacterStyle characterStyle, MessageObject messageObject, org.telegram.ui.Cells.u1 u1Var, boolean z10, boolean z11) {
        this.f41985e = znVar;
        this.f41984c = str;
        this.f41986f = characterStyle;
        this.h = messageObject;
        this.f41987n = u1Var;
        this.f41983b = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f41982a) {
            case 0:
                zn znVar = (zn) this.f41985e;
                String str = (String) this.f41984c;
                CharacterStyle characterStyle = (CharacterStyle) this.f41986f;
                MessageObject messageObject = (MessageObject) this.h;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f41987n;
                if (str.startsWith("video?")) {
                    znVar.X7(characterStyle, false, messageObject, u1Var);
                    return;
                } else if (this.f41983b && !this.d) {
                    znVar.getParentActivity();
                    of.f.n(str);
                    return;
                } else {
                    znVar.O9(messageObject, false, false);
                    znVar.ea(characterStyle, str, false, u1Var, messageObject);
                    return;
                }
            case 1:
                wh.l lVar = (wh.l) this.f41985e;
                Runnable runnable = (Runnable) this.f41986f;
                String str2 = (String) this.f41984c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.h;
                TLObject tLObject = (TLObject) this.f41987n;
                lVar.f50445w = false;
                lVar.f50448z = true;
                if (this.f41983b) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                }
                wh.l.k(lVar.f50440q, false, false);
                if (TextUtils.equals(str2, lVar.f50443t) && tL_error == null) {
                    lVar.f50448z = true;
                    lVar.g((TLRPC.TL_messages_chatInviteImporters) tLObject, str2, this.d, false);
                    return;
                }
                return;
            default:
                yh.s3.B0((yh.s3) this.f41985e, (TLObject) this.f41984c, this.f41983b, (TLRPC.Document) this.f41986f, this.d, (TLRPC.TL_error) this.h, (TL_stars.saveStarGift) this.f41987n);
                return;
        }
    }

    public te(wh.l lVar, boolean z10, Runnable runnable, String str, TLRPC.TL_error tL_error, TLObject tLObject, boolean z11) {
        this.f41985e = lVar;
        this.f41983b = z10;
        this.f41986f = runnable;
        this.f41984c = str;
        this.h = tL_error;
        this.f41987n = tLObject;
        this.d = z11;
    }

    public te(yh.s3 s3Var, TLObject tLObject, boolean z10, TLRPC.Document document, boolean z11, TLRPC.TL_error tL_error, TL_stars.saveStarGift savestargift) {
        this.f41985e = s3Var;
        this.f41984c = tLObject;
        this.f41983b = z10;
        this.f41986f = document;
        this.d = z11;
        this.h = tL_error;
        this.f41987n = savestargift;
    }
}
