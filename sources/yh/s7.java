package yh;

import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.y51;
public final class s7 implements Utilities.Callback2 {
    public final int f48142a;
    public final NotificationCenter.NotificationCenterDelegate f48143b;

    public s7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f48142a = i10;
        this.f48143b = notificationCenterDelegate;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f48142a;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f48143b;
        switch (i10) {
            case 0:
                t7 t7Var = (t7) notificationCenterDelegate;
                ArrayList arrayList = (ArrayList) obj;
                m61 m61Var = (m61) obj2;
                int i11 = t7Var.f48174c;
                int i12 = t7Var.d;
                long j3 = t7Var.f48175f;
                int i13 = 0;
                if (j3 != 0) {
                    o g10 = o.g(i11);
                    ArrayList arrayList2 = g10.k(j3).f47860a[i12];
                    int size = arrayList2.size();
                    while (i13 < size) {
                        Object obj3 = arrayList2.get(i13);
                        i13++;
                        int i14 = p7.f47993a;
                        y51 J = y51.J(p7.class);
                        J.G = (TL_stars.StarsTransaction) obj3;
                        J.f30642q = true;
                        arrayList.add(J);
                    }
                    if (!g10.k(j3).e[i12]) {
                        arrayList.add(y51.o(arrayList.size(), 7));
                        arrayList.add(y51.o(arrayList.size(), 7));
                        arrayList.add(y51.o(arrayList.size(), 7));
                        return;
                    }
                    return;
                }
                s5 y3 = s5.y(i11, t7Var.e);
                ArrayList arrayList3 = y3.f48132q[i12];
                int size2 = arrayList3.size();
                int i15 = 0;
                while (i15 < size2) {
                    Object obj4 = arrayList3.get(i15);
                    i15++;
                    int i16 = p7.f47993a;
                    y51 J2 = y51.J(p7.class);
                    J2.G = (TL_stars.StarsTransaction) obj4;
                    J2.f30642q = false;
                    arrayList.add(J2);
                }
                if (!y3.f48136u[i12]) {
                    arrayList.add(y51.o(arrayList.size(), 7));
                    arrayList.add(y51.o(arrayList.size(), 7));
                    arrayList.add(y51.o(arrayList.size(), 7));
                    return;
                }
                return;
            default:
                hg.f2.V((hg.f2) notificationCenterDelegate, (ArrayList) obj, (m61) obj2);
                return;
        }
    }
}
