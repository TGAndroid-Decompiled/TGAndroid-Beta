package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class zb implements Utilities.Callback3 {
    public final xc f45100a;
    public final int f45101b;
    public final View f45102c;

    public zb(xc xcVar, int i9, View view) {
        this.f45100a = xcVar;
        this.f45101b = i9;
        this.f45102c = view;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3) {
        boolean z10;
        Long l10 = (Long) obj;
        Integer num = (Integer) obj2;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj3;
        xc xcVar = this.f45100a;
        int i9 = xcVar.Q;
        int i10 = this.f45101b;
        if (i10 == i9) {
            xcVar.f44477n = l10.longValue();
            xcVar.a1(true);
        } else if (i10 == xcVar.Y) {
            xcVar.f44488w = l10.longValue();
            xcVar.b1();
        } else if (i10 == xcVar.f44463b0) {
            if (l10.longValue() == 0) {
                xcVar.f44490y = null;
            } else if (tL_starGiftUnique != null) {
                TLRPC.TL_emojiStatusCollectible emojiStatusCollectibleFromGift = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
                if (num != null) {
                    emojiStatusCollectibleFromGift.flags |= 1;
                    emojiStatusCollectibleFromGift.until = num.intValue();
                }
                xcVar.f44490y = emojiStatusCollectibleFromGift;
                xcVar.f44484s = -1;
                xcVar.f44488w = 0L;
            } else {
                TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                tL_emojiStatus.document_id = l10.longValue();
                if (num != null) {
                    tL_emojiStatus.flags |= 1;
                    tL_emojiStatus.until = num.intValue();
                }
                xcVar.f44490y = tL_emojiStatus;
            }
            xcVar.b1();
        }
        xcVar.X0(true);
        jc jcVar = (jc) this.f45102c;
        long longValue = l10.longValue();
        if (tL_starGiftUnique != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        jcVar.c(longValue, z10, true);
        xcVar.Z0(true);
    }
}
