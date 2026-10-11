package ze;

import cf.p;
import cf.r;
import cf.t;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
public final class d {
    public static final LinkedHashSet f54465p = new LinkedHashSet(Arrays.asList(cf.b.class, cf.i.class, cf.h.class, cf.j.class, t.class, cf.n.class, cf.l.class));
    public static final Map f54466q;
    public CharSequence f54467a;
    public boolean d;
    public boolean h;
    public final List f54473i;
    public final df.b f54474j;
    public final List f54475k;
    public final c f54476l;
    public final ArrayList f54478n;
    public final LinkedHashSet f54479o;
    public int f54468b = 0;
    public int f54469c = 0;
    public int f54470e = 0;
    public int f54471f = 0;
    public int f54472g = 0;
    public final LinkedHashMap f54477m = new LinkedHashMap();

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(cf.b.class, new ad.b(2));
        hashMap.put(cf.i.class, new ad.b(4));
        hashMap.put(cf.h.class, new ad.b(3));
        hashMap.put(cf.j.class, new ad.b(5));
        hashMap.put(t.class, new ad.b(8));
        hashMap.put(cf.n.class, new ad.b(7));
        hashMap.put(cf.l.class, new ad.b(6));
        f54466q = DesugarCollections.unmodifiableMap(hashMap);
    }

    public d(ArrayList arrayList, df.b bVar, ArrayList arrayList2) {
        ArrayList arrayList3 = new ArrayList();
        this.f54478n = arrayList3;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f54479o = linkedHashSet;
        this.f54473i = arrayList;
        this.f54474j = bVar;
        this.f54475k = arrayList2;
        c cVar = new c(0);
        this.f54476l = cVar;
        arrayList3.add(cVar);
        linkedHashSet.add(cVar);
    }

    public final void a(ef.a aVar) {
        while (!h().b(aVar.e())) {
            e(h());
        }
        h().e().b(aVar.e());
        this.f54478n.add(aVar);
        this.f54479o.add(aVar);
    }

    public final void b(m mVar) {
        i iVar = mVar.f54524b;
        iVar.a();
        ArrayList arrayList = iVar.f54510c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            cf.m mVar2 = (cf.m) obj;
            r rVar = mVar.f54523a;
            mVar2.g();
            p pVar = (p) rVar.f4653e;
            mVar2.f4653e = pVar;
            if (pVar != null) {
                pVar.f4654f = mVar2;
            }
            mVar2.f4654f = rVar;
            rVar.f4653e = mVar2;
            p pVar2 = (p) rVar.f4651b;
            mVar2.f4651b = pVar2;
            if (((p) mVar2.f4653e) == null) {
                pVar2.f4652c = mVar2;
            }
            String str = mVar2.f4648g;
            LinkedHashMap linkedHashMap = this.f54477m;
            if (!linkedHashMap.containsKey(str)) {
                linkedHashMap.put(str, mVar2);
            }
        }
    }

    public final void c() {
        CharSequence subSequence;
        if (this.d) {
            CharSequence charSequence = this.f54467a;
            CharSequence subSequence2 = charSequence.subSequence(this.f54468b + 1, charSequence.length());
            int i10 = 4 - (this.f54469c % 4);
            StringBuilder sb2 = new StringBuilder(subSequence2.length() + i10);
            for (int i11 = 0; i11 < i10; i11++) {
                sb2.append(' ');
            }
            sb2.append(subSequence2);
            subSequence = sb2.toString();
        } else {
            CharSequence charSequence2 = this.f54467a;
            subSequence = charSequence2.subSequence(this.f54468b, charSequence2.length());
        }
        h().a(subSequence);
    }

    public final void d() {
        if (this.f54467a.charAt(this.f54468b) == '\t') {
            this.f54468b++;
            int i10 = this.f54469c;
            this.f54469c = (4 - (i10 % 4)) + i10;
            return;
        }
        this.f54468b++;
        this.f54469c++;
    }

    public final void e(ef.a aVar) {
        if (h() == aVar) {
            a1.g.y(1, this.f54478n);
        }
        if (aVar instanceof m) {
            b((m) aVar);
        }
        aVar.d();
    }

    public final void f(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            e((ef.a) list.get(size));
        }
    }

    public final void g() {
        int i10 = this.f54468b;
        int i11 = this.f54469c;
        this.h = true;
        int length = this.f54467a.length();
        while (true) {
            if (i10 >= length) {
                break;
            }
            char charAt = this.f54467a.charAt(i10);
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
        this.f54470e = i10;
        this.f54471f = i11;
        this.f54472g = i11 - this.f54469c;
    }

    public final ef.a h() {
        return (ef.a) hg.c.g(1, this.f54478n);
    }

    public final void i(java.lang.String r23) {
        throw new UnsupportedOperationException("Method not decompiled: ze.d.i(java.lang.String):void");
    }

    public final void j(int i10) {
        int i11;
        int i12 = this.f54471f;
        if (i10 >= i12) {
            this.f54468b = this.f54470e;
            this.f54469c = i12;
        }
        int length = this.f54467a.length();
        while (true) {
            i11 = this.f54469c;
            if (i11 >= i10 || this.f54468b == length) {
                break;
            }
            d();
        }
        if (i11 > i10) {
            this.f54468b--;
            this.f54469c = i10;
            this.d = true;
            return;
        }
        this.d = false;
    }

    public final void k(int i10) {
        int i11 = this.f54470e;
        if (i10 >= i11) {
            this.f54468b = i11;
            this.f54469c = this.f54471f;
        }
        int length = this.f54467a.length();
        while (true) {
            int i12 = this.f54468b;
            if (i12 >= i10 || i12 == length) {
                break;
            }
            d();
        }
        this.d = false;
    }
}
