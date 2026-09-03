package xd;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import oh.h4;
public final class h implements Iterable {
    public final d f50560a;
    public final c f50562c;
    public final g d;
    public boolean f50564f;
    public final ArrayList f50561b = new ArrayList();
    public final ArrayList f50563e = new ArrayList();

    public h(d dVar, Interpolator interpolator, long j10) {
        this.f50560a = dVar;
        this.d = new g(this, dVar);
        if (interpolator != null && j10 > 0) {
            this.f50562c = new c(0, new h4(this, 29), interpolator, j10);
        } else {
            this.f50562c = null;
        }
    }

    public final void i(float f10) {
        boolean z4;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        g gVar = this.d;
        boolean a2 = gVar.f50555b.a(f10);
        if (!gVar.d.a(f10) && !a2) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (!gVar.f50557e.a(f10) && !z4) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!gVar.f50558f.a(f10) && !z10) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!gVar.f50559g.a(f10) && !z11) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (!gVar.f50556c.a(f10) && !z12) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (!gVar.f50554a.l(f10) && !z13) {
            z14 = false;
        } else {
            z14 = true;
        }
        ArrayList arrayList = this.f50561b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            e eVar = (e) obj;
            boolean a10 = eVar.f50551c.a(f10);
            if (!eVar.d.a(f10) && !a10) {
                z15 = false;
            } else {
                z15 = true;
            }
            if (!eVar.f50552e.a(f10) && !z15) {
                z16 = false;
            } else {
                z16 = true;
            }
            if (!eVar.f50553f.a(f10) && !z16) {
                z17 = false;
            } else {
                z17 = true;
            }
            Object obj2 = eVar.f50549a;
            if (obj2 instanceof l) {
                if (!((l) obj2).a(f10) && !z17) {
                    z17 = false;
                } else {
                    z17 = true;
                }
            }
            if (!z17 && !z14) {
                z14 = false;
            } else {
                z14 = true;
            }
        }
        if (z14) {
            this.f50560a.E();
            if (f10 == 1.0f) {
                q(true);
            }
        }
    }

    @Override
    public final Iterator iterator() {
        return this.f50561b.iterator();
    }

    public final e n(int i10) {
        return (e) this.f50561b.get(i10);
    }

    public final void o(boolean z4) {
        ArrayList arrayList;
        boolean z10;
        ArrayList arrayList2 = this.f50563e;
        int size = arrayList2.size();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i14 < size) {
            Object obj = arrayList2.get(i14);
            i14++;
            e eVar = (e) obj;
            Object obj2 = eVar.f50549a;
            k kVar = eVar.f50553f;
            l lVar = eVar.f50552e;
            if (obj2 instanceof f) {
                f fVar = (f) obj2;
                if (eVar.f50550b == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                arrayList2.size();
                int b10 = fVar.b(z10);
                int width = fVar.getWidth();
                int height = fVar.getHeight();
                int i15 = b10 + width + i10;
                int i16 = i11 + b10 + height;
                if (z4 && eVar.c() > 0.0f) {
                    float f10 = i10;
                    float f11 = i11;
                    float f12 = i15;
                    arrayList = arrayList2;
                    float f13 = i16;
                    if (lVar.b(f10, f11, f12, f13)) {
                        p();
                        lVar.e(f10, f11, f12, f13);
                    }
                    float f14 = b10;
                    if (kVar.b(f14)) {
                        p();
                        kVar.f50568c = f14;
                    }
                } else {
                    arrayList = arrayList2;
                    lVar.d(i10, i11, i15, i16);
                    kVar.d(b10);
                }
                i12 = Math.max(i12, width);
                i13 = Math.max(i13, height);
                i11 = i16;
                i10 = i15;
            } else {
                arrayList = arrayList2;
            }
            arrayList2 = arrayList;
        }
        ArrayList arrayList3 = this.f50561b;
        if (z4) {
            int size2 = arrayList3.size();
            int i17 = 0;
            while (i17 < size2) {
                Object obj3 = arrayList3.get(i17);
                i17++;
                Object obj4 = ((e) obj3).f50549a;
            }
        }
        int size3 = arrayList3.size();
        int i18 = 0;
        while (i18 < size3) {
            Object obj5 = arrayList3.get(i18);
            i18++;
            Object obj6 = ((e) obj5).f50549a;
        }
        g gVar = this.d;
        if (z4) {
            k kVar2 = gVar.f50558f;
            d dVar = gVar.f50554a;
            k kVar3 = gVar.f50557e;
            k kVar4 = gVar.d;
            k kVar5 = gVar.f50559g;
            float f15 = i10;
            if (kVar2.b(f15)) {
                p();
                gVar.f50558f.f50568c = f15;
            }
            float f16 = i11;
            if (kVar5.b(f16)) {
                p();
                kVar5.f50568c = f16;
            }
            float f17 = i12;
            if (kVar4.b(f17)) {
                p();
                kVar4.f50568c = f17;
            }
            float f18 = i13;
            if (kVar3.b(f18)) {
                p();
                kVar3.f50568c = f18;
            }
            if (dVar.k()) {
                p();
                dVar.m();
                return;
            }
            return;
        }
        gVar.f50558f.d(i10);
        gVar.f50559g.d(i11);
        gVar.d.d(i12);
        gVar.f50557e.d(i13);
        gVar.f50554a.a();
    }

    public final void p() {
        if (!this.f50564f) {
            this.f50564f = true;
            c cVar = this.f50562c;
            if (cVar != null) {
                cVar.b();
                q(false);
                cVar.c(0.0f);
                return;
            }
            q(false);
        }
    }

    public final void q(boolean z4) {
        ArrayList arrayList = this.f50561b;
        boolean z10 = false;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            e eVar = (e) arrayList.get(size);
            eVar.a(z4);
            if (eVar.c() == 0.0f && eVar.h) {
                arrayList.remove(size);
                Object obj = eVar.f50549a;
                if (obj instanceof ae.a) {
                    ((ae.a) obj).a();
                }
                z10 = true;
            }
        }
        if (z10) {
            arrayList.trimToSize();
        }
        g gVar = this.d;
        gVar.f50555b.c(z4);
        gVar.d.c(z4);
        gVar.f50557e.c(z4);
        gVar.f50558f.c(z4);
        gVar.f50559g.c(z4);
        gVar.f50556c.c(z4);
        gVar.f50554a.i(z4);
    }

    public final void r(List list, boolean z4) {
        boolean isEmpty;
        boolean z10;
        boolean z11;
        int i10;
        boolean z12;
        int i11;
        c cVar = this.f50562c;
        g gVar = this.d;
        ArrayList arrayList = this.f50563e;
        ArrayList arrayList2 = this.f50561b;
        if (!z4) {
            if (cVar != null) {
                cVar.b();
                q(false);
                cVar.c(0.0f);
            } else {
                q(false);
            }
            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                Object obj = ((e) arrayList2.get(size)).f50549a;
                if (obj instanceof ae.a) {
                    ((ae.a) obj).a();
                }
            }
            arrayList2.clear();
            arrayList.clear();
            if (list != null) {
                i11 = list.size();
            } else {
                i11 = 0;
            }
            if (i11 > 0) {
                arrayList2.ensureCapacity(i11);
                arrayList.ensureCapacity(i11);
                for (Object obj2 : list) {
                    e eVar = new e(arrayList.size(), obj2, true);
                    arrayList2.add(eVar);
                    arrayList.add(eVar);
                }
                arrayList2.trimToSize();
                arrayList.trimToSize();
            }
            g.a(gVar, i11, false);
            o(false);
            this.f50560a.E();
            return;
        }
        if (list != null && !list.isEmpty()) {
            if (arrayList.size() == list.size()) {
                for (int i12 = 0; i12 < list.size(); i12++) {
                    if (((e) arrayList.get(i12)).equals(list.get(i12))) {
                    }
                }
                isEmpty = true;
            }
            isEmpty = false;
            break;
        }
        isEmpty = arrayList.isEmpty();
        if (!isEmpty) {
            p();
            if (list != null && !list.isEmpty()) {
                boolean z13 = false;
                int i13 = 0;
                boolean z14 = false;
                for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                    e eVar2 = (e) arrayList2.get(i14);
                    Object obj3 = eVar2.f50549a;
                    k kVar = eVar2.d;
                    k kVar2 = eVar2.f50551c;
                    int indexOf = list.indexOf(obj3);
                    if (indexOf != -1) {
                        i13++;
                        float f10 = indexOf;
                        if (kVar2.b(f10)) {
                            p();
                            kVar2.f50568c = f10;
                        }
                        if (eVar2.f50550b != indexOf) {
                            eVar2.f50550b = indexOf;
                            if (!z13 && eVar2.h) {
                                z13 = false;
                            } else {
                                z13 = true;
                            }
                            z14 = true;
                        }
                        if (kVar.b(1.0f)) {
                            p();
                            kVar.f50568c = 1.0f;
                            eVar2.h = false;
                            arrayList.add(eVar2);
                            g.a(gVar, arrayList.size(), true);
                            z13 = true;
                        }
                    } else if (kVar.b(0.0f)) {
                        p();
                        kVar.f50568c = 0.0f;
                        eVar2.h = true;
                        if (z13) {
                            z12 = arrayList.remove(eVar2);
                        } else {
                            int binarySearch = Collections.binarySearch(arrayList, eVar2);
                            if (binarySearch >= 0) {
                                arrayList.remove(binarySearch);
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                        }
                        if (z12) {
                            g.a(gVar, arrayList.size(), true);
                        } else {
                            throw new IllegalArgumentException();
                        }
                    } else {
                        continue;
                    }
                }
                if (z13) {
                    Collections.sort(arrayList);
                }
                if (i13 < list.size()) {
                    arrayList2.ensureCapacity((list.size() - i13) + arrayList2.size());
                    int i15 = 0;
                    for (Object obj4 : list) {
                        if (obj4 == null) {
                            int size2 = arrayList2.size();
                            i10 = 0;
                            int i16 = 0;
                            while (i16 < size2) {
                                Object obj5 = arrayList2.get(i16);
                                i16++;
                                if (((e) obj5).f50549a == null) {
                                    break;
                                }
                                i10++;
                            }
                            i10 = -1;
                        } else {
                            int size3 = arrayList2.size();
                            i10 = 0;
                            int i17 = 0;
                            while (i17 < size3) {
                                Object obj6 = arrayList2.get(i17);
                                i17++;
                                if (obj4.equals(((e) obj6).f50549a)) {
                                    break;
                                }
                                i10++;
                            }
                            i10 = -1;
                        }
                        if (i10 == -1) {
                            if (i15 != arrayList2.size()) {
                                z14 = true;
                            }
                            p();
                            e eVar3 = new e(i15, obj4, false);
                            eVar3.d.f50568c = 1.0f;
                            eVar3.h = false;
                            arrayList2.add(eVar3);
                            int binarySearch2 = Collections.binarySearch(arrayList, eVar3);
                            if (binarySearch2 < 0) {
                                arrayList.add((-binarySearch2) - 1, eVar3);
                                g.a(gVar, arrayList.size(), true);
                            } else {
                                throw new IllegalArgumentException("Element already exists in list");
                            }
                        }
                        i15++;
                    }
                }
                z11 = z14;
                z10 = true;
            } else {
                if (!this.f50564f) {
                    int size4 = arrayList2.size();
                    int i18 = 0;
                    while (true) {
                        if (i18 >= size4) {
                            break;
                        }
                        Object obj7 = arrayList2.get(i18);
                        i18++;
                        if (((e) obj7).d.b(0.0f)) {
                            p();
                            break;
                        }
                    }
                }
                if (this.f50564f) {
                    int size5 = arrayList2.size();
                    int i19 = 0;
                    while (i19 < size5) {
                        Object obj8 = arrayList2.get(i19);
                        i19++;
                        e eVar4 = (e) obj8;
                        if (eVar4.d.b(0.0f)) {
                            p();
                            eVar4.d.f50568c = 0.0f;
                            eVar4.h = true;
                            int binarySearch3 = Collections.binarySearch(arrayList, eVar4);
                            if (binarySearch3 >= 0) {
                                arrayList.remove(binarySearch3);
                            }
                            g.a(gVar, arrayList.size(), true);
                        }
                    }
                }
                z10 = true;
                z11 = false;
            }
            if (z11) {
                Collections.sort(arrayList2);
            }
            o(z10);
            if (this.f50564f) {
                this.f50564f = false;
                if (cVar != null) {
                    cVar.a(1.0f);
                }
            } else if (cVar == null) {
                int size6 = arrayList2.size();
                int i20 = 0;
                while (i20 < size6) {
                    Object obj9 = arrayList2.get(i20);
                    i20++;
                    e eVar5 = (e) obj9;
                    k kVar3 = eVar5.d;
                    kVar3.f50567b = kVar3.f50566a;
                    k kVar4 = eVar5.f50551c;
                    kVar4.f50567b = kVar4.f50566a;
                }
            }
        }
    }
}
