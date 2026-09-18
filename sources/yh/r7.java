package yh;

import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.x51;
public final class r7 implements Utilities.Callback2 {
    public final int f47959a;
    public final NotificationCenter.NotificationCenterDelegate f47960b;

    public r7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f47959a = i10;
        this.f47960b = notificationCenterDelegate;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f47959a;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f47960b;
        switch (i10) {
            case 0:
                s7 s7Var = (s7) notificationCenterDelegate;
                ArrayList arrayList = (ArrayList) obj;
                l61 l61Var = (l61) obj2;
                int i11 = s7Var.f48020c;
                int i12 = s7Var.d;
                long j3 = s7Var.f48021f;
                int i13 = 0;
                if (j3 != 0) {
                    o g10 = o.g(i11);
                    ArrayList arrayList2 = g10.k(j3).f47741a[i12];
                    int size = arrayList2.size();
                    while (i13 < size) {
                        Object obj3 = arrayList2.get(i13);
                        i13++;
                        int i14 = o7.f47823a;
                        x51 J = x51.J(o7.class);
                        J.G = (TL_stars.StarsTransaction) obj3;
                        J.f30253q = true;
                        arrayList.add(J);
                    }
                    if (!g10.k(j3).e[i12]) {
                        arrayList.add(x51.o(arrayList.size(), 7));
                        arrayList.add(x51.o(arrayList.size(), 7));
                        arrayList.add(x51.o(arrayList.size(), 7));
                        return;
                    }
                    return;
                }
                t5 y3 = t5.y(i11, s7Var.e);
                ArrayList arrayList3 = y3.f48055q[i12];
                int size2 = arrayList3.size();
                int i15 = 0;
                while (i15 < size2) {
                    Object obj4 = arrayList3.get(i15);
                    i15++;
                    int i16 = o7.f47823a;
                    x51 J2 = x51.J(o7.class);
                    J2.G = (TL_stars.StarsTransaction) obj4;
                    J2.f30253q = false;
                    arrayList.add(J2);
                }
                if (!y3.f48059u[i12]) {
                    arrayList.add(x51.o(arrayList.size(), 7));
                    arrayList.add(x51.o(arrayList.size(), 7));
                    arrayList.add(x51.o(arrayList.size(), 7));
                    return;
                }
                return;
            default:
                hg.e2.V((hg.e2) notificationCenterDelegate, (ArrayList) obj, (l61) obj2);
                return;
        }
    }
}
