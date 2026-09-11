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
    public static final LinkedHashSet f49983p = new LinkedHashSet(Arrays.asList(bf.b.class, bf.i.class, bf.h.class, bf.j.class, t.class, bf.n.class, bf.l.class));
    public static final Map f49984q;
    public CharSequence f49985a;
    public boolean d;
    public boolean h;
    public final List f49991i;
    public final cf.b f49992j;
    public final List f49993k;
    public final c f49994l;
    public final ArrayList f49996n;
    public final LinkedHashSet f49997o;
    public int f49986b = 0;
    public int f49987c = 0;
    public int f49988e = 0;
    public int f49989f = 0;
    public int f49990g = 0;
    public final LinkedHashMap f49995m = new LinkedHashMap();

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(bf.b.class, new xe.a(1));
        hashMap.put(bf.i.class, new xe.a(3));
        hashMap.put(bf.h.class, new xe.a(2));
        hashMap.put(bf.j.class, new xe.a(4));
        hashMap.put(t.class, new xe.a(7));
        hashMap.put(bf.n.class, new xe.a(6));
        hashMap.put(bf.l.class, new xe.a(5));
        f49984q = DesugarCollections.unmodifiableMap(hashMap);
    }

    public d(ArrayList arrayList, cf.b bVar, ArrayList arrayList2) {
        ArrayList arrayList3 = new ArrayList();
        this.f49996n = arrayList3;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f49997o = linkedHashSet;
        this.f49991i = arrayList;
        this.f49992j = bVar;
        this.f49993k = arrayList2;
        c cVar = new c(0);
        this.f49994l = cVar;
        arrayList3.add(cVar);
        linkedHashSet.add(cVar);
    }

    public final void a(df.a aVar) {
        while (!h().b(aVar.e())) {
            e(h());
        }
        h().e().b(aVar.e());
        this.f49996n.add(aVar);
        this.f49997o.add(aVar);
    }

    public final void b(m mVar) {
        i iVar = mVar.f50042b;
        iVar.a();
        ArrayList arrayList = iVar.f50028c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            bf.m mVar2 = (bf.m) obj;
            r rVar = mVar.f50041a;
            mVar2.g();
            p pVar = (p) rVar.f2640e;
            mVar2.f2640e = pVar;
            if (pVar != null) {
                pVar.f2641f = mVar2;
            }
            mVar2.f2641f = rVar;
            rVar.f2640e = mVar2;
            p pVar2 = (p) rVar.f2638b;
            mVar2.f2638b = pVar2;
            if (((p) mVar2.f2640e) == null) {
                pVar2.f2639c = mVar2;
            }
            String str = mVar2.f2635g;
            LinkedHashMap linkedHashMap = this.f49995m;
            if (!linkedHashMap.containsKey(str)) {
                linkedHashMap.put(str, mVar2);
            }
        }
    }

    public final void c() {
        CharSequence subSequence;
        if (this.d) {
            CharSequence charSequence = this.f49985a;
            CharSequence subSequence2 = charSequence.subSequence(this.f49986b + 1, charSequence.length());
            int i10 = 4 - (this.f49987c % 4);
            StringBuilder sb2 = new StringBuilder(subSequence2.length() + i10);
            for (int i11 = 0; i11 < i10; i11++) {
                sb2.append(' ');
            }
            sb2.append(subSequence2);
            subSequence = sb2.toString();
        } else {
            CharSequence charSequence2 = this.f49985a;
            subSequence = charSequence2.subSequence(this.f49986b, charSequence2.length());
        }
        h().a(subSequence);
    }

    public final void d() {
        if (this.f49985a.charAt(this.f49986b) == '\t') {
            this.f49986b++;
            int i10 = this.f49987c;
            this.f49987c = (4 - (i10 % 4)) + i10;
            return;
        }
        this.f49986b++;
        this.f49987c++;
    }

    public final void e(df.a aVar) {
        if (h() == aVar) {
            a4.a.x(1, this.f49996n);
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
        int i10 = this.f49986b;
        int i11 = this.f49987c;
        this.h = true;
        int length = this.f49985a.length();
        while (true) {
            if (i10 >= length) {
                break;
            }
            char charAt = this.f49985a.charAt(i10);
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
        this.f49988e = i10;
        this.f49989f = i11;
        this.f49990g = i11 - this.f49987c;
    }

    public final df.a h() {
        return (df.a) i2.g.h(1, this.f49996n);
    }

    public final void i(java.lang.String r23) {
        throw new UnsupportedOperationException("Method not decompiled: ye.d.i(java.lang.String):void");
    }

    public final void j(int i10) {
        int i11;
        int i12 = this.f49989f;
        if (i10 >= i12) {
            this.f49986b = this.f49988e;
            this.f49987c = i12;
        }
        int length = this.f49985a.length();
        while (true) {
            i11 = this.f49987c;
            if (i11 >= i10 || this.f49986b == length) {
                break;
            }
            d();
        }
        if (i11 > i10) {
            this.f49986b--;
            this.f49987c = i10;
            this.d = true;
            return;
        }
        this.d = false;
    }

    public final void k(int i10) {
        int i11 = this.f49988e;
        if (i10 >= i11) {
            this.f49986b = i11;
            this.f49987c = this.f49989f;
        }
        int length = this.f49985a.length();
        while (true) {
            int i12 = this.f49986b;
            if (i12 >= i10 || i12 == length) {
                break;
            }
            d();
        }
        this.d = false;
    }
}
