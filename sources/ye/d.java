package ye;

import bf.p;
import bf.r;
import bf.t;
import hg.k0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
public final class d {
    public static final LinkedHashSet f46972p = new LinkedHashSet(Arrays.asList(bf.b.class, bf.i.class, bf.h.class, bf.j.class, t.class, bf.n.class, bf.l.class));
    public static final Map f46973q;
    public CharSequence f46974a;
    public boolean d;
    public boolean h;
    public final List f46979i;
    public final cf.b f46980j;
    public final List f46981k;
    public final c f46982l;
    public final ArrayList f46984n;
    public final LinkedHashSet f46985o;
    public int f46975b = 0;
    public int f46976c = 0;
    public int e = 0;
    public int f46977f = 0;
    public int f46978g = 0;
    public final LinkedHashMap f46983m = new LinkedHashMap();

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(bf.b.class, new xe.a(1));
        hashMap.put(bf.i.class, new xe.a(3));
        hashMap.put(bf.h.class, new xe.a(2));
        hashMap.put(bf.j.class, new xe.a(4));
        hashMap.put(t.class, new xe.a(7));
        hashMap.put(bf.n.class, new xe.a(6));
        hashMap.put(bf.l.class, new xe.a(5));
        f46973q = DesugarCollections.unmodifiableMap(hashMap);
    }

    public d(ArrayList arrayList, cf.b bVar, ArrayList arrayList2) {
        ArrayList arrayList3 = new ArrayList();
        this.f46984n = arrayList3;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f46985o = linkedHashSet;
        this.f46979i = arrayList;
        this.f46980j = bVar;
        this.f46981k = arrayList2;
        c cVar = new c(0);
        this.f46982l = cVar;
        arrayList3.add(cVar);
        linkedHashSet.add(cVar);
    }

    public final void a(df.a aVar) {
        while (!h().b(aVar.e())) {
            e(h());
        }
        h().e().b(aVar.e());
        this.f46984n.add(aVar);
        this.f46985o.add(aVar);
    }

    public final void b(m mVar) {
        i iVar = mVar.f47027b;
        iVar.a();
        ArrayList arrayList = iVar.f47014c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            bf.m mVar2 = (bf.m) obj;
            r rVar = mVar.f47026a;
            mVar2.g();
            p pVar = (p) rVar.e;
            mVar2.e = pVar;
            if (pVar != null) {
                pVar.f3554f = mVar2;
            }
            mVar2.f3554f = rVar;
            rVar.e = mVar2;
            p pVar2 = (p) rVar.f3552b;
            mVar2.f3552b = pVar2;
            if (((p) mVar2.e) == null) {
                pVar2.f3553c = mVar2;
            }
            String str = mVar2.f3549g;
            LinkedHashMap linkedHashMap = this.f46983m;
            if (!linkedHashMap.containsKey(str)) {
                linkedHashMap.put(str, mVar2);
            }
        }
    }

    public final void c() {
        CharSequence subSequence;
        if (this.d) {
            CharSequence charSequence = this.f46974a;
            CharSequence subSequence2 = charSequence.subSequence(this.f46975b + 1, charSequence.length());
            int i10 = 4 - (this.f46976c % 4);
            StringBuilder sb2 = new StringBuilder(subSequence2.length() + i10);
            for (int i11 = 0; i11 < i10; i11++) {
                sb2.append(' ');
            }
            sb2.append(subSequence2);
            subSequence = sb2.toString();
        } else {
            CharSequence charSequence2 = this.f46974a;
            subSequence = charSequence2.subSequence(this.f46975b, charSequence2.length());
        }
        h().a(subSequence);
    }

    public final void d() {
        if (this.f46974a.charAt(this.f46975b) == '\t') {
            this.f46975b++;
            int i10 = this.f46976c;
            this.f46976c = (4 - (i10 % 4)) + i10;
            return;
        }
        this.f46975b++;
        this.f46976c++;
    }

    public final void e(df.a aVar) {
        if (h() == aVar) {
            a4.a.x(1, this.f46984n);
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
        int i10 = this.f46975b;
        int i11 = this.f46976c;
        this.h = true;
        int length = this.f46974a.length();
        while (true) {
            if (i10 >= length) {
                break;
            }
            char charAt = this.f46974a.charAt(i10);
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
        this.e = i10;
        this.f46977f = i11;
        this.f46978g = i11 - this.f46976c;
    }

    public final df.a h() {
        return (df.a) k0.g(1, this.f46984n);
    }

    public final void i(java.lang.String r23) {
        throw new UnsupportedOperationException("Method not decompiled: ye.d.i(java.lang.String):void");
    }

    public final void j(int i10) {
        int i11;
        int i12 = this.f46977f;
        if (i10 >= i12) {
            this.f46975b = this.e;
            this.f46976c = i12;
        }
        int length = this.f46974a.length();
        while (true) {
            i11 = this.f46976c;
            if (i11 >= i10 || this.f46975b == length) {
                break;
            }
            d();
        }
        if (i11 > i10) {
            this.f46975b--;
            this.f46976c = i10;
            this.d = true;
            return;
        }
        this.d = false;
    }

    public final void k(int i10) {
        int i11 = this.e;
        if (i10 >= i11) {
            this.f46975b = i11;
            this.f46976c = this.f46977f;
        }
        int length = this.f46974a.length();
        while (true) {
            int i12 = this.f46975b;
            if (i12 >= i10 || i12 == length) {
                break;
            }
            d();
        }
        this.d = false;
    }
}
