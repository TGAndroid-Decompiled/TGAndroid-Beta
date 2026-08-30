package org.telegram.ui;

import java.util.Comparator;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
public final class tt implements Comparator {
    public final int f38736a;
    public final Object f38737b;

    public tt(Object obj, int i10) {
        this.f38736a = i10;
        this.f38737b = obj;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f38736a) {
            case 0:
                return ((Comparator) this.f38737b).compare(((st) obj).f38435a, ((st) obj2).f38435a);
            case 1:
                LongSparseIntArray longSparseIntArray = (LongSparseIntArray) this.f38737b;
                int i10 = longSparseIntArray.get(((Long) obj).longValue());
                int i11 = longSparseIntArray.get(((Long) obj2).longValue());
                if (i10 > i11) {
                    return 1;
                }
                if (i10 < i11) {
                    return -1;
                }
                return 0;
            case 2:
                LocaleController.LocaleInfo localeInfo = (LocaleController.LocaleInfo) this.f38737b;
                LocaleController.LocaleInfo localeInfo2 = (LocaleController.LocaleInfo) obj;
                LocaleController.LocaleInfo localeInfo3 = (LocaleController.LocaleInfo) obj2;
                if (localeInfo2 != localeInfo) {
                    if (localeInfo3 != localeInfo) {
                        int i12 = localeInfo2.serverIndex;
                        int i13 = localeInfo3.serverIndex;
                        if (i12 == i13) {
                            return localeInfo2.name.compareTo(localeInfo3.name);
                        }
                        if (i12 <= i13) {
                            if (i12 >= i13) {
                                return 0;
                            }
                        }
                    }
                    return 1;
                }
                return -1;
            default:
                StickersActivity stickersActivity = (StickersActivity) this.f38737b;
                int indexOf = stickersActivity.e.indexOf((TLRPC.TL_messages_stickerSet) obj);
                int indexOf2 = stickersActivity.e.indexOf((TLRPC.TL_messages_stickerSet) obj2);
                if (indexOf >= 0 && indexOf2 >= 0) {
                    return indexOf - indexOf2;
                }
                return 0;
        }
    }
}
