package org.telegram.ui;

import android.text.TextUtils;
import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class te implements Runnable {
    public final int f42028a = 0;
    public final boolean f42029b;
    public final Object f42030c;
    public final boolean d;
    public final Object f42031e;
    public final Object f42032f;
    public final Object h;
    public final Object f42033n;

    public te(zn znVar, String str, CharacterStyle characterStyle, MessageObject messageObject, org.telegram.ui.Cells.u1 u1Var, boolean z10, boolean z11) {
        this.f42031e = znVar;
        this.f42030c = str;
        this.f42032f = characterStyle;
        this.h = messageObject;
        this.f42033n = u1Var;
        this.f42029b = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f42028a) {
            case 0:
                zn znVar = (zn) this.f42031e;
                String str = (String) this.f42030c;
                CharacterStyle characterStyle = (CharacterStyle) this.f42032f;
                MessageObject messageObject = (MessageObject) this.h;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f42033n;
                if (str.startsWith("video?")) {
                    znVar.X7(characterStyle, false, messageObject, u1Var);
                    return;
                } else if (this.f42029b && !this.d) {
                    znVar.getParentActivity();
                    of.f.n(str);
                    return;
                } else {
                    znVar.O9(messageObject, false, false);
                    znVar.ea(characterStyle, str, false, u1Var, messageObject);
                    return;
                }
            case 1:
                wh.l lVar = (wh.l) this.f42031e;
                Runnable runnable = (Runnable) this.f42032f;
                String str2 = (String) this.f42030c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.h;
                TLObject tLObject = (TLObject) this.f42033n;
                lVar.f50491w = false;
                lVar.f50494z = true;
                if (this.f42029b) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                }
                wh.l.k(lVar.f50486q, false, false);
                if (TextUtils.equals(str2, lVar.f50489t) && tL_error == null) {
                    lVar.f50494z = true;
                    lVar.g((TLRPC.TL_messages_chatInviteImporters) tLObject, str2, this.d, false);
                    return;
                }
                return;
            default:
                yh.s3.B0((yh.s3) this.f42031e, (TLObject) this.f42030c, this.f42029b, (TLRPC.Document) this.f42032f, this.d, (TLRPC.TL_error) this.h, (TL_stars.saveStarGift) this.f42033n);
                return;
        }
    }

    public te(wh.l lVar, boolean z10, Runnable runnable, String str, TLRPC.TL_error tL_error, TLObject tLObject, boolean z11) {
        this.f42031e = lVar;
        this.f42029b = z10;
        this.f42032f = runnable;
        this.f42030c = str;
        this.h = tL_error;
        this.f42033n = tLObject;
        this.d = z11;
    }

    public te(yh.s3 s3Var, TLObject tLObject, boolean z10, TLRPC.Document document, boolean z11, TLRPC.TL_error tL_error, TL_stars.saveStarGift savestargift) {
        this.f42031e = s3Var;
        this.f42030c = tLObject;
        this.f42029b = z10;
        this.f42032f = document;
        this.d = z11;
        this.h = tL_error;
        this.f42033n = savestargift;
    }
}
