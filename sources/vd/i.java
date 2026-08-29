package vd;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public final class i implements Iterable {
    public final e f49525a;
    public final c f49527c;
    public final h d;
    public boolean f49529f;
    public final ArrayList f49526b = new ArrayList();
    public final ArrayList f49528e = new ArrayList();

    public i(e eVar, Interpolator interpolator, long j10) {
        this.f49525a = eVar;
        this.d = new h(this, eVar);
        if (interpolator != null && j10 > 0) {
            ?? obj = new Object();
            obj.f49513a = this;
            this.f49527c = new c(0, obj, interpolator, j10);
            return;
        }
        this.f49527c = null;
    }

    public final void i(float f9) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        h hVar = this.d;
        boolean a2 = hVar.f49520b.a(f9);
        if (!hVar.d.a(f9) && !a2) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!hVar.f49522e.a(f9) && !z10) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!hVar.f49523f.a(f9) && !z11) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (!hVar.f49524g.a(f9) && !z12) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (!hVar.f49521c.a(f9) && !z13) {
            z14 = false;
        } else {
            z14 = true;
        }
        if (!hVar.f49519a.k(f9) && !z14) {
            z15 = false;
        } else {
            z15 = true;
        }
        ArrayList arrayList = this.f49526b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            f fVar = (f) obj;
            boolean a10 = fVar.f49516c.a(f9);
            if (!fVar.d.a(f9) && !a10) {
                z16 = false;
            } else {
                z16 = true;
            }
            if (!fVar.f49517e.a(f9) && !z16) {
                z17 = false;
            } else {
                z17 = true;
            }
            if (!fVar.f49518f.a(f9) && !z17) {
                z18 = false;
            } else {
                z18 = true;
            }
            Object obj2 = fVar.f49514a;
            if (obj2 instanceof m) {
                if (!((m) obj2).a(f9) && !z18) {
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
            this.f49525a.w();
            if (f9 == 1.0f) {
                q(true);
            }
        }
    }

    @Override
    public final Iterator iterator() {
        return this.f49526b.iterator();
    }

    public final f n(int i10) {
        return (f) this.f49526b.get(i10);
    }

    public final void o(boolean z10) {
        ArrayList arrayList;
        boolean z11;
        ArrayList arrayList2 = this.f49528e;
        int size = arrayList2.size();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i14 < size) {
            Object obj = arrayList2.get(i14);
            i14++;
            f fVar = (f) obj;
            Object obj2 = fVar.f49514a;
            l lVar = fVar.f49518f;
            m mVar = fVar.f49517e;
            if (obj2 instanceof g) {
                g gVar = (g) obj2;
                if (fVar.f49515b == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                arrayList2.size();
                int b10 = gVar.b(z11);
                int width = gVar.getWidth();
                int height = gVar.getHeight();
                int i15 = b10 + width + i10;
                int i16 = i11 + b10 + height;
                if (z10 && fVar.c() > 0.0f) {
                    float f9 = i10;
                    float f10 = i11;
                    float f11 = i15;
                    arrayList = arrayList2;
                    float f12 = i16;
                    if (mVar.b(f9, f10, f11, f12)) {
                        p();
                        mVar.e(f9, f10, f11, f12);
                    }
                    float f13 = b10;
                    if (lVar.b(f13)) {
                        p();
                        lVar.f49533c = f13;
                    }
                } else {
                    arrayList = arrayList2;
                    mVar.d(i10, i11, i15, i16);
                    lVar.d(b10);
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
        ArrayList arrayList3 = this.f49526b;
        if (z10) {
            int size2 = arrayList3.size();
            int i17 = 0;
            while (i17 < size2) {
                Object obj3 = arrayList3.get(i17);
                i17++;
                Object obj4 = ((f) obj3).f49514a;
            }
        }
        int size3 = arrayList3.size();
        int i18 = 0;
        while (i18 < size3) {
            Object obj5 = arrayList3.get(i18);
            i18++;
            Object obj6 = ((f) obj5).f49514a;
        }
        h hVar = this.d;
        if (z10) {
            l lVar2 = hVar.f49523f;
            e eVar = hVar.f49519a;
            l lVar3 = hVar.f49522e;
            l lVar4 = hVar.d;
            l lVar5 = hVar.f49524g;
            float f14 = i10;
            if (lVar2.b(f14)) {
                p();
                hVar.f49523f.f49533c = f14;
            }
            float f15 = i11;
            if (lVar5.b(f15)) {
                p();
                lVar5.f49533c = f15;
            }
            float f16 = i12;
            if (lVar4.b(f16)) {
                p();
                lVar4.f49533c = f16;
            }
            float f17 = i13;
            if (lVar3.b(f17)) {
                p();
                lVar3.f49533c = f17;
            }
            if (eVar.j()) {
                p();
                eVar.l();
                return;
            }
            return;
        }
        hVar.f49523f.d(i10);
        hVar.f49524g.d(i11);
        hVar.d.d(i12);
        hVar.f49522e.d(i13);
        hVar.f49519a.a();
    }

    public final void p() {
        if (!this.f49529f) {
            this.f49529f = true;
            c cVar = this.f49527c;
            if (cVar != null) {
                cVar.b();
                q(false);
                cVar.c(0.0f);
                return;
            }
            q(false);
        }
    }

    public final void q(boolean z10) {
        ArrayList arrayList = this.f49526b;
        boolean z11 = false;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            f fVar = (f) arrayList.get(size);
            fVar.a(z10);
            if (fVar.c() == 0.0f && fVar.h) {
                arrayList.remove(size);
                Object obj = fVar.f49514a;
                if (obj instanceof yd.a) {
                    ((yd.a) obj).a();
                }
                z11 = true;
            }
        }
        if (z11) {
            arrayList.trimToSize();
        }
        h hVar = this.d;
        hVar.f49520b.c(z10);
        hVar.d.c(z10);
        hVar.f49522e.c(z10);
        hVar.f49523f.c(z10);
        hVar.f49524g.c(z10);
        hVar.f49521c.c(z10);
        hVar.f49519a.h(z10);
    }

    public final void r(List list, boolean z10) {
        boolean isEmpty;
        boolean z11;
        boolean z12;
        int i10;
        boolean z13;
        int i11;
        c cVar = this.f49527c;
        h hVar = this.d;
        ArrayList arrayList = this.f49528e;
        ArrayList arrayList2 = this.f49526b;
        if (!z10) {
            if (cVar != null) {
                cVar.b();
                q(false);
                cVar.c(0.0f);
            } else {
                q(false);
            }
            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                Object obj = ((f) arrayList2.get(size)).f49514a;
                if (obj instanceof yd.a) {
                    ((yd.a) obj).a();
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
                    f fVar = new f(arrayList.size(), obj2, true);
                    arrayList2.add(fVar);
                    arrayList.add(fVar);
                }
                arrayList2.trimToSize();
                arrayList.trimToSize();
            }
            h.a(hVar, i11, false);
            o(false);
            this.f49525a.w();
            return;
        }
        if (list != null && !list.isEmpty()) {
            if (arrayList.size() == list.size()) {
                for (int i12 = 0; i12 < list.size(); i12++) {
                    if (((f) arrayList.get(i12)).equals(list.get(i12))) {
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
                boolean z14 = false;
                int i13 = 0;
                boolean z15 = false;
                for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                    f fVar2 = (f) arrayList2.get(i14);
                    Object obj3 = fVar2.f49514a;
                    l lVar = fVar2.d;
                    l lVar2 = fVar2.f49516c;
                    int indexOf = list.indexOf(obj3);
                    if (indexOf != -1) {
                        i13++;
                        float f9 = indexOf;
                        if (lVar2.b(f9)) {
                            p();
                            lVar2.f49533c = f9;
                        }
                        if (fVar2.f49515b != indexOf) {
                            fVar2.f49515b = indexOf;
                            if (!z14 && fVar2.h) {
                                z14 = false;
                            } else {
                                z14 = true;
                            }
                            z15 = true;
                        }
                        if (lVar.b(1.0f)) {
                            p();
                            lVar.f49533c = 1.0f;
                            fVar2.h = false;
                            arrayList.add(fVar2);
                            h.a(hVar, arrayList.size(), true);
                            z14 = true;
                        }
                    } else if (lVar.b(0.0f)) {
                        p();
                        lVar.f49533c = 0.0f;
                        fVar2.h = true;
                        if (z14) {
                            z13 = arrayList.remove(fVar2);
                        } else {
                            int binarySearch = Collections.binarySearch(arrayList, fVar2);
                            if (binarySearch >= 0) {
                                arrayList.remove(binarySearch);
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                        }
                        if (z13) {
                            h.a(hVar, arrayList.size(), true);
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
                                if (((f) obj5).f49514a == null) {
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
                                if (obj4.equals(((f) obj6).f49514a)) {
                                    break;
                                }
                                i10++;
                            }
                            i10 = -1;
                        }
                        if (i10 == -1) {
                            if (i15 != arrayList2.size()) {
                                z15 = true;
                            }
                            p();
                            f fVar3 = new f(i15, obj4, false);
                            fVar3.d.f49533c = 1.0f;
                            fVar3.h = false;
                            arrayList2.add(fVar3);
                            int binarySearch2 = Collections.binarySearch(arrayList, fVar3);
                            if (binarySearch2 < 0) {
                                arrayList.add((-binarySearch2) - 1, fVar3);
                                h.a(hVar, arrayList.size(), true);
                            } else {
                                throw new IllegalArgumentException("Element already exists in list");
                            }
                        }
                        i15++;
                    }
                }
                z12 = z15;
                z11 = true;
            } else {
                if (!this.f49529f) {
                    int size4 = arrayList2.size();
                    int i18 = 0;
                    while (true) {
                        if (i18 >= size4) {
                            break;
                        }
                        Object obj7 = arrayList2.get(i18);
                        i18++;
                        if (((f) obj7).d.b(0.0f)) {
                            p();
                            break;
                        }
                    }
                }
                if (this.f49529f) {
                    int size5 = arrayList2.size();
                    int i19 = 0;
                    while (i19 < size5) {
                        Object obj8 = arrayList2.get(i19);
                        i19++;
                        f fVar4 = (f) obj8;
                        if (fVar4.d.b(0.0f)) {
                            p();
                            fVar4.d.f49533c = 0.0f;
                            fVar4.h = true;
                            int binarySearch3 = Collections.binarySearch(arrayList, fVar4);
                            if (binarySearch3 >= 0) {
                                arrayList.remove(binarySearch3);
                            }
                            h.a(hVar, arrayList.size(), true);
                        }
                    }
                }
                z11 = true;
                z12 = false;
            }
            if (z12) {
                Collections.sort(arrayList2);
            }
            o(z11);
            if (this.f49529f) {
                this.f49529f = false;
                if (cVar != null) {
                    cVar.a(1.0f);
                }
            } else if (cVar == null) {
                int size6 = arrayList2.size();
                int i20 = 0;
                while (i20 < size6) {
                    Object obj9 = arrayList2.get(i20);
                    i20++;
                    f fVar5 = (f) obj9;
                    l lVar3 = fVar5.d;
                    lVar3.f49532b = lVar3.f49531a;
                    l lVar4 = fVar5.f49516c;
                    lVar4.f49532b = lVar4.f49531a;
                }
            }
        }
    }
}
