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
    public static final LinkedHashSet f50864p = new LinkedHashSet(Arrays.asList(bf.b.class, bf.i.class, bf.h.class, bf.j.class, t.class, bf.n.class, bf.l.class));
    public static final Map f50865q;
    public CharSequence f50866a;
    public boolean d;
    public boolean h;
    public final List f50872i;
    public final cf.b f50873j;
    public final List f50874k;
    public final c f50875l;
    public final ArrayList f50877n;
    public final LinkedHashSet f50878o;
    public int f50867b = 0;
    public int f50868c = 0;
    public int f50869e = 0;
    public int f50870f = 0;
    public int f50871g = 0;
    public final LinkedHashMap f50876m = new LinkedHashMap();

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(bf.b.class, new xe.a(1));
        hashMap.put(bf.i.class, new xe.a(3));
        hashMap.put(bf.h.class, new xe.a(2));
        hashMap.put(bf.j.class, new xe.a(4));
        hashMap.put(t.class, new xe.a(7));
        hashMap.put(bf.n.class, new xe.a(6));
        hashMap.put(bf.l.class, new xe.a(5));
        f50865q = DesugarCollections.unmodifiableMap(hashMap);
    }

    public d(ArrayList arrayList, cf.b bVar, ArrayList arrayList2) {
        ArrayList arrayList3 = new ArrayList();
        this.f50877n = arrayList3;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f50878o = linkedHashSet;
        this.f50872i = arrayList;
        this.f50873j = bVar;
        this.f50874k = arrayList2;
        c cVar = new c(0);
        this.f50875l = cVar;
        arrayList3.add(cVar);
        linkedHashSet.add(cVar);
    }

    public final void a(df.a aVar) {
        while (!h().b(aVar.e())) {
            e(h());
        }
        h().e().b(aVar.e());
        this.f50877n.add(aVar);
        this.f50878o.add(aVar);
    }

    public final void b(m mVar) {
        i iVar = mVar.f50923b;
        iVar.a();
        ArrayList arrayList = iVar.f50909c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            bf.m mVar2 = (bf.m) obj;
            r rVar = mVar.f50922a;
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
            LinkedHashMap linkedHashMap = this.f50876m;
            if (!linkedHashMap.containsKey(str)) {
                linkedHashMap.put(str, mVar2);
            }
        }
    }

    public final void c() {
        CharSequence subSequence;
        if (this.d) {
            CharSequence charSequence = this.f50866a;
            CharSequence subSequence2 = charSequence.subSequence(this.f50867b + 1, charSequence.length());
            int i10 = 4 - (this.f50868c % 4);
            StringBuilder sb2 = new StringBuilder(subSequence2.length() + i10);
            for (int i11 = 0; i11 < i10; i11++) {
                sb2.append(' ');
            }
            sb2.append(subSequence2);
            subSequence = sb2.toString();
        } else {
            CharSequence charSequence2 = this.f50866a;
            subSequence = charSequence2.subSequence(this.f50867b, charSequence2.length());
        }
        h().a(subSequence);
    }

    public final void d() {
        if (this.f50866a.charAt(this.f50867b) == '\t') {
            this.f50867b++;
            int i10 = this.f50868c;
            this.f50868c = (4 - (i10 % 4)) + i10;
            return;
        }
        this.f50867b++;
        this.f50868c++;
    }

    public final void e(df.a aVar) {
        if (h() == aVar) {
            a4.a.x(1, this.f50877n);
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
        int i10 = this.f50867b;
        int i11 = this.f50868c;
        this.h = true;
        int length = this.f50866a.length();
        while (true) {
            if (i10 >= length) {
                break;
            }
            char charAt = this.f50866a.charAt(i10);
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
        this.f50869e = i10;
        this.f50870f = i11;
        this.f50871g = i11 - this.f50868c;
    }

    public final df.a h() {
        return (df.a) k0.g(1, this.f50877n);
    }

    public final void i(java.lang.String r24) {
        throw new UnsupportedOperationException("Method not decompiled: ye.d.i(java.lang.String):void");
    }

    public final void j(int i10) {
        int i11;
        int i12 = this.f50870f;
        if (i10 >= i12) {
            this.f50867b = this.f50869e;
            this.f50868c = i12;
        }
        int length = this.f50866a.length();
        while (true) {
            i11 = this.f50868c;
            if (i11 >= i10 || this.f50867b == length) {
                break;
            }
            d();
        }
        if (i11 > i10) {
            this.f50867b--;
            this.f50868c = i10;
            this.d = true;
            return;
        }
        this.d = false;
    }

    public final void k(int i10) {
        int i11 = this.f50869e;
        if (i10 >= i11) {
            this.f50867b = i11;
            this.f50868c = this.f50870f;
        }
        int length = this.f50866a.length();
        while (true) {
            int i12 = this.f50867b;
            if (i12 >= i10 || i12 == length) {
                break;
            }
            d();
        }
        this.d = false;
    }
}
