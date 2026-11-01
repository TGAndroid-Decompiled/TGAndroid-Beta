package x2;

import e9.b0;
import e9.v1;
import e9.z;
import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.telegram.tgnet.TLRPC;
import z9.d0;
import z9.h1;
import zf.k1;
import zf.y;
public final class e implements Comparator {
    public final int f52927a;

    public e(int i10) {
        this.f52927a = i10;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        v1 a2;
        switch (this.f52927a) {
            case 0:
                List list = (List) obj;
                List list2 = (List) obj2;
                return z.f(n.c((n) Collections.max(list, new e(3)), (n) Collections.max(list2, new e(3)))).a(list.size(), list2.size()).b((n) Collections.max(list, new e(4)), (n) Collections.max(list2, new e(4)), new e(4)).e();
            case 1:
                return ((f) Collections.max((List) obj)).compareTo((f) Collections.max((List) obj2));
            case 2:
                return ((k) ((List) obj).get(0)).compareTo((k) ((List) obj2).get(0));
            case 3:
                return n.c((n) obj, (n) obj2);
            case 4:
                n nVar = (n) obj;
                n nVar2 = (n) obj2;
                boolean z10 = nVar.e;
                int i10 = nVar.f52955s;
                if (z10 && nVar.f52953n) {
                    a2 = o.f52959l;
                } else {
                    a2 = o.f52959l.a();
                }
                boolean z11 = nVar.f52952f.F;
                b0 b0Var = b0.f6331a;
                if (z11) {
                    b0Var = b0Var.b(Integer.valueOf(i10), Integer.valueOf(nVar2.f52955s), o.f52959l.a());
                }
                b0 b10 = b0Var.c(nVar.O, nVar2.O).b(Integer.valueOf(nVar.f52956w), Integer.valueOf(nVar2.f52956w), a2);
                if (nVar.K && nVar.M) {
                    b10 = b10.a(nVar.N, nVar2.N);
                }
                return b10.c(nVar.L, nVar2.L).b(Integer.valueOf(i10), Integer.valueOf(nVar2.f52955s), a2).e();
            case 5:
                return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
            case 6:
                return ((d0) ((h1) obj)).f55277a.compareTo(((d0) ((h1) obj2)).f55277a);
            case 7:
                return ((y2.p) obj).f54192a - ((y2.p) obj2).f54192a;
            case 8:
                return Float.compare(((y2.p) obj).f54194c, ((y2.p) obj2).f54194c);
            case 9:
                int i11 = ((y) obj).f55697b;
                int i12 = ((y) obj2).f55697b;
                if (i11 < i12) {
                    return 1;
                }
                if (i11 > i12) {
                    return -1;
                }
                return 0;
            case 10:
                return Double.compare(((TLRPC.TL_topPeer) obj2).rating, ((TLRPC.TL_topPeer) obj).rating);
            default:
                int i13 = ((k1) obj).f55575b;
                int i14 = ((k1) obj2).f55575b;
                if (i13 < i14) {
                    return 1;
                }
                if (i13 > i14) {
                    return -1;
                }
                return 0;
        }
    }
}
