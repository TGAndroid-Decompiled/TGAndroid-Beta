package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class yb implements Utilities.Callback3 {
    public final vc f44826a;
    public final int f44827b;
    public final View f44828c;

    public yb(vc vcVar, int i10, View view) {
        this.f44826a = vcVar;
        this.f44827b = i10;
        this.f44828c = view;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3) {
        boolean z10;
        Long l10 = (Long) obj;
        Integer num = (Integer) obj2;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj3;
        vc vcVar = this.f44826a;
        int i10 = vcVar.Q;
        int i11 = this.f44827b;
        if (i11 == i10) {
            vcVar.f43519n = l10.longValue();
            vcVar.a1(true);
        } else if (i11 == vcVar.Y) {
            vcVar.f43530w = l10.longValue();
            vcVar.b1();
        } else if (i11 == vcVar.f43505b0) {
            if (l10.longValue() == 0) {
                vcVar.f43532y = null;
            } else if (tL_starGiftUnique != null) {
                TLRPC.TL_emojiStatusCollectible emojiStatusCollectibleFromGift = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
                if (num != null) {
                    emojiStatusCollectibleFromGift.flags |= 1;
                    emojiStatusCollectibleFromGift.until = num.intValue();
                }
                vcVar.f43532y = emojiStatusCollectibleFromGift;
                vcVar.f43526s = -1;
                vcVar.f43530w = 0L;
            } else {
                TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                tL_emojiStatus.document_id = l10.longValue();
                if (num != null) {
                    tL_emojiStatus.flags |= 1;
                    tL_emojiStatus.until = num.intValue();
                }
                vcVar.f43532y = tL_emojiStatus;
            }
            vcVar.b1();
        }
        vcVar.X0(true);
        ic icVar = (ic) this.f44828c;
        long longValue = l10.longValue();
        if (tL_starGiftUnique != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        icVar.c(longValue, z10, true);
        vcVar.Z0(true);
    }
}
