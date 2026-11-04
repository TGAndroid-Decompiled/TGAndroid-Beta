package u4;

import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import org.telegram.messenger.r2;
import org.telegram.ui.Components.i9;
public final class b {
    public static boolean f55502i = true;
    public final int f55503a;
    public int f55504b;
    public Object f55505c;
    public Serializable d;
    public Object f55506e;
    public Object f55507f;
    public Object f55508g;
    public Object h;

    public b(int i3) {
        this.f55503a = i3;
    }

    public boolean a(int i3) {
        ArrayList arrayList = (ArrayList) this.f55506e;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = (a) arrayList.get(i10);
            int i11 = aVar.f55484a;
            if (i11 == 8) {
                if (f(aVar.d, i10 + 1) == i3) {
                    return true;
                }
            } else {
                if (i11 == 1) {
                    int i12 = aVar.f55485b;
                    int i13 = aVar.d + i12;
                    while (i12 < i13) {
                        if (f(i12, i10 + 1) == i3) {
                            return true;
                        }
                        i12++;
                    }
                    continue;
                } else {
                    continue;
                }
            }
        }
        return false;
    }

    public void b() {
        ArrayList arrayList = (ArrayList) this.f55506e;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((kh.g) this.f55508g).a((a) arrayList.get(i3));
        }
        l(arrayList);
        this.f55504b = 0;
    }

    public void c() {
        kh.g gVar = (kh.g) this.f55508g;
        b();
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            a aVar = (a) arrayList.get(i3);
            int i10 = aVar.f55484a;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        if (i10 == 8) {
                            gVar.a(aVar);
                            gVar.d(aVar.f55485b, aVar.d);
                        }
                    } else {
                        gVar.a(aVar);
                        gVar.b(aVar.f55485b, aVar.d, aVar.f55486c);
                    }
                } else {
                    gVar.a(aVar);
                    int i11 = aVar.f55485b;
                    int i12 = aVar.d;
                    RecyclerView recyclerView = gVar.f17291a;
                    recyclerView.f0(i11, i12, true);
                    recyclerView.f2306y0 = true;
                    recyclerView.f2300v0.f55492c += i12;
                }
            } else {
                gVar.a(aVar);
                gVar.c(aVar.f55485b, aVar.d);
            }
        }
        l(arrayList);
        this.f55504b = 0;
    }

    public void d(a aVar) {
        int i3;
        e5.u uVar = (e5.u) this.f55505c;
        int i10 = aVar.f55484a;
        if (i10 != 1 && i10 != 8) {
            int n4 = n(aVar.f55485b, i10);
            int i11 = aVar.f55485b;
            int i12 = aVar.f55484a;
            if (i12 != 2) {
                if (i12 == 4) {
                    i3 = 1;
                } else {
                    throw new IllegalArgumentException("op should be remove or update." + aVar);
                }
            } else {
                i3 = 0;
            }
            int i13 = 1;
            for (int i14 = 1; i14 < aVar.d; i14++) {
                int n10 = n((i3 * i14) + aVar.f55485b, aVar.f55484a);
                int i15 = aVar.f55484a;
                if (i15 == 2 ? n10 == n4 : !(i15 != 4 || n10 != n4 + 1)) {
                    i13++;
                } else {
                    a i16 = i(i15, n4, aVar.f55486c, i13);
                    e(i16, i11);
                    i16.f55486c = null;
                    uVar.q(i16);
                    if (aVar.f55484a == 4) {
                        i11 += i13;
                    }
                    i13 = 1;
                    n4 = n10;
                }
            }
            Object obj = aVar.f55486c;
            aVar.f55486c = null;
            uVar.q(aVar);
            if (i13 > 0) {
                a i17 = i(aVar.f55484a, n4, obj, i13);
                e(i17, i11);
                i17.f55486c = null;
                uVar.q(i17);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("should not dispatch add or move for pre layout");
    }

    public void e(a aVar, int i3) {
        kh.g gVar = (kh.g) this.f55508g;
        gVar.a(aVar);
        int i10 = aVar.f55484a;
        if (i10 != 2) {
            if (i10 == 4) {
                gVar.b(i3, aVar.d, aVar.f55486c);
                return;
            }
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
        int i11 = aVar.d;
        RecyclerView recyclerView = gVar.f17291a;
        recyclerView.f0(i3, i11, true);
        recyclerView.f2306y0 = true;
        recyclerView.f2300v0.f55492c += i11;
    }

    public int f(int i3, int i10) {
        ArrayList arrayList = (ArrayList) this.f55506e;
        int size = arrayList.size();
        while (i10 < size) {
            a aVar = (a) arrayList.get(i10);
            int i11 = aVar.f55484a;
            if (i11 == 8) {
                int i12 = aVar.f55485b;
                if (i12 == i3) {
                    i3 = aVar.d;
                } else {
                    if (i12 < i3) {
                        i3--;
                    }
                    if (aVar.d <= i3) {
                        i3++;
                    }
                }
            } else {
                int i13 = aVar.f55485b;
                if (i13 > i3) {
                    continue;
                } else if (i11 == 2) {
                    int i14 = aVar.d;
                    if (i3 < i13 + i14) {
                        return -1;
                    }
                    i3 -= i14;
                } else if (i11 == 1) {
                    i3 += aVar.d;
                }
            }
            i10++;
        }
        return i3;
    }

    public boolean g() {
        if (((ArrayList) this.d).size() > 0) {
            return true;
        }
        return false;
    }

    public void h(String str) {
        int i3;
        ArrayList arrayList = (ArrayList) this.f55507f;
        if (arrayList == null) {
            return;
        }
        while (true) {
            if (arrayList.size() <= 5) {
                break;
            }
            arrayList.remove(0);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(new Date().toString());
        sb2.append("  ");
        sb2.append(str);
        sb2.append("\n");
        StackTraceElement[] stackTrace = new Exception().getStackTrace();
        int i10 = 0;
        for (i3 = 0; i3 < stackTrace.length && i10 < 5; i3++) {
            String stackTraceElement = stackTrace[i3].toString();
            if (!stackTraceElement.startsWith("androidx.recyclerview.widget.") || i10 != 0) {
                sb2.append("\n");
                sb2.append(stackTraceElement);
                sb2.append("\n");
                i10++;
            }
        }
        arrayList.add(sb2.toString());
    }

    public a i(int i3, int i10, Object obj, int i11) {
        a aVar = (a) ((e5.u) this.f55505c).a();
        if (aVar == null) {
            ?? obj2 = new Object();
            obj2.f55484a = i3;
            obj2.f55485b = i10;
            obj2.d = i11;
            obj2.f55486c = obj;
            return obj2;
        }
        aVar.f55484a = i3;
        aVar.f55485b = i10;
        aVar.d = i11;
        aVar.f55486c = obj;
        return aVar;
    }

    public void j(a aVar) {
        kh.g gVar = (kh.g) this.f55508g;
        ((ArrayList) this.f55506e).add(aVar);
        int i3 = aVar.f55484a;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 4) {
                    if (i3 == 8) {
                        gVar.d(aVar.f55485b, aVar.d);
                        return;
                    }
                    throw new IllegalArgumentException("Unknown update op type for " + aVar);
                }
                gVar.b(aVar.f55485b, aVar.d, aVar.f55486c);
                return;
            }
            int i10 = aVar.f55485b;
            int i11 = aVar.d;
            RecyclerView recyclerView = gVar.f17291a;
            recyclerView.f0(i10, i11, false);
            recyclerView.f2306y0 = true;
            return;
        }
        gVar.c(aVar.f55485b, aVar.d);
    }

    public void k() {
        throw new UnsupportedOperationException("Method not decompiled: u4.b.k():void");
    }

    public void l(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            a aVar = (a) arrayList.get(i3);
            aVar.f55486c = null;
            ((e5.u) this.f55505c).q(aVar);
        }
        arrayList.clear();
    }

    public java.lang.String m() {
        throw new UnsupportedOperationException("Method not decompiled: u4.b.m():java.lang.String");
    }

    public int n(int i3, int i10) {
        int i11;
        int i12;
        e5.u uVar = (e5.u) this.f55505c;
        ArrayList arrayList = (ArrayList) this.f55506e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            a aVar = (a) arrayList.get(size);
            int i13 = aVar.f55484a;
            if (i13 == 8) {
                int i14 = aVar.f55485b;
                int i15 = aVar.d;
                if (i14 < i15) {
                    i12 = i14;
                    i11 = i15;
                } else {
                    i11 = i14;
                    i12 = i15;
                }
                if (i3 >= i12 && i3 <= i11) {
                    if (i12 == i14) {
                        if (i10 == 1) {
                            aVar.d = i15 + 1;
                        } else if (i10 == 2) {
                            aVar.d = i15 - 1;
                        }
                        i3++;
                    } else {
                        if (i10 == 1) {
                            aVar.f55485b = i14 + 1;
                        } else if (i10 == 2) {
                            aVar.f55485b = i14 - 1;
                        }
                        i3--;
                    }
                } else if (i3 < i14) {
                    if (i10 == 1) {
                        aVar.f55485b = i14 + 1;
                        aVar.d = i15 + 1;
                    } else if (i10 == 2) {
                        aVar.f55485b = i14 - 1;
                        aVar.d = i15 - 1;
                    }
                }
            } else {
                int i16 = aVar.f55485b;
                if (i16 <= i3) {
                    if (i13 == 1) {
                        i3 -= aVar.d;
                    } else if (i13 == 2) {
                        i3 += aVar.d;
                    }
                } else if (i10 == 1) {
                    aVar.f55485b = i16 + 1;
                } else if (i10 == 2) {
                    aVar.f55485b = i16 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            a aVar2 = (a) arrayList.get(size2);
            if (aVar2.f55484a == 8) {
                int i17 = aVar2.d;
                if (i17 == aVar2.f55485b || i17 < 0) {
                    arrayList.remove(size2);
                    aVar2.f55486c = null;
                    uVar.q(aVar2);
                }
            } else if (aVar2.d <= 0) {
                arrayList.remove(size2);
                aVar2.f55486c = null;
                uVar.q(aVar2);
            }
        }
        return i3;
    }

    public String toString() {
        switch (this.f55503a) {
            case 2:
                we.b bVar = we.b.f57560e;
                return m();
            default:
                return super.toString();
        }
    }

    public b(kh.g gVar) {
        this.f55503a = 0;
        this.f55505c = new e5.u(30, 15);
        this.d = new ArrayList();
        this.f55506e = new ArrayList();
        this.f55504b = 0;
        boolean z10 = r2.f25040a;
        this.f55507f = new ArrayList();
        this.f55508g = gVar;
        this.h = new i9(this, 22);
    }
}
