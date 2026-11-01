package u0;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import com.google.android.gms.internal.cast.o;
import e9.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.WeakHashMap;
import jg.g3;
import m.p3;
import m.r1;
import r0.h0;
import vh.s7;
import x7.a7;
import x7.ga;
import x7.m7;
import x7.o7;
import x7.r0;
import x7.s0;
import xa.n;
import z7.ed;
import z7.fb;
import z7.hb;
import z7.i1;
import z7.j1;
import z7.ma;
import z7.mg;
import z7.xf;
public final class b implements Runnable {
    public final int f49811a;
    public final Object f49812b;

    public b(Object obj, int i10) {
        this.f49811a = i10;
        this.f49812b = obj;
    }

    @Override
    public final void run() {
        m mVar;
        m mVar2;
        int i10 = this.f49811a;
        jb.m mVar3 = jb.m.f9798a;
        double d = 75.0d;
        double d10 = 100.0d;
        m mVar4 = null;
        int i11 = 3;
        Object obj = this.f49812b;
        switch (i10) {
            case 0:
                e eVar = (e) obj;
                r1 r1Var = eVar.f49815c;
                a aVar = eVar.f49813a;
                if (eVar.E) {
                    if (eVar.f49822y) {
                        eVar.f49822y = false;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar.e = currentAnimationTimeMillis;
                        aVar.f49809g = -1L;
                        aVar.f49808f = currentAnimationTimeMillis;
                        aVar.h = 0.5f;
                    }
                    if ((aVar.f49809g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar.f49809g + aVar.f49810i) || !eVar.e()) {
                        eVar.E = false;
                        return;
                    }
                    if (eVar.D) {
                        eVar.D = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        r1Var.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (aVar.f49808f != 0) {
                        long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                        float a2 = aVar.a(currentAnimationTimeMillis2);
                        aVar.f49808f = currentAnimationTimeMillis2;
                        eVar.G.scrollListBy((int) (((float) (currentAnimationTimeMillis2 - aVar.f49808f)) * ((a2 * 4.0f) + ((-4.0f) * a2 * a2)) * aVar.d));
                        WeakHashMap weakHashMap = h0.f46134a;
                        r1Var.postOnAnimation(this);
                        return;
                    }
                    throw new RuntimeException("Cannot compute scroll delta before calling start()");
                }
                return;
            case 1:
                jg.j jVar = ((s7) obj).f50993s0;
                if (jVar instanceof g3) {
                    ((g3) jVar).getEditText();
                    return;
                }
                return;
            case 2:
                ga gaVar = (ga) obj;
                HashMap hashMap = gaVar.f53192j;
                o7 o7Var = o7.AGGREGATED_ON_DEVICE_IMAGE_LABEL_DETECTION;
                x7.f fVar = (x7.f) hashMap.get(o7Var);
                if (fVar != null) {
                    x7.f fVar2 = fVar;
                    x7.a aVar2 = fVar2.f53143a;
                    if (aVar2 == null) {
                        x7.f fVar3 = fVar2;
                        x7.a aVar3 = new x7.a(fVar3, fVar3.f53160c);
                        fVar2.f53143a = aVar3;
                        aVar2 = aVar3;
                    }
                    Iterator it = aVar2.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        Object obj2 = (Collection) fVar.f53160c.get(next);
                        if (obj2 == null) {
                            obj2 = new ArrayList(3);
                        }
                        List list = (List) obj2;
                        if (list instanceof RandomAccess) {
                            mVar = new m(fVar, next, list, (m) null);
                        } else {
                            mVar = new m(fVar, next, list, (m) null);
                        }
                        ArrayList arrayList = new ArrayList(mVar);
                        Collections.sort(arrayList);
                        ?? obj3 = new Object();
                        int size = arrayList.size();
                        long j10 = 0;
                        int i12 = 0;
                        while (i12 < size) {
                            Object obj4 = arrayList.get(i12);
                            i12++;
                            j10 = ((Long) obj4).longValue() + j10;
                        }
                        obj3.f53441c = Long.valueOf((j10 / arrayList.size()) & Long.MAX_VALUE);
                        obj3.f53439a = Long.valueOf(ga.a(arrayList, d10) & Long.MAX_VALUE);
                        obj3.f53442f = Long.valueOf(ga.a(arrayList, 75.0d) & Long.MAX_VALUE);
                        obj3.e = Long.valueOf(ga.a(arrayList, 50.0d) & Long.MAX_VALUE);
                        obj3.d = Long.valueOf(ga.a(arrayList, 25.0d) & Long.MAX_VALUE);
                        obj3.f53440b = Long.valueOf(ga.a(arrayList, 0.0d) & Long.MAX_VALUE);
                        a7 a7Var = new a7(obj3);
                        int size2 = arrayList.size();
                        ?? obj5 = new Object();
                        obj5.f9350c = m7.TYPE_THIN;
                        q5.d dVar = new q5.d(19, false);
                        dVar.f45499c = Integer.valueOf(size2 & Integer.MAX_VALUE);
                        dVar.f45498b = (r0) next;
                        dVar.d = a7Var;
                        obj5.f9351f = new s0(dVar);
                        mVar3.execute(new o(gaVar, new a5.a((j2.f) obj5, 0), o7Var, gaVar.b(), 7));
                        d10 = 100.0d;
                    }
                    hashMap.remove(o7Var);
                    return;
                }
                return;
            case 3:
                ((ThreadLocal) ((n) obj).d).set(Boolean.TRUE);
                return;
            case 4:
                ((y2.j) obj).b();
                return;
            case 5:
                z4.g gVar = (z4.g) obj;
                gVar.setScrollState(0);
                gVar.s();
                return;
            default:
                xf xfVar = (xf) obj;
                hb hbVar = hb.AGGREGATED_ON_DEVICE_SUBJECT_SEGMENTATION_INFERENCE;
                HashMap hashMap2 = xfVar.f55189j;
                mg mgVar = (mg) hashMap2.get(hbVar);
                if (mgVar != null) {
                    mg mgVar2 = mgVar;
                    ed edVar = mgVar2.f55030a;
                    if (edVar == null) {
                        mg mgVar3 = mgVar2;
                        ed edVar2 = new ed(mgVar3, mgVar3.f55044c);
                        mgVar2.f55030a = edVar2;
                        edVar = edVar2;
                    }
                    Iterator it2 = edVar.iterator();
                    while (it2.hasNext()) {
                        Object next2 = it2.next();
                        Object obj6 = (Collection) mgVar.f55044c.get(next2);
                        if (obj6 == null) {
                            obj6 = new ArrayList(i11);
                        }
                        List list2 = (List) obj6;
                        if (list2 instanceof RandomAccess) {
                            mVar2 = new m(mgVar, next2, list2, mVar4);
                        } else {
                            mVar2 = new m(mgVar, next2, list2, mVar4);
                        }
                        ArrayList arrayList2 = new ArrayList(mVar2);
                        Collections.sort(arrayList2);
                        ?? obj7 = new Object();
                        int size3 = arrayList2.size();
                        long j11 = 0;
                        int i13 = 0;
                        while (i13 < size3) {
                            Object obj8 = arrayList2.get(i13);
                            i13++;
                            j11 = ((Long) obj8).longValue() + j11;
                        }
                        obj7.f53441c = Long.valueOf((j11 / arrayList2.size()) & Long.MAX_VALUE);
                        obj7.f53439a = Long.valueOf(xf.a(arrayList2, 100.0d) & Long.MAX_VALUE);
                        obj7.f53442f = Long.valueOf(xf.a(arrayList2, d) & Long.MAX_VALUE);
                        obj7.e = Long.valueOf(xf.a(arrayList2, 50.0d) & Long.MAX_VALUE);
                        obj7.d = Long.valueOf(xf.a(arrayList2, 25.0d) & Long.MAX_VALUE);
                        obj7.f53440b = Long.valueOf(xf.a(arrayList2, 0.0d) & Long.MAX_VALUE);
                        ma maVar = new ma(obj7);
                        int size4 = arrayList2.size();
                        ?? obj9 = new Object();
                        obj9.f12521c = fb.TYPE_THIN;
                        q5.d dVar2 = new q5.d(27, false);
                        dVar2.f45499c = Integer.valueOf(size4 & Integer.MAX_VALUE);
                        dVar2.f45498b = (i1) next2;
                        dVar2.d = maVar;
                        obj9.h = new j1(dVar2);
                        xf xfVar2 = xfVar;
                        mVar3.execute(new o(xfVar2, new a5.a((p3) obj9, 0), hbVar, xfVar.c(), 8));
                        xfVar = xfVar2;
                        d = 75.0d;
                        mVar4 = null;
                        i11 = 3;
                    }
                    hashMap2.remove(hbVar);
                    return;
                }
                return;
        }
    }

    public b(xf xfVar) {
        this.f49811a = 6;
        hb hbVar = hb.UNKNOWN_EVENT;
        this.f49812b = xfVar;
    }
}
