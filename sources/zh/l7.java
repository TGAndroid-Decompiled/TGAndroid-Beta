package zh;

import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.m61;
public final class l7 implements Utilities.Callback2 {
    public final int f50807a;
    public final NotificationCenter.NotificationCenterDelegate f50808b;

    public l7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f50807a = i10;
        this.f50808b = notificationCenterDelegate;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f50807a;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f50808b;
        switch (i10) {
            case 0:
                m7 m7Var = (m7) notificationCenterDelegate;
                ArrayList arrayList = (ArrayList) obj;
                a71 a71Var = (a71) obj2;
                int i11 = m7Var.f50842c;
                int i12 = m7Var.d;
                long j10 = m7Var.f50843f;
                int i13 = 0;
                if (j10 != 0) {
                    p g10 = p.g(i11);
                    ArrayList arrayList2 = g10.k(j10).f50894a[i12];
                    int size = arrayList2.size();
                    while (i13 < size) {
                        Object obj3 = arrayList2.get(i13);
                        i13++;
                        int i14 = i7.f50679a;
                        m61 J = m61.J(i7.class);
                        J.G = (TL_stars.StarsTransaction) obj3;
                        J.f26951q = true;
                        arrayList.add(J);
                    }
                    if (!g10.k(j10).e[i12]) {
                        arrayList.add(m61.o(arrayList.size(), 7));
                        arrayList.add(m61.o(arrayList.size(), 7));
                        arrayList.add(m61.o(arrayList.size(), 7));
                        return;
                    }
                    return;
                }
                n5 y3 = n5.y(i11, m7Var.e);
                ArrayList arrayList3 = y3.f50878q[i12];
                int size2 = arrayList3.size();
                int i15 = 0;
                while (i15 < size2) {
                    Object obj4 = arrayList3.get(i15);
                    i15++;
                    int i16 = i7.f50679a;
                    m61 J2 = m61.J(i7.class);
                    J2.G = (TL_stars.StarsTransaction) obj4;
                    J2.f26951q = false;
                    arrayList.add(J2);
                }
                if (!y3.f50882u[i12]) {
                    arrayList.add(m61.o(arrayList.size(), 7));
                    arrayList.add(m61.o(arrayList.size(), 7));
                    arrayList.add(m61.o(arrayList.size(), 7));
                    return;
                }
                return;
            default:
                ig.e2.V((ig.e2) notificationCenterDelegate, (ArrayList) obj, (a71) obj2);
                return;
        }
    }
}
