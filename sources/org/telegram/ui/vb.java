package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class vb implements org.telegram.messenger.x10 {
    public final rc f50686a;
    public final int f50687b;
    public final View f50688c;

    public vb(rc rcVar, int i7, View view) {
        this.f50686a = rcVar;
        this.f50687b = i7;
        this.f50688c = view;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3) {
        boolean z9;
        Long l10 = (Long) obj;
        Integer num = (Integer) obj2;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj3;
        rc rcVar = this.f50686a;
        int i7 = rcVar.U;
        int i10 = this.f50687b;
        if (i10 == i7) {
            rcVar.f49464n = l10.longValue();
            rcVar.h1(true);
        } else if (i10 == rcVar.f49452c0) {
            rcVar.f49478x = l10.longValue();
            rcVar.i1();
        } else if (i10 == rcVar.f49457f0) {
            if (l10.longValue() == 0) {
                rcVar.D = null;
            } else if (tL_starGiftUnique != null) {
                TLRPC.TL_emojiStatusCollectible q02 = org.telegram.messenger.qp.q0(tL_starGiftUnique);
                if (num != null) {
                    q02.flags |= 1;
                    q02.until = num.intValue();
                }
                rcVar.D = q02;
                rcVar.f49471s = -1;
                rcVar.f49478x = 0L;
            } else {
                TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                tL_emojiStatus.document_id = l10.longValue();
                if (num != null) {
                    tL_emojiStatus.flags |= 1;
                    tL_emojiStatus.until = num.intValue();
                }
                rcVar.D = tL_emojiStatus;
            }
            rcVar.i1();
        }
        rcVar.e1(true);
        fc fcVar = (fc) this.f50688c;
        long longValue = l10.longValue();
        if (tL_starGiftUnique != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        fcVar.c(longValue, z9, true);
        rcVar.g1(true);
    }
}
