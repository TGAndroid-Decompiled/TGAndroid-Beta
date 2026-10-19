package yh;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
public final class q0 implements BillingController.ProductDetailsResponseListenerLegacy, e2.j {
    public final int f50474a;
    public final Object f50475b;

    public q0(Object obj, int i10) {
        this.f50474a = i10;
        this.f50475b = obj;
    }

    @Override
    public void accept(Object obj) {
        switch (this.f50474a) {
            case 1:
                z3.h hVar = (z3.h) this.f50475b;
                z3.a aVar = (z3.a) obj;
                z3.g gVar = new z3.g(aVar.f50637b, sb.a.s2(aVar.f50636a, aVar.f50638c));
                hVar.f50647c.add(gVar);
                long j10 = hVar.f50651j;
                if (j10 == -9223372036854775807L || aVar.d >= j10) {
                    hVar.g(gVar);
                    return;
                }
                return;
            default:
                ((e9.k0) this.f50475b).c((z3.a) obj);
                return;
        }
    }

    @Override
    public void onProductDetailsResponse(c5.i iVar, List list) {
        int i10;
        o1 o1Var = (o1) this.f50475b;
        ArrayList arrayList = o1Var.f50435n0;
        Iterator it = list.iterator();
        long j10 = 0;
        while (true) {
            i10 = 0;
            if (!it.hasNext()) {
                break;
            }
            c5.p pVar = (c5.p) it.next();
            int size = arrayList.size();
            while (true) {
                if (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    sg.k kVar = (sg.k) obj;
                    if (kVar.h() != null && kVar.h().equals(pVar.f4775c)) {
                        kVar.h = pVar;
                        if (kVar.f() > j10) {
                            j10 = kVar.f();
                        }
                    }
                }
            }
        }
        int size2 = arrayList.size();
        while (i10 < size2) {
            Object obj2 = arrayList.get(i10);
            i10++;
            ((sg.k) obj2).f46280g = j10;
        }
        AndroidUtilities.runOnUIThread(new tg.p(o1Var, 15));
    }
}
