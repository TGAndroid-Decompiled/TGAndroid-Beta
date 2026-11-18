package ug;

import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import org.telegram.messenger.s2;
public final class n0 {
    public static boolean f58778i = true;
    public final int f58779a;
    public int f58780b;
    public Object f58781c;
    public Serializable d;
    public Object f58782e;
    public Object f58783f;
    public Object f58784g;
    public Object h;

    public n0(int i7) {
        this.f58779a = i7;
    }

    public boolean a(int i7) {
        ArrayList arrayList = (ArrayList) this.f58782e;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            v4.a aVar = (v4.a) arrayList.get(i10);
            int i11 = aVar.f59042a;
            if (i11 == 8) {
                if (f(aVar.d, i10 + 1) == i7) {
                    return true;
                }
            } else {
                if (i11 == 1) {
                    int i12 = aVar.f59043b;
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
        ArrayList arrayList = (ArrayList) this.f58782e;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((v4.f0) this.f58783f).b((v4.a) arrayList.get(i7));
        }
        l(arrayList);
        this.f58780b = 0;
    }

    public void c() {
        v4.f0 f0Var = (v4.f0) this.f58783f;
        b();
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            v4.a aVar = (v4.a) arrayList.get(i7);
            int i10 = aVar.f59042a;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        if (i10 == 8) {
                            f0Var.b(aVar);
                            f0Var.e(aVar.f59043b, aVar.d);
                        }
                    } else {
                        f0Var.b(aVar);
                        f0Var.c(aVar.f59043b, aVar.d, aVar.f59044c);
                    }
                } else {
                    f0Var.b(aVar);
                    int i11 = aVar.f59043b;
                    int i12 = aVar.d;
                    RecyclerView recyclerView = (RecyclerView) f0Var.f59121a;
                    recyclerView.f0(i11, i12, true);
                    recyclerView.f2823y0 = true;
                    recyclerView.f2817v0.f59088c += i12;
                }
            } else {
                f0Var.b(aVar);
                f0Var.d(aVar.f59043b, aVar.d);
            }
        }
        l(arrayList);
        this.f58780b = 0;
    }

    public void d(v4.a aVar) {
        int i7;
        b3.j jVar = (b3.j) this.f58781c;
        int i10 = aVar.f59042a;
        if (i10 != 1 && i10 != 8) {
            int n10 = n(aVar.f59043b, i10);
            int i11 = aVar.f59043b;
            int i12 = aVar.f59042a;
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
                int n11 = n((i7 * i14) + aVar.f59043b, aVar.f59042a);
                int i15 = aVar.f59042a;
                if (i15 == 2 ? n11 == n10 : !(i15 != 4 || n11 != n10 + 1)) {
                    i13++;
                } else {
                    v4.a i16 = i(i15, n10, aVar.f59044c, i13);
                    e(i16, i11);
                    i16.f59044c = null;
                    jVar.t(i16);
                    if (aVar.f59042a == 4) {
                        i11 += i13;
                    }
                    i13 = 1;
                    n10 = n11;
                }
            }
            Object obj = aVar.f59044c;
            aVar.f59044c = null;
            jVar.t(aVar);
            if (i13 > 0) {
                v4.a i17 = i(aVar.f59042a, n10, obj, i13);
                e(i17, i11);
                i17.f59044c = null;
                jVar.t(i17);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("should not dispatch add or move for pre layout");
    }

    public void e(v4.a aVar, int i7) {
        v4.f0 f0Var = (v4.f0) this.f58783f;
        f0Var.b(aVar);
        int i10 = aVar.f59042a;
        if (i10 != 2) {
            if (i10 == 4) {
                f0Var.c(i7, aVar.d, aVar.f59044c);
                return;
            }
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
        int i11 = aVar.d;
        RecyclerView recyclerView = (RecyclerView) f0Var.f59121a;
        recyclerView.f0(i7, i11, true);
        recyclerView.f2823y0 = true;
        recyclerView.f2817v0.f59088c += i11;
    }

    public int f(int i7, int i10) {
        ArrayList arrayList = (ArrayList) this.f58782e;
        int size = arrayList.size();
        while (i10 < size) {
            v4.a aVar = (v4.a) arrayList.get(i10);
            int i11 = aVar.f59042a;
            if (i11 == 8) {
                int i12 = aVar.f59043b;
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
                int i13 = aVar.f59043b;
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
        v4.a aVar = (v4.a) ((b3.j) this.f58781c).a();
        if (aVar == null) {
            ?? obj2 = new Object();
            obj2.f59042a = i7;
            obj2.f59043b = i10;
            obj2.d = i11;
            obj2.f59044c = obj;
            return obj2;
        }
        aVar.f59042a = i7;
        aVar.f59043b = i10;
        aVar.d = i11;
        aVar.f59044c = obj;
        return aVar;
    }

    public void j(v4.a aVar) {
        v4.f0 f0Var = (v4.f0) this.f58783f;
        ((ArrayList) this.f58782e).add(aVar);
        int i7 = aVar.f59042a;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 4) {
                    if (i7 == 8) {
                        f0Var.e(aVar.f59043b, aVar.d);
                        return;
                    }
                    throw new IllegalArgumentException("Unknown update op type for " + aVar);
                }
                f0Var.c(aVar.f59043b, aVar.d, aVar.f59044c);
                return;
            }
            int i10 = aVar.f59043b;
            int i11 = aVar.d;
            RecyclerView recyclerView = (RecyclerView) f0Var.f59121a;
            recyclerView.f0(i10, i11, false);
            recyclerView.f2823y0 = true;
            return;
        }
        f0Var.d(aVar.f59043b, aVar.d);
    }

    public void k() {
        throw new UnsupportedOperationException("Method not decompiled: ug.n0.k():void");
    }

    public void l(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            v4.a aVar = (v4.a) arrayList.get(i7);
            aVar.f59044c = null;
            ((b3.j) this.f58781c).t(aVar);
        }
        arrayList.clear();
    }

    public java.lang.String m() {
        throw new UnsupportedOperationException("Method not decompiled: ug.n0.m():java.lang.String");
    }

    public int n(int i7, int i10) {
        int i11;
        int i12;
        b3.j jVar = (b3.j) this.f58781c;
        ArrayList arrayList = (ArrayList) this.f58782e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            v4.a aVar = (v4.a) arrayList.get(size);
            int i13 = aVar.f59042a;
            if (i13 == 8) {
                int i14 = aVar.f59043b;
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
                            aVar.f59043b = i14 + 1;
                        } else if (i10 == 2) {
                            aVar.f59043b = i14 - 1;
                        }
                        i7--;
                    }
                } else if (i7 < i14) {
                    if (i10 == 1) {
                        aVar.f59043b = i14 + 1;
                        aVar.d = i15 + 1;
                    } else if (i10 == 2) {
                        aVar.f59043b = i14 - 1;
                        aVar.d = i15 - 1;
                    }
                }
            } else {
                int i16 = aVar.f59043b;
                if (i16 <= i7) {
                    if (i13 == 1) {
                        i7 -= aVar.d;
                    } else if (i13 == 2) {
                        i7 += aVar.d;
                    }
                } else if (i10 == 1) {
                    aVar.f59043b = i16 + 1;
                } else if (i10 == 2) {
                    aVar.f59043b = i16 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            v4.a aVar2 = (v4.a) arrayList.get(size2);
            if (aVar2.f59042a == 8) {
                int i17 = aVar2.d;
                if (i17 == aVar2.f59043b || i17 < 0) {
                    arrayList.remove(size2);
                    aVar2.f59044c = null;
                    jVar.t(aVar2);
                }
            } else if (aVar2.d <= 0) {
                arrayList.remove(size2);
                aVar2.f59044c = null;
                jVar.t(aVar2);
            }
        }
        return i7;
    }

    public String toString() {
        switch (this.f58779a) {
            case 2:
                ze.c cVar = ze.c.f61916e;
                return m();
            default:
                return super.toString();
        }
    }

    public n0(v4.f0 f0Var) {
        this.f58779a = 1;
        this.f58781c = new b3.j(30, 11);
        this.d = new ArrayList();
        this.f58782e = new ArrayList();
        this.f58780b = 0;
        boolean z10 = s2.f26721a;
        this.h = new ArrayList();
        this.f58783f = f0Var;
        this.f58784g = new v4.f0(this);
    }
}
