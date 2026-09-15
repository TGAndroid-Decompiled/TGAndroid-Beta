package yh;

import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.w51;
public final class u7 implements Utilities.Callback2 {
    public final int f47874a;
    public final NotificationCenter.NotificationCenterDelegate f47875b;

    public u7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f47874a = i10;
        this.f47875b = notificationCenterDelegate;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f47874a;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f47875b;
        switch (i10) {
            case 0:
                v7 v7Var = (v7) notificationCenterDelegate;
                ArrayList arrayList = (ArrayList) obj;
                w51 w51Var = (w51) obj2;
                int i11 = v7Var.f47921c;
                int i12 = v7Var.d;
                long j3 = v7Var.f47922f;
                int i13 = 0;
                if (j3 != 0) {
                    o g10 = o.g(i11);
                    ArrayList arrayList2 = g10.k(j3).f47477a[i12];
                    int size = arrayList2.size();
                    while (i13 < size) {
                        Object obj3 = arrayList2.get(i13);
                        i13++;
                        int i14 = r7.f47733a;
                        i51 J = i51.J(r7.class);
                        J.G = (TL_stars.StarsTransaction) obj3;
                        J.f24899q = true;
                        arrayList.add(J);
                    }
                    if (!g10.k(j3).e[i12]) {
                        arrayList.add(i51.o(arrayList.size(), 7));
                        arrayList.add(i51.o(arrayList.size(), 7));
                        arrayList.add(i51.o(arrayList.size(), 7));
                        return;
                    }
                    return;
                }
                v5 y3 = v5.y(i11, v7Var.e);
                ArrayList arrayList3 = y3.f47908q[i12];
                int size2 = arrayList3.size();
                int i15 = 0;
                while (i15 < size2) {
                    Object obj4 = arrayList3.get(i15);
                    i15++;
                    int i16 = r7.f47733a;
                    i51 J2 = i51.J(r7.class);
                    J2.G = (TL_stars.StarsTransaction) obj4;
                    J2.f24899q = false;
                    arrayList.add(J2);
                }
                if (!y3.f47912u[i12]) {
                    arrayList.add(i51.o(arrayList.size(), 7));
                    arrayList.add(i51.o(arrayList.size(), 7));
                    arrayList.add(i51.o(arrayList.size(), 7));
                    return;
                }
                return;
            default:
                hg.e2.V((hg.e2) notificationCenterDelegate, (ArrayList) obj, (w51) obj2);
                return;
        }
    }
}
