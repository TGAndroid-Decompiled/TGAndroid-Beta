package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class ub implements org.telegram.messenger.s10 {
    public final qc f52513a;
    public final int f52514b;
    public final View f52515c;

    public ub(qc qcVar, int i7, View view) {
        this.f52513a = qcVar;
        this.f52514b = i7;
        this.f52515c = view;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3) {
        boolean z10;
        Long l10 = (Long) obj;
        Integer num = (Integer) obj2;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj3;
        qc qcVar = this.f52513a;
        int i7 = qcVar.V;
        int i10 = this.f52514b;
        if (i10 == i7) {
            qcVar.f51222n = l10.longValue();
            qcVar.h1(true);
        } else if (i10 == qcVar.f51211d0) {
            qcVar.f51236x = l10.longValue();
            qcVar.i1();
        } else if (i10 == qcVar.f51216g0) {
            if (l10.longValue() == 0) {
                qcVar.E = null;
            } else if (tL_starGiftUnique != null) {
                TLRPC.TL_emojiStatusCollectible r02 = org.telegram.messenger.mp.r0(tL_starGiftUnique);
                if (num != null) {
                    r02.flags |= 1;
                    r02.until = num.intValue();
                }
                qcVar.E = r02;
                qcVar.f51229s = -1;
                qcVar.f51236x = 0L;
            } else {
                TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                tL_emojiStatus.document_id = l10.longValue();
                if (num != null) {
                    tL_emojiStatus.flags |= 1;
                    tL_emojiStatus.until = num.intValue();
                }
                qcVar.E = tL_emojiStatus;
            }
            qcVar.i1();
        }
        qcVar.e1(true);
        ec ecVar = (ec) this.f52515c;
        long longValue = l10.longValue();
        if (tL_starGiftUnique != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        ecVar.c(longValue, z10, true);
        qcVar.g1(true);
    }
}
