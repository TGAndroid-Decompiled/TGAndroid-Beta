package vh;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.q20;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
public final class p0 implements q20 {
    public final int f51714a;
    public final s0 f51715b;

    public p0(s0 s0Var, int i10) {
        this.f51714a = i10;
        this.f51715b = s0Var;
    }

    @Override
    public final void a(Object obj) {
        File file;
        File file2;
        ArrayList arrayList = (ArrayList) obj;
        switch (this.f51714a) {
            case 0:
                long currentTimeMillis = System.currentTimeMillis();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    n5 a2 = ((r0) arrayList.get(i10)).a();
                    if ((!a2.v() && ((file = a2.L) == null || !file.exists())) || currentTimeMillis - a2.d > 604800000) {
                        arrayList3.add(a2);
                    } else {
                        arrayList4.add(a2);
                        arrayList2.add(Long.valueOf(a2.f51517b));
                    }
                }
                s0 s0Var = this.f51715b;
                s0Var.b(arrayList3);
                s0Var.f51904f = false;
                s0Var.e = true;
                th.e5 O1 = vp.r1(s0Var.f51901a).O1();
                int size = arrayList4.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj2 = arrayList4.get(i11);
                    i11++;
                    th.d5 d5Var = new th.d5(O1, (n5) obj2);
                    O1.d(d5Var.J, d5Var, O1.f48905b, false);
                }
                zs.f(O1.f48904a).k(324, new Object[0]);
                return;
            default:
                s0 s0Var2 = this.f51715b;
                s0Var2.getClass();
                long currentTimeMillis2 = System.currentTimeMillis();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    n5 a10 = ((r0) arrayList.get(i12)).a();
                    if ((!a10.v() && ((file2 = a10.L) == null || !file2.exists())) || (!a10.f51529g ? currentTimeMillis2 - a10.d > 604800000 : currentTimeMillis2 > a10.J)) {
                        arrayList6.add(a10);
                    } else {
                        s0Var2.f51902b.add(a10);
                        arrayList5.add(Long.valueOf(a10.f51517b));
                    }
                }
                s0Var2.b(arrayList6);
                s0Var2.d = false;
                s0Var2.f51903c = true;
                zs.f(s0Var2.f51901a).k(327, new Object[0]);
                return;
        }
    }
}
