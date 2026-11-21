package te;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.telegram.ui.Cells.c5;
public final class h implements Iterable {
    public final d f57716a;
    public final c f57718c;
    public final g d;
    public boolean f57720f;
    public final ArrayList f57717b = new ArrayList();
    public final ArrayList f57719e = new ArrayList();

    public h(d dVar, Interpolator interpolator, long j3) {
        this.f57716a = dVar;
        this.d = new g(this, dVar);
        if (interpolator != null && j3 > 0) {
            this.f57718c = new c(0, new c5(this), interpolator, j3);
        } else {
            this.f57718c = null;
        }
    }

    public final void f(float f10) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        g gVar = this.d;
        boolean a10 = gVar.f57711b.a(f10);
        if (!gVar.d.a(f10) && !a10) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!gVar.f57713e.a(f10) && !z10) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!gVar.f57714f.a(f10) && !z11) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (!gVar.f57715g.a(f10) && !z12) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (!gVar.f57712c.a(f10) && !z13) {
            z14 = false;
        } else {
            z14 = true;
        }
        if (!gVar.f57710a.D(f10) && !z14) {
            z15 = false;
        } else {
            z15 = true;
        }
        ArrayList arrayList = this.f57717b;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            e eVar = (e) obj;
            boolean a11 = eVar.f57707c.a(f10);
            if (!eVar.d.a(f10) && !a11) {
                z16 = false;
            } else {
                z16 = true;
            }
            if (!eVar.f57708e.a(f10) && !z16) {
                z17 = false;
            } else {
                z17 = true;
            }
            if (!eVar.f57709f.a(f10) && !z17) {
                z18 = false;
            } else {
                z18 = true;
            }
            Object obj2 = eVar.f57705a;
            if (obj2 instanceof l) {
                if (!((l) obj2).a(f10) && !z18) {
                    z18 = false;
                } else {
                    z18 = true;
                }
            }
            if (!z18 && !z15) {
                z15 = false;
            } else {
                z15 = true;
            }
        }
        if (z15) {
            this.f57716a.m1();
            if (f10 == 1.0f) {
                l(true);
            }
        }
    }

    public final e i(int i7) {
        return (e) this.f57717b.get(i7);
    }

    @Override
    public final Iterator iterator() {
        return this.f57717b.iterator();
    }

    public final void j(boolean z10) {
        ArrayList arrayList;
        boolean z11;
        ArrayList arrayList2 = this.f57719e;
        int size = arrayList2.size();
        int i7 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayList2.get(i13);
            i13++;
            e eVar = (e) obj;
            Object obj2 = eVar.f57705a;
            k kVar = eVar.f57709f;
            l lVar = eVar.f57708e;
            if (obj2 instanceof f) {
                f fVar = (f) obj2;
                if (eVar.f57706b == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                arrayList2.size();
                int b10 = fVar.b(z11);
                int width = fVar.getWidth();
                int height = fVar.getHeight();
                int i14 = b10 + width + i7;
                int i15 = i10 + b10 + height;
                if (z10 && eVar.c() > 0.0f) {
                    float f10 = i7;
                    float f11 = i10;
                    float f12 = i14;
                    arrayList = arrayList2;
                    float f13 = i15;
                    if (lVar.b(f10, f11, f12, f13)) {
                        k();
                        lVar.e(f10, f11, f12, f13);
                    }
                    float f14 = b10;
                    if (kVar.b(f14)) {
                        k();
                        kVar.f57724c = f14;
                    }
                } else {
                    arrayList = arrayList2;
                    lVar.d(i7, i10, i14, i15);
                    kVar.d(b10);
                }
                i11 = Math.max(i11, width);
                i12 = Math.max(i12, height);
                i10 = i15;
                i7 = i14;
            } else {
                arrayList = arrayList2;
            }
            arrayList2 = arrayList;
        }
        ArrayList arrayList3 = this.f57717b;
        if (z10) {
            int size2 = arrayList3.size();
            int i16 = 0;
            while (i16 < size2) {
                Object obj3 = arrayList3.get(i16);
                i16++;
                Object obj4 = ((e) obj3).f57705a;
            }
        }
        int size3 = arrayList3.size();
        int i17 = 0;
        while (i17 < size3) {
            Object obj5 = arrayList3.get(i17);
            i17++;
            Object obj6 = ((e) obj5).f57705a;
        }
        g gVar = this.d;
        if (z10) {
            k kVar2 = gVar.f57714f;
            d dVar = gVar.f57710a;
            k kVar3 = gVar.f57713e;
            k kVar4 = gVar.d;
            k kVar5 = gVar.f57715g;
            float f15 = i7;
            if (kVar2.b(f15)) {
                k();
                gVar.f57714f.f57724c = f15;
            }
            float f16 = i10;
            if (kVar5.b(f16)) {
                k();
                kVar5.f57724c = f16;
            }
            float f17 = i11;
            if (kVar4.b(f17)) {
                k();
                kVar4.f57724c = f17;
            }
            float f18 = i12;
            if (kVar3.b(f18)) {
                k();
                kVar3.f57724c = f18;
            }
            if (dVar.C()) {
                k();
                dVar.H();
                return;
            }
            return;
        }
        gVar.f57714f.d(i7);
        gVar.f57715g.d(i10);
        gVar.d.d(i11);
        gVar.f57713e.d(i12);
        gVar.f57710a.a();
    }

    public final void k() {
        if (!this.f57720f) {
            this.f57720f = true;
            c cVar = this.f57718c;
            if (cVar != null) {
                cVar.b();
                l(false);
                cVar.c(0.0f);
                return;
            }
            l(false);
        }
    }

    public final void l(boolean z10) {
        ArrayList arrayList = this.f57717b;
        boolean z11 = false;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            e eVar = (e) arrayList.get(size);
            eVar.a(z10);
            if (eVar.c() == 0.0f && eVar.h) {
                arrayList.remove(size);
                Object obj = eVar.f57705a;
                if (obj instanceof we.a) {
                    ((we.a) obj).a();
                }
                z11 = true;
            }
        }
        if (z11) {
            arrayList.trimToSize();
        }
        g gVar = this.d;
        gVar.f57711b.c(z10);
        gVar.d.c(z10);
        gVar.f57713e.c(z10);
        gVar.f57714f.c(z10);
        gVar.f57715g.c(z10);
        gVar.f57712c.c(z10);
        gVar.f57710a.x(z10);
    }

    public final void m(List list, boolean z10) {
        boolean isEmpty;
        boolean z11;
        boolean z12;
        int i7;
        boolean z13;
        int i10;
        c cVar = this.f57718c;
        g gVar = this.d;
        ArrayList arrayList = this.f57719e;
        ArrayList arrayList2 = this.f57717b;
        if (!z10) {
            if (cVar != null) {
                cVar.b();
                l(false);
                cVar.c(0.0f);
            } else {
                l(false);
            }
            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                Object obj = ((e) arrayList2.get(size)).f57705a;
                if (obj instanceof we.a) {
                    ((we.a) obj).a();
                }
            }
            arrayList2.clear();
            arrayList.clear();
            if (list != null) {
                i10 = list.size();
            } else {
                i10 = 0;
            }
            if (i10 > 0) {
                arrayList2.ensureCapacity(i10);
                arrayList.ensureCapacity(i10);
                for (Object obj2 : list) {
                    e eVar = new e(arrayList.size(), obj2, true);
                    arrayList2.add(eVar);
                    arrayList.add(eVar);
                }
                arrayList2.trimToSize();
                arrayList.trimToSize();
            }
            g.a(gVar, i10, false);
            j(false);
            this.f57716a.m1();
            return;
        }
        if (list != null && !list.isEmpty()) {
            if (arrayList.size() == list.size()) {
                for (int i11 = 0; i11 < list.size(); i11++) {
                    if (((e) arrayList.get(i11)).equals(list.get(i11))) {
                    }
                }
                isEmpty = true;
            }
            isEmpty = false;
            break;
        }
        isEmpty = arrayList.isEmpty();
        if (!isEmpty) {
            k();
            if (list != null && !list.isEmpty()) {
                boolean z14 = false;
                int i12 = 0;
                boolean z15 = false;
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    e eVar2 = (e) arrayList2.get(i13);
                    Object obj3 = eVar2.f57705a;
                    k kVar = eVar2.d;
                    k kVar2 = eVar2.f57707c;
                    int indexOf = list.indexOf(obj3);
                    if (indexOf != -1) {
                        i12++;
                        float f10 = indexOf;
                        if (kVar2.b(f10)) {
                            k();
                            kVar2.f57724c = f10;
                        }
                        if (eVar2.f57706b != indexOf) {
                            eVar2.f57706b = indexOf;
                            if (!z14 && eVar2.h) {
                                z14 = false;
                            } else {
                                z14 = true;
                            }
                            z15 = true;
                        }
                        if (kVar.b(1.0f)) {
                            k();
                            kVar.f57724c = 1.0f;
                            eVar2.h = false;
                            arrayList.add(eVar2);
                            g.a(gVar, arrayList.size(), true);
                            z14 = true;
                        }
                    } else if (kVar.b(0.0f)) {
                        k();
                        kVar.f57724c = 0.0f;
                        eVar2.h = true;
                        if (z14) {
                            z13 = arrayList.remove(eVar2);
                        } else {
                            int binarySearch = Collections.binarySearch(arrayList, eVar2);
                            if (binarySearch >= 0) {
                                arrayList.remove(binarySearch);
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                        }
                        if (z13) {
                            g.a(gVar, arrayList.size(), true);
                        } else {
                            throw new IllegalArgumentException();
                        }
                    } else {
                        continue;
                    }
                }
                if (z14) {
                    Collections.sort(arrayList);
                }
                if (i12 < list.size()) {
                    arrayList2.ensureCapacity((list.size() - i12) + arrayList2.size());
                    int i14 = 0;
                    for (Object obj4 : list) {
                        if (obj4 == null) {
                            int size2 = arrayList2.size();
                            i7 = 0;
                            int i15 = 0;
                            while (i15 < size2) {
                                Object obj5 = arrayList2.get(i15);
                                i15++;
                                if (((e) obj5).f57705a == null) {
                                    break;
                                }
                                i7++;
                            }
                            i7 = -1;
                        } else {
                            int size3 = arrayList2.size();
                            i7 = 0;
                            int i16 = 0;
                            while (i16 < size3) {
                                Object obj6 = arrayList2.get(i16);
                                i16++;
                                if (obj4.equals(((e) obj6).f57705a)) {
                                    break;
                                }
                                i7++;
                            }
                            i7 = -1;
                        }
                        if (i7 == -1) {
                            if (i14 != arrayList2.size()) {
                                z15 = true;
                            }
                            k();
                            e eVar3 = new e(i14, obj4, false);
                            eVar3.d.f57724c = 1.0f;
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
                        i14++;
                    }
                }
                z12 = z15;
                z11 = true;
            } else {
                if (!this.f57720f) {
                    int size4 = arrayList2.size();
                    int i17 = 0;
                    while (true) {
                        if (i17 >= size4) {
                            break;
                        }
                        Object obj7 = arrayList2.get(i17);
                        i17++;
                        if (((e) obj7).d.b(0.0f)) {
                            k();
                            break;
                        }
                    }
                }
                if (this.f57720f) {
                    int size5 = arrayList2.size();
                    int i18 = 0;
                    while (i18 < size5) {
                        Object obj8 = arrayList2.get(i18);
                        i18++;
                        e eVar4 = (e) obj8;
                        if (eVar4.d.b(0.0f)) {
                            k();
                            eVar4.d.f57724c = 0.0f;
                            eVar4.h = true;
                            int binarySearch3 = Collections.binarySearch(arrayList, eVar4);
                            if (binarySearch3 >= 0) {
                                arrayList.remove(binarySearch3);
                            }
                            g.a(gVar, arrayList.size(), true);
                        }
                    }
                }
                z11 = true;
                z12 = false;
            }
            if (z12) {
                Collections.sort(arrayList2);
            }
            j(z11);
            if (this.f57720f) {
                this.f57720f = false;
                if (cVar != null) {
                    cVar.a(1.0f);
                }
            } else if (cVar == null) {
                int size6 = arrayList2.size();
                int i19 = 0;
                while (i19 < size6) {
                    Object obj9 = arrayList2.get(i19);
                    i19++;
                    e eVar5 = (e) obj9;
                    k kVar3 = eVar5.d;
                    kVar3.f57723b = kVar3.f57722a;
                    k kVar4 = eVar5.f57707c;
                    kVar4.f57723b = kVar4.f57722a;
                }
            }
        }
    }
}
