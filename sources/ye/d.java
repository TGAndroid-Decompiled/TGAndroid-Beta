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
    public static final LinkedHashSet f46996p = new LinkedHashSet(Arrays.asList(bf.b.class, bf.i.class, bf.h.class, bf.j.class, t.class, bf.n.class, bf.l.class));
    public static final Map f46997q;
    public CharSequence f46998a;
    public boolean d;
    public boolean h;
    public final List f47003i;
    public final cf.b f47004j;
    public final List f47005k;
    public final c f47006l;
    public final ArrayList f47008n;
    public final LinkedHashSet f47009o;
    public int f46999b = 0;
    public int f47000c = 0;
    public int e = 0;
    public int f47001f = 0;
    public int f47002g = 0;
    public final LinkedHashMap f47007m = new LinkedHashMap();

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(bf.b.class, new xe.a(1));
        hashMap.put(bf.i.class, new xe.a(3));
        hashMap.put(bf.h.class, new xe.a(2));
        hashMap.put(bf.j.class, new xe.a(4));
        hashMap.put(t.class, new xe.a(7));
        hashMap.put(bf.n.class, new xe.a(6));
        hashMap.put(bf.l.class, new xe.a(5));
        f46997q = DesugarCollections.unmodifiableMap(hashMap);
    }

    public d(ArrayList arrayList, cf.b bVar, ArrayList arrayList2) {
        ArrayList arrayList3 = new ArrayList();
        this.f47008n = arrayList3;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f47009o = linkedHashSet;
        this.f47003i = arrayList;
        this.f47004j = bVar;
        this.f47005k = arrayList2;
        c cVar = new c(0);
        this.f47006l = cVar;
        arrayList3.add(cVar);
        linkedHashSet.add(cVar);
    }

    public final void a(df.a aVar) {
        while (!h().b(aVar.e())) {
            e(h());
        }
        h().e().b(aVar.e());
        this.f47008n.add(aVar);
        this.f47009o.add(aVar);
    }

    public final void b(m mVar) {
        i iVar = mVar.f47051b;
        iVar.a();
        ArrayList arrayList = iVar.f47038c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            bf.m mVar2 = (bf.m) obj;
            r rVar = mVar.f47050a;
            mVar2.g();
            p pVar = (p) rVar.e;
            mVar2.e = pVar;
            if (pVar != null) {
                pVar.f3546f = mVar2;
            }
            mVar2.f3546f = rVar;
            rVar.e = mVar2;
            p pVar2 = (p) rVar.f3544b;
            mVar2.f3544b = pVar2;
            if (((p) mVar2.e) == null) {
                pVar2.f3545c = mVar2;
            }
            String str = mVar2.f3541g;
            LinkedHashMap linkedHashMap = this.f47007m;
            if (!linkedHashMap.containsKey(str)) {
                linkedHashMap.put(str, mVar2);
            }
        }
    }

    public final void c() {
        CharSequence subSequence;
        if (this.d) {
            CharSequence charSequence = this.f46998a;
            CharSequence subSequence2 = charSequence.subSequence(this.f46999b + 1, charSequence.length());
            int i10 = 4 - (this.f47000c % 4);
            StringBuilder sb2 = new StringBuilder(subSequence2.length() + i10);
            for (int i11 = 0; i11 < i10; i11++) {
                sb2.append(' ');
            }
            sb2.append(subSequence2);
            subSequence = sb2.toString();
        } else {
            CharSequence charSequence2 = this.f46998a;
            subSequence = charSequence2.subSequence(this.f46999b, charSequence2.length());
        }
        h().a(subSequence);
    }

    public final void d() {
        if (this.f46998a.charAt(this.f46999b) == '\t') {
            this.f46999b++;
            int i10 = this.f47000c;
            this.f47000c = (4 - (i10 % 4)) + i10;
            return;
        }
        this.f46999b++;
        this.f47000c++;
    }

    public final void e(df.a aVar) {
        if (h() == aVar) {
            a4.a.y(1, this.f47008n);
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
        int i10 = this.f46999b;
        int i11 = this.f47000c;
        this.h = true;
        int length = this.f46998a.length();
        while (true) {
            if (i10 >= length) {
                break;
            }
            char charAt = this.f46998a.charAt(i10);
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
        this.f47001f = i11;
        this.f47002g = i11 - this.f47000c;
    }

    public final df.a h() {
        return (df.a) hg.c.g(1, this.f47008n);
    }

    public final void i(java.lang.String r23) {
        throw new UnsupportedOperationException("Method not decompiled: ye.d.i(java.lang.String):void");
    }

    public final void j(int i10) {
        int i11;
        int i12 = this.f47001f;
        if (i10 >= i12) {
            this.f46999b = this.e;
            this.f47000c = i12;
        }
        int length = this.f46998a.length();
        while (true) {
            i11 = this.f47000c;
            if (i11 >= i10 || this.f46999b == length) {
                break;
            }
            d();
        }
        if (i11 > i10) {
            this.f46999b--;
            this.f47000c = i10;
            this.d = true;
            return;
        }
        this.d = false;
    }

    public final void k(int i10) {
        int i11 = this.e;
        if (i10 >= i11) {
            this.f46999b = i11;
            this.f47000c = this.f47001f;
        }
        int length = this.f46998a.length();
        while (true) {
            int i12 = this.f46999b;
            if (i12 >= i10 || i12 == length) {
                break;
            }
            d();
        }
        this.d = false;
    }
}
