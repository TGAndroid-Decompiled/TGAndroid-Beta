package org.telegram.ui;

import android.text.TextUtils;
import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class ze implements Runnable {
    public final int f42599a = 0;
    public final boolean f42600b;
    public final Object f42601c;
    public final boolean d;
    public final Object e;
    public final Object f42602f;
    public final Object h;
    public final Object f42603n;

    public ze(fo foVar, String str, CharacterStyle characterStyle, MessageObject messageObject, org.telegram.ui.Cells.u1 u1Var, boolean z10, boolean z11) {
        this.e = foVar;
        this.f42601c = str;
        this.f42602f = characterStyle;
        this.h = messageObject;
        this.f42603n = u1Var;
        this.f42600b = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f42599a) {
            case 0:
                fo foVar = (fo) this.e;
                String str = (String) this.f42601c;
                CharacterStyle characterStyle = (CharacterStyle) this.f42602f;
                MessageObject messageObject = (MessageObject) this.h;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f42603n;
                if (str.startsWith("video?")) {
                    foVar.X7(characterStyle, false, messageObject, u1Var);
                    return;
                } else if (this.f42600b && !this.d) {
                    foVar.getParentActivity();
                    pf.d.n(str);
                    return;
                } else {
                    foVar.O9(messageObject, false, false);
                    foVar.ea(characterStyle, str, false, u1Var, messageObject);
                    return;
                }
            case 1:
                xh.l lVar = (xh.l) this.e;
                Runnable runnable = (Runnable) this.f42602f;
                String str2 = (String) this.f42601c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.h;
                TLObject tLObject = (TLObject) this.f42603n;
                lVar.f48493w = false;
                lVar.f48496z = true;
                if (this.f42600b) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                }
                xh.l.k(lVar.f48488q, false, false);
                if (TextUtils.equals(str2, lVar.f48491t) && tL_error == null) {
                    lVar.f48496z = true;
                    lVar.g((TLRPC.TL_messages_chatInviteImporters) tLObject, str2, this.d, false);
                    return;
                }
                return;
            default:
                zh.r3.B0((zh.r3) this.e, (TLObject) this.f42601c, this.f42600b, (TLRPC.Document) this.f42602f, this.d, (TLRPC.TL_error) this.h, (TL_stars.saveStarGift) this.f42603n);
                return;
        }
    }

    public ze(xh.l lVar, boolean z10, Runnable runnable, String str, TLRPC.TL_error tL_error, TLObject tLObject, boolean z11) {
        this.e = lVar;
        this.f42600b = z10;
        this.f42602f = runnable;
        this.f42601c = str;
        this.h = tL_error;
        this.f42603n = tLObject;
        this.d = z11;
    }

    public ze(zh.r3 r3Var, TLObject tLObject, boolean z10, TLRPC.Document document, boolean z11, TLRPC.TL_error tL_error, TL_stars.saveStarGift savestargift) {
        this.e = r3Var;
        this.f42601c = tLObject;
        this.f42600b = z10;
        this.f42602f = document;
        this.d = z11;
        this.h = tL_error;
        this.f42603n = savestargift;
    }
}
