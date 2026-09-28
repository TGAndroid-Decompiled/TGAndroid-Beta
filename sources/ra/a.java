package ra;

import androidx.recyclerview.widget.RecyclerView;
import c5.b0;
import hh.h;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import l.d;
import org.telegram.messenger.BuildVars;
import v7.j;
public final class a {
    public static boolean f42461i = true;
    public final int f42462a;
    public int f42463b;
    public Object f42464c;
    public Serializable d;
    public Object e;
    public Object f42465f;
    public Object f42466g;
    public Object h;

    public a(int i10) {
        this.f42462a = i10;
    }

    public b a() {
        String str;
        if (this.f42463b == 0) {
            str = " registrationStatus";
        } else {
            str = "";
        }
        if (((Long) this.f42466g) == null) {
            str = str.concat(" expiresInSecs");
        }
        if (((Long) this.h) == null) {
            str = j.t(str, " tokenCreationEpochInSecs");
        }
        if (str.isEmpty()) {
            return new b((String) this.f42464c, this.f42463b, (String) this.d, (String) this.e, ((Long) this.f42466g).longValue(), ((Long) this.h).longValue(), (String) this.f42465f);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public boolean b(int i10) {
        ArrayList arrayList = (ArrayList) this.e;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            s4.a aVar = (s4.a) arrayList.get(i11);
            int i12 = aVar.f42925a;
            if (i12 == 8) {
                if (g(aVar.d, i11 + 1) == i10) {
                    return true;
                }
            } else {
                if (i12 == 1) {
                    int i13 = aVar.f42926b;
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
            ((h) this.f42465f).a((s4.a) arrayList.get(i10));
        }
        m(arrayList);
        this.f42463b = 0;
    }

    public void d() {
        h hVar = (h) this.f42465f;
        c();
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            s4.a aVar = (s4.a) arrayList.get(i10);
            int i11 = aVar.f42925a;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 4) {
                        if (i11 == 8) {
                            hVar.a(aVar);
                            hVar.d(aVar.f42926b, aVar.d);
                        }
                    } else {
                        hVar.a(aVar);
                        hVar.b(aVar.f42926b, aVar.d, aVar.f42927c);
                    }
                } else {
                    hVar.a(aVar);
                    int i12 = aVar.f42926b;
                    int i13 = aVar.d;
                    RecyclerView recyclerView = hVar.f10517a;
                    recyclerView.e0(i12, i13, true);
                    recyclerView.f2859w0 = true;
                    recyclerView.f2855t0.f43121c += i13;
                }
            } else {
                hVar.a(aVar);
                hVar.c(aVar.f42926b, aVar.d);
            }
        }
        m(arrayList);
        this.f42463b = 0;
    }

    public void e(s4.a aVar) {
        int i10;
        b0 b0Var = (b0) this.f42464c;
        int i11 = aVar.f42925a;
        if (i11 != 1 && i11 != 8) {
            int o9 = o(aVar.f42926b, i11);
            int i12 = aVar.f42926b;
            int i13 = aVar.f42925a;
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
                int o10 = o((i10 * i15) + aVar.f42926b, aVar.f42925a);
                int i16 = aVar.f42925a;
                if (i16 == 2 ? o10 == o9 : !(i16 != 4 || o10 != o9 + 1)) {
                    i14++;
                } else {
                    s4.a j3 = j(i16, o9, aVar.f42927c, i14);
                    f(j3, i12);
                    j3.f42927c = null;
                    b0Var.i(j3);
                    if (aVar.f42925a == 4) {
                        i12 += i14;
                    }
                    o9 = o10;
                    i14 = 1;
                }
            }
            Object obj = aVar.f42927c;
            aVar.f42927c = null;
            b0Var.i(aVar);
            if (i14 > 0) {
                s4.a j10 = j(aVar.f42925a, o9, obj, i14);
                f(j10, i12);
                j10.f42927c = null;
                b0Var.i(j10);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("should not dispatch add or move for pre layout");
    }

    public void f(s4.a aVar, int i10) {
        h hVar = (h) this.f42465f;
        hVar.a(aVar);
        int i11 = aVar.f42925a;
        if (i11 != 2) {
            if (i11 == 4) {
                hVar.b(i10, aVar.d, aVar.f42927c);
                return;
            }
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
        int i12 = aVar.d;
        RecyclerView recyclerView = hVar.f10517a;
        recyclerView.e0(i10, i12, true);
        recyclerView.f2859w0 = true;
        recyclerView.f2855t0.f43121c += i12;
    }

    public int g(int i10, int i11) {
        ArrayList arrayList = (ArrayList) this.e;
        int size = arrayList.size();
        while (i11 < size) {
            s4.a aVar = (s4.a) arrayList.get(i11);
            int i12 = aVar.f42925a;
            if (i12 == 8) {
                int i13 = aVar.f42926b;
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
                int i14 = aVar.f42926b;
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
        s4.a aVar = (s4.a) ((b0) this.f42464c).a();
        if (aVar == null) {
            ?? obj2 = new Object();
            obj2.f42925a = i10;
            obj2.f42926b = i11;
            obj2.d = i12;
            obj2.f42927c = obj;
            return obj2;
        }
        aVar.f42925a = i10;
        aVar.f42926b = i11;
        aVar.d = i12;
        aVar.f42927c = obj;
        return aVar;
    }

    public void k(s4.a aVar) {
        h hVar = (h) this.f42465f;
        ((ArrayList) this.e).add(aVar);
        int i10 = aVar.f42925a;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 4) {
                    if (i10 == 8) {
                        hVar.d(aVar.f42926b, aVar.d);
                        return;
                    }
                    throw new IllegalArgumentException("Unknown update op type for " + aVar);
                }
                hVar.b(aVar.f42926b, aVar.d, aVar.f42927c);
                return;
            }
            int i11 = aVar.f42926b;
            int i12 = aVar.d;
            RecyclerView recyclerView = hVar.f10517a;
            recyclerView.e0(i11, i12, false);
            recyclerView.f2859w0 = true;
            return;
        }
        hVar.c(aVar.f42926b, aVar.d);
    }

    public void l() {
        throw new UnsupportedOperationException("Method not decompiled: ra.a.l():void");
    }

    public void m(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            s4.a aVar = (s4.a) arrayList.get(i10);
            aVar.f42927c = null;
            ((b0) this.f42464c).i(aVar);
        }
        arrayList.clear();
    }

    public java.lang.String n() {
        throw new UnsupportedOperationException("Method not decompiled: ra.a.n():java.lang.String");
    }

    public int o(int i10, int i11) {
        int i12;
        int i13;
        b0 b0Var = (b0) this.f42464c;
        ArrayList arrayList = (ArrayList) this.e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            s4.a aVar = (s4.a) arrayList.get(size);
            int i14 = aVar.f42925a;
            if (i14 == 8) {
                int i15 = aVar.f42926b;
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
                            aVar.f42926b = i15 + 1;
                        } else if (i11 == 2) {
                            aVar.f42926b = i15 - 1;
                        }
                        i10--;
                    }
                } else if (i10 < i15) {
                    if (i11 == 1) {
                        aVar.f42926b = i15 + 1;
                        aVar.d = i16 + 1;
                    } else if (i11 == 2) {
                        aVar.f42926b = i15 - 1;
                        aVar.d = i16 - 1;
                    }
                }
            } else {
                int i17 = aVar.f42926b;
                if (i17 <= i10) {
                    if (i14 == 1) {
                        i10 -= aVar.d;
                    } else if (i14 == 2) {
                        i10 += aVar.d;
                    }
                } else if (i11 == 1) {
                    aVar.f42926b = i17 + 1;
                } else if (i11 == 2) {
                    aVar.f42926b = i17 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            s4.a aVar2 = (s4.a) arrayList.get(size2);
            if (aVar2.f42925a == 8) {
                int i18 = aVar2.d;
                if (i18 == aVar2.f42926b || i18 < 0) {
                    arrayList.remove(size2);
                    aVar2.f42927c = null;
                    b0Var.i(aVar2);
                }
            } else if (aVar2.d <= 0) {
                arrayList.remove(size2);
                aVar2.f42927c = null;
                b0Var.i(aVar2);
            }
        }
        return i10;
    }

    public String toString() {
        switch (this.f42462a) {
            case 1:
                re.b bVar = re.b.e;
                return n();
            default:
                return super.toString();
        }
    }

    public a(h hVar) {
        this.f42462a = 3;
        this.f42464c = new b0(30, 6);
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f42463b = 0;
        this.h = BuildVars.DEBUG_VERSION ? new ArrayList() : null;
        this.f42465f = hVar;
        this.f42466g = new d(this);
    }
}
