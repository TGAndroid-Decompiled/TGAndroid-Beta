package r9;

import b2.n0;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import ji.m5;
import w7.f7;
public final class a {
    public final String f44029a;
    public final Set f44030b;
    public final Set f44031c;
    public final int d;
    public final int e;
    public final d f44032f;
    public final Set f44033g;

    public a(String str, Set set, Set set2, int i10, int i11, d dVar, Set set3) {
        this.f44029a = str;
        this.f44030b = DesugarCollections.unmodifiableSet(set);
        this.f44031c = DesugarCollections.unmodifiableSet(set2);
        this.d = i10;
        this.e = i11;
        this.f44032f = dVar;
        this.f44033g = DesugarCollections.unmodifiableSet(set3);
    }

    public static n0 a(Class cls) {
        return new n0(cls, new Class[0]);
    }

    public static n0 b(r rVar) {
        r[] rVarArr = new r[0];
        ?? obj = new Object();
        obj.d = null;
        HashSet hashSet = new HashSet();
        obj.f2222c = hashSet;
        obj.e = new HashSet();
        obj.f2220a = 0;
        obj.f2221b = 0;
        obj.f2224g = new HashSet();
        hashSet.add(rVar);
        for (r rVar2 : rVarArr) {
            f7.a(rVar2, "Null interface");
        }
        Collections.addAll((HashSet) obj.f2222c, rVarArr);
        return obj;
    }

    public static a c(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(r.a(cls));
        for (Class cls2 : clsArr) {
            f7.a(cls2, "Null interface");
            hashSet.add(r.a(cls2));
        }
        return new a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new m5(obj, 27), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f44030b.toArray()) + ">{" + this.d + ", type=" + this.e + ", deps=" + Arrays.toString(this.f44031c.toArray()) + "}";
    }
}
