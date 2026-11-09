package ug;

import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import org.telegram.messenger.r2;
import org.telegram.ui.Components.rt;
public final class k0 {
    public static boolean f56686i = true;
    public final int f56687a;
    public int f56688b;
    public Object f56689c;
    public Serializable d;
    public Object f56690e;
    public Object f56691f;
    public Object f56692g;
    public Object h;

    public k0(int i7) {
        this.f56687a = i7;
    }

    public boolean a(int i7) {
        ArrayList arrayList = (ArrayList) this.f56690e;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            v4.a aVar = (v4.a) arrayList.get(i10);
            int i11 = aVar.f57004a;
            if (i11 == 8) {
                if (f(aVar.d, i10 + 1) == i7) {
                    return true;
                }
            } else {
                if (i11 == 1) {
                    int i12 = aVar.f57005b;
                    int i13 = aVar.d + i12;
                    while (i12 < i13) {
                        if (f(i12, i10 + 1) == i7) {
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
        ArrayList arrayList = (ArrayList) this.f56690e;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((rt) this.f56691f).g0((v4.a) arrayList.get(i7));
        }
        l(arrayList);
        this.f56688b = 0;
    }

    public void c() {
        rt rtVar = (rt) this.f56691f;
        b();
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            v4.a aVar = (v4.a) arrayList.get(i7);
            int i10 = aVar.f57004a;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        if (i10 == 8) {
                            rtVar.g0(aVar);
                            rtVar.l0(aVar.f57005b, aVar.d);
                        }
                    } else {
                        rtVar.g0(aVar);
                        rtVar.i0(aVar.f57005b, aVar.d, aVar.f57006c);
                    }
                } else {
                    rtVar.g0(aVar);
                    int i11 = aVar.f57005b;
                    int i12 = aVar.d;
                    RecyclerView recyclerView = (RecyclerView) rtVar.f37805b;
                    recyclerView.f0(i11, i12, true);
                    recyclerView.f2872x0 = true;
                    recyclerView.f2867u0.f57012c += i12;
                }
            } else {
                rtVar.g0(aVar);
                rtVar.k0(aVar.f57005b, aVar.d);
            }
        }
        l(arrayList);
        this.f56688b = 0;
    }

    public void d(v4.a aVar) {
        int i7;
        f5.u uVar = (f5.u) this.f56689c;
        int i10 = aVar.f57004a;
        if (i10 != 1 && i10 != 8) {
            int n10 = n(aVar.f57005b, i10);
            int i11 = aVar.f57005b;
            int i12 = aVar.f57004a;
            if (i12 != 2) {
                if (i12 == 4) {
                    i7 = 1;
                } else {
                    throw new IllegalArgumentException("op should be remove or update." + aVar);
                }
            } else {
                i7 = 0;
            }
            int i13 = 1;
            for (int i14 = 1; i14 < aVar.d; i14++) {
                int n11 = n((i7 * i14) + aVar.f57005b, aVar.f57004a);
                int i15 = aVar.f57004a;
                if (i15 == 2 ? n11 == n10 : !(i15 != 4 || n11 != n10 + 1)) {
                    i13++;
                } else {
                    v4.a i16 = i(i15, n10, aVar.f57006c, i13);
                    e(i16, i11);
                    i16.f57006c = null;
                    uVar.v(i16);
                    if (aVar.f57004a == 4) {
                        i11 += i13;
                    }
                    i13 = 1;
                    n10 = n11;
                }
            }
            Object obj = aVar.f57006c;
            aVar.f57006c = null;
            uVar.v(aVar);
            if (i13 > 0) {
                v4.a i17 = i(aVar.f57004a, n10, obj, i13);
                e(i17, i11);
                i17.f57006c = null;
                uVar.v(i17);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("should not dispatch add or move for pre layout");
    }

    public void e(v4.a aVar, int i7) {
        rt rtVar = (rt) this.f56691f;
        rtVar.g0(aVar);
        int i10 = aVar.f57004a;
        if (i10 != 2) {
            if (i10 == 4) {
                rtVar.i0(i7, aVar.d, aVar.f57006c);
                return;
            }
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
        int i11 = aVar.d;
        RecyclerView recyclerView = (RecyclerView) rtVar.f37805b;
        recyclerView.f0(i7, i11, true);
        recyclerView.f2872x0 = true;
        recyclerView.f2867u0.f57012c += i11;
    }

    public int f(int i7, int i10) {
        ArrayList arrayList = (ArrayList) this.f56690e;
        int size = arrayList.size();
        while (i10 < size) {
            v4.a aVar = (v4.a) arrayList.get(i10);
            int i11 = aVar.f57004a;
            if (i11 == 8) {
                int i12 = aVar.f57005b;
                if (i12 == i7) {
                    i7 = aVar.d;
                } else {
                    if (i12 < i7) {
                        i7--;
                    }
                    if (aVar.d <= i7) {
                        i7++;
                    }
                }
            } else {
                int i13 = aVar.f57005b;
                if (i13 > i7) {
                    continue;
                } else if (i11 == 2) {
                    int i14 = aVar.d;
                    if (i7 < i13 + i14) {
                        return -1;
                    }
                    i7 -= i14;
                } else if (i11 == 1) {
                    i7 += aVar.d;
                }
            }
            i10++;
        }
        return i7;
    }

    public boolean g() {
        if (((ArrayList) this.d).size() > 0) {
            return true;
        }
        return false;
    }

    public void h(String str) {
        int i7;
        ArrayList arrayList = (ArrayList) this.h;
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
        for (i7 = 0; i7 < stackTrace.length && i10 < 5; i7++) {
            String stackTraceElement = stackTrace[i7].toString();
            if (!stackTraceElement.startsWith("androidx.recyclerview.widget.") || i10 != 0) {
                sb2.append("\n");
                sb2.append(stackTraceElement);
                sb2.append("\n");
                i10++;
            }
        }
        arrayList.add(sb2.toString());
    }

    public v4.a i(int i7, int i10, Object obj, int i11) {
        v4.a aVar = (v4.a) ((f5.u) this.f56689c).a();
        if (aVar == null) {
            ?? obj2 = new Object();
            obj2.f57004a = i7;
            obj2.f57005b = i10;
            obj2.d = i11;
            obj2.f57006c = obj;
            return obj2;
        }
        aVar.f57004a = i7;
        aVar.f57005b = i10;
        aVar.d = i11;
        aVar.f57006c = obj;
        return aVar;
    }

    public void j(v4.a aVar) {
        rt rtVar = (rt) this.f56691f;
        ((ArrayList) this.f56690e).add(aVar);
        int i7 = aVar.f57004a;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 4) {
                    if (i7 == 8) {
                        rtVar.l0(aVar.f57005b, aVar.d);
                        return;
                    }
                    throw new IllegalArgumentException("Unknown update op type for " + aVar);
                }
                rtVar.i0(aVar.f57005b, aVar.d, aVar.f57006c);
                return;
            }
            int i10 = aVar.f57005b;
            int i11 = aVar.d;
            RecyclerView recyclerView = (RecyclerView) rtVar.f37805b;
            recyclerView.f0(i10, i11, false);
            recyclerView.f2872x0 = true;
            return;
        }
        rtVar.k0(aVar.f57005b, aVar.d);
    }

    public void k() {
        throw new UnsupportedOperationException("Method not decompiled: ug.k0.k():void");
    }

    public void l(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            v4.a aVar = (v4.a) arrayList.get(i7);
            aVar.f57006c = null;
            ((f5.u) this.f56689c).v(aVar);
        }
        arrayList.clear();
    }

    public java.lang.String m() {
        throw new UnsupportedOperationException("Method not decompiled: ug.k0.m():java.lang.String");
    }

    public int n(int i7, int i10) {
        int i11;
        int i12;
        f5.u uVar = (f5.u) this.f56689c;
        ArrayList arrayList = (ArrayList) this.f56690e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            v4.a aVar = (v4.a) arrayList.get(size);
            int i13 = aVar.f57004a;
            if (i13 == 8) {
                int i14 = aVar.f57005b;
                int i15 = aVar.d;
                if (i14 < i15) {
                    i12 = i14;
                    i11 = i15;
                } else {
                    i11 = i14;
                    i12 = i15;
                }
                if (i7 >= i12 && i7 <= i11) {
                    if (i12 == i14) {
                        if (i10 == 1) {
                            aVar.d = i15 + 1;
                        } else if (i10 == 2) {
                            aVar.d = i15 - 1;
                        }
                        i7++;
                    } else {
                        if (i10 == 1) {
                            aVar.f57005b = i14 + 1;
                        } else if (i10 == 2) {
                            aVar.f57005b = i14 - 1;
                        }
                        i7--;
                    }
                } else if (i7 < i14) {
                    if (i10 == 1) {
                        aVar.f57005b = i14 + 1;
                        aVar.d = i15 + 1;
                    } else if (i10 == 2) {
                        aVar.f57005b = i14 - 1;
                        aVar.d = i15 - 1;
                    }
                }
            } else {
                int i16 = aVar.f57005b;
                if (i16 <= i7) {
                    if (i13 == 1) {
                        i7 -= aVar.d;
                    } else if (i13 == 2) {
                        i7 += aVar.d;
                    }
                } else if (i10 == 1) {
                    aVar.f57005b = i16 + 1;
                } else if (i10 == 2) {
                    aVar.f57005b = i16 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            v4.a aVar2 = (v4.a) arrayList.get(size2);
            if (aVar2.f57004a == 8) {
                int i17 = aVar2.d;
                if (i17 == aVar2.f57005b || i17 < 0) {
                    arrayList.remove(size2);
                    aVar2.f57006c = null;
                    uVar.v(aVar2);
                }
            } else if (aVar2.d <= 0) {
                arrayList.remove(size2);
                aVar2.f57006c = null;
                uVar.v(aVar2);
            }
        }
        return i7;
    }

    public String toString() {
        switch (this.f56687a) {
            case 2:
                ze.b bVar = ze.b.f60150e;
                return m();
            default:
                return super.toString();
        }
    }

    public k0(rt rtVar) {
        this.f56687a = 1;
        this.f56689c = new f5.u(30, 13);
        this.d = new ArrayList();
        this.f56690e = new ArrayList();
        this.f56688b = 0;
        boolean z9 = r2.f25212a;
        this.h = new ArrayList();
        this.f56691f = rtVar;
        this.f56692g = new rt(this, 21);
    }
}
