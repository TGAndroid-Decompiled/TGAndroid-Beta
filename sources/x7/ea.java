package x7;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import z7.hb;
import z7.lg;
import z7.wf;
public final class ea implements Runnable {
    public final int f45701a = 0;
    public final long f45702b;
    public final Object f45703c;
    public final Object d;

    public ea(ga gaVar, r0 r0Var, long j3) {
        this.f45703c = gaVar;
        this.d = r0Var;
        this.f45702b = j3;
    }

    @Override
    public final void run() {
        switch (this.f45701a) {
            case 0:
                ga gaVar = (ga) this.f45703c;
                r0 r0Var = (r0) this.d;
                HashMap hashMap = gaVar.f45732j;
                p7 p7Var = p7.AGGREGATED_ON_DEVICE_IMAGE_LABEL_DETECTION;
                if (!hashMap.containsKey(p7Var)) {
                    j jVar = new j();
                    ?? obj = new Object();
                    if (jVar.isEmpty()) {
                        obj.f45704c = jVar;
                        hashMap.put(p7Var, obj);
                    } else {
                        throw new IllegalArgumentException();
                    }
                }
                f fVar = (f) hashMap.get(p7Var);
                Long valueOf = Long.valueOf(this.f45702b);
                j jVar2 = fVar.f45704c;
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
                if (gaVar.c(p7Var, elapsedRealtime)) {
                    gaVar.f45731i.put(p7Var, Long.valueOf(elapsedRealtime));
                    qb.m.f41557a.execute(new p8.b(gaVar, 9));
                    return;
                }
                return;
            default:
                wf wfVar = (wf) this.f45703c;
                hb hbVar = hb.AGGREGATED_ON_DEVICE_SUBJECT_SEGMENTATION_INFERENCE;
                z7.i1 i1Var = (z7.i1) this.d;
                HashMap hashMap2 = wfVar.f48981j;
                if (!hashMap2.containsKey(hbVar)) {
                    z7.d dVar = new z7.d();
                    ?? obj2 = new Object();
                    if (dVar.isEmpty()) {
                        obj2.f48838c = dVar;
                        hashMap2.put(hbVar, obj2);
                    } else {
                        throw new IllegalArgumentException();
                    }
                }
                Long valueOf2 = Long.valueOf(this.f45702b);
                z7.d dVar2 = ((lg) hashMap2.get(hbVar)).f48838c;
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
                if (wfVar.d(hbVar, elapsedRealtime2)) {
                    wfVar.f48980i.put(hbVar, Long.valueOf(elapsedRealtime2));
                    qb.m.f41557a.execute(new p8.b(wfVar));
                    return;
                }
                return;
        }
    }

    public ea(wf wfVar, z7.i1 i1Var, long j3) {
        hb hbVar = hb.UNKNOWN_EVENT;
        this.f45703c = wfVar;
        this.d = i1Var;
        this.f45702b = j3;
    }
}
