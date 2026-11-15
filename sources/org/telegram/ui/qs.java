package org.telegram.ui;

import java.util.Comparator;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
public final class qs implements Comparator {
    public final int f50786a;
    public final Object f50787b;

    public qs(Object obj, int i7) {
        this.f50786a = i7;
        this.f50787b = obj;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f50786a) {
            case 0:
                return ((Comparator) this.f50787b).compare(((ps) obj).f50358a, ((ps) obj2).f50358a);
            case 1:
                LongSparseIntArray longSparseIntArray = (LongSparseIntArray) this.f50787b;
                int i7 = longSparseIntArray.get(((Long) obj).longValue());
                int i10 = longSparseIntArray.get(((Long) obj2).longValue());
                if (i7 > i10) {
                    return 1;
                }
                if (i7 < i10) {
                    return -1;
                }
                return 0;
            case 2:
                org.telegram.messenger.dd ddVar = (org.telegram.messenger.dd) this.f50787b;
                org.telegram.messenger.dd ddVar2 = (org.telegram.messenger.dd) obj;
                org.telegram.messenger.dd ddVar3 = (org.telegram.messenger.dd) obj2;
                if (ddVar2 != ddVar) {
                    if (ddVar3 != ddVar) {
                        int i11 = ddVar2.f23066k;
                        int i12 = ddVar3.f23066k;
                        if (i11 == i12) {
                            return ddVar2.f23058a.compareTo(ddVar3.f23058a);
                        }
                        if (i11 <= i12) {
                            if (i11 >= i12) {
                                return 0;
                            }
                        }
                    }
                    return 1;
                }
                return -1;
            default:
                StickersActivity stickersActivity = (StickersActivity) this.f50787b;
                int indexOf = stickersActivity.d.indexOf((TLRPC.TL_messages_stickerSet) obj);
                int indexOf2 = stickersActivity.d.indexOf((TLRPC.TL_messages_stickerSet) obj2);
                if (indexOf >= 0 && indexOf2 >= 0) {
                    return indexOf - indexOf2;
                }
                return 0;
        }
    }
}
