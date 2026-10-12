package s4;

import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import org.telegram.messenger.BuildVars;
public final class b {
    public static boolean f44820i = true;
    public final int f44821a;
    public int f44822b;
    public Object f44823c;
    public Serializable d;
    public Object e;
    public Object f44824f;
    public Object f44825g;
    public Object h;

    public b(int i10) {
        this.f44821a = i10;
    }

    public sa.a a() {
        String str;
        if (this.f44822b == 0) {
            str = " registrationStatus";
        } else {
            str = "";
        }
        if (((Long) this.f44824f) == null) {
            str = str.concat(" expiresInSecs");
        }
        if (((Long) this.f44825g) == null) {
            str = t8.b.u(str, " tokenCreationEpochInSecs");
        }
        if (str.isEmpty()) {
            return new sa.a((String) this.f44823c, this.f44822b, (String) this.d, (String) this.e, ((Long) this.f44824f).longValue(), ((Long) this.f44825g).longValue(), (String) this.h);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public boolean b(int i10) {
        ArrayList arrayList = (ArrayList) this.e;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            a aVar = (a) arrayList.get(i11);
            int i12 = aVar.f44810a;
            if (i12 == 8) {
                if (g(aVar.d, i11 + 1) == i10) {
                    return true;
                }
            } else {
                if (i12 == 1) {
                    int i13 = aVar.f44811b;
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
        ArrayList arrayList = (ArrayList) this.e;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((ih.g) this.f44825g).a((a) arrayList.get(i10));
        }
        m(arrayList);
        this.f44822b = 0;
    }

    public void d() {
        ih.g gVar = (ih.g) this.f44825g;
        c();
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = (a) arrayList.get(i10);
            int i11 = aVar.f44810a;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 4) {
                        if (i11 == 8) {
                            gVar.a(aVar);
                            gVar.d(aVar.f44811b, aVar.d);
                        }
                    } else {
                        gVar.a(aVar);
                        gVar.b(aVar.f44811b, aVar.d, aVar.f44812c);
                    }
                } else {
                    gVar.a(aVar);
                    int i12 = aVar.f44811b;
                    int i13 = aVar.d;
                    RecyclerView recyclerView = gVar.f11748a;
                    recyclerView.e0(i12, i13, true);
                    recyclerView.f2018x0 = true;
                    recyclerView.f2013u0.f44996c += i13;
                }
            } else {
                gVar.a(aVar);
                gVar.c(aVar.f44811b, aVar.d);
            }
        }
        m(arrayList);
        this.f44822b = 0;
    }

    public void e(a aVar) {
        int i10;
        c5.c0 c0Var = (c5.c0) this.f44823c;
        int i11 = aVar.f44810a;
        if (i11 != 1 && i11 != 8) {
            int o10 = o(aVar.f44811b, i11);
            int i12 = aVar.f44811b;
            int i13 = aVar.f44810a;
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
                int o11 = o((i10 * i15) + aVar.f44811b, aVar.f44810a);
                int i16 = aVar.f44810a;
                if (i16 == 2 ? o11 == o10 : !(i16 != 4 || o11 != o10 + 1)) {
                    i14++;
                } else {
                    a j10 = j(i16, o10, aVar.f44812c, i14);
                    f(j10, i12);
                    j10.f44812c = null;
                    c0Var.u(j10);
                    if (aVar.f44810a == 4) {
                        i12 += i14;
                    }
                    i14 = 1;
                    o10 = o11;
                }
            }
            Object obj = aVar.f44812c;
            aVar.f44812c = null;
            c0Var.u(aVar);
            if (i14 > 0) {
                a j11 = j(aVar.f44810a, o10, obj, i14);
                f(j11, i12);
                j11.f44812c = null;
                c0Var.u(j11);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("should not dispatch add or move for pre layout");
    }

    public void f(a aVar, int i10) {
        ih.g gVar = (ih.g) this.f44825g;
        gVar.a(aVar);
        int i11 = aVar.f44810a;
        if (i11 != 2) {
            if (i11 == 4) {
                gVar.b(i10, aVar.d, aVar.f44812c);
                return;
            }
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
        int i12 = aVar.d;
        RecyclerView recyclerView = gVar.f11748a;
        recyclerView.e0(i10, i12, true);
        recyclerView.f2018x0 = true;
        recyclerView.f2013u0.f44996c += i12;
    }

    public int g(int i10, int i11) {
        ArrayList arrayList = (ArrayList) this.e;
        int size = arrayList.size();
        while (i11 < size) {
            a aVar = (a) arrayList.get(i11);
            int i12 = aVar.f44810a;
            if (i12 == 8) {
                int i13 = aVar.f44811b;
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
                int i14 = aVar.f44811b;
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
        ArrayList arrayList = (ArrayList) this.f44824f;
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

    public a j(int i10, int i11, Object obj, int i12) {
        a aVar = (a) ((c5.c0) this.f44823c).b();
        if (aVar == null) {
            ?? obj2 = new Object();
            obj2.f44810a = i10;
            obj2.f44811b = i11;
            obj2.d = i12;
            obj2.f44812c = obj;
            return obj2;
        }
        aVar.f44810a = i10;
        aVar.f44811b = i11;
        aVar.d = i12;
        aVar.f44812c = obj;
        return aVar;
    }

    public void k(a aVar) {
        ih.g gVar = (ih.g) this.f44825g;
        ((ArrayList) this.e).add(aVar);
        int i10 = aVar.f44810a;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 4) {
                    if (i10 == 8) {
                        gVar.d(aVar.f44811b, aVar.d);
                        return;
                    }
                    throw new IllegalArgumentException("Unknown update op type for " + aVar);
                }
                gVar.b(aVar.f44811b, aVar.d, aVar.f44812c);
                return;
            }
            int i11 = aVar.f44811b;
            int i12 = aVar.d;
            RecyclerView recyclerView = gVar.f11748a;
            recyclerView.e0(i11, i12, false);
            recyclerView.f2018x0 = true;
            return;
        }
        gVar.c(aVar.f44811b, aVar.d);
    }

    public void l() {
        throw new UnsupportedOperationException("Method not decompiled: s4.b.l():void");
    }

    public void m(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = (a) arrayList.get(i10);
            aVar.f44812c = null;
            ((c5.c0) this.f44823c).u(aVar);
        }
        arrayList.clear();
    }

    public java.lang.String n() {
        throw new UnsupportedOperationException("Method not decompiled: s4.b.n():java.lang.String");
    }

    public int o(int i10, int i11) {
        int i12;
        int i13;
        c5.c0 c0Var = (c5.c0) this.f44823c;
        ArrayList arrayList = (ArrayList) this.e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            a aVar = (a) arrayList.get(size);
            int i14 = aVar.f44810a;
            if (i14 == 8) {
                int i15 = aVar.f44811b;
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
                            aVar.f44811b = i15 + 1;
                        } else if (i11 == 2) {
                            aVar.f44811b = i15 - 1;
                        }
                        i10--;
                    }
                } else if (i10 < i15) {
                    if (i11 == 1) {
                        aVar.f44811b = i15 + 1;
                        aVar.d = i16 + 1;
                    } else if (i11 == 2) {
                        aVar.f44811b = i15 - 1;
                        aVar.d = i16 - 1;
                    }
                }
            } else {
                int i17 = aVar.f44811b;
                if (i17 <= i10) {
                    if (i14 == 1) {
                        i10 -= aVar.d;
                    } else if (i14 == 2) {
                        i10 += aVar.d;
                    }
                } else if (i11 == 1) {
                    aVar.f44811b = i17 + 1;
                } else if (i11 == 2) {
                    aVar.f44811b = i17 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            a aVar2 = (a) arrayList.get(size2);
            if (aVar2.f44810a == 8) {
                int i18 = aVar2.d;
                if (i18 == aVar2.f44811b || i18 < 0) {
                    arrayList.remove(size2);
                    aVar2.f44812c = null;
                    c0Var.u(aVar2);
                }
            } else if (aVar2.d <= 0) {
                arrayList.remove(size2);
                aVar2.f44812c = null;
                c0Var.u(aVar2);
            }
        }
        return i10;
    }

    public String toString() {
        switch (this.f44821a) {
            case 3:
                te.b bVar = te.b.e;
                return n();
            default:
                return super.toString();
        }
    }

    public b(ih.g gVar) {
        this.f44821a = 0;
        this.f44823c = new c5.c0(30, 8);
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f44822b = 0;
        this.f44824f = BuildVars.DEBUG_VERSION ? new ArrayList() : null;
        this.f44825g = gVar;
        this.h = new l2.f(this, 17);
    }
}
