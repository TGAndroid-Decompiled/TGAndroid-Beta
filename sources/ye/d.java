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
    public static final LinkedHashSet f50013p = new LinkedHashSet(Arrays.asList(bf.b.class, bf.i.class, bf.h.class, bf.j.class, t.class, bf.n.class, bf.l.class));
    public static final Map f50014q;
    public CharSequence f50015a;
    public boolean d;
    public boolean h;
    public final List f50021i;
    public final cf.b f50022j;
    public final List f50023k;
    public final c f50024l;
    public final ArrayList f50026n;
    public final LinkedHashSet f50027o;
    public int f50016b = 0;
    public int f50017c = 0;
    public int f50018e = 0;
    public int f50019f = 0;
    public int f50020g = 0;
    public final LinkedHashMap f50025m = new LinkedHashMap();

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(bf.b.class, new xe.a(1));
        hashMap.put(bf.i.class, new xe.a(3));
        hashMap.put(bf.h.class, new xe.a(2));
        hashMap.put(bf.j.class, new xe.a(4));
        hashMap.put(t.class, new xe.a(7));
        hashMap.put(bf.n.class, new xe.a(6));
        hashMap.put(bf.l.class, new xe.a(5));
        f50014q = DesugarCollections.unmodifiableMap(hashMap);
    }

    public d(ArrayList arrayList, cf.b bVar, ArrayList arrayList2) {
        ArrayList arrayList3 = new ArrayList();
        this.f50026n = arrayList3;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f50027o = linkedHashSet;
        this.f50021i = arrayList;
        this.f50022j = bVar;
        this.f50023k = arrayList2;
        c cVar = new c(0);
        this.f50024l = cVar;
        arrayList3.add(cVar);
        linkedHashSet.add(cVar);
    }

    public final void a(df.a aVar) {
        while (!h().b(aVar.e())) {
            e(h());
        }
        h().e().b(aVar.e());
        this.f50026n.add(aVar);
        this.f50027o.add(aVar);
    }

    public final void b(m mVar) {
        i iVar = mVar.f50072b;
        iVar.a();
        ArrayList arrayList = iVar.f50058c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            bf.m mVar2 = (bf.m) obj;
            r rVar = mVar.f50071a;
            mVar2.g();
            p pVar = (p) rVar.f2667e;
            mVar2.f2667e = pVar;
            if (pVar != null) {
                pVar.f2668f = mVar2;
            }
            mVar2.f2668f = rVar;
            rVar.f2667e = mVar2;
            p pVar2 = (p) rVar.f2665b;
            mVar2.f2665b = pVar2;
            if (((p) mVar2.f2667e) == null) {
                pVar2.f2666c = mVar2;
            }
            String str = mVar2.f2662g;
            LinkedHashMap linkedHashMap = this.f50025m;
            if (!linkedHashMap.containsKey(str)) {
                linkedHashMap.put(str, mVar2);
            }
        }
    }

    public final void c() {
        CharSequence subSequence;
        if (this.d) {
            CharSequence charSequence = this.f50015a;
            CharSequence subSequence2 = charSequence.subSequence(this.f50016b + 1, charSequence.length());
            int i10 = 4 - (this.f50017c % 4);
            StringBuilder sb2 = new StringBuilder(subSequence2.length() + i10);
            for (int i11 = 0; i11 < i10; i11++) {
                sb2.append(' ');
            }
            sb2.append(subSequence2);
            subSequence = sb2.toString();
        } else {
            CharSequence charSequence2 = this.f50015a;
            subSequence = charSequence2.subSequence(this.f50016b, charSequence2.length());
        }
        h().a(subSequence);
    }

    public final void d() {
        if (this.f50015a.charAt(this.f50016b) == '\t') {
            this.f50016b++;
            int i10 = this.f50017c;
            this.f50017c = (4 - (i10 % 4)) + i10;
            return;
        }
        this.f50016b++;
        this.f50017c++;
    }

    public final void e(df.a aVar) {
        if (h() == aVar) {
            a4.a.x(1, this.f50026n);
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
        int i10 = this.f50016b;
        int i11 = this.f50017c;
        this.h = true;
        int length = this.f50015a.length();
        while (true) {
            if (i10 >= length) {
                break;
            }
            char charAt = this.f50015a.charAt(i10);
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
        this.f50018e = i10;
        this.f50019f = i11;
        this.f50020g = i11 - this.f50017c;
    }

    public final df.a h() {
        return (df.a) i2.g.h(1, this.f50026n);
    }

    public final void i(java.lang.String r23) {
        throw new UnsupportedOperationException("Method not decompiled: ye.d.i(java.lang.String):void");
    }

    public final void j(int i10) {
        int i11;
        int i12 = this.f50019f;
        if (i10 >= i12) {
            this.f50016b = this.f50018e;
            this.f50017c = i12;
        }
        int length = this.f50015a.length();
        while (true) {
            i11 = this.f50017c;
            if (i11 >= i10 || this.f50016b == length) {
                break;
            }
            d();
        }
        if (i11 > i10) {
            this.f50016b--;
            this.f50017c = i10;
            this.d = true;
            return;
        }
        this.d = false;
    }

    public final void k(int i10) {
        int i11 = this.f50018e;
        if (i10 >= i11) {
            this.f50016b = i11;
            this.f50017c = this.f50019f;
        }
        int length = this.f50015a.length();
        while (true) {
            int i12 = this.f50016b;
            if (i12 >= i10 || i12 == length) {
                break;
            }
            d();
        }
        this.d = false;
    }
}
