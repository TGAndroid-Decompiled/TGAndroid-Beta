package uf;

import java.util.ArrayList;
import java.util.Comparator;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class n0 implements Comparator {
    public final ArrayList f48658a;
    public final ArrayList f48659b;

    public n0(ArrayList arrayList, ArrayList arrayList2) {
        this.f48658a = arrayList;
        this.f48659b = arrayList2;
    }

    public final int a(t0 t0Var) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f48658a;
            if (i11 >= arrayList.size()) {
                while (true) {
                    ArrayList arrayList2 = this.f48659b;
                    if (i10 < Math.min(20, arrayList2.size())) {
                        if (((TLRPC.Document) arrayList2.get(i10)).f20849id == t0Var.f48688a.f20849id) {
                            return (arrayList2.size() - i10) + 1000000;
                        }
                        i10++;
                    } else {
                        return -1;
                    }
                }
            } else if (((TLRPC.Document) arrayList.get(i11)).f20849id == t0Var.f48688a.f20849id) {
                return i11 + 2000000;
            } else {
                i11++;
            }
        }
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        t0 t0Var = (t0) obj;
        t0 t0Var2 = (t0) obj2;
        boolean isAnimatedStickerDocument = MessageObject.isAnimatedStickerDocument(t0Var.f48688a, true);
        if (isAnimatedStickerDocument == MessageObject.isAnimatedStickerDocument(t0Var2.f48688a, true)) {
            int a2 = a(t0Var);
            int a10 = a(t0Var2);
            if (a2 <= a10) {
                if (a2 >= a10) {
                    return 0;
                }
            } else {
                return -1;
            }
        } else if (isAnimatedStickerDocument) {
            return -1;
        }
        return 1;
    }
}
