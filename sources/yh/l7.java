package yh;

import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.q61;
public final class l7 implements Utilities.Callback2 {
    public final int f52960a;
    public final NotificationCenter.NotificationCenterDelegate f52961b;

    public l7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f52960a = i10;
        this.f52961b = notificationCenterDelegate;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f52960a;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f52961b;
        switch (i10) {
            case 0:
                m7 m7Var = (m7) notificationCenterDelegate;
                ArrayList arrayList = (ArrayList) obj;
                d71 d71Var = (d71) obj2;
                int i11 = m7Var.f53008c;
                int i12 = m7Var.d;
                long j3 = m7Var.f53010f;
                int i13 = 0;
                if (j3 != 0) {
                    o g10 = o.g(i11);
                    ArrayList arrayList2 = g10.k(j3).f53011a[i12];
                    int size = arrayList2.size();
                    while (i13 < size) {
                        Object obj3 = arrayList2.get(i13);
                        i13++;
                        int i14 = i7.f52820a;
                        q61 J = q61.J(i7.class);
                        J.G = (TL_stars.StarsTransaction) obj3;
                        J.f30172q = true;
                        arrayList.add(J);
                    }
                    if (!g10.k(j3).f53014e[i12]) {
                        arrayList.add(q61.o(arrayList.size(), 7));
                        arrayList.add(q61.o(arrayList.size(), 7));
                        arrayList.add(q61.o(arrayList.size(), 7));
                        return;
                    }
                    return;
                }
                n5 y3 = n5.y(i11, m7Var.f53009e);
                ArrayList arrayList3 = y3.f53045q[i12];
                int size2 = arrayList3.size();
                int i15 = 0;
                while (i15 < size2) {
                    Object obj4 = arrayList3.get(i15);
                    i15++;
                    int i16 = i7.f52820a;
                    q61 J2 = q61.J(i7.class);
                    J2.G = (TL_stars.StarsTransaction) obj4;
                    J2.f30172q = false;
                    arrayList.add(J2);
                }
                if (!y3.f53049u[i12]) {
                    arrayList.add(q61.o(arrayList.size(), 7));
                    arrayList.add(q61.o(arrayList.size(), 7));
                    arrayList.add(q61.o(arrayList.size(), 7));
                    return;
                }
                return;
            default:
                hg.f2.V((hg.f2) notificationCenterDelegate, (ArrayList) obj, (d71) obj2);
                return;
        }
    }
}
