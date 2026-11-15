package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class ub implements org.telegram.messenger.u10 {
    public final qc f51897a;
    public final int f51898b;
    public final View f51899c;

    public ub(qc qcVar, int i7, View view) {
        this.f51897a = qcVar;
        this.f51898b = i7;
        this.f51899c = view;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3) {
        boolean z10;
        Long l10 = (Long) obj;
        Integer num = (Integer) obj2;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj3;
        qc qcVar = this.f51897a;
        int i7 = qcVar.V;
        int i10 = this.f51898b;
        if (i10 == i7) {
            qcVar.f50569n = l10.longValue();
            qcVar.h1(true);
        } else if (i10 == qcVar.f50558d0) {
            qcVar.f50583x = l10.longValue();
            qcVar.i1();
        } else if (i10 == qcVar.f50563g0) {
            if (l10.longValue() == 0) {
                qcVar.E = null;
            } else if (tL_starGiftUnique != null) {
                TLRPC.TL_emojiStatusCollectible q02 = org.telegram.messenger.np.q0(tL_starGiftUnique);
                if (num != null) {
                    q02.flags |= 1;
                    q02.until = num.intValue();
                }
                qcVar.E = q02;
                qcVar.f50576s = -1;
                qcVar.f50583x = 0L;
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
        ec ecVar = (ec) this.f51899c;
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
