package org.telegram.ui;

import android.text.TextUtils;
import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class xe implements Runnable {
    public final int f43901a = 0;
    public final boolean f43902b;
    public final Object f43903c;
    public final boolean d;
    public final Object f43904e;
    public final Object f43905f;
    public final Object h;
    public final Object f43906n;

    public xe(eo eoVar, String str, CharacterStyle characterStyle, MessageObject messageObject, org.telegram.ui.Cells.u1 u1Var, boolean z10, boolean z11) {
        this.f43904e = eoVar;
        this.f43903c = str;
        this.f43905f = characterStyle;
        this.h = messageObject;
        this.f43906n = u1Var;
        this.f43902b = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f43901a) {
            case 0:
                eo eoVar = (eo) this.f43904e;
                String str = (String) this.f43903c;
                CharacterStyle characterStyle = (CharacterStyle) this.f43905f;
                MessageObject messageObject = (MessageObject) this.h;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f43906n;
                if (str.startsWith("video?")) {
                    eoVar.X7(characterStyle, false, messageObject, u1Var);
                    return;
                } else if (this.f43902b && !this.d) {
                    eoVar.getParentActivity();
                    of.f.n(str);
                    return;
                } else {
                    eoVar.O9(messageObject, false, false);
                    eoVar.ea(characterStyle, str, false, u1Var, messageObject);
                    return;
                }
            case 1:
                wh.l lVar = (wh.l) this.f43904e;
                Runnable runnable = (Runnable) this.f43905f;
                String str2 = (String) this.f43903c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.h;
                TLObject tLObject = (TLObject) this.f43906n;
                lVar.f50676w = false;
                lVar.f50679z = true;
                if (this.f43902b) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                }
                wh.l.k(lVar.f50671q, false, false);
                if (TextUtils.equals(str2, lVar.f50674t) && tL_error == null) {
                    lVar.f50679z = true;
                    lVar.g((TLRPC.TL_messages_chatInviteImporters) tLObject, str2, this.d, false);
                    return;
                }
                return;
            default:
                yh.s3.B0((yh.s3) this.f43904e, (TLObject) this.f43903c, this.f43902b, (TLRPC.Document) this.f43905f, this.d, (TLRPC.TL_error) this.h, (TL_stars.saveStarGift) this.f43906n);
                return;
        }
    }

    public xe(wh.l lVar, boolean z10, Runnable runnable, String str, TLRPC.TL_error tL_error, TLObject tLObject, boolean z11) {
        this.f43904e = lVar;
        this.f43902b = z10;
        this.f43905f = runnable;
        this.f43903c = str;
        this.h = tL_error;
        this.f43906n = tLObject;
        this.d = z11;
    }

    public xe(yh.s3 s3Var, TLObject tLObject, boolean z10, TLRPC.Document document, boolean z11, TLRPC.TL_error tL_error, TL_stars.saveStarGift savestargift) {
        this.f43904e = s3Var;
        this.f43903c = tLObject;
        this.f43902b = z10;
        this.f43905f = document;
        this.d = z11;
        this.h = tL_error;
        this.f43906n = savestargift;
    }
}
