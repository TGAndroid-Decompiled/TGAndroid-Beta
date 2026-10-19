package yh;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
public final class q0 implements BillingController.ProductDetailsResponseListenerLegacy, e2.j {
    public final int f50472a;
    public final Object f50473b;

    public q0(Object obj, int i10) {
        this.f50472a = i10;
        this.f50473b = obj;
    }

    @Override
    public void accept(Object obj) {
        switch (this.f50472a) {
            case 1:
                z3.h hVar = (z3.h) this.f50473b;
                z3.a aVar = (z3.a) obj;
                z3.g gVar = new z3.g(aVar.f50635b, sb.a.s2(aVar.f50634a, aVar.f50636c));
                hVar.f50645c.add(gVar);
                long j10 = hVar.f50649j;
                if (j10 == -9223372036854775807L || aVar.d >= j10) {
                    hVar.g(gVar);
                    return;
                }
                return;
            default:
                ((e9.k0) this.f50473b).c((z3.a) obj);
                return;
        }
    }

    @Override
    public void onProductDetailsResponse(c5.i iVar, List list) {
        int i10;
        o1 o1Var = (o1) this.f50473b;
        ArrayList arrayList = o1Var.f50433n0;
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
                    if (kVar.h() != null && kVar.h().equals(pVar.f4777c)) {
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
            ((sg.k) obj2).f46278g = j10;
        }
        AndroidUtilities.runOnUIThread(new tg.p(o1Var, 15));
    }
}
