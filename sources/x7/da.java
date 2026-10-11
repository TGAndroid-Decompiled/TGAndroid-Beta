package x7;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import z7.hb;
import z7.mg;
import z7.xf;
public final class da implements Runnable {
    public final int f50820a = 0;
    public final long f50821b;
    public final Object f50822c;
    public final Object d;

    public da(fa faVar, r0 r0Var, long j3) {
        this.f50822c = faVar;
        this.d = r0Var;
        this.f50821b = j3;
    }

    @Override
    public final void run() {
        switch (this.f50820a) {
            case 0:
                fa faVar = (fa) this.f50822c;
                r0 r0Var = (r0) this.d;
                HashMap hashMap = faVar.f50860j;
                o7 o7Var = o7.AGGREGATED_ON_DEVICE_IMAGE_LABEL_DETECTION;
                if (!hashMap.containsKey(o7Var)) {
                    j jVar = new j();
                    ?? obj = new Object();
                    if (jVar.isEmpty()) {
                        obj.f50838c = jVar;
                        hashMap.put(o7Var, obj);
                    } else {
                        throw new IllegalArgumentException();
                    }
                }
                f fVar = (f) hashMap.get(o7Var);
                Long valueOf = Long.valueOf(this.f50821b);
                j jVar2 = fVar.f50838c;
                Collection collection = (Collection) jVar2.get(r0Var);
                if (collection == null) {
                    ArrayList arrayList = new ArrayList(3);
                    if (arrayList.add(valueOf)) {
                        fVar.d++;
                        jVar2.put(r0Var, arrayList);
                    } else {
                        throw new AssertionError("New Collection violated the Collection spec");
                    }
                } else if (collection.add(valueOf)) {
                    fVar.d++;
                }
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (faVar.c(o7Var, elapsedRealtime)) {
                    faVar.f50859i.put(o7Var, Long.valueOf(elapsedRealtime));
                    qb.m.f46169a.execute(new org.telegram.ui.Wallet.p5(faVar, 11));
                    return;
                }
                return;
            default:
                xf xfVar = (xf) this.f50822c;
                hb hbVar = hb.AGGREGATED_ON_DEVICE_SUBJECT_SEGMENTATION_INFERENCE;
                z7.i1 i1Var = (z7.i1) this.d;
                HashMap hashMap2 = xfVar.f54226j;
                if (!hashMap2.containsKey(hbVar)) {
                    z7.d dVar = new z7.d();
                    ?? obj2 = new Object();
                    if (dVar.isEmpty()) {
                        obj2.f54070c = dVar;
                        hashMap2.put(hbVar, obj2);
                    } else {
                        throw new IllegalArgumentException();
                    }
                }
                Long valueOf2 = Long.valueOf(this.f50821b);
                z7.d dVar2 = ((mg) hashMap2.get(hbVar)).f54070c;
                Collection collection2 = (Collection) dVar2.get(i1Var);
                if (collection2 == null) {
                    ArrayList arrayList2 = new ArrayList(3);
                    if (arrayList2.add(valueOf2)) {
                        dVar2.put(i1Var, arrayList2);
                    } else {
                        throw new AssertionError("New Collection violated the Collection spec");
                    }
                } else {
                    collection2.add(valueOf2);
                }
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                if (xfVar.d(hbVar, elapsedRealtime2)) {
                    xfVar.f54225i.put(hbVar, Long.valueOf(elapsedRealtime2));
                    qb.m.f46169a.execute(new org.telegram.ui.Wallet.p5(xfVar));
                    return;
                }
                return;
        }
    }

    public da(xf xfVar, z7.i1 i1Var, long j3) {
        hb hbVar = hb.UNKNOWN_EVENT;
        this.f50822c = xfVar;
        this.d = i1Var;
        this.f50821b = j3;
    }
}
