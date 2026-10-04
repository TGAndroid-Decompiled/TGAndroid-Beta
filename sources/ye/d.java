package ye;

import bf.p;
import bf.r;
import bf.t;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
public final class d {
    public static final LinkedHashSet f50873p = new LinkedHashSet(Arrays.asList(bf.b.class, bf.i.class, bf.h.class, bf.j.class, t.class, bf.n.class, bf.l.class));
    public static final Map f50874q;
    public CharSequence f50875a;
    public boolean d;
    public boolean h;
    public final List f50881i;
    public final cf.b f50882j;
    public final List f50883k;
    public final c f50884l;
    public final ArrayList f50886n;
    public final LinkedHashSet f50887o;
    public int f50876b = 0;
    public int f50877c = 0;
    public int f50878e = 0;
    public int f50879f = 0;
    public int f50880g = 0;
    public final LinkedHashMap f50885m = new LinkedHashMap();

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(bf.b.class, new xe.a(1));
        hashMap.put(bf.i.class, new xe.a(3));
        hashMap.put(bf.h.class, new xe.a(2));
        hashMap.put(bf.j.class, new xe.a(4));
        hashMap.put(t.class, new xe.a(7));
        hashMap.put(bf.n.class, new xe.a(6));
        hashMap.put(bf.l.class, new xe.a(5));
        f50874q = DesugarCollections.unmodifiableMap(hashMap);
    }

    public d(ArrayList arrayList, cf.b bVar, ArrayList arrayList2) {
        ArrayList arrayList3 = new ArrayList();
        this.f50886n = arrayList3;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f50887o = linkedHashSet;
        this.f50881i = arrayList;
        this.f50882j = bVar;
        this.f50883k = arrayList2;
        c cVar = new c(0);
        this.f50884l = cVar;
        arrayList3.add(cVar);
        linkedHashSet.add(cVar);
    }

    public final void a(df.a aVar) {
        while (!h().b(aVar.e())) {
            e(h());
        }
        h().e().b(aVar.e());
        this.f50886n.add(aVar);
        this.f50887o.add(aVar);
    }

    public final void b(m mVar) {
        i iVar = mVar.f50932b;
        iVar.a();
        ArrayList arrayList = iVar.f50918c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            bf.m mVar2 = (bf.m) obj;
            r rVar = mVar.f50931a;
            mVar2.g();
            p pVar = (p) rVar.f3833e;
            mVar2.f3833e = pVar;
            if (pVar != null) {
                pVar.f3834f = mVar2;
            }
            mVar2.f3834f = rVar;
            rVar.f3833e = mVar2;
            p pVar2 = (p) rVar.f3831b;
            mVar2.f3831b = pVar2;
            if (((p) mVar2.f3833e) == null) {
                pVar2.f3832c = mVar2;
            }
            String str = mVar2.f3828g;
            LinkedHashMap linkedHashMap = this.f50885m;
            if (!linkedHashMap.containsKey(str)) {
                linkedHashMap.put(str, mVar2);
            }
        }
    }

    public final void c() {
        CharSequence subSequence;
        if (this.d) {
            CharSequence charSequence = this.f50875a;
            CharSequence subSequence2 = charSequence.subSequence(this.f50876b + 1, charSequence.length());
            int i10 = 4 - (this.f50877c % 4);
            StringBuilder sb2 = new StringBuilder(subSequence2.length() + i10);
            for (int i11 = 0; i11 < i10; i11++) {
                sb2.append(' ');
            }
            sb2.append(subSequence2);
            subSequence = sb2.toString();
        } else {
            CharSequence charSequence2 = this.f50875a;
            subSequence = charSequence2.subSequence(this.f50876b, charSequence2.length());
        }
        h().a(subSequence);
    }

    public final void d() {
        if (this.f50875a.charAt(this.f50876b) == '\t') {
            this.f50876b++;
            int i10 = this.f50877c;
            this.f50877c = (4 - (i10 % 4)) + i10;
            return;
        }
        this.f50876b++;
        this.f50877c++;
    }

    public final void e(df.a aVar) {
        if (h() == aVar) {
            a4.a.y(1, this.f50886n);
        }
        if (aVar instanceof m) {
            b((m) aVar);
        }
        aVar.d();
    }

    public final void f(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            e((df.a) list.get(size));
        }
    }

    public final void g() {
        int i10 = this.f50876b;
        int i11 = this.f50877c;
        this.h = true;
        int length = this.f50875a.length();
        while (true) {
            if (i10 >= length) {
                break;
            }
            char charAt = this.f50875a.charAt(i10);
            if (charAt != '\t') {
                if (charAt != ' ') {
                    this.h = false;
                    break;
                } else {
                    i10++;
                    i11++;
                }
            } else {
                i10++;
                i11 += 4 - (i11 % 4);
            }
        }
        this.f50878e = i10;
        this.f50879f = i11;
        this.f50880g = i11 - this.f50877c;
    }

    public final df.a h() {
        return (df.a) hg.c.g(1, this.f50886n);
    }

    public final void i(java.lang.String r24) {
        throw new UnsupportedOperationException("Method not decompiled: ye.d.i(java.lang.String):void");
    }

    public final void j(int i10) {
        int i11;
        int i12 = this.f50879f;
        if (i10 >= i12) {
            this.f50876b = this.f50878e;
            this.f50877c = i12;
        }
        int length = this.f50875a.length();
        while (true) {
            i11 = this.f50877c;
            if (i11 >= i10 || this.f50876b == length) {
                break;
            }
            d();
        }
        if (i11 > i10) {
            this.f50876b--;
            this.f50877c = i10;
            this.d = true;
            return;
        }
        this.d = false;
    }

    public final void k(int i10) {
        int i11 = this.f50878e;
        if (i10 >= i11) {
            this.f50876b = i11;
            this.f50877c = this.f50879f;
        }
        int length = this.f50875a.length();
        while (true) {
            int i12 = this.f50876b;
            if (i12 >= i10 || i12 == length) {
                break;
            }
            d();
        }
        this.d = false;
    }
}
