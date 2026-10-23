package x7;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import z7.hb;
import z7.mg;
import z7.wf;
public final class da implements Runnable {
    public final int f49799a = 0;
    public final long f49800b;
    public final Object f49801c;
    public final Object d;

    public da(fa faVar, r0 r0Var, long j10) {
        this.f49801c = faVar;
        this.d = r0Var;
        this.f49800b = j10;
    }

    @Override
    public final void run() {
        switch (this.f49799a) {
            case 0:
                fa faVar = (fa) this.f49801c;
                r0 r0Var = (r0) this.d;
                HashMap hashMap = faVar.f49836j;
                o7 o7Var = o7.AGGREGATED_ON_DEVICE_IMAGE_LABEL_DETECTION;
                if (!hashMap.containsKey(o7Var)) {
                    j jVar = new j();
                    ?? obj = new Object();
                    if (jVar.isEmpty()) {
                        obj.f49816c = jVar;
                        hashMap.put(o7Var, obj);
                    } else {
                        throw new IllegalArgumentException();
                    }
                }
                f fVar = (f) hashMap.get(o7Var);
                Long valueOf = Long.valueOf(this.f49800b);
                j jVar2 = fVar.f49816c;
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
                    faVar.f49835i.put(o7Var, Long.valueOf(elapsedRealtime));
                    rb.m.f45623a.execute(new org.telegram.ui.Wallet.m4(faVar, 13));
                    return;
                }
                return;
            default:
                wf wfVar = (wf) this.f49801c;
                hb hbVar = hb.AGGREGATED_ON_DEVICE_SUBJECT_SEGMENTATION_INFERENCE;
                z7.i1 i1Var = (z7.i1) this.d;
                HashMap hashMap2 = wfVar.f51708j;
                if (!hashMap2.containsKey(hbVar)) {
                    z7.d dVar = new z7.d();
                    ?? obj2 = new Object();
                    if (dVar.isEmpty()) {
                        obj2.f51577c = dVar;
                        hashMap2.put(hbVar, obj2);
                    } else {
                        throw new IllegalArgumentException();
                    }
                }
                Long valueOf2 = Long.valueOf(this.f49800b);
                z7.d dVar2 = ((mg) hashMap2.get(hbVar)).f51577c;
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
                    wfVar.f51707i.put(hbVar, Long.valueOf(elapsedRealtime2));
                    rb.m.f45623a.execute(new org.telegram.ui.Wallet.m4(wfVar));
                    return;
                }
                return;
        }
    }

    public da(wf wfVar, z7.i1 i1Var, long j10) {
        hb hbVar = hb.UNKNOWN_EVENT;
        this.f49801c = wfVar;
        this.d = i1Var;
        this.f49800b = j10;
    }
}
