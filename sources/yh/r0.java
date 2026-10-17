package yh;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.camera.CameraView;
public final class r0 implements BillingController.ProductDetailsResponseListenerLegacy, e2.j, CameraView.CameraViewDelegate {
    public final int f50508a;
    public final Object f50509b;

    public r0(Object obj, int i10) {
        this.f50508a = i10;
        this.f50509b = obj;
    }

    @Override
    public void accept(Object obj) {
        switch (this.f50508a) {
            case 1:
                z3.h hVar = (z3.h) this.f50509b;
                z3.a aVar = (z3.a) obj;
                z3.g gVar = new z3.g(aVar.f50657b, sb.a.s2(aVar.f50656a, aVar.f50658c));
                hVar.f50667c.add(gVar);
                long j10 = hVar.f50671j;
                if (j10 == -9223372036854775807L || aVar.d >= j10) {
                    hVar.g(gVar);
                    return;
                }
                return;
            default:
                ((e9.k0) this.f50509b).c((z3.a) obj);
                return;
        }
    }

    @Override
    public void onCameraInit() {
        zh.d0 d0Var = (zh.d0) this.f50509b;
        if (!d0Var.S && !d0Var.f51952d0 && !d0Var.f51957h0) {
            d0Var.f51952d0 = true;
            d0Var.f51951c0.postDelayed(d0Var.f51960k0, 150L);
        }
    }

    @Override
    public void onProductDetailsResponse(c5.i iVar, List list) {
        int i10;
        p1 p1Var = (p1) this.f50509b;
        ArrayList arrayList = p1Var.f50469n0;
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
                    if (kVar.h() != null && kVar.h().equals(oVar.f4775c)) {
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
            ((sg.k) obj2).f46308g = j10;
        }
        AndroidUtilities.runOnUIThread(new tg.p(p1Var, 15));
    }
}
