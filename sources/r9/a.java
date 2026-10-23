package r9;

import b2.m0;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import qg.h0;
import w7.a7;
public final class a {
    public final String f45130a;
    public final Set f45131b;
    public final Set f45132c;
    public final int d;
    public final int e;
    public final d f45133f;
    public final Set f45134g;

    public a(String str, Set set, Set set2, int i10, int i11, d dVar, Set set3) {
        this.f45130a = str;
        this.f45131b = DesugarCollections.unmodifiableSet(set);
        this.f45132c = DesugarCollections.unmodifiableSet(set2);
        this.d = i10;
        this.e = i11;
        this.f45133f = dVar;
        this.f45134g = DesugarCollections.unmodifiableSet(set3);
    }

    public static m0 a(Class cls) {
        return new m0(cls, new Class[0]);
    }

    public static m0 b(r rVar) {
        r[] rVarArr = new r[0];
        ?? obj = new Object();
        obj.d = null;
        HashSet hashSet = new HashSet();
        obj.f3831c = hashSet;
        obj.e = new HashSet();
        obj.f3829a = 0;
        obj.f3830b = 0;
        obj.f3833g = new HashSet();
        hashSet.add(rVar);
        for (r rVar2 : rVarArr) {
            a7.a(rVar2, "Null interface");
        }
        Collections.addAll((HashSet) obj.f3831c, rVarArr);
        return obj;
    }

    public static a c(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(r.a(cls));
        for (Class cls2 : clsArr) {
            a7.a(cls2, "Null interface");
            hashSet.add(r.a(cls2));
        }
        return new a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new h0(obj, 6), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f45131b.toArray()) + ">{" + this.d + ", type=" + this.e + ", deps=" + Arrays.toString(this.f45132c.toArray()) + "}";
    }
}
