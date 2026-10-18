package yh;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
public final class r0 implements BillingController.ProductDetailsResponseListenerLegacy, e2.j {
    public final int f50533a;
    public final Object f50534b;

    public r0(Object obj, int i10) {
        this.f50533a = i10;
        this.f50534b = obj;
    }

    @Override
    public void accept(Object obj) {
        switch (this.f50533a) {
            case 1:
                z3.h hVar = (z3.h) this.f50534b;
                z3.a aVar = (z3.a) obj;
                z3.g gVar = new z3.g(aVar.f50682b, sb.a.s2(aVar.f50681a, aVar.f50683c));
                hVar.f50692c.add(gVar);
                long j10 = hVar.f50696j;
                if (j10 == -9223372036854775807L || aVar.d >= j10) {
                    hVar.g(gVar);
                    return;
                }
                return;
            default:
                ((e9.k0) this.f50534b).c((z3.a) obj);
                return;
        }
    }

    @Override
    public void onProductDetailsResponse(c5.i iVar, List list) {
        int i10;
        p1 p1Var = (p1) this.f50534b;
        ArrayList arrayList = p1Var.f50494n0;
        Iterator it = list.iterator();
        long j10 = 0;
        while (true) {
            i10 = 0;
            if (!it.hasNext()) {
                break;
            }
            c5.o oVar = (c5.o) it.next();
            int size = arrayList.size();
            while (true) {
                if (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    sg.k kVar = (sg.k) obj;
                    if (kVar.h() != null && kVar.h().equals(oVar.f4776c)) {
                        kVar.h = oVar;
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
            ((sg.k) obj2).f46328g = j10;
        }
        AndroidUtilities.runOnUIThread(new tg.p(p1Var, 15));
    }
}
