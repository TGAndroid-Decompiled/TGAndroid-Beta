package vg;

import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public final class i1 implements Comparator {
    public final int f56676a;

    public i1(int i3) {
        this.f56676a = i3;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        g9.q1 a10;
        switch (this.f56676a) {
            case 0:
                return (int) ((((l1) obj).f56702a * 100.0f) - (((l1) obj2).f56702a * 100.0f));
            case 1:
                return ((String) obj).compareTo((String) obj2);
            case 2:
                return ((d2.v) obj2).f8480j - ((d2.v) obj).f8480j;
            case 3:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                if (num.intValue() == -1) {
                    if (num2.intValue() != -1) {
                        return -1;
                    }
                    return 0;
                } else if (num2.intValue() == -1) {
                    return 1;
                } else {
                    return num.intValue() - num2.intValue();
                }
            case 4:
                return Integer.compare(((z2.f) ((List) obj).get(0)).f59603f, ((z2.f) ((List) obj2).get(0)).f59603f);
            case 5:
                List list = (List) obj;
                List list2 = (List) obj2;
                return g9.u.f(z2.m.c((z2.m) Collections.max(list, new i1(8)), (z2.m) Collections.max(list2, new i1(8)))).a(list.size(), list2.size()).b((z2.m) Collections.max(list, new i1(9)), (z2.m) Collections.max(list2, new i1(9)), new i1(9)).e();
            case 6:
                return ((z2.e) Collections.max((List) obj)).compareTo((z2.e) Collections.max((List) obj2));
            case 7:
                return ((z2.j) ((List) obj).get(0)).compareTo((z2.j) ((List) obj2).get(0));
            case 8:
                return z2.m.c((z2.m) obj, (z2.m) obj2);
            case 9:
                z2.m mVar = (z2.m) obj;
                z2.m mVar2 = (z2.m) obj2;
                boolean z10 = mVar.f59621e;
                int i3 = mVar.f59625s;
                if (z10 && mVar.f59623n) {
                    a10 = z2.n.f59629l;
                } else {
                    a10 = z2.n.f59629l.a();
                }
                boolean z11 = mVar.f59622f.F;
                g9.w wVar = g9.w.f12160a;
                if (z11) {
                    wVar = wVar.b(Integer.valueOf(i3), Integer.valueOf(mVar2.f59625s), z2.n.f59629l.a());
                }
                g9.w b10 = wVar.c(mVar.P, mVar2.P).b(Integer.valueOf(mVar.f59626w), Integer.valueOf(mVar2.f59626w), a10);
                if (mVar.L && mVar.N) {
                    b10 = b10.a(mVar.O, mVar2.O);
                }
                return b10.c(mVar.M, mVar2.M).b(Integer.valueOf(i3), Integer.valueOf(mVar2.f59625s), a10).e();
            case 10:
                return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
            default:
                return ((ca.h0) ((ca.v1) obj)).f4394a.compareTo(((ca.h0) ((ca.v1) obj2)).f4394a);
        }
    }
}
