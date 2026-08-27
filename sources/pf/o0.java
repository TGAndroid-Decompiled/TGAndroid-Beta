package pf;

import java.util.ArrayList;
import java.util.Comparator;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class o0 implements Comparator {

    public final a0.h f45892a;

    public final ArrayList f45893b;

    public o0(a0.h hVar, ArrayList arrayList) {
        this.f45892a = hVar;
        this.f45893b = arrayList;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        TLObject tLObject = (TLObject) obj;
        TLObject tLObject2 = (TLObject) obj2;
        long j10 = tLObject instanceof TLRPC.User ? ((TLRPC.User) tLObject).f22527id : -((TLRPC.Chat) tLObject).f22380id;
        long j11 = tLObject2 instanceof TLRPC.User ? ((TLRPC.User) tLObject2).f22527id : -((TLRPC.Chat) tLObject2).f22380id;
        a0.h hVar = this.f45892a;
        if (hVar.h(j10) >= 0 && hVar.h(j11) >= 0) {
            return 0;
        }
        if (hVar.h(j10) < 0) {
            if (hVar.h(j11) >= 0) {
                return 1;
            }
            Long lValueOf = Long.valueOf(j10);
            ArrayList arrayList = this.f45893b;
            int iIndexOf = arrayList.indexOf(lValueOf);
            int iIndexOf2 = arrayList.indexOf(Long.valueOf(j11));
            if (iIndexOf == -1 || iIndexOf2 == -1) {
                if (iIndexOf == -1 || iIndexOf2 != -1) {
                    return (iIndexOf != -1 || iIndexOf2 == -1) ? 0 : 1;
                }
            } else if (iIndexOf >= iIndexOf2) {
                return iIndexOf == iIndexOf2 ? 0 : 1;
            }
        }
        return -1;
    }
}
