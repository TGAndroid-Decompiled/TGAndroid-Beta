package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class tb implements org.telegram.messenger.p10 {
    public final pc f49762a;
    public final int f49763b;
    public final View f49764c;

    public tb(pc pcVar, int i3, View view) {
        this.f49762a = pcVar;
        this.f49763b = i3;
        this.f49764c = view;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3) {
        boolean z10;
        Long l10 = (Long) obj;
        Integer num = (Integer) obj2;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj3;
        pc pcVar = this.f49762a;
        int i3 = pcVar.V;
        int i10 = this.f49763b;
        if (i10 == i3) {
            pcVar.f48527n = l10.longValue();
            pcVar.h1(true);
        } else if (i10 == pcVar.f48516d0) {
            pcVar.f48541x = l10.longValue();
            pcVar.i1();
        } else if (i10 == pcVar.f48521g0) {
            if (l10.longValue() == 0) {
                pcVar.E = null;
            } else if (tL_starGiftUnique != null) {
                TLRPC.TL_emojiStatusCollectible q02 = org.telegram.messenger.hp.q0(tL_starGiftUnique);
                if (num != null) {
                    q02.flags |= 1;
                    q02.until = num.intValue();
                }
                pcVar.E = q02;
                pcVar.f48534s = -1;
                pcVar.f48541x = 0L;
            } else {
                TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                tL_emojiStatus.document_id = l10.longValue();
                if (num != null) {
                    tL_emojiStatus.flags |= 1;
                    tL_emojiStatus.until = num.intValue();
                }
                pcVar.E = tL_emojiStatus;
            }
            pcVar.i1();
        }
        pcVar.e1(true);
        dc dcVar = (dc) this.f49764c;
        long longValue = l10.longValue();
        if (tL_starGiftUnique != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        dcVar.c(longValue, z10, true);
        pcVar.g1(true);
    }
}
