package org.telegram.ui;

import android.text.TextUtils;
import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class xe implements Runnable {
    public final int f43906a = 0;
    public final boolean f43907b;
    public final Object f43908c;
    public final boolean d;
    public final Object f43909e;
    public final Object f43910f;
    public final Object h;
    public final Object f43911n;

    public xe(eo eoVar, String str, CharacterStyle characterStyle, MessageObject messageObject, org.telegram.ui.Cells.u1 u1Var, boolean z10, boolean z11) {
        this.f43909e = eoVar;
        this.f43908c = str;
        this.f43910f = characterStyle;
        this.h = messageObject;
        this.f43911n = u1Var;
        this.f43907b = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f43906a) {
            case 0:
                eo eoVar = (eo) this.f43909e;
                String str = (String) this.f43908c;
                CharacterStyle characterStyle = (CharacterStyle) this.f43910f;
                MessageObject messageObject = (MessageObject) this.h;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f43911n;
                if (str.startsWith("video?")) {
                    eoVar.X7(characterStyle, false, messageObject, u1Var);
                    return;
                } else if (this.f43907b && !this.d) {
                    eoVar.getParentActivity();
                    of.f.n(str);
                    return;
                } else {
                    eoVar.O9(messageObject, false, false);
                    eoVar.ea(characterStyle, str, false, u1Var, messageObject);
                    return;
                }
            case 1:
                wh.l lVar = (wh.l) this.f43909e;
                Runnable runnable = (Runnable) this.f43910f;
                String str2 = (String) this.f43908c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.h;
                TLObject tLObject = (TLObject) this.f43911n;
                lVar.f50684w = false;
                lVar.f50687z = true;
                if (this.f43907b) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                }
                wh.l.k(lVar.f50679q, false, false);
                if (TextUtils.equals(str2, lVar.f50682t) && tL_error == null) {
                    lVar.f50687z = true;
                    lVar.g((TLRPC.TL_messages_chatInviteImporters) tLObject, str2, this.d, false);
                    return;
                }
                return;
            default:
                yh.s3.B0((yh.s3) this.f43909e, (TLObject) this.f43908c, this.f43907b, (TLRPC.Document) this.f43910f, this.d, (TLRPC.TL_error) this.h, (TL_stars.saveStarGift) this.f43911n);
                return;
        }
    }

    public xe(wh.l lVar, boolean z10, Runnable runnable, String str, TLRPC.TL_error tL_error, TLObject tLObject, boolean z11) {
        this.f43909e = lVar;
        this.f43907b = z10;
        this.f43910f = runnable;
        this.f43908c = str;
        this.h = tL_error;
        this.f43911n = tLObject;
        this.d = z11;
    }

    public xe(yh.s3 s3Var, TLObject tLObject, boolean z10, TLRPC.Document document, boolean z11, TLRPC.TL_error tL_error, TL_stars.saveStarGift savestargift) {
        this.f43909e = s3Var;
        this.f43908c = tLObject;
        this.f43907b = z10;
        this.f43910f = document;
        this.d = z11;
        this.h = tL_error;
        this.f43911n = savestargift;
    }
}
