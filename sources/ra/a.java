package ra;

import androidx.recyclerview.widget.RecyclerView;
import c5.b0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import l2.g;
import org.telegram.messenger.BuildVars;
public final class a {
    public static boolean f45960i = true;
    public final int f45961a;
    public int f45962b;
    public Object f45963c;
    public Serializable d;
    public Object f45964e;
    public Object f45965f;
    public Object f45966g;
    public Object h;

    public a(int i10) {
        this.f45961a = i10;
    }

    public b a() {
        String str;
        if (this.f45962b == 0) {
            str = " registrationStatus";
        } else {
            str = "";
        }
        if (((Long) this.f45966g) == null) {
            str = str.concat(" expiresInSecs");
        }
        if (((Long) this.h) == null) {
            str = t8.b.v(str, " tokenCreationEpochInSecs");
        }
        if (str.isEmpty()) {
            return new b((String) this.f45963c, this.f45962b, (String) this.d, (String) this.f45964e, ((Long) this.f45966g).longValue(), ((Long) this.h).longValue(), (String) this.f45965f);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public boolean b(int i10) {
        ArrayList arrayList = (ArrayList) this.f45964e;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            s4.a aVar = (s4.a) arrayList.get(i11);
            int i12 = aVar.f46485a;
            if (i12 == 8) {
                if (g(aVar.d, i11 + 1) == i10) {
                    return true;
                }
            } else {
                if (i12 == 1) {
                    int i13 = aVar.f46486b;
                    int i14 = aVar.d + i13;
                    while (i13 < i14) {
                        if (g(i13, i11 + 1) == i10) {
                            return true;
                        }
                        i13++;
                    }
                    continue;
                } else {
                    continue;
                }
            }
        }
        return false;
    }

    public void c() {
        ArrayList arrayList = (ArrayList) this.f45964e;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((n2.c) this.f45965f).e((s4.a) arrayList.get(i10));
        }
        m(arrayList);
        this.f45962b = 0;
    }

