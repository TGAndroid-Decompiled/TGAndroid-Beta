package r3;

import b4.a0;
import b4.f0;
import h5.c0;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.ui.al0;
import q5.g0;
import s8.i0;
public final class i {
    public static final int[] f43224b = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14};
    public static final g0 f43225c = new g0(new al0(24));
    public static final g0 d = new g0(new al0(25));
    public i0 f43226a;

    public final void a(int i10, ArrayList arrayList) {
        switch (i10) {
            case 0:
                arrayList.add(new b4.a());
                return;
            case 1:
                arrayList.add(new b4.c());
                return;
            case 2:
                arrayList.add(new b4.d(1));
                return;
            case 3:
                arrayList.add(new s3.a(1));
                return;
            case 4:
                k K = f43225c.K(0);
                if (K != null) {
                    arrayList.add(K);
                    return;
                } else {
                    arrayList.add(new u3.a());
                    return;
                }
            case 5:
                arrayList.add(new v3.b());
                return;
            case 6:
                arrayList.add(new x3.d(0));
                return;
            case 7:
                arrayList.add(new y3.d(1));
                return;
            case 8:
                arrayList.add(new z3.i(0, null, Collections.EMPTY_LIST, null));
                arrayList.add(new z3.m(0));
                return;
            case 9:
                arrayList.add(new Object());
                return;
            case 10:
                arrayList.add(new a0());
                return;
            case 11:
                if (this.f43226a == null) {
                    s8.t tVar = s8.v.f44157b;
                    this.f43226a = i0.e;
                }
                arrayList.add(new f0(1, new c0(0L), new b4.f(0, this.f43226a)));
                return;
            case 12:
                ?? obj = new Object();
                obj.f2069c = 0;
                obj.d = -1L;
                obj.f2070f = -1;
                obj.f2071g = -1L;
                arrayList.add(obj);
                return;
            case 13:
            default:
                return;
            case 14:
                arrayList.add(new w3.a());
                return;
            case 15:
                k K2 = d.K(new Object[0]);
                if (K2 != null) {
                    arrayList.add(K2);
                    return;
                }
                return;
            case 16:
                arrayList.add(new t3.b());
                return;
        }
    }
}
