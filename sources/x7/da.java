package x7;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import z7.hb;
import z7.lg;
import z7.wf;
public final class da implements Runnable {
    public final int f45670a = 0;
    public final long f45671b;
    public final Object f45672c;
    public final Object d;

    public da(fa faVar, r0 r0Var, long j3) {
        this.f45672c = faVar;
        this.d = r0Var;
        this.f45671b = j3;
    }

    @Override
    public final void run() {
        switch (this.f45670a) {
            case 0:
                fa faVar = (fa) this.f45672c;
                r0 r0Var = (r0) this.d;
                HashMap hashMap = faVar.f45707j;
                o7 o7Var = o7.AGGREGATED_ON_DEVICE_IMAGE_LABEL_DETECTION;
                if (!hashMap.containsKey(o7Var)) {
                    j jVar = new j();
                    ?? obj = new Object();
                    if (jVar.isEmpty()) {
                        obj.f45687c = jVar;
                        hashMap.put(o7Var, obj);
                    } else {
                        throw new IllegalArgumentException();
                    }
                }
                f fVar = (f) hashMap.get(o7Var);
                Long valueOf = Long.valueOf(this.f45671b);
                j jVar2 = fVar.f45687c;
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
                    faVar.f45706i.put(o7Var, Long.valueOf(elapsedRealtime));
                    qb.m.f41544a.execute(new pg.c1(faVar, 8));
                    return;
                }
                return;
            default:
                wf wfVar = (wf) this.f45672c;
                hb hbVar = hb.AGGREGATED_ON_DEVICE_SUBJECT_SEGMENTATION_INFERENCE;
                z7.i1 i1Var = (z7.i1) this.d;
                HashMap hashMap2 = wfVar.f48953j;
                if (!hashMap2.containsKey(hbVar)) {
                    z7.d dVar = new z7.d();
                    ?? obj2 = new Object();
                    if (dVar.isEmpty()) {
                        obj2.f48810c = dVar;
                        hashMap2.put(hbVar, obj2);
                    } else {
                        throw new IllegalArgumentException();
                    }
                }
                Long valueOf2 = Long.valueOf(this.f45671b);
                z7.d dVar2 = ((lg) hashMap2.get(hbVar)).f48810c;
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
                    wfVar.f48952i.put(hbVar, Long.valueOf(elapsedRealtime2));
                    qb.m.f41544a.execute(new pg.c1(wfVar));
                    return;
                }
                return;
        }
    }

    public da(wf wfVar, z7.i1 i1Var, long j3) {
        hb hbVar = hb.UNKNOWN_EVENT;
        this.f45672c = wfVar;
        this.d = i1Var;
        this.f45671b = j3;
    }
}
