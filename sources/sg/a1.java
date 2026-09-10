package sg;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.WeakHashMap;
import m.r1;
import m.r3;
import org.telegram.messenger.AndroidUtilities;
import v7.a6;
import x7.a7;
import x7.fa;
import x7.m7;
import x7.o7;
import z7.ed;
import z7.fb;
import z7.hb;
import z7.lg;
import z7.ma;
import z7.wf;
import zh.a3;
import zh.g6;
import zh.k7;
import zh.l7;
import zh.u7;
public final class a1 implements Runnable {
    public final int f41870a;
    public final Object f41871b;

    public a1(Object obj, int i10) {
        this.f41870a = i10;
        this.f41871b = obj;
    }

    @Override
    public final void run() {
        e9.l lVar;
        e9.l lVar2;
        e9.l lVar3 = null;
        int i10 = 3;
        switch (this.f41870a) {
            case 0:
                c1 c1Var = (c1) this.f41871b;
                String str = c1Var.f41891n0;
                if (str != null) {
                    c1Var.T(c1Var.f41895r0, str, false);
                    return;
                }
                return;
            case 1:
                p1 p1Var = (p1) this.f41871b;
                String str2 = p1Var.f41980o0;
                if (str2 != null) {
                    p1.U(p1Var, str2);
                    return;
                }
                return;
            case 2:
                u0.d dVar = (u0.d) this.f41871b;
                r1 r1Var = dVar.f42250c;
                u0.a aVar = dVar.f42248a;
                if (dVar.E) {
                    if (dVar.f42256x) {
                        dVar.f42256x = false;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar.e = currentAnimationTimeMillis;
                        aVar.f42246g = -1L;
                        aVar.f42245f = currentAnimationTimeMillis;
                        aVar.h = 0.5f;
                    }
                    if ((aVar.f42246g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar.f42246g + aVar.f42247i) || !dVar.e()) {
                        dVar.E = false;
                        return;
                    }
                    if (dVar.f42257y) {
                        dVar.f42257y = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        r1Var.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (aVar.f42245f != 0) {
                        long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                        float a2 = aVar.a(currentAnimationTimeMillis2);
                        aVar.f42245f = currentAnimationTimeMillis2;
                        dVar.G.scrollListBy((int) (((float) (currentAnimationTimeMillis2 - aVar.f42245f)) * ((a2 * 4.0f) + ((-4.0f) * a2 * a2)) * aVar.d));
                        WeakHashMap weakHashMap = r0.i0.f41062a;
                        r1Var.postOnAnimation(this);
                        return;
                    }
                    throw new RuntimeException("Cannot compute scroll delta before calling start()");
                }
                return;
            case 3:
                ((ThreadLocal) ((com.google.firebase.messaging.s) this.f41871b).e).set(Boolean.TRUE);
                return;
            case 4:
                fa faVar = (fa) this.f41871b;
                o7 o7Var = o7.AGGREGATED_ON_DEVICE_IMAGE_LABEL_DETECTION;
                HashMap hashMap = faVar.f44768j;
                x7.f fVar = (x7.f) hashMap.get(o7Var);
                if (fVar != null) {
                    x7.f fVar2 = fVar;
                    x7.a aVar2 = fVar2.f44734a;
                    if (aVar2 == null) {
                        x7.f fVar3 = fVar2;
                        x7.a aVar3 = new x7.a(fVar3, fVar3.f44748c);
                        fVar2.f44734a = aVar3;
                        aVar2 = aVar3;
                    }
                    Iterator it = aVar2.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        Object obj = (Collection) fVar.f44748c.get(next);
                        if (obj == null) {
                            obj = new ArrayList(3);
                        }
                        List list = (List) obj;
                        if (list instanceof RandomAccess) {
                            lVar = new e9.l(fVar, next, list, (e9.l) null);
                        } else {
                            lVar = new e9.l(fVar, next, list, (e9.l) null);
                        }
                        ArrayList arrayList = new ArrayList(lVar);
                        Collections.sort(arrayList);
                        ?? obj2 = new Object();
                        int size = arrayList.size();
                        long j3 = 0;
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj3 = arrayList.get(i11);
                            i11++;
                            j3 = ((Long) obj3).longValue() + j3;
                        }
                        obj2.f45026c = Long.valueOf((j3 / arrayList.size()) & Long.MAX_VALUE);
                        obj2.f45024a = Long.valueOf(fa.a(arrayList, 100.0d) & Long.MAX_VALUE);
                        obj2.f45027f = Long.valueOf(fa.a(arrayList, 75.0d) & Long.MAX_VALUE);
                        obj2.e = Long.valueOf(fa.a(arrayList, 50.0d) & Long.MAX_VALUE);
                        obj2.d = Long.valueOf(fa.a(arrayList, 25.0d) & Long.MAX_VALUE);
                        obj2.f45025b = Long.valueOf(fa.a(arrayList, 0.0d) & Long.MAX_VALUE);
                        a7 a7Var = new a7(obj2);
                        int size2 = arrayList.size();
                        ?? obj4 = new Object();
                        obj4.f6105c = m7.TYPE_THIN;
                        a6 a6Var = new a6(5, false);
                        a6Var.f42935c = Integer.valueOf(size2 & Integer.MAX_VALUE);
                        a6Var.f42934b = (x7.r0) next;
                        a6Var.d = a7Var;
                        obj4.f6106f = new x7.s0(a6Var);
                        qb.m.f40631a.execute(new com.google.android.gms.internal.cast.p(faVar, new a5.a((com.google.firebase.messaging.n) obj4, 0), o7Var, faVar.b(), 7));
                    }
                    hashMap.remove(o7Var);
                    return;
                }
                return;
            case 5:
                for (Thread thread : xf.e.f45109w.keySet()) {
                    if (!thread.isAlive()) {
                        xf.e.f45109w.remove(thread);
                    }
                }
                if (!xf.e.f45109w.isEmpty()) {
                    AndroidUtilities.runOnUIThread(((xf.e) this.f41871b).f45125p, 5000L);
                    return;
                } else {
                    xf.e.f45110x = false;
                    return;
                }
            case 6:
                xf.y yVar = (xf.y) this.f41871b;
                if (yVar.F.get()) {
                    yVar.invalidate();
                    yVar.H.postDelayed(this, 300L);
                    return;
                }
                return;
            case 7:
                ((y2.l) this.f41871b).b();
                return;
            case 8:
                z4.g gVar = (z4.g) this.f41871b;
                gVar.setScrollState(0);
                gVar.s();
                return;
            case 9:
                wf wfVar = (wf) this.f41871b;
                hb hbVar = hb.AGGREGATED_ON_DEVICE_SUBJECT_SEGMENTATION_INFERENCE;
                HashMap hashMap2 = wfVar.f47797j;
                lg lgVar = (lg) hashMap2.get(hbVar);
                if (lgVar != null) {
                    lg lgVar2 = lgVar;
                    ed edVar = lgVar2.f47644a;
                    if (edVar == null) {
                        lg lgVar3 = lgVar2;
                        ed edVar2 = new ed(lgVar3, lgVar3.f47654c);
                        lgVar2.f47644a = edVar2;
                        edVar = edVar2;
                    }
                    Iterator it2 = edVar.iterator();
                    while (it2.hasNext()) {
                        Object next2 = it2.next();
                        Object obj5 = (Collection) lgVar.f47654c.get(next2);
                        if (obj5 == null) {
                            obj5 = new ArrayList(i10);
                        }
                        List list2 = (List) obj5;
                        if (list2 instanceof RandomAccess) {
                            lVar2 = new e9.l(lgVar, next2, list2, lVar3);
                        } else {
                            lVar2 = new e9.l(lgVar, next2, list2, lVar3);
                        }
                        ArrayList arrayList2 = new ArrayList(lVar2);
                        Collections.sort(arrayList2);
                        ?? obj6 = new Object();
                        int size3 = arrayList2.size();
                        long j10 = 0;
                        int i12 = 0;
                        while (i12 < size3) {
                            Object obj7 = arrayList2.get(i12);
                            i12++;
                            j10 = ((Long) obj7).longValue() + j10;
                        }
                        hb hbVar2 = hbVar;
                        obj6.f45026c = Long.valueOf((j10 / arrayList2.size()) & Long.MAX_VALUE);
                        obj6.f45024a = Long.valueOf(wf.a(arrayList2, 100.0d) & Long.MAX_VALUE);
                        obj6.f45027f = Long.valueOf(wf.a(arrayList2, 75.0d) & Long.MAX_VALUE);
                        obj6.e = Long.valueOf(wf.a(arrayList2, 50.0d) & Long.MAX_VALUE);
                        obj6.d = Long.valueOf(wf.a(arrayList2, 25.0d) & Long.MAX_VALUE);
                        obj6.f45025b = Long.valueOf(wf.a(arrayList2, 0.0d) & Long.MAX_VALUE);
                        ma maVar = new ma(obj6);
                        int size4 = arrayList2.size();
                        ?? obj8 = new Object();
                        obj8.f13139c = fb.TYPE_THIN;
                        a6 a6Var2 = new a6(11, false);
                        a6Var2.f42935c = Integer.valueOf(size4 & Integer.MAX_VALUE);
                        a6Var2.f42934b = (z7.i1) next2;
                        a6Var2.d = maVar;
                        obj8.h = new z7.j1(a6Var2);
                        wf wfVar2 = wfVar;
                        qb.m.f40631a.execute(new com.google.android.gms.internal.cast.p(wfVar2, new a5.a((r3) obj8, 0), hbVar2, wfVar.c(), 8));
                        hbVar = hbVar2;
                        wfVar = wfVar2;
                        lVar3 = null;
                        i10 = 3;
                    }
                    hashMap2.remove(hbVar);
                    return;
                }
                return;
            case 10:
                a3 a3Var = (a3) this.f41871b;
                if (a3Var.K1 && a3Var.f48156b1) {
                    u7 u7Var = ((l7) a3Var.Q1).d;
                    u7Var.l1 = false;
                    u7Var.P();
                    return;
                }
                return;
            case 11:
                ((k7) this.f41871b).L0 = false;
                return;
            default:
                g6 g6Var = (g6) this.f41871b;
                g6Var.f48453b = false;
                g6Var.invalidate();
                return;
        }
    }

    public a1(wf wfVar) {
        this.f41870a = 9;
        hb hbVar = hb.UNKNOWN_EVENT;
        this.f41871b = wfVar;
    }
}
