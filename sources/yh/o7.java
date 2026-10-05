package yh;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Cells.w8;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.w61;
public final class o7 implements Utilities.Callback2 {
    public final int f51741a;
    public final NotificationCenter.NotificationCenterDelegate f51742b;

    public o7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f51741a = i10;
        this.f51742b = notificationCenterDelegate;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        h61 j3;
        int i10 = this.f51741a;
        int i11 = 0;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f51742b;
        switch (i10) {
            case 0:
                ((p7) notificationCenterDelegate).P((ArrayList) obj, (w61) obj2);
                return;
            case 1:
                w7 w7Var = (w7) notificationCenterDelegate;
                ArrayList arrayList = (ArrayList) obj;
                w61 w61Var = (w61) obj2;
                int i12 = w7Var.f52205c;
                int i13 = w7Var.d;
                long j10 = w7Var.f52207f;
                if (j10 != 0) {
                    p g10 = p.g(i12);
                    ArrayList arrayList2 = g10.k(j10).f51719a[i13];
                    int size = arrayList2.size();
                    while (i11 < size) {
                        Object obj3 = arrayList2.get(i11);
                        i11++;
                        int i14 = s7.f51981a;
                        h61 K = h61.K(s7.class);
                        K.G = (TL_stars.StarsTransaction) obj3;
                        K.f27098q = true;
                        arrayList.add(K);
                    }
                    if (!g10.k(j10).f51722e[i13]) {
                        arrayList.add(h61.q(arrayList.size(), 7));
                        arrayList.add(h61.q(arrayList.size(), 7));
                        arrayList.add(h61.q(arrayList.size(), 7));
                        return;
                    }
                    return;
                }
                u5 y3 = u5.y(i12, w7Var.f52206e);
                ArrayList arrayList3 = y3.f52099q[i13];
                int size2 = arrayList3.size();
                int i15 = 0;
                while (i15 < size2) {
                    Object obj4 = arrayList3.get(i15);
                    i15++;
                    int i16 = s7.f51981a;
                    h61 K2 = h61.K(s7.class);
                    K2.G = (TL_stars.StarsTransaction) obj4;
                    K2.f27098q = false;
                    arrayList.add(K2);
                }
                if (!y3.f52103u[i13]) {
                    arrayList.add(h61.q(arrayList.size(), 7));
                    arrayList.add(h61.q(arrayList.size(), 7));
                    arrayList.add(h61.q(arrayList.size(), 7));
                    return;
                }
                return;
            default:
                zg.o oVar = (zg.o) notificationCenterDelegate;
                ArrayList arrayList4 = (ArrayList) obj;
                w61 w61Var2 = (w61) obj2;
                ArrayList arrayList5 = oVar.F;
                w8 w8Var = oVar.f53503e;
                if (w8Var != null && oVar.f53504f != null) {
                    arrayList4.add(h61.j(1, w8Var));
                    arrayList4.add(h61.l(2, oVar.f53504f));
                    int i17 = oVar.X;
                    if (i17 == 1 || i17 == 0 || oVar.f53500a) {
                        while (i11 < arrayList5.size()) {
                            View view = (View) arrayList5.get(i11);
                            if (((Boolean) oVar.G.get(i11)).booleanValue()) {
                                j3 = h61.l(i11 + 100, view);
                            } else {
                                j3 = h61.j(i11 + 100, view);
                            }
                            arrayList4.add(j3);
                            i11++;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
