package yh;

import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.u61;
public final class t7 implements Utilities.Callback2 {
    public final int f52042a;
    public final NotificationCenter.NotificationCenterDelegate f52043b;

    public t7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f52042a = i10;
        this.f52043b = notificationCenterDelegate;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f52042a;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f52043b;
        switch (i10) {
            case 0:
                u7 u7Var = (u7) notificationCenterDelegate;
                ArrayList arrayList = (ArrayList) obj;
                u61 u61Var = (u61) obj2;
                int i11 = u7Var.f52110c;
                int i12 = u7Var.d;
                long j3 = u7Var.f52112f;
                int i13 = 0;
                if (j3 != 0) {
                    o g10 = o.g(i11);
                    ArrayList arrayList2 = g10.k(j3).f51672a[i12];
                    int size = arrayList2.size();
                    while (i13 < size) {
                        Object obj3 = arrayList2.get(i13);
                        i13++;
                        int i14 = q7.f51876a;
                        g61 J = g61.J(q7.class);
                        J.G = (TL_stars.StarsTransaction) obj3;
                        J.f26679q = true;
                        arrayList.add(J);
                    }
                    if (!g10.k(j3).f51675e[i12]) {
                        arrayList.add(g61.p(arrayList.size(), 7));
                        arrayList.add(g61.p(arrayList.size(), 7));
                        arrayList.add(g61.p(arrayList.size(), 7));
                        return;
                    }
                    return;
                }
                t5 y3 = t5.y(i11, u7Var.f52111e);
                ArrayList arrayList3 = y3.f52030q[i12];
                int size2 = arrayList3.size();
                int i15 = 0;
                while (i15 < size2) {
                    Object obj4 = arrayList3.get(i15);
                    i15++;
                    int i16 = q7.f51876a;
                    g61 J2 = g61.J(q7.class);
                    J2.G = (TL_stars.StarsTransaction) obj4;
                    J2.f26679q = false;
                    arrayList.add(J2);
                }
                if (!y3.f52034u[i12]) {
                    arrayList.add(g61.p(arrayList.size(), 7));
                    arrayList.add(g61.p(arrayList.size(), 7));
                    arrayList.add(g61.p(arrayList.size(), 7));
                    return;
                }
                return;
            default:
                hg.e2.T((hg.e2) notificationCenterDelegate, (ArrayList) obj, (u61) obj2);
                return;
        }
    }
}
