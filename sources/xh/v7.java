package xh;

import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.v51;
public final class v7 implements Utilities.Callback2 {
    public final int f46200a;
    public final NotificationCenter.NotificationCenterDelegate f46201b;

    public v7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f46200a = i10;
        this.f46201b = notificationCenterDelegate;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f46200a;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f46201b;
        switch (i10) {
            case 0:
                w7 w7Var = (w7) notificationCenterDelegate;
                ArrayList arrayList = (ArrayList) obj;
                j61 j61Var = (j61) obj2;
                int i11 = w7Var.f46236c;
                int i12 = w7Var.d;
                long j3 = w7Var.f46237f;
                int i13 = 0;
                if (j3 != 0) {
                    p g10 = p.g(i11);
                    ArrayList arrayList2 = g10.k(j3).f45783a[i12];
                    int size = arrayList2.size();
                    while (i13 < size) {
                        Object obj3 = arrayList2.get(i13);
                        i13++;
                        int i14 = s7.f46039a;
                        v51 J = v51.J(s7.class);
                        J.G = (TL_stars.StarsTransaction) obj3;
                        J.f27834q = true;
                        arrayList.add(J);
                    }
                    if (!g10.k(j3).e[i12]) {
                        arrayList.add(v51.o(arrayList.size(), 7));
                        arrayList.add(v51.o(arrayList.size(), 7));
                        arrayList.add(v51.o(arrayList.size(), 7));
                        return;
                    }
                    return;
                }
                v5 y3 = v5.y(i11, w7Var.e);
                ArrayList arrayList3 = y3.f46189q[i12];
                int size2 = arrayList3.size();
                int i15 = 0;
                while (i15 < size2) {
                    Object obj4 = arrayList3.get(i15);
                    i15++;
                    int i16 = s7.f46039a;
                    v51 J2 = v51.J(s7.class);
                    J2.G = (TL_stars.StarsTransaction) obj4;
                    J2.f27834q = false;
                    arrayList.add(J2);
                }
                if (!y3.f46193u[i12]) {
                    arrayList.add(v51.o(arrayList.size(), 7));
                    arrayList.add(v51.o(arrayList.size(), 7));
                    arrayList.add(v51.o(arrayList.size(), 7));
                    return;
                }
                return;
            default:
                gg.n2.V((gg.n2) notificationCenterDelegate, (ArrayList) obj, (j61) obj2);
                return;
        }
    }
}
