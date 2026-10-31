package se;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import ve.q;
import ve.s;
public final class d {
    public static final LinkedHashSet f48195p = new LinkedHashSet(Arrays.asList(ve.b.class, ve.i.class, ve.h.class, ve.j.class, s.class, ve.n.class, ve.l.class));
    public static final Map f48196q;
    public CharSequence f48197a;
    public boolean d;
    public boolean h;
    public final List f48202i;
    public final we.b f48203j;
    public final List f48204k;
    public final c f48205l;
    public final ArrayList f48207n;
    public final LinkedHashSet f48208o;
    public int f48198b = 0;
    public int f48199c = 0;
    public int e = 0;
    public int f48200f = 0;
    public int f48201g = 0;
    public final LinkedHashMap f48206m = new LinkedHashMap();

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(ve.b.class, new re.a(1));
        hashMap.put(ve.i.class, new re.a(3));
        hashMap.put(ve.h.class, new re.a(2));
        hashMap.put(ve.j.class, new re.a(4));
        hashMap.put(s.class, new re.a(7));
        hashMap.put(ve.n.class, new re.a(6));
        hashMap.put(ve.l.class, new re.a(5));
        f48196q = DesugarCollections.unmodifiableMap(hashMap);
    }

    public d(ArrayList arrayList, we.b bVar, ArrayList arrayList2) {
        ArrayList arrayList3 = new ArrayList();
        this.f48207n = arrayList3;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f48208o = linkedHashSet;
        this.f48202i = arrayList;
        this.f48203j = bVar;
        this.f48204k = arrayList2;
        c cVar = new c(0);
        this.f48205l = cVar;
        arrayList3.add(cVar);
        linkedHashSet.add(cVar);
    }

    public final void a(xe.a aVar) {
        while (!h().b(aVar.e())) {
            e(h());
        }
        h().e().b(aVar.e());
        this.f48207n.add(aVar);
        this.f48208o.add(aVar);
    }

    public final void b(m mVar) {
        i iVar = mVar.f48250b;
        iVar.a();
        ArrayList arrayList = iVar.f48237c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ve.m mVar2 = (ve.m) obj;
            q qVar = mVar.f48249a;
            mVar2.g();
            df.c cVar = (df.c) qVar.e;
            mVar2.e = cVar;
            if (cVar != null) {
                cVar.f5879f = mVar2;
            }
            mVar2.f5879f = qVar;
            qVar.e = mVar2;
            df.c cVar2 = (df.c) qVar.f5877b;
            mVar2.f5877b = cVar2;
            if (((df.c) mVar2.e) == null) {
                cVar2.f5878c = mVar2;
            }
            String str = mVar2.f50808g;
            LinkedHashMap linkedHashMap = this.f48206m;
            if (!linkedHashMap.containsKey(str)) {
                linkedHashMap.put(str, mVar2);
            }
        }
    }

    public final void c() {
        CharSequence subSequence;
        if (this.d) {
            CharSequence charSequence = this.f48197a;
            CharSequence subSequence2 = charSequence.subSequence(this.f48198b + 1, charSequence.length());
            int i10 = 4 - (this.f48199c % 4);
            StringBuilder sb2 = new StringBuilder(subSequence2.length() + i10);
            for (int i11 = 0; i11 < i10; i11++) {
                sb2.append(' ');
            }
            sb2.append(subSequence2);
            subSequence = sb2.toString();
        } else {
            CharSequence charSequence2 = this.f48197a;
            subSequence = charSequence2.subSequence(this.f48198b, charSequence2.length());
        }
        h().a(subSequence);
    }

    public final void d() {
        if (this.f48197a.charAt(this.f48198b) == '\t') {
            this.f48198b++;
            int i10 = this.f48199c;
            this.f48199c = (4 - (i10 % 4)) + i10;
            return;
        }
        this.f48198b++;
        this.f48199c++;
    }

    public final void e(xe.a aVar) {
        if (h() == aVar) {
            a1.g.x(1, this.f48207n);
        }
        if (aVar instanceof m) {
            b((m) aVar);
        }
        aVar.d();
    }

    public final void f(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            e((xe.a) list.get(size));
        }
    }

    public final void g() {
        int i10 = this.f48198b;
        int i11 = this.f48199c;
        this.h = true;
        int length = this.f48197a.length();
        while (true) {
            if (i10 >= length) {
                break;
            }
            char charAt = this.f48197a.charAt(i10);
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
        this.f48200f = i11;
        this.f48201g = i11 - this.f48199c;
    }

    public final xe.a h() {
        return (xe.a) i0.a.g(1, this.f48207n);
    }

    public final void i(java.lang.String r23) {
        throw new UnsupportedOperationException("Method not decompiled: se.d.i(java.lang.String):void");
    }

    public final void j(int i10) {
        int i11;
        int i12 = this.f48200f;
        if (i10 >= i12) {
            this.f48198b = this.e;
            this.f48199c = i12;
        }
        int length = this.f48197a.length();
        while (true) {
            i11 = this.f48199c;
            if (i11 >= i10 || this.f48198b == length) {
                break;
            }
            d();
        }
        if (i11 > i10) {
            this.f48198b--;
            this.f48199c = i10;
            this.d = true;
            return;
        }
        this.d = false;
    }

    public final void k(int i10) {
        int i11 = this.e;
        if (i10 >= i11) {
            this.f48198b = i11;
            this.f48199c = this.f48200f;
        }
        int length = this.f48197a.length();
        while (true) {
            int i12 = this.f48198b;
            if (i12 >= i10 || i12 == length) {
                break;
            }
            d();
        }
        this.d = false;
    }
}
