package org.telegram.ui;

import java.util.Comparator;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
public final class qs implements Comparator {
    public final int f49144a;
    public final Object f49145b;

    public qs(Object obj, int i7) {
        this.f49144a = i7;
        this.f49145b = obj;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f49144a) {
            case 0:
                return ((Comparator) this.f49145b).compare(((ps) obj).f48826a, ((ps) obj2).f48826a);
            case 1:
                LongSparseIntArray longSparseIntArray = (LongSparseIntArray) this.f49145b;
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
                org.telegram.messenger.fd fdVar = (org.telegram.messenger.fd) this.f49145b;
                org.telegram.messenger.fd fdVar2 = (org.telegram.messenger.fd) obj;
                org.telegram.messenger.fd fdVar3 = (org.telegram.messenger.fd) obj2;
                if (fdVar2 != fdVar) {
                    if (fdVar3 != fdVar) {
                        int i11 = fdVar2.f22408k;
                        int i12 = fdVar3.f22408k;
                        if (i11 == i12) {
                            return fdVar2.f22400a.compareTo(fdVar3.f22400a);
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
                StickersActivity stickersActivity = (StickersActivity) this.f49145b;
                int indexOf = stickersActivity.d.indexOf((TLRPC.TL_messages_stickerSet) obj);
                int indexOf2 = stickersActivity.d.indexOf((TLRPC.TL_messages_stickerSet) obj2);
                if (indexOf >= 0 && indexOf2 >= 0) {
                    return indexOf - indexOf2;
                }
                return 0;
        }
    }
}
