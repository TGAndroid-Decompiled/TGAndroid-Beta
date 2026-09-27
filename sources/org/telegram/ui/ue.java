package org.telegram.ui;

import android.text.TextUtils;
import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class ue implements Runnable {
    public final int f38223a = 0;
    public final boolean f38224b;
    public final Object f38225c;
    public final boolean d;
    public final Object e;
    public final Object f38226f;
    public final Object h;
    public final Object f38227n;

    public ue(xn xnVar, String str, CharacterStyle characterStyle, MessageObject messageObject, org.telegram.ui.Cells.u1 u1Var, boolean z10, boolean z11) {
        this.e = xnVar;
        this.f38225c = str;
        this.f38226f = characterStyle;
        this.h = messageObject;
        this.f38227n = u1Var;
        this.f38224b = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f38223a) {
            case 0:
                xn xnVar = (xn) this.e;
                String str = (String) this.f38225c;
                CharacterStyle characterStyle = (CharacterStyle) this.f38226f;
                MessageObject messageObject = (MessageObject) this.h;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f38227n;
                if (str.startsWith("video?")) {
                    xnVar.U7(characterStyle, false, messageObject, u1Var);
                    return;
                } else if (this.f38224b && !this.d) {
                    xnVar.getParentActivity();
                    nf.f.n(str);
                    return;
                } else {
                    xnVar.J9(messageObject, false, false);
                    xnVar.Z9(characterStyle, str, false, u1Var, messageObject);
                    return;
                }
            case 1:
                wh.n nVar = (wh.n) this.e;
                Runnable runnable = (Runnable) this.f38226f;
                String str2 = (String) this.f38225c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.h;
                TLObject tLObject = (TLObject) this.f38227n;
                nVar.f45453w = false;
                nVar.f45456z = true;
                if (this.f38224b) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                }
                wh.n.k(nVar.f45448q, false, false);
                if (TextUtils.equals(str2, nVar.f45451t) && tL_error == null) {
                    nVar.f45456z = true;
                    nVar.g((TLRPC.TL_messages_chatInviteImporters) tLObject, str2, this.d, false);
                    return;
                }
                return;
            default:
                yh.x3.A0((yh.x3) this.e, (TLObject) this.f38225c, this.f38224b, (TLRPC.Document) this.f38226f, this.d, (TLRPC.TL_error) this.h, (TL_stars.saveStarGift) this.f38227n);
                return;
        }
    }

    public ue(wh.n nVar, boolean z10, Runnable runnable, String str, TLRPC.TL_error tL_error, TLObject tLObject, boolean z11) {
        this.e = nVar;
        this.f38224b = z10;
        this.f38226f = runnable;
        this.f38225c = str;
        this.h = tL_error;
        this.f38227n = tLObject;
        this.d = z11;
    }

    public ue(yh.x3 x3Var, TLObject tLObject, boolean z10, TLRPC.Document document, boolean z11, TLRPC.TL_error tL_error, TL_stars.saveStarGift savestargift) {
        this.e = x3Var;
        this.f38225c = tLObject;
        this.f38224b = z10;
        this.f38226f = document;
        this.d = z11;
        this.h = tL_error;
        this.f38227n = savestargift;
    }
}
