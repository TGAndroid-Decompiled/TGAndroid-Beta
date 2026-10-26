package x2;

import android.view.View;
import b2.q1;
import bi.h0;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import f9.f0;
import f9.s1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.e2;
import r0.k1;
import zh.i0;
import zh.p1;
public final class e implements l, Continuation, e2.j, ag.s, b2, r0.n, BillingController.ProductDetailsResponseListenerLegacy {
    public final int f51313a;
    public final Object f51314b;

    public e(Object obj, int i10) {
        this.f51313a = i10;
        this.f51314b = obj;
    }

    @Override
    public k1 P0(View view, k1 k1Var) {
        ((i0) this.f51314b).h.j(k1Var);
        return k1.f47117b;
    }

    @Override
    public s1 a(int i10, q1 q1Var, int[] iArr) {
        j jVar = (j) this.f51314b;
        f0 t10 = f9.i0.t();
        for (int i11 = 0; i11 < q1Var.f3358a; i11++) {
            t10.c(new g(i10, q1Var, i11, jVar, iArr[i11]));
        }
        return t10.f();
    }

    @Override
    public void accept(Object obj) {
        switch (this.f51313a) {
            case 2:
                z3.h hVar = (z3.h) this.f51314b;
                z3.a aVar = (z3.a) obj;
                z3.g gVar = new z3.g(aVar.f52643b, pa.d.f(aVar.f52642a, aVar.f52644c));
                hVar.f52653c.add(gVar);
                long j10 = hVar.f52657j;
                if (j10 == -9223372036854775807L || aVar.d >= j10) {
                    hVar.g(gVar);
                    return;
                }
                return;
            default:
                ((f0) this.f51314b).c((z3.a) obj);
                return;
        }
    }

    @Override
    public void f(long j10) {
        ((zh.d) this.f51314b).a(j10, true);
    }

    @Override
    public void h(e2 e2Var, int i10) {
        ((h0) this.f51314b).run();
    }

    @Override
    public void onProductDetailsResponse(d5.i iVar, List list) {
        int i10;
        p1 p1Var = (p1) this.f51314b;
        ArrayList arrayList = p1Var.f53201n0;
        Iterator it = list.iterator();
        long j10 = 0;
        while (true) {
            i10 = 0;
            if (!it.hasNext()) {
                break;
            }
            d5.o oVar = (d5.o) it.next();
            int size = arrayList.size();
            while (true) {
                if (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    tg.k kVar = (tg.k) obj;
                    if (kVar.h() != null && kVar.h().equals(oVar.f8001c)) {
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
            ((tg.k) obj2).f48915g = j10;
        }
        AndroidUtilities.runOnUIThread(new ti.g(p1Var, 19));
    }

    @Override
    public Object then(Task task) {
        ((CountDownLatch) this.f51314b).countDown();
        return null;
    }
}
