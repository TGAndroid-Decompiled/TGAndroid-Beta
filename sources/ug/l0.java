package ug;

import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import org.telegram.messenger.r2;
import org.telegram.ui.Components.cf;
public final class l0 {
    public static boolean f58195i = true;
    public final int f58196a;
    public int f58197b;
    public Object f58198c;
    public Serializable d;
    public Object f58199e;
    public Object f58200f;
    public Object f58201g;
    public Object h;

    public l0(int i7) {
        this.f58196a = i7;
    }

    public boolean a(int i7) {
        ArrayList arrayList = (ArrayList) this.f58199e;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            v4.a aVar = (v4.a) arrayList.get(i10);
            int i11 = aVar.f58474a;
            if (i11 == 8) {
                if (f(aVar.d, i10 + 1) == i7) {
                    return true;
                }
            } else {
                if (i11 == 1) {
                    int i12 = aVar.f58475b;
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
        ArrayList arrayList = (ArrayList) this.f58199e;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((jh.g) this.f58200f).a((v4.a) arrayList.get(i7));
        }
        l(arrayList);
        this.f58197b = 0;
    }

    public void c() {
        jh.g gVar = (jh.g) this.f58200f;
        b();
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            v4.a aVar = (v4.a) arrayList.get(i7);
            int i10 = aVar.f58474a;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        if (i10 == 8) {
                            gVar.a(aVar);
                            gVar.d(aVar.f58475b, aVar.d);
                        }
                    } else {
                        gVar.a(aVar);
                        gVar.b(aVar.f58475b, aVar.d, aVar.f58476c);
                    }
                } else {
                    gVar.a(aVar);
                    int i11 = aVar.f58475b;
                    int i12 = aVar.d;
                    RecyclerView recyclerView = gVar.f17401a;
                    recyclerView.f0(i11, i12, true);
                    recyclerView.f2831y0 = true;
                    recyclerView.f2825v0.f58502c += i12;
                }
            } else {
                gVar.a(aVar);
                gVar.c(aVar.f58475b, aVar.d);
            }
        }
        l(arrayList);
        this.f58197b = 0;
    }

    public void d(v4.a aVar) {
        int i7;
        f5.v vVar = (f5.v) this.f58198c;
        int i10 = aVar.f58474a;
        if (i10 != 1 && i10 != 8) {
            int n10 = n(aVar.f58475b, i10);
            int i11 = aVar.f58475b;
            int i12 = aVar.f58474a;
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
                int n11 = n((i7 * i14) + aVar.f58475b, aVar.f58474a);
                int i15 = aVar.f58474a;
                if (i15 == 2 ? n11 == n10 : !(i15 != 4 || n11 != n10 + 1)) {
                    i13++;
                } else {
                    v4.a i16 = i(i15, n10, aVar.f58476c, i13);
                    e(i16, i11);
                    i16.f58476c = null;
                    vVar.u(i16);
                    if (aVar.f58474a == 4) {
                        i11 += i13;
                    }
                    i13 = 1;
                    n10 = n11;
                }
            }
            Object obj = aVar.f58476c;
            aVar.f58476c = null;
            vVar.u(aVar);
            if (i13 > 0) {
                v4.a i17 = i(aVar.f58474a, n10, obj, i13);
                e(i17, i11);
                i17.f58476c = null;
                vVar.u(i17);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("should not dispatch add or move for pre layout");
    }

    public void e(v4.a aVar, int i7) {
        jh.g gVar = (jh.g) this.f58200f;
        gVar.a(aVar);
        int i10 = aVar.f58474a;
        if (i10 != 2) {
            if (i10 == 4) {
                gVar.b(i7, aVar.d, aVar.f58476c);
                return;
            }
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
        int i11 = aVar.d;
        RecyclerView recyclerView = gVar.f17401a;
        recyclerView.f0(i7, i11, true);
        recyclerView.f2831y0 = true;
        recyclerView.f2825v0.f58502c += i11;
    }

    public int f(int i7, int i10) {
        ArrayList arrayList = (ArrayList) this.f58199e;
        int size = arrayList.size();
        while (i10 < size) {
            v4.a aVar = (v4.a) arrayList.get(i10);
            int i11 = aVar.f58474a;
            if (i11 == 8) {
                int i12 = aVar.f58475b;
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
                int i13 = aVar.f58475b;
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
        v4.a aVar = (v4.a) ((f5.v) this.f58198c).a();
        if (aVar == null) {
            ?? obj2 = new Object();
            obj2.f58474a = i7;
            obj2.f58475b = i10;
            obj2.d = i11;
            obj2.f58476c = obj;
            return obj2;
        }
        aVar.f58474a = i7;
        aVar.f58475b = i10;
        aVar.d = i11;
        aVar.f58476c = obj;
        return aVar;
    }

    public void j(v4.a aVar) {
        jh.g gVar = (jh.g) this.f58200f;
        ((ArrayList) this.f58199e).add(aVar);
        int i7 = aVar.f58474a;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 4) {
                    if (i7 == 8) {
                        gVar.d(aVar.f58475b, aVar.d);
                        return;
                    }
                    throw new IllegalArgumentException("Unknown update op type for " + aVar);
                }
                gVar.b(aVar.f58475b, aVar.d, aVar.f58476c);
                return;
            }
            int i10 = aVar.f58475b;
            int i11 = aVar.d;
            RecyclerView recyclerView = gVar.f17401a;
            recyclerView.f0(i10, i11, false);
            recyclerView.f2831y0 = true;
            return;
        }
        gVar.c(aVar.f58475b, aVar.d);
    }

    public void k() {
        throw new UnsupportedOperationException("Method not decompiled: ug.l0.k():void");
    }

    public void l(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            v4.a aVar = (v4.a) arrayList.get(i7);
            aVar.f58476c = null;
            ((f5.v) this.f58198c).u(aVar);
        }
        arrayList.clear();
    }

    public java.lang.String m() {
        throw new UnsupportedOperationException("Method not decompiled: ug.l0.m():java.lang.String");
    }

    public int n(int i7, int i10) {
        int i11;
        int i12;
        f5.v vVar = (f5.v) this.f58198c;
        ArrayList arrayList = (ArrayList) this.f58199e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            v4.a aVar = (v4.a) arrayList.get(size);
            int i13 = aVar.f58474a;
            if (i13 == 8) {
                int i14 = aVar.f58475b;
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
                            aVar.f58475b = i14 + 1;
                        } else if (i10 == 2) {
                            aVar.f58475b = i14 - 1;
                        }
                        i7--;
                    }
                } else if (i7 < i14) {
                    if (i10 == 1) {
                        aVar.f58475b = i14 + 1;
                        aVar.d = i15 + 1;
                    } else if (i10 == 2) {
                        aVar.f58475b = i14 - 1;
                        aVar.d = i15 - 1;
                    }
                }
            } else {
                int i16 = aVar.f58475b;
                if (i16 <= i7) {
                    if (i13 == 1) {
                        i7 -= aVar.d;
                    } else if (i13 == 2) {
                        i7 += aVar.d;
                    }
                } else if (i10 == 1) {
                    aVar.f58475b = i16 + 1;
                } else if (i10 == 2) {
                    aVar.f58475b = i16 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            v4.a aVar2 = (v4.a) arrayList.get(size2);
            if (aVar2.f58474a == 8) {
                int i17 = aVar2.d;
                if (i17 == aVar2.f58475b || i17 < 0) {
                    arrayList.remove(size2);
                    aVar2.f58476c = null;
                    vVar.u(aVar2);
                }
            } else if (aVar2.d <= 0) {
                arrayList.remove(size2);
                aVar2.f58476c = null;
                vVar.u(aVar2);
            }
        }
        return i7;
    }

    public String toString() {
        switch (this.f58196a) {
            case 2:
                ze.b bVar = ze.b.f61349e;
                return m();
            default:
                return super.toString();
        }
    }

    public l0(jh.g gVar) {
        this.f58196a = 1;
        this.f58198c = new f5.v(30, 12);
        this.d = new ArrayList();
        this.f58199e = new ArrayList();
        this.f58197b = 0;
        boolean z10 = r2.f26206a;
        this.h = new ArrayList();
        this.f58200f = gVar;
        this.f58201g = new cf(this);
    }
}
