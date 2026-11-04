package wi;

import b8.ah;
import b8.cg;
import b8.kg;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import xg.e1;
import z7.da;
import z7.l7;
import z7.n7;
import z7.z6;
public final class i0 implements Runnable {
    public final int f57857a;
    public final Object f57858b;

    public i0(Object obj, int i3) {
        this.f57857a = i3;
        this.f57858b = obj;
    }

    @Override
    public final void run() {
        k2.i0 i0Var;
        ah ahVar;
        switch (this.f57857a) {
            case 0:
                t0 t0Var = (t0) this.f57858b;
                if (t0Var.Z == 5 && (i0Var = t0Var.V) != null && t0Var.f58076z) {
                    long N0 = i0Var.N0();
                    long j10 = t0Var.J;
                    if (N0 < j10 || N0 >= t0Var.K) {
                        t0Var.V.Z0(5, j10);
                    }
                    t0Var.d.getClass();
                    t0Var.f58060i.postDelayed(this, 33L);
                    return;
                }
                return;
            case 1:
                xg.w0 w0Var = (xg.w0) this.f57858b;
                String str = w0Var.f58776g2;
                if (str != null) {
                    w0Var.f1(w0Var.f58780k2, str, false);
                    return;
                }
                return;
            case 2:
                e1 e1Var = (e1) this.f57858b;
                String str2 = e1Var.f58679h2;
                if (str2 != null) {
                    if (e1Var.f58688q2 >= 0) {
                        ConnectionsManager.getInstance(e1Var.f28583a).cancelRequest(e1Var.f58688q2, true);
                        e1Var.f58688q2 = -1;
                    }
                    TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
                    tL_contacts_search.f27047q = str2;
                    e1Var.f58688q2 = ConnectionsManager.getInstance(e1Var.f28583a).sendRequest(tL_contacts_search, new ci.d0(e1Var, 25));
                    return;
                }
                return;
            default:
                da daVar = (da) this.f57858b;
                HashMap hashMap = daVar.f59848j;
                n7 n7Var = n7.AGGREGATED_ON_DEVICE_IMAGE_LABEL_DETECTION;
                z7.e eVar = (z7.e) hashMap.get(n7Var);
                if (eVar != null) {
                    z7.e eVar2 = eVar;
                    z7.a aVar = eVar2.f59824a;
                    if (aVar == null) {
                        z7.e eVar3 = eVar2;
                        z7.a aVar2 = new z7.a(eVar3, eVar3.f59849c);
                        eVar2.f59824a = aVar2;
                        aVar = aVar2;
                    }
                    Iterator it = aVar.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        Object obj = (Collection) eVar.f59849c.get(next);
                        if (obj == null) {
                            obj = new ArrayList(3);
                        }
                        List list = (List) obj;
                        if (list instanceof RandomAccess) {
                            ahVar = new ah(eVar, next, list, (ah) null);
                        } else {
                            ahVar = new ah(eVar, next, list, (ah) null);
                        }
                        ArrayList arrayList = new ArrayList(ahVar);
                        Collections.sort(arrayList);
                        ?? obj2 = new Object();
                        int size = arrayList.size();
                        long j11 = 0;
                        int i3 = 0;
                        while (i3 < size) {
                            Object obj3 = arrayList.get(i3);
                            i3++;
                            j11 += ((Long) obj3).longValue();
                        }
                        obj2.f3062c = Long.valueOf((j11 / arrayList.size()) & Long.MAX_VALUE);
                        obj2.f3060a = Long.valueOf(da.a(arrayList, 100.0d) & Long.MAX_VALUE);
                        obj2.f3064f = Long.valueOf(da.a(arrayList, 75.0d) & Long.MAX_VALUE);
                        obj2.f3063e = Long.valueOf(da.a(arrayList, 50.0d) & Long.MAX_VALUE);
                        obj2.d = Long.valueOf(da.a(arrayList, 25.0d) & Long.MAX_VALUE);
                        obj2.f3061b = Long.valueOf(da.a(arrayList, 0.0d) & Long.MAX_VALUE);
                        z6 z6Var = new z6(obj2);
                        int size2 = arrayList.size();
                        ?? obj4 = new Object();
                        obj4.f17691c = l7.TYPE_THIN;
                        p7.d dVar = new p7.d(29, false);
                        dVar.d = Integer.valueOf(size2 & Integer.MAX_VALUE);
                        dVar.f53345b = (z7.r0) next;
                        dVar.f53346c = z6Var;
                        obj4.f17693f = new z7.s0(dVar);
                        mb.m.f19245a.execute(new cg(daVar, new kg((l2.e) obj4, 0), n7Var, daVar.b(), 8));
                    }
                    hashMap.remove(n7Var);
                    return;
                }
                return;
        }
    }
}
