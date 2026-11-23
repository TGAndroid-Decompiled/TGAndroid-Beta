package org.telegram.ui;

import java.util.Comparator;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
public final class qs implements Comparator {
    public final int f51317a;
    public final Object f51318b;

    public qs(Object obj, int i7) {
        this.f51317a = i7;
        this.f51318b = obj;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f51317a) {
            case 0:
                return ((Comparator) this.f51318b).compare(((ps) obj).f50902a, ((ps) obj2).f50902a);
            case 1:
                LongSparseIntArray longSparseIntArray = (LongSparseIntArray) this.f51318b;
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
                org.telegram.messenger.dd ddVar = (org.telegram.messenger.dd) this.f51318b;
                org.telegram.messenger.dd ddVar2 = (org.telegram.messenger.dd) obj;
                org.telegram.messenger.dd ddVar3 = (org.telegram.messenger.dd) obj2;
                if (ddVar2 != ddVar) {
                    if (ddVar3 != ddVar) {
                        int i11 = ddVar2.f23501k;
                        int i12 = ddVar3.f23501k;
                        if (i11 == i12) {
                            return ddVar2.f23493a.compareTo(ddVar3.f23493a);
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
                StickersActivity stickersActivity = (StickersActivity) this.f51318b;
                int indexOf = stickersActivity.d.indexOf((TLRPC.TL_messages_stickerSet) obj);
                int indexOf2 = stickersActivity.d.indexOf((TLRPC.TL_messages_stickerSet) obj2);
                if (indexOf >= 0 && indexOf2 >= 0) {
                    return indexOf - indexOf2;
                }
                return 0;
        }
    }
}
