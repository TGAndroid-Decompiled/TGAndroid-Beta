package x7;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import z7.hb;
import z7.mg;
import z7.xf;
public final class ea implements Runnable {
    public final int f53139a = 0;
    public final long f53140b;
    public final Object f53141c;
    public final Object d;

    public ea(ga gaVar, r0 r0Var, long j10) {
        this.f53141c = gaVar;
        this.d = r0Var;
        this.f53140b = j10;
    }

    @Override
    public final void run() {
        switch (this.f53139a) {
            case 0:
                ga gaVar = (ga) this.f53141c;
                r0 r0Var = (r0) this.d;
                HashMap hashMap = gaVar.f53174j;
                o7 o7Var = o7.AGGREGATED_ON_DEVICE_IMAGE_LABEL_DETECTION;
                if (!hashMap.containsKey(o7Var)) {
                    j jVar = new j();
                    ?? obj = new Object();
                    if (jVar.isEmpty()) {
                        obj.f53142c = jVar;
                        hashMap.put(o7Var, obj);
                    } else {
                        throw new IllegalArgumentException();
                    }
                }
                f fVar = (f) hashMap.get(o7Var);
                Long valueOf = Long.valueOf(this.f53140b);
                j jVar2 = fVar.f53142c;
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
                if (gaVar.c(o7Var, elapsedRealtime)) {
                    gaVar.f53173i.put(o7Var, Long.valueOf(elapsedRealtime));
                    jb.m.f9797a.execute(new u0.b(gaVar, 2));
                    return;
                }
                return;
            default:
                xf xfVar = (xf) this.f53141c;
                hb hbVar = hb.AGGREGATED_ON_DEVICE_SUBJECT_SEGMENTATION_INFERENCE;
                z7.i1 i1Var = (z7.i1) this.d;
                HashMap hashMap2 = xfVar.f55171j;
                if (!hashMap2.containsKey(hbVar)) {
                    z7.d dVar = new z7.d();
                    ?? obj2 = new Object();
                    if (dVar.isEmpty()) {
                        obj2.f55026c = dVar;
                        hashMap2.put(hbVar, obj2);
                    } else {
                        throw new IllegalArgumentException();
                    }
                }
                Long valueOf2 = Long.valueOf(this.f53140b);
                z7.d dVar2 = ((mg) hashMap2.get(hbVar)).f55026c;
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
                    xfVar.f55170i.put(hbVar, Long.valueOf(elapsedRealtime2));
                    jb.m.f9797a.execute(new u0.b(xfVar));
                    return;
                }
                return;
        }
    }

    public ea(xf xfVar, z7.i1 i1Var, long j10) {
        hb hbVar = hb.UNKNOWN_EVENT;
        this.f53141c = xfVar;
        this.d = i1Var;
        this.f53140b = j10;
    }
}
