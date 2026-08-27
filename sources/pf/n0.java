package pf;

import java.util.ArrayList;
import java.util.Comparator;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

public final class n0 implements Comparator {

    public final ArrayList f45886a;

    public final ArrayList f45887b;

    public n0(ArrayList arrayList, ArrayList arrayList2) {
        this.f45886a = arrayList;
        this.f45887b = arrayList2;
    }

    public final int a(t0 t0Var) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f45886a;
            if (i11 >= arrayList.size()) {
                while (true) {
                    ArrayList arrayList2 = this.f45887b;
                    if (i10 >= Math.min(20, arrayList2.size())) {
                        return -1;
                    }
                    if (((TLRPC.Document) arrayList2.get(i10)).f22386id == t0Var.f45916a.f22386id) {
                        return (arrayList2.size() - i10) + 1000000;
                    }
                    i10++;
                }
            } else {
                if (((TLRPC.Document) arrayList.get(i11)).f22386id == t0Var.f45916a.f22386id) {
                    return i11 + 2000000;
                }
                i11++;
            }
        }
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        t0 t0Var = (t0) obj;
        t0 t0Var2 = (t0) obj2;
        boolean zIsAnimatedStickerDocument = MessageObject.isAnimatedStickerDocument(t0Var.f45916a, true);
        if (zIsAnimatedStickerDocument == MessageObject.isAnimatedStickerDocument(t0Var2.f45916a, true)) {
            int iA = a(t0Var);
            int iA2 = a(t0Var2);
            if (iA > iA2) {
                return -1;
            }
            if (iA >= iA2) {
                return 0;
            }
        } else if (zIsAnimatedStickerDocument) {
            return -1;
        }
        return 1;
    }
}
