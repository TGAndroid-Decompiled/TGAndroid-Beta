package yh;

import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.x51;
public final class u7 implements Utilities.Callback2 {
    public final int f47902a;
    public final NotificationCenter.NotificationCenterDelegate f47903b;

    public u7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f47902a = i10;
        this.f47903b = notificationCenterDelegate;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f47902a;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f47903b;
        switch (i10) {
            case 0:
                v7 v7Var = (v7) notificationCenterDelegate;
                ArrayList arrayList = (ArrayList) obj;
                x51 x51Var = (x51) obj2;
                int i11 = v7Var.f47949c;
                int i12 = v7Var.d;
                long j3 = v7Var.f47950f;
                int i13 = 0;
                if (j3 != 0) {
                    o g10 = o.g(i11);
                    ArrayList arrayList2 = g10.k(j3).f47505a[i12];
                    int size = arrayList2.size();
                    while (i13 < size) {
                        Object obj3 = arrayList2.get(i13);
                        i13++;
                        int i14 = r7.f47761a;
                        j51 J = j51.J(r7.class);
                        J.G = (TL_stars.StarsTransaction) obj3;
                        J.f25132q = true;
                        arrayList.add(J);
                    }
                    if (!g10.k(j3).e[i12]) {
                        arrayList.add(j51.o(arrayList.size(), 7));
                        arrayList.add(j51.o(arrayList.size(), 7));
                        arrayList.add(j51.o(arrayList.size(), 7));
                        return;
                    }
                    return;
                }
                v5 y3 = v5.y(i11, v7Var.e);
                ArrayList arrayList3 = y3.f47936q[i12];
                int size2 = arrayList3.size();
                int i15 = 0;
                while (i15 < size2) {
                    Object obj4 = arrayList3.get(i15);
                    i15++;
                    int i16 = r7.f47761a;
                    j51 J2 = j51.J(r7.class);
                    J2.G = (TL_stars.StarsTransaction) obj4;
                    J2.f25132q = false;
                    arrayList.add(J2);
                }
                if (!y3.f47940u[i12]) {
                    arrayList.add(j51.o(arrayList.size(), 7));
                    arrayList.add(j51.o(arrayList.size(), 7));
                    arrayList.add(j51.o(arrayList.size(), 7));
                    return;
                }
                return;
            default:
                hg.e2.V((hg.e2) notificationCenterDelegate, (ArrayList) obj, (x51) obj2);
                return;
        }
    }
}
