package x7;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import z7.jb;
import z7.ng;
import z7.yf;
public final class da implements Runnable {
    public final int f49369a = 0;
    public final long f49370b;
    public final Object f49371c;
    public final Object d;

    public da(fa faVar, r0 r0Var, long j10) {
        this.f49371c = faVar;
        this.d = r0Var;
        this.f49370b = j10;
    }

    @Override
    public final void run() {
        switch (this.f49369a) {
            case 0:
                fa faVar = (fa) this.f49371c;
                r0 r0Var = (r0) this.d;
                HashMap hashMap = faVar.f49406j;
                o7 o7Var = o7.AGGREGATED_ON_DEVICE_IMAGE_LABEL_DETECTION;
                if (!hashMap.containsKey(o7Var)) {
                    j jVar = new j();
                    ?? obj = new Object();
                    if (jVar.isEmpty()) {
                        obj.f49386c = jVar;
                        hashMap.put(o7Var, obj);
                    } else {
                        throw new IllegalArgumentException();
                    }
                }
                f fVar = (f) hashMap.get(o7Var);
                Long valueOf = Long.valueOf(this.f49370b);
                j jVar2 = fVar.f49386c;
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
                    faVar.f49405i.put(o7Var, Long.valueOf(elapsedRealtime));
                    rb.m.f45225a.execute(new p4.s0(faVar, 10));
                    return;
                }
                return;
            default:
                yf yfVar = (yf) this.f49371c;
                jb jbVar = jb.AGGREGATED_ON_DEVICE_SUBJECT_SEGMENTATION_INFERENCE;
                z7.i1 i1Var = (z7.i1) this.d;
                HashMap hashMap2 = yfVar.f51291j;
                if (!hashMap2.containsKey(jbVar)) {
                    z7.d dVar = new z7.d();
                    ?? obj2 = new Object();
                    if (dVar.isEmpty()) {
                        obj2.f51136c = dVar;
                        hashMap2.put(jbVar, obj2);
                    } else {
                        throw new IllegalArgumentException();
                    }
                }
                Long valueOf2 = Long.valueOf(this.f49370b);
                z7.d dVar2 = ((ng) hashMap2.get(jbVar)).f51136c;
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
                if (yfVar.d(jbVar, elapsedRealtime2)) {
                    yfVar.f51290i.put(jbVar, Long.valueOf(elapsedRealtime2));
                    rb.m.f45225a.execute(new p4.s0(yfVar));
                    return;
                }
                return;
        }
    }

    public da(yf yfVar, z7.i1 i1Var, long j10) {
        jb jbVar = jb.UNKNOWN_EVENT;
        this.f49371c = yfVar;
        this.d = i1Var;
        this.f49370b = j10;
    }
}
