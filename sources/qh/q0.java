package qh;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
public final class q0 implements Utilities.Callback {
    public final int f45908a;
    public final t0 f45909b;

    public q0(t0 t0Var, int i10) {
        this.f45908a = i10;
        this.f45909b = t0Var;
    }

    @Override
    public final void run(Object obj) {
        File file;
        File file2;
        ArrayList arrayList = (ArrayList) obj;
        switch (this.f45908a) {
            case 0:
                t0 t0Var = this.f45909b;
                t0Var.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    r6 a2 = ((s0) arrayList.get(i10)).a();
                    if ((!a2.v() && ((file = a2.L) == null || !file.exists())) || currentTimeMillis - a2.d > 604800000) {
                        arrayList3.add(a2);
                    } else {
                        arrayList4.add(a2);
                        arrayList2.add(Long.valueOf(a2.f45995b));
                    }
                }
                t0Var.b(arrayList3);
                t0Var.f46119f = false;
                t0Var.f46118e = true;
                oh.t6 storiesController = MessagesController.getInstance(t0Var.f46115a).getStoriesController();
                storiesController.getClass();
                int size = arrayList4.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj2 = arrayList4.get(i11);
                    i11++;
                    oh.s6 s6Var = new oh.s6(storiesController, (r6) obj2);
                    storiesController.d(s6Var.G, s6Var, storiesController.f17773b, false);
                }
                NotificationCenter.getInstance(storiesController.f17772a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                return;
            default:
                t0 t0Var2 = this.f45909b;
                t0Var2.getClass();
                long currentTimeMillis2 = System.currentTimeMillis();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    r6 a10 = ((s0) arrayList.get(i12)).a();
                    if ((!a10.v() && ((file2 = a10.L) == null || !file2.exists())) || (!a10.f46008g ? currentTimeMillis2 - a10.d > 604800000 : currentTimeMillis2 > a10.J)) {
                        arrayList6.add(a10);
                    } else {
                        t0Var2.f46116b.add(a10);
                        arrayList5.add(Long.valueOf(a10.f45995b));
                    }
                }
                t0Var2.b(arrayList6);
                t0Var2.d = false;
                t0Var2.f46117c = true;
                NotificationCenter.getInstance(t0Var2.f46115a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesDraftsUpdated, new Object[0]);
                return;
        }
    }
}
