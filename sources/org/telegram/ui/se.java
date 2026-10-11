package org.telegram.ui;

import android.text.TextUtils;
import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class se implements Runnable {
    public final int f41714a = 0;
    public final boolean f41715b;
    public final Object f41716c;
    public final boolean d;
    public final Object f41717e;
    public final Object f41718f;
    public final Object h;
    public final Object f41719n;

    public se(zn znVar, String str, CharacterStyle characterStyle, MessageObject messageObject, org.telegram.ui.Cells.u1 u1Var, boolean z10, boolean z11) {
        this.f41717e = znVar;
        this.f41716c = str;
        this.f41718f = characterStyle;
        this.h = messageObject;
        this.f41719n = u1Var;
        this.f41715b = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f41714a) {
            case 0:
                zn znVar = (zn) this.f41717e;
                String str = (String) this.f41716c;
                CharacterStyle characterStyle = (CharacterStyle) this.f41718f;
                MessageObject messageObject = (MessageObject) this.h;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f41719n;
                if (str.startsWith("video?")) {
                    znVar.X7(characterStyle, false, messageObject, u1Var);
                    return;
                } else if (this.f41715b && !this.d) {
                    znVar.getParentActivity();
                    of.f.n(str);
                    return;
                } else {
                    znVar.O9(messageObject, false, false);
                    znVar.ea(characterStyle, str, false, u1Var, messageObject);
                    return;
                }
            case 1:
                wh.l lVar = (wh.l) this.f41717e;
                Runnable runnable = (Runnable) this.f41718f;
                String str2 = (String) this.f41716c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.h;
                TLObject tLObject = (TLObject) this.f41719n;
                lVar.f50535w = false;
                lVar.f50538z = true;
                if (this.f41715b) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                }
                wh.l.k(lVar.f50530q, false, false);
                if (TextUtils.equals(str2, lVar.f50533t) && tL_error == null) {
                    lVar.f50538z = true;
                    lVar.g((TLRPC.TL_messages_chatInviteImporters) tLObject, str2, this.d, false);
                    return;
                }
                return;
            default:
                yh.s3.B0((yh.s3) this.f41717e, (TLObject) this.f41716c, this.f41715b, (TLRPC.Document) this.f41718f, this.d, (TLRPC.TL_error) this.h, (TL_stars.saveStarGift) this.f41719n);
                return;
        }
    }

    public se(wh.l lVar, boolean z10, Runnable runnable, String str, TLRPC.TL_error tL_error, TLObject tLObject, boolean z11) {
        this.f41717e = lVar;
        this.f41715b = z10;
        this.f41718f = runnable;
        this.f41716c = str;
        this.h = tL_error;
        this.f41719n = tLObject;
        this.d = z11;
    }

    public se(yh.s3 s3Var, TLObject tLObject, boolean z10, TLRPC.Document document, boolean z11, TLRPC.TL_error tL_error, TL_stars.saveStarGift savestargift) {
        this.f41717e = s3Var;
        this.f41716c = tLObject;
        this.f41715b = z10;
        this.f41718f = document;
        this.d = z11;
        this.h = tL_error;
        this.f41719n = savestargift;
    }
}
