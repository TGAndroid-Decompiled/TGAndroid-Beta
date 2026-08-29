package rf;

import java.util.ArrayList;
import java.util.Comparator;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class o0 implements Comparator {
    public final ArrayList f47327a;
    public final ArrayList f47328b;

    public o0(ArrayList arrayList, ArrayList arrayList2) {
        this.f47327a = arrayList;
        this.f47328b = arrayList2;
    }

    public final int a(u0 u0Var) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f47327a;
            if (i11 >= arrayList.size()) {
                while (true) {
                    ArrayList arrayList2 = this.f47328b;
                    if (i10 < Math.min(20, arrayList2.size())) {
                        if (((TLRPC.Document) arrayList2.get(i10)).f22398id == u0Var.f47357a.f22398id) {
                            return (arrayList2.size() - i10) + 1000000;
                        }
                        i10++;
                    } else {
                        return -1;
                    }
                }
            } else if (((TLRPC.Document) arrayList.get(i11)).f22398id == u0Var.f47357a.f22398id) {
                return i11 + 2000000;
            } else {
                i11++;
            }
        }
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        u0 u0Var = (u0) obj;
        u0 u0Var2 = (u0) obj2;
        boolean isAnimatedStickerDocument = MessageObject.isAnimatedStickerDocument(u0Var.f47357a, true);
        if (isAnimatedStickerDocument == MessageObject.isAnimatedStickerDocument(u0Var2.f47357a, true)) {
            int a2 = a(u0Var);
            int a10 = a(u0Var2);
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
