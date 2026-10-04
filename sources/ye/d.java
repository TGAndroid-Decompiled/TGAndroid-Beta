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
    public static final LinkedHashSet f50865p = new LinkedHashSet(Arrays.asList(bf.b.class, bf.i.class, bf.h.class, bf.j.class, t.class, bf.n.class, bf.l.class));
    public static final Map f50866q;
    public CharSequence f50867a;
    public boolean d;
    public boolean h;
    public final List f50873i;
    public final cf.b f50874j;
    public final List f50875k;
    public final c f50876l;
    public final ArrayList f50878n;
    public final LinkedHashSet f50879o;
    public int f50868b = 0;
    public int f50869c = 0;
    public int f50870e = 0;
    public int f50871f = 0;
    public int f50872g = 0;
    public final LinkedHashMap f50877m = new LinkedHashMap();

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(bf.b.class, new xe.a(1));
        hashMap.put(bf.i.class, new xe.a(3));
        hashMap.put(bf.h.class, new xe.a(2));
        hashMap.put(bf.j.class, new xe.a(4));
        hashMap.put(t.class, new xe.a(7));
        hashMap.put(bf.n.class, new xe.a(6));
        hashMap.put(bf.l.class, new xe.a(5));
        f50866q = DesugarCollections.unmodifiableMap(hashMap);
    }

    public d(ArrayList arrayList, cf.b bVar, ArrayList arrayList2) {
        ArrayList arrayList3 = new ArrayList();
        this.f50878n = arrayList3;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f50879o = linkedHashSet;
        this.f50873i = arrayList;
        this.f50874j = bVar;
        this.f50875k = arrayList2;
        c cVar = new c(0);
        this.f50876l = cVar;
        arrayList3.add(cVar);
        linkedHashSet.add(cVar);
    }

    public final void a(df.a aVar) {
        while (!h().b(aVar.e())) {
            e(h());
        }
        h().e().b(aVar.e());
        this.f50878n.add(aVar);
        this.f50879o.add(aVar);
    }

    public final void b(m mVar) {
        i iVar = mVar.f50924b;
        iVar.a();
        ArrayList arrayList = iVar.f50910c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            bf.m mVar2 = (bf.m) obj;
            r rVar = mVar.f50923a;
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
            LinkedHashMap linkedHashMap = this.f50877m;
            if (!linkedHashMap.containsKey(str)) {
                linkedHashMap.put(str, mVar2);
            }
        }
    }

    public final void c() {
        CharSequence subSequence;
        if (this.d) {
            CharSequence charSequence = this.f50867a;
            CharSequence subSequence2 = charSequence.subSequence(this.f50868b + 1, charSequence.length());
            int i10 = 4 - (this.f50869c % 4);
            StringBuilder sb2 = new StringBuilder(subSequence2.length() + i10);
            for (int i11 = 0; i11 < i10; i11++) {
                sb2.append(' ');
            }
            sb2.append(subSequence2);
            subSequence = sb2.toString();
        } else {
            CharSequence charSequence2 = this.f50867a;
            subSequence = charSequence2.subSequence(this.f50868b, charSequence2.length());
        }
        h().a(subSequence);
    }

    public final void d() {
        if (this.f50867a.charAt(this.f50868b) == '\t') {
            this.f50868b++;
            int i10 = this.f50869c;
            this.f50869c = (4 - (i10 % 4)) + i10;
            return;
        }
        this.f50868b++;
        this.f50869c++;
    }

    public final void e(df.a aVar) {
        if (h() == aVar) {
            a4.a.x(1, this.f50878n);
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
        int i10 = this.f50868b;
        int i11 = this.f50869c;
        this.h = true;
        int length = this.f50867a.length();
        while (true) {
            if (i10 >= length) {
                break;
            }
            char charAt = this.f50867a.charAt(i10);
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
        this.f50870e = i10;
        this.f50871f = i11;
        this.f50872g = i11 - this.f50869c;
    }

    public final df.a h() {
        return (df.a) k0.g(1, this.f50878n);
    }

    public final void i(java.lang.String r24) {
        throw new UnsupportedOperationException("Method not decompiled: ye.d.i(java.lang.String):void");
    }

    public final void j(int i10) {
        int i11;
        int i12 = this.f50871f;
        if (i10 >= i12) {
            this.f50868b = this.f50870e;
            this.f50869c = i12;
        }
        int length = this.f50867a.length();
        while (true) {
            i11 = this.f50869c;
            if (i11 >= i10 || this.f50868b == length) {
                break;
            }
            d();
        }
        if (i11 > i10) {
            this.f50868b--;
            this.f50869c = i10;
            this.d = true;
            return;
        }
        this.d = false;
    }

    public final void k(int i10) {
        int i11 = this.f50870e;
        if (i10 >= i11) {
            this.f50868b = i11;
            this.f50869c = this.f50871f;
        }
        int length = this.f50867a.length();
        while (true) {
            int i12 = this.f50868b;
            if (i12 >= i10 || i12 == length) {
                break;
            }
            d();
        }
        this.d = false;
    }
}
