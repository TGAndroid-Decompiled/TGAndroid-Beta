package te;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.telegram.ui.Components.n;
public final class h implements Iterable {
    public final d f55519a;
    public final c f55521c;
    public final g d;
    public boolean f55523f;
    public final ArrayList f55520b = new ArrayList();
    public final ArrayList f55522e = new ArrayList();

    public h(d dVar, Interpolator interpolator, long j3) {
        this.f55519a = dVar;
        this.d = new g(this, dVar);
        if (interpolator != null && j3 > 0) {
            this.f55521c = new c(0, new n(this), interpolator, j3);
        } else {
            this.f55521c = null;
        }
    }

    public final void f(float f10) {
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        g gVar = this.d;
        boolean a10 = gVar.f55514b.a(f10);
        if (!gVar.d.a(f10) && !a10) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (!gVar.f55516e.a(f10) && !z9) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!gVar.f55517f.a(f10) && !z10) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!gVar.f55518g.a(f10) && !z11) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (!gVar.f55515c.a(f10) && !z12) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (!gVar.f55513a.B(f10) && !z13) {
            z14 = false;
        } else {
            z14 = true;
        }
        ArrayList arrayList = this.f55520b;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            e eVar = (e) obj;
            boolean a11 = eVar.f55510c.a(f10);
            if (!eVar.d.a(f10) && !a11) {
                z15 = false;
            } else {
                z15 = true;
            }
            if (!eVar.f55511e.a(f10) && !z15) {
                z16 = false;
            } else {
                z16 = true;
            }
            if (!eVar.f55512f.a(f10) && !z16) {
                z17 = false;
            } else {
                z17 = true;
            }
            Object obj2 = eVar.f55508a;
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
            this.f55519a.Y0();
            if (f10 == 1.0f) {
                l(true);
            }
        }
    }

    public final e i(int i7) {
        return (e) this.f55520b.get(i7);
    }

    @Override
    public final Iterator iterator() {
        return this.f55520b.iterator();
    }

    public final void j(boolean z9) {
        ArrayList arrayList;
        boolean z10;
        ArrayList arrayList2 = this.f55522e;
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
            Object obj2 = eVar.f55508a;
            k kVar = eVar.f55512f;
            l lVar = eVar.f55511e;
            if (obj2 instanceof f) {
                f fVar = (f) obj2;
                if (eVar.f55509b == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                arrayList2.size();
                int b10 = fVar.b(z10);
                int width = fVar.getWidth();
                int height = fVar.getHeight();
                int i14 = b10 + width + i7;
                int i15 = i10 + b10 + height;
                if (z9 && eVar.c() > 0.0f) {
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
                        kVar.f55527c = f14;
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
        ArrayList arrayList3 = this.f55520b;
        if (z9) {
            int size2 = arrayList3.size();
            int i16 = 0;
            while (i16 < size2) {
                Object obj3 = arrayList3.get(i16);
                i16++;
                Object obj4 = ((e) obj3).f55508a;
            }
        }
        int size3 = arrayList3.size();
        int i17 = 0;
        while (i17 < size3) {
            Object obj5 = arrayList3.get(i17);
            i17++;
            Object obj6 = ((e) obj5).f55508a;
        }
        g gVar = this.d;
        if (z9) {
            k kVar2 = gVar.f55517f;
            d dVar = gVar.f55513a;
            k kVar3 = gVar.f55516e;
            k kVar4 = gVar.d;
            k kVar5 = gVar.f55518g;
            float f15 = i7;
            if (kVar2.b(f15)) {
                k();
                gVar.f55517f.f55527c = f15;
            }
            float f16 = i10;
            if (kVar5.b(f16)) {
                k();
                kVar5.f55527c = f16;
            }
            float f17 = i11;
            if (kVar4.b(f17)) {
                k();
                kVar4.f55527c = f17;
            }
            float f18 = i12;
            if (kVar3.b(f18)) {
                k();
                kVar3.f55527c = f18;
            }
            if (dVar.A()) {
                k();
                dVar.D();
                return;
            }
            return;
        }
        gVar.f55517f.d(i7);
        gVar.f55518g.d(i10);
        gVar.d.d(i11);
        gVar.f55516e.d(i12);
        gVar.f55513a.a();
    }

    public final void k() {
        if (!this.f55523f) {
            this.f55523f = true;
            c cVar = this.f55521c;
            if (cVar != null) {
                cVar.b();
                l(false);
                cVar.c(0.0f);
                return;
            }
            l(false);
        }
    }

    public final void l(boolean z9) {
        ArrayList arrayList = this.f55520b;
        boolean z10 = false;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            e eVar = (e) arrayList.get(size);
            eVar.a(z9);
            if (eVar.c() == 0.0f && eVar.h) {
                arrayList.remove(size);
                Object obj = eVar.f55508a;
                if (obj instanceof we.a) {
                    ((we.a) obj).a();
                }
                z10 = true;
            }
        }
        if (z10) {
            arrayList.trimToSize();
        }
        g gVar = this.d;
        gVar.f55514b.c(z9);
        gVar.d.c(z9);
        gVar.f55516e.c(z9);
        gVar.f55517f.c(z9);
        gVar.f55518g.c(z9);
        gVar.f55515c.c(z9);
        gVar.f55513a.l(z9);
    }

    public final void m(List list, boolean z9) {
        boolean isEmpty;
        boolean z10;
        boolean z11;
        int i7;
        boolean z12;
        int i10;
        c cVar = this.f55521c;
        g gVar = this.d;
        ArrayList arrayList = this.f55522e;
        ArrayList arrayList2 = this.f55520b;
        if (!z9) {
            if (cVar != null) {
                cVar.b();
                l(false);
                cVar.c(0.0f);
            } else {
                l(false);
            }
            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                Object obj = ((e) arrayList2.get(size)).f55508a;
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
            this.f55519a.Y0();
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
                boolean z13 = false;
                int i12 = 0;
                boolean z14 = false;
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    e eVar2 = (e) arrayList2.get(i13);
                    Object obj3 = eVar2.f55508a;
                    k kVar = eVar2.d;
                    k kVar2 = eVar2.f55510c;
                    int indexOf = list.indexOf(obj3);
                    if (indexOf != -1) {
                        i12++;
                        float f10 = indexOf;
                        if (kVar2.b(f10)) {
                            k();
                            kVar2.f55527c = f10;
                        }
                        if (eVar2.f55509b != indexOf) {
                            eVar2.f55509b = indexOf;
                            if (!z13 && eVar2.h) {
                                z13 = false;
                            } else {
                                z13 = true;
                            }
                            z14 = true;
                        }
                        if (kVar.b(1.0f)) {
                            k();
                            kVar.f55527c = 1.0f;
                            eVar2.h = false;
                            arrayList.add(eVar2);
                            g.a(gVar, arrayList.size(), true);
                            z13 = true;
                        }
                    } else if (kVar.b(0.0f)) {
                        k();
                        kVar.f55527c = 0.0f;
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
                                if (((e) obj5).f55508a == null) {
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
                                if (obj4.equals(((e) obj6).f55508a)) {
                                    break;
                                }
                                i7++;
                            }
                            i7 = -1;
                        }
                        if (i7 == -1) {
                            if (i14 != arrayList2.size()) {
                                z14 = true;
                            }
                            k();
                            e eVar3 = new e(i14, obj4, false);
                            eVar3.d.f55527c = 1.0f;
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
                z11 = z14;
                z10 = true;
            } else {
                if (!this.f55523f) {
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
                if (this.f55523f) {
                    int size5 = arrayList2.size();
                    int i18 = 0;
                    while (i18 < size5) {
                        Object obj8 = arrayList2.get(i18);
                        i18++;
                        e eVar4 = (e) obj8;
                        if (eVar4.d.b(0.0f)) {
                            k();
                            eVar4.d.f55527c = 0.0f;
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
            j(z10);
            if (this.f55523f) {
                this.f55523f = false;
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
                    kVar3.f55526b = kVar3.f55525a;
                    k kVar4 = eVar5.f55510c;
                    kVar4.f55526b = kVar4.f55525a;
                }
            }
        }
    }
}
