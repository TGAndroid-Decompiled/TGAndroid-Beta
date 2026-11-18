package org.telegram.ui;

import java.util.Comparator;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
public final class qs implements Comparator {
    public final int f51291a;
    public final Object f51292b;

    public qs(Object obj, int i7) {
        this.f51291a = i7;
        this.f51292b = obj;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f51291a) {
            case 0:
                return ((Comparator) this.f51292b).compare(((ps) obj).f50920a, ((ps) obj2).f50920a);
            case 1:
                LongSparseIntArray longSparseIntArray = (LongSparseIntArray) this.f51292b;
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
                org.telegram.messenger.cd cdVar = (org.telegram.messenger.cd) this.f51292b;
                org.telegram.messenger.cd cdVar2 = (org.telegram.messenger.cd) obj;
                org.telegram.messenger.cd cdVar3 = (org.telegram.messenger.cd) obj2;
                if (cdVar2 != cdVar) {
                    if (cdVar3 != cdVar) {
                        int i11 = cdVar2.f23336k;
                        int i12 = cdVar3.f23336k;
                        if (i11 == i12) {
                            return cdVar2.f23328a.compareTo(cdVar3.f23328a);
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
                StickersActivity stickersActivity = (StickersActivity) this.f51292b;
                int indexOf = stickersActivity.d.indexOf((TLRPC.TL_messages_stickerSet) obj);
                int indexOf2 = stickersActivity.d.indexOf((TLRPC.TL_messages_stickerSet) obj2);
                if (indexOf >= 0 && indexOf2 >= 0) {
                    return indexOf - indexOf2;
                }
                return 0;
        }
    }
}