    public void d() {
        n2.c cVar = (n2.c) this.f45965f;
        c();
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            s4.a aVar = (s4.a) arrayList.get(i10);
            int i11 = aVar.f46485a;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 4) {
                        if (i11 == 8) {
                            cVar.e(aVar);
                            cVar.j(aVar.f46486b, aVar.d);
                        }
                    } else {
                        cVar.e(aVar);
                        cVar.f(aVar.f46486b, aVar.d, aVar.f46487c);
                    }
                } else {
                    cVar.e(aVar);
                    int i12 = aVar.f46486b;
                    int i13 = aVar.d;
                    RecyclerView recyclerView = (RecyclerView) cVar.f16522b;
                    recyclerView.f0(i12, i13, true);
                    recyclerView.f3089w0 = true;
                    recyclerView.f3085t0.f46702c += i13;
                }
            } else {
                cVar.e(aVar);
                cVar.i(aVar.f46486b, aVar.d);
            }
        }
        m(arrayList);
        this.f45962b = 0;
    }

    public void e(s4.a aVar) {
        int i10;
        b0 b0Var = (b0) this.f45963c;
        int i11 = aVar.f46485a;
        if (i11 != 1 && i11 != 8) {
            int o9 = o(aVar.f46486b, i11);
            int i12 = aVar.f46486b;
            int i13 = aVar.f46485a;
            if (i13 != 2) {
                if (i13 == 4) {
                    i10 = 1;
                } else {
                    throw new IllegalArgumentException("op should be remove or update." + aVar);
                }
            } else {
                i10 = 0;
            }
            int i14 = 1;
            for (int i15 = 1; i15 < aVar.d; i15++) {
                int o10 = o((i10 * i15) + aVar.f46486b, aVar.f46485a);
                int i16 = aVar.f46485a;
                if (i16 == 2 ? o10 == o9 : !(i16 != 4 || o10 != o9 + 1)) {
                    i14++;
                } else {
                    s4.a j3 = j(i16, o9, aVar.f46487c, i14);
                    f(j3, i12);
                    j3.f46487c = null;
                    b0Var.i(j3);
                    if (aVar.f46485a == 4) {
                        i12 += i14;
                    }
                    o9 = o10;
                    i14 = 1;
                }
            }
            Object obj = aVar.f46487c;
            aVar.f46487c = null;
            b0Var.i(aVar);
            if (i14 > 0) {
                s4.a j10 = j(aVar.f46485a, o9, obj, i14);
                f(j10, i12);
                j10.f46487c = null;
                b0Var.i(j10);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("should not dispatch add or move for pre layout");
    }

    public void f(s4.a aVar, int i10) {
        n2.c cVar = (n2.c) this.f45965f;
        cVar.e(aVar);
        int i11 = aVar.f46485a;
        if (i11 != 2) {
            if (i11 == 4) {
                cVar.f(i10, aVar.d, aVar.f46487c);
                return;
            }
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
        int i12 = aVar.d;
        RecyclerView recyclerView = (RecyclerView) cVar.f16522b;
        recyclerView.f0(i10, i12, true);
        recyclerView.f3089w0 = true;
        recyclerView.f3085t0.f46702c += i12;
    }

    public int g(int i10, int i11) {
        ArrayList arrayList = (ArrayList) this.f45964e;
        int size = arrayList.size();
        while (i11 < size) {
            s4.a aVar = (s4.a) arrayList.get(i11);
            int i12 = aVar.f46485a;
            if (i12 == 8) {
                int i13 = aVar.f46486b;
                if (i13 == i10) {
                    i10 = aVar.d;
                } else {
                    if (i13 < i10) {
                        i10--;
                    }
                    if (aVar.d <= i10) {
                        i10++;
                    }
                }
            } else {
                int i14 = aVar.f46486b;
                if (i14 > i10) {
                    continue;
                } else if (i12 == 2) {
                    int i15 = aVar.d;
                    if (i10 < i14 + i15) {
                        return -1;
                    }
                    i10 -= i15;
                } else if (i12 == 1) {
                    i10 += aVar.d;
                }
            }
            i11++;
        }
        return i10;
    }

    public boolean h() {
        if (((ArrayList) this.d).size() > 0) {
            return true;
        }
        return false;
    }

    public void i(String str) {
        int i10;
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
        int i11 = 0;
        for (i10 = 0; i10 < stackTrace.length && i11 < 5; i10++) {
            String stackTraceElement = stackTrace[i10].toString();
            if (!stackTraceElement.startsWith("androidx.recyclerview.widget.") || i11 != 0) {
                sb2.append("\n");
                sb2.append(stackTraceElement);
                sb2.append("\n");
                i11++;
            }
        }
        arrayList.add(sb2.toString());
    }

    public s4.a j(int i10, int i11, Object obj, int i12) {
        s4.a aVar = (s4.a) ((b0) this.f45963c).b();
        if (aVar == null) {
            ?? obj2 = new Object();
            obj2.f46485a = i10;
            obj2.f46486b = i11;
            obj2.d = i12;
            obj2.f46487c = obj;
            return obj2;
        }
        aVar.f46485a = i10;
        aVar.f46486b = i11;
        aVar.d = i12;
        aVar.f46487c = obj;
        return aVar;
    }

    public void k(s4.a aVar) {
        n2.c cVar = (n2.c) this.f45965f;
        ((ArrayList) this.f45964e).add(aVar);
        int i10 = aVar.f46485a;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 4) {
                    if (i10 == 8) {
                        cVar.j(aVar.f46486b, aVar.d);
                        return;
                    }
                    throw new IllegalArgumentException("Unknown update op type for " + aVar);
                }
                cVar.f(aVar.f46486b, aVar.d, aVar.f46487c);
                return;
            }
            int i11 = aVar.f46486b;
            int i12 = aVar.d;
            RecyclerView recyclerView = (RecyclerView) cVar.f16522b;
            recyclerView.f0(i11, i12, false);
            recyclerView.f3089w0 = true;
            return;
        }
        cVar.i(aVar.f46486b, aVar.d);
    }

    public void l() {
        throw new UnsupportedOperationException("Method not decompiled: ra.a.l():void");
    }

    public void m(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            s4.a aVar = (s4.a) arrayList.get(i10);
            aVar.f46487c = null;
            ((b0) this.f45963c).i(aVar);
        }
        arrayList.clear();
    }

    public java.lang.String n() {
        throw new UnsupportedOperationException("Method not decompiled: ra.a.n():java.lang.String");
    }

    public int o(int i10, int i11) {
        int i12;
        int i13;
        b0 b0Var = (b0) this.f45963c;
        ArrayList arrayList = (ArrayList) this.f45964e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            s4.a aVar = (s4.a) arrayList.get(size);
            int i14 = aVar.f46485a;
            if (i14 == 8) {
                int i15 = aVar.f46486b;
                int i16 = aVar.d;
                if (i15 < i16) {
                    i13 = i15;
                    i12 = i16;
                } else {
                    i12 = i15;
                    i13 = i16;
                }
                if (i10 >= i13 && i10 <= i12) {
                    if (i13 == i15) {
                        if (i11 == 1) {
                            aVar.d = i16 + 1;
                        } else if (i11 == 2) {
                            aVar.d = i16 - 1;
                        }
                        i10++;
                    } else {
                        if (i11 == 1) {
                            aVar.f46486b = i15 + 1;
                        } else if (i11 == 2) {
                            aVar.f46486b = i15 - 1;
                        }
                        i10--;
                    }
                } else if (i10 < i15) {
                    if (i11 == 1) {
                        aVar.f46486b = i15 + 1;
                        aVar.d = i16 + 1;
                    } else if (i11 == 2) {
                        aVar.f46486b = i15 - 1;
                        aVar.d = i16 - 1;
                    }
                }
            } else {
                int i17 = aVar.f46486b;
                if (i17 <= i10) {
                    if (i14 == 1) {
                        i10 -= aVar.d;
                    } else if (i14 == 2) {
                        i10 += aVar.d;
                    }
                } else if (i11 == 1) {
                    aVar.f46486b = i17 + 1;
                } else if (i11 == 2) {
                    aVar.f46486b = i17 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            s4.a aVar2 = (s4.a) arrayList.get(size2);
            if (aVar2.f46485a == 8) {
                int i18 = aVar2.d;
                if (i18 == aVar2.f46486b || i18 < 0) {
                    arrayList.remove(size2);
                    aVar2.f46487c = null;
                    b0Var.i(aVar2);
                }
            } else if (aVar2.d <= 0) {
                arrayList.remove(size2);
                aVar2.f46487c = null;
                b0Var.i(aVar2);
            }
        }
        return i10;
    }

    public String toString() {
        switch (this.f45961a) {
            case 1:
                re.b bVar = re.b.f46008e;
                return n();
            default:
                return super.toString();
        }
    }

    public a(n2.c cVar) {
        this.f45961a = 3;
        this.f45963c = new b0(30, 6);
        this.d = new ArrayList();
        this.f45964e = new ArrayList();
        this.f45962b = 0;
        this.h = BuildVars.DEBUG_VERSION ? new ArrayList() : null;
        this.f45965f = cVar;
        this.f45966g = new g(this, 17);
    }
}
