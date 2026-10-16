package org.telegram.ui;

import android.text.TextUtils;
import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class ze implements Runnable {
    public final int f42285a = 0;
    public final boolean f42286b;
    public final Object f42287c;
    public final boolean d;
    public final Object e;
    public final Object f42288f;
    public final Object h;
    public final Object f42289n;

    public ze(fo foVar, String str, CharacterStyle characterStyle, MessageObject messageObject, org.telegram.ui.Cells.u1 u1Var, boolean z10, boolean z11) {
        this.e = foVar;
        this.f42287c = str;
        this.f42288f = characterStyle;
        this.h = messageObject;
        this.f42289n = u1Var;
        this.f42286b = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f42285a) {
            case 0:
                fo foVar = (fo) this.e;
                String str = (String) this.f42287c;
                CharacterStyle characterStyle = (CharacterStyle) this.f42288f;
                MessageObject messageObject = (MessageObject) this.h;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f42289n;
                if (str.startsWith("video?")) {
                    foVar.X7(characterStyle, false, messageObject, u1Var);
                    return;
                } else if (this.f42286b && !this.d) {
                    foVar.getParentActivity();
                    pf.d.m(str);
                    return;
                } else {
                    foVar.O9(messageObject, false, false);
                    foVar.ea(characterStyle, str, false, u1Var, messageObject);
                    return;
                }
            case 1:
                xh.l lVar = (xh.l) this.e;
                Runnable runnable = (Runnable) this.f42288f;
                String str2 = (String) this.f42287c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.h;
                TLObject tLObject = (TLObject) this.f42289n;
                lVar.f48492w = false;
                lVar.f48495z = true;
                if (this.f42286b) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                }
                xh.l.k(lVar.f48487q, false, false);
                if (TextUtils.equals(str2, lVar.f48490t) && tL_error == null) {
                    lVar.f48495z = true;
                    lVar.g((TLRPC.TL_messages_chatInviteImporters) tLObject, str2, this.d, false);
                    return;
                }
                return;
            default:
                zh.r3.B0((zh.r3) this.e, (TLObject) this.f42287c, this.f42286b, (TLRPC.Document) this.f42288f, this.d, (TLRPC.TL_error) this.h, (TL_stars.saveStarGift) this.f42289n);
                return;
        }
    }

    public ze(xh.l lVar, boolean z10, Runnable runnable, String str, TLRPC.TL_error tL_error, TLObject tLObject, boolean z11) {
        this.e = lVar;
        this.f42286b = z10;
        this.f42288f = runnable;
        this.f42287c = str;
        this.h = tL_error;
        this.f42289n = tLObject;
        this.d = z11;
    }

    public ze(zh.r3 r3Var, TLObject tLObject, boolean z10, TLRPC.Document document, boolean z11, TLRPC.TL_error tL_error, TL_stars.saveStarGift savestargift) {
        this.e = r3Var;
        this.f42287c = tLObject;
        this.f42286b = z10;
        this.f42288f = document;
        this.d = z11;
        this.h = tL_error;
        this.f42289n = savestargift;
    }
}
