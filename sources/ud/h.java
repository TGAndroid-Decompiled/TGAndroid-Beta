package ud;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class h implements Iterable {

    public final d f48516a;

    public final c f48518c;
    public final g d;

    public boolean f48520f;

    public final ArrayList f48517b = new ArrayList();

    public final ArrayList f48519e = new ArrayList();

    public h(d dVar, Interpolator interpolator, long j10) {
        this.f48516a = dVar;
        this.d = new g(this, dVar);
        if (interpolator == null || j10 <= 0) {
            this.f48518c = null;
        } else {
            this.f48518c = new c(0, new o0.b(this, 20), interpolator, j10);
        }
    }

    public final void i(float f10) {
        g gVar = this.d;
        boolean z10 = gVar.f48510a.G(f10) || (gVar.f48512c.a(f10) || (gVar.f48515g.a(f10) || (gVar.f48514f.a(f10) || (gVar.f48513e.a(f10) || (gVar.d.a(f10) || gVar.f48511b.a(f10))))));
        ArrayList arrayList = this.f48517b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            e eVar = (e) obj;
            boolean z11 = eVar.f48509f.a(f10) || (eVar.f48508e.a(f10) || (eVar.d.a(f10) || eVar.f48507c.a(f10)));
            Object obj2 = eVar.f48505a;
            if (obj2 instanceof l) {
                z11 = ((l) obj2).a(f10) || z11;
            }
            z10 = z11 || z10;
        }
        if (z10) {
            this.f48516a.l1();
            if (f10 == 1.0f) {
                q(true);
            }
        }
    }

    @Override
    public final Iterator iterator() {
        return this.f48517b.iterator();
    }

    public final e n(int i10) {
        return (e) this.f48517b.get(i10);
    }

    public final void o(boolean z10) {
        ArrayList arrayList;
        ArrayList arrayList2 = this.f48519e;
        int size = arrayList2.size();
        int i10 = 0;
        int i11 = 0;
        int iMax = 0;
        int iMax2 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList2.get(i12);
            i12++;
            e eVar = (e) obj;
            Object obj2 = eVar.f48505a;
            k kVar = eVar.f48509f;
            l lVar = eVar.f48508e;
            if (obj2 instanceof f) {
                f fVar = (f) obj2;
                boolean z11 = eVar.f48506b == 0;
                arrayList2.size();
                int iB = fVar.b(z11);
                int width = fVar.getWidth();
                int height = fVar.getHeight();
                int i13 = iB + width + i10;
                int i14 = i11 + iB + height;
                if (!z10 || eVar.c() <= 0.0f) {
                    arrayList = arrayList2;
                    lVar.d(i10, i11, i13, i14);
                    kVar.d(iB);
                } else {
                    float f10 = i10;
                    float f11 = i11;
                    float f12 = i13;
                    arrayList = arrayList2;
                    float f13 = i14;
                    if (lVar.b(f10, f11, f12, f13)) {
                        p();
                        lVar.e(f10, f11, f12, f13);
                    }
                    float f14 = iB;
                    if (kVar.b(f14)) {
                        p();
                        kVar.f48524c = f14;
                    }
                }
                iMax = Math.max(iMax, width);
                iMax2 = Math.max(iMax2, height);
                i11 = i14;
                i10 = i13;
            } else {
                arrayList = arrayList2;
            }
            arrayList2 = arrayList;
        }
        ArrayList arrayList3 = this.f48517b;
        if (z10) {
            int size2 = arrayList3.size();
            int i15 = 0;
            while (i15 < size2) {
                Object obj3 = arrayList3.get(i15);
                i15++;
                Object obj4 = ((e) obj3).f48505a;
            }
        }
        int size3 = arrayList3.size();
        int i16 = 0;
        while (i16 < size3) {
            Object obj5 = arrayList3.get(i16);
            i16++;
            Object obj6 = ((e) obj5).f48505a;
        }
        g gVar = this.d;
        if (!z10) {
            gVar.f48514f.d(i10);
            gVar.f48515g.d(i11);
            gVar.d.d(iMax);
            gVar.f48513e.d(iMax2);
            gVar.f48510a.b();
            return;
        }
        k kVar2 = gVar.f48514f;
        d dVar = gVar.f48510a;
        k kVar3 = gVar.f48513e;
        k kVar4 = gVar.d;
        k kVar5 = gVar.f48515g;
        float f15 = i10;
        if (kVar2.b(f15)) {
            p();
            gVar.f48514f.f48524c = f15;
        }
        float f16 = i11;
        if (kVar5.b(f16)) {
            p();
            kVar5.f48524c = f16;
        }
        float f17 = iMax;
        if (kVar4.b(f17)) {
            p();
            kVar4.f48524c = f17;
        }
        float f18 = iMax2;
        if (kVar3.b(f18)) {
            p();
            kVar3.f48524c = f18;
        }
        if (dVar.E()) {
            p();
            dVar.K();
        }
    }

    public final void p() {
        if (this.f48520f) {
            return;
        }
        this.f48520f = true;
        c cVar = this.f48518c;
        if (cVar == null) {
            q(false);
            return;
        }
        cVar.b();
        q(false);
        cVar.c(0.0f);
    }

    public final void q(boolean z10) {
        ArrayList arrayList = this.f48517b;
        boolean z11 = false;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            e eVar = (e) arrayList.get(size);
            eVar.a(z10);
            if (eVar.c() == 0.0f && eVar.h) {
                arrayList.remove(size);
                Object obj = eVar.f48505a;
                if (obj instanceof xd.a) {
                    ((xd.a) obj).a();
                }
                z11 = true;
            }
        }
        if (z11) {
            arrayList.trimToSize();
        }
        g gVar = this.d;
        gVar.f48511b.c(z10);
        gVar.d.c(z10);
        gVar.f48513e.c(z10);
        gVar.f48514f.c(z10);
        gVar.f48515g.c(z10);
        gVar.f48512c.c(z10);
        gVar.f48510a.A(z10);
    }

    public final void r(List list, boolean z10) {
        boolean zIsEmpty;
        boolean z11;
        boolean z12;
        int i10;
        boolean zRemove;
        c cVar = this.f48518c;
        g gVar = this.d;
        ArrayList arrayList = this.f48519e;
        ArrayList arrayList2 = this.f48517b;
        if (!z10) {
            if (cVar != null) {
                cVar.b();
                q(false);
                cVar.c(0.0f);
            } else {
                q(false);
            }
            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                Object obj = ((e) arrayList2.get(size)).f48505a;
                if (obj instanceof xd.a) {
                    ((xd.a) obj).a();
                }
            }
            arrayList2.clear();
            arrayList.clear();
            int size2 = list != null ? list.size() : 0;
            if (size2 > 0) {
                arrayList2.ensureCapacity(size2);
                arrayList.ensureCapacity(size2);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    e eVar = new e(arrayList.size(), it.next(), true);
                    arrayList2.add(eVar);
                    arrayList.add(eVar);
                }
                arrayList2.trimToSize();
                arrayList.trimToSize();
            }
            g.a(gVar, size2, false);
            o(false);
            this.f48516a.l1();
            return;
        }
        if (list != null && !list.isEmpty()) {
            if (arrayList.size() != list.size()) {
                zIsEmpty = false;
                break;
            }
            int i11 = 0;
            while (true) {
                if (i11 >= list.size()) {
                    zIsEmpty = true;
                    break;
                } else {
                    if (!((e) arrayList.get(i11)).equals(list.get(i11))) {
                        zIsEmpty = false;
                        break;
                    }
                    i11++;
                }
            }
        } else {
            zIsEmpty = arrayList.isEmpty();
        }
        if (zIsEmpty) {
            return;
        }
        p();
        if (list == null || list.isEmpty()) {
            if (!this.f48520f) {
                int size3 = arrayList2.size();
                int i12 = 0;
                while (i12 < size3) {
                    Object obj2 = arrayList2.get(i12);
                    i12++;
                    if (((e) obj2).d.b(0.0f)) {
                        p();
                        break;
                    }
                }
            }
            if (this.f48520f) {
                int size4 = arrayList2.size();
                int i13 = 0;
                while (i13 < size4) {
                    Object obj3 = arrayList2.get(i13);
                    i13++;
                    e eVar2 = (e) obj3;
                    if (eVar2.d.b(0.0f)) {
                        p();
                        eVar2.d.f48524c = 0.0f;
                        eVar2.h = true;
                        int iBinarySearch = Collections.binarySearch(arrayList, eVar2);
                        if (iBinarySearch >= 0) {
                            arrayList.remove(iBinarySearch);
                        }
                        g.a(gVar, arrayList.size(), true);
                    }
                }
            }
            z11 = true;
            z12 = false;
        } else {
            boolean z13 = false;
            int i14 = 0;
            boolean z14 = false;
            for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                e eVar3 = (e) arrayList2.get(i15);
                Object obj4 = eVar3.f48505a;
                k kVar = eVar3.d;
                k kVar2 = eVar3.f48507c;
                int iIndexOf = list.indexOf(obj4);
                if (iIndexOf != -1) {
                    i14++;
                    float f10 = iIndexOf;
                    if (kVar2.b(f10)) {
                        p();
                        kVar2.f48524c = f10;
                    }
                    if (eVar3.f48506b != iIndexOf) {
                        eVar3.f48506b = iIndexOf;
                        z13 = z13 || !eVar3.h;
                        z14 = true;
                    }
                    if (kVar.b(1.0f)) {
                        p();
                        kVar.f48524c = 1.0f;
                        eVar3.h = false;
                        arrayList.add(eVar3);
                        g.a(gVar, arrayList.size(), true);
                        z13 = true;
                    }
                } else if (kVar.b(0.0f)) {
                    p();
                    kVar.f48524c = 0.0f;
                    eVar3.h = true;
                    if (z13) {
                        zRemove = arrayList.remove(eVar3);
                    } else {
                        int iBinarySearch2 = Collections.binarySearch(arrayList, eVar3);
                        if (iBinarySearch2 >= 0) {
                            arrayList.remove(iBinarySearch2);
                            zRemove = true;
                        } else {
                            zRemove = false;
                        }
                    }
                    if (!zRemove) {
                        throw new IllegalArgumentException();
                    }
                    g.a(gVar, arrayList.size(), true);
                } else {
                    continue;
                }
            }
            if (z13) {
                Collections.sort(arrayList);
            }
            if (i14 < list.size()) {
                arrayList2.ensureCapacity((list.size() - i14) + arrayList2.size());
                int i16 = 0;
                for (Object obj5 : list) {
                    if (obj5 != null) {
                        int size5 = arrayList2.size();
                        i10 = 0;
                        int i17 = 0;
                        while (true) {
                            if (i17 >= size5) {
                                i10 = -1;
                                break;
                            }
                            Object obj6 = arrayList2.get(i17);
                            i17++;
                            if (obj5.equals(((e) obj6).f48505a)) {
                                break;
                            } else {
                                i10++;
                            }
                        }
                    } else {
                        int size6 = arrayList2.size();
                        i10 = 0;
                        int i18 = 0;
                        while (true) {
                            if (i18 >= size6) {
                                i10 = -1;
                                break;
                            }
                            Object obj7 = arrayList2.get(i18);
                            i18++;
                            if (((e) obj7).f48505a == null) {
                                break;
                            } else {
                                i10++;
                            }
                        }
                    }
                    if (i10 == -1) {
                        if (i16 != arrayList2.size()) {
                            z14 = true;
                        }
                        p();
                        e eVar4 = new e(i16, obj5, false);
                        eVar4.d.f48524c = 1.0f;
                        eVar4.h = false;
                        arrayList2.add(eVar4);
                        int iBinarySearch3 = Collections.binarySearch(arrayList, eVar4);
                        if (iBinarySearch3 >= 0) {
                            throw new IllegalArgumentException("Element already exists in list");
                        }
                        arrayList.add((-iBinarySearch3) - 1, eVar4);
                        g.a(gVar, arrayList.size(), true);
                    }
                    i16++;
                }
            }
            z12 = z14;
            z11 = true;
        }
        if (z12) {
            Collections.sort(arrayList2);
        }
        o(z11);
        if (this.f48520f) {
            this.f48520f = false;
            if (cVar != null) {
                cVar.a(1.0f);
                return;
            }
            return;
        }
        if (cVar == null) {
            int size7 = arrayList2.size();
            int i19 = 0;
            while (i19 < size7) {
                Object obj8 = arrayList2.get(i19);
                i19++;
                e eVar5 = (e) obj8;
                k kVar3 = eVar5.d;
                kVar3.f48523b = kVar3.f48522a;
                k kVar4 = eVar5.f48507c;
                kVar4.f48523b = kVar4.f48522a;
            }
        }
    }
}
