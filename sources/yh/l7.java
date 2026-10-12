package yh;

import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.u61;
public final class l7 implements Utilities.Callback2 {
    public final int f53063a;
    public final NotificationCenter.NotificationCenterDelegate f53064b;

    public l7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f53063a = i10;
        this.f53064b = notificationCenterDelegate;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f53063a;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f53064b;
        switch (i10) {
            case 0:
                m7 m7Var = (m7) notificationCenterDelegate;
                ArrayList arrayList = (ArrayList) obj;
                h71 h71Var = (h71) obj2;
                int i11 = m7Var.f53111c;
                int i12 = m7Var.d;
                long j3 = m7Var.f53113f;
                int i13 = 0;
                if (j3 != 0) {
                    o g10 = o.g(i11);
                    ArrayList arrayList2 = g10.k(j3).f53114a[i12];
                    int size = arrayList2.size();
                    while (i13 < size) {
                        Object obj3 = arrayList2.get(i13);
                        i13++;
                        int i14 = i7.f52923a;
                        u61 J = u61.J(i7.class);
                        J.G = (TL_stars.StarsTransaction) obj3;
                        J.f31081q = true;
                        arrayList.add(J);
                    }
                    if (!g10.k(j3).f53117e[i12]) {
                        arrayList.add(u61.o(arrayList.size(), 7));
                        arrayList.add(u61.o(arrayList.size(), 7));
                        arrayList.add(u61.o(arrayList.size(), 7));
                        return;
                    }
                    return;
                }
                n5 y3 = n5.y(i11, m7Var.f53112e);
                ArrayList arrayList3 = y3.f53148q[i12];
                int size2 = arrayList3.size();
                int i15 = 0;
                while (i15 < size2) {
                    Object obj4 = arrayList3.get(i15);
                    i15++;
                    int i16 = i7.f52923a;
                    u61 J2 = u61.J(i7.class);
                    J2.G = (TL_stars.StarsTransaction) obj4;
                    J2.f31081q = false;
                    arrayList.add(J2);
                }
                if (!y3.f53152u[i12]) {
                    arrayList.add(u61.o(arrayList.size(), 7));
                    arrayList.add(u61.o(arrayList.size(), 7));
                    arrayList.add(u61.o(arrayList.size(), 7));
                    return;
                }
                return;
            default:
                hg.f2.V((hg.f2) notificationCenterDelegate, (ArrayList) obj, (h71) obj2);
                return;
        }
    }
}
