package yh;

import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.w51;
public final class s7 implements Utilities.Callback2 {
    public final int f48051a;
    public final NotificationCenter.NotificationCenterDelegate f48052b;

    public s7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f48051a = i10;
        this.f48052b = notificationCenterDelegate;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f48051a;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f48052b;
        switch (i10) {
            case 0:
                t7 t7Var = (t7) notificationCenterDelegate;
                ArrayList arrayList = (ArrayList) obj;
                k61 k61Var = (k61) obj2;
                int i11 = t7Var.f48087c;
                int i12 = t7Var.d;
                long j3 = t7Var.f48088f;
                int i13 = 0;
                if (j3 != 0) {
                    o g10 = o.g(i11);
                    ArrayList arrayList2 = g10.k(j3).f47785a[i12];
                    int size = arrayList2.size();
                    while (i13 < size) {
                        Object obj3 = arrayList2.get(i13);
                        i13++;
                        int i14 = p7.f47919a;
                        w51 J = w51.J(p7.class);
                        J.G = (TL_stars.StarsTransaction) obj3;
                        J.f29953q = true;
                        arrayList.add(J);
                    }
                    if (!g10.k(j3).e[i12]) {
                        arrayList.add(w51.o(arrayList.size(), 7));
                        arrayList.add(w51.o(arrayList.size(), 7));
                        arrayList.add(w51.o(arrayList.size(), 7));
                        return;
                    }
                    return;
                }
                u5 y3 = u5.y(i11, t7Var.e);
                ArrayList arrayList3 = y3.f48124q[i12];
                int size2 = arrayList3.size();
                int i15 = 0;
                while (i15 < size2) {
                    Object obj4 = arrayList3.get(i15);
                    i15++;
                    int i16 = p7.f47919a;
                    w51 J2 = w51.J(p7.class);
                    J2.G = (TL_stars.StarsTransaction) obj4;
                    J2.f29953q = false;
                    arrayList.add(J2);
                }
                if (!y3.f48128u[i12]) {
                    arrayList.add(w51.o(arrayList.size(), 7));
                    arrayList.add(w51.o(arrayList.size(), 7));
                    arrayList.add(w51.o(arrayList.size(), 7));
                    return;
                }
                return;
            default:
                hg.e2.V((hg.e2) notificationCenterDelegate, (ArrayList) obj, (k61) obj2);
                return;
        }
    }
}
