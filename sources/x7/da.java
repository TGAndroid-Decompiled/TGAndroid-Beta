package x7;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import z7.ib;
import z7.mg;
import z7.xf;
public final class da implements Runnable {
    public final int f49347a = 0;
    public final long f49348b;
    public final Object f49349c;
    public final Object d;

    public da(fa faVar, r0 r0Var, long j10) {
        this.f49349c = faVar;
        this.d = r0Var;
        this.f49348b = j10;
    }

    @Override
    public final void run() {
        switch (this.f49347a) {
            case 0:
                fa faVar = (fa) this.f49349c;
                r0 r0Var = (r0) this.d;
                HashMap hashMap = faVar.f49384j;
                o7 o7Var = o7.AGGREGATED_ON_DEVICE_IMAGE_LABEL_DETECTION;
                if (!hashMap.containsKey(o7Var)) {
                    j jVar = new j();
                    ?? obj = new Object();
                    if (jVar.isEmpty()) {
                        obj.f49364c = jVar;
                        hashMap.put(o7Var, obj);
                    } else {
                        throw new IllegalArgumentException();
                    }
                }
                f fVar = (f) hashMap.get(o7Var);
                Long valueOf = Long.valueOf(this.f49348b);
                j jVar2 = fVar.f49364c;
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
                    faVar.f49383i.put(o7Var, Long.valueOf(elapsedRealtime));
                    rb.m.f45199a.execute(new p8.b(faVar, 9));
                    return;
                }
                return;
            default:
                xf xfVar = (xf) this.f49349c;
                ib ibVar = ib.AGGREGATED_ON_DEVICE_SUBJECT_SEGMENTATION_INFERENCE;
                z7.i1 i1Var = (z7.i1) this.d;
                HashMap hashMap2 = xfVar.f51252j;
                if (!hashMap2.containsKey(ibVar)) {
                    z7.d dVar = new z7.d();
                    ?? obj2 = new Object();
                    if (dVar.isEmpty()) {
                        obj2.f51105c = dVar;
                        hashMap2.put(ibVar, obj2);
                    } else {
                        throw new IllegalArgumentException();
                    }
                }
                Long valueOf2 = Long.valueOf(this.f49348b);
                z7.d dVar2 = ((mg) hashMap2.get(ibVar)).f51105c;
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
                if (xfVar.d(ibVar, elapsedRealtime2)) {
                    xfVar.f51251i.put(ibVar, Long.valueOf(elapsedRealtime2));
                    rb.m.f45199a.execute(new p8.b(xfVar));
                    return;
                }
                return;
        }
    }

    public da(xf xfVar, z7.i1 i1Var, long j10) {
        ib ibVar = ib.UNKNOWN_EVENT;
        this.f49349c = xfVar;
        this.d = i1Var;
        this.f49348b = j10;
    }
}
