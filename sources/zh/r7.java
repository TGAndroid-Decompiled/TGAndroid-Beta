package zh;

import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.v51;
public final class r7 implements Utilities.Callback2 {
    public final int f52559a;
    public final NotificationCenter.NotificationCenterDelegate f52560b;

    public r7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f52559a = i10;
        this.f52560b = notificationCenterDelegate;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f52559a;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f52560b;
        switch (i10) {
            case 0:
                s7 s7Var = (s7) notificationCenterDelegate;
                ArrayList arrayList = (ArrayList) obj;
                v51 v51Var = (v51) obj2;
                int i11 = s7Var.f52624c;
                int i12 = s7Var.d;
                long j3 = s7Var.f52626f;
                int i13 = 0;
                if (j3 != 0) {
                    o g10 = o.g(i11);
                    ArrayList arrayList2 = g10.k(j3).f52316a[i12];
                    int size = arrayList2.size();
                    while (i13 < size) {
                        Object obj3 = arrayList2.get(i13);
                        i13++;
                        int i14 = o7.f52426a;
                        h51 J = h51.J(o7.class);
                        J.G = (TL_stars.StarsTransaction) obj3;
                        J.f26626q = true;
                        arrayList.add(J);
                    }
                    if (!g10.k(j3).f52319e[i12]) {
                        arrayList.add(h51.o(arrayList.size(), 7));
                        arrayList.add(h51.o(arrayList.size(), 7));
                        arrayList.add(h51.o(arrayList.size(), 7));
                        return;
                    }
                    return;
                }
                s5 y3 = s5.y(i11, s7Var.f52625e);
                ArrayList arrayList3 = y3.f52611q[i12];
                int size2 = arrayList3.size();
                int i15 = 0;
                while (i15 < size2) {
                    Object obj4 = arrayList3.get(i15);
                    i15++;
                    int i16 = o7.f52426a;
                    h51 J2 = h51.J(o7.class);
                    J2.G = (TL_stars.StarsTransaction) obj4;
                    J2.f26626q = false;
                    arrayList.add(J2);
                }
                if (!y3.f52615u[i12]) {
                    arrayList.add(h51.o(arrayList.size(), 7));
                    arrayList.add(h51.o(arrayList.size(), 7));
                    arrayList.add(h51.o(arrayList.size(), 7));
                    return;
                }
                return;
            default:
                ig.e2.V((ig.e2) notificationCenterDelegate, (ArrayList) obj, (v51) obj2);
                return;
        }
    }
}
