package r9;

import b2.m0;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import qg.g0;
import w7.f7;
public final class a {
    public final String f45144a;
    public final Set f45145b;
    public final Set f45146c;
    public final int d;
    public final int e;
    public final d f45147f;
    public final Set f45148g;

    public a(String str, Set set, Set set2, int i10, int i11, d dVar, Set set3) {
        this.f45144a = str;
        this.f45145b = DesugarCollections.unmodifiableSet(set);
        this.f45146c = DesugarCollections.unmodifiableSet(set2);
        this.d = i10;
        this.e = i11;
        this.f45147f = dVar;
        this.f45148g = DesugarCollections.unmodifiableSet(set3);
    }

    public static m0 a(Class cls) {
        return new m0(cls, new Class[0]);
    }

    public static m0 b(r rVar) {
        r[] rVarArr = new r[0];
        ?? obj = new Object();
        obj.d = null;
        HashSet hashSet = new HashSet();
        obj.f3834c = hashSet;
        obj.e = new HashSet();
        obj.f3832a = 0;
        obj.f3833b = 0;
        obj.f3836g = new HashSet();
        hashSet.add(rVar);
        for (r rVar2 : rVarArr) {
            f7.a(rVar2, "Null interface");
        }
        Collections.addAll((HashSet) obj.f3834c, rVarArr);
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
        return new a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new g0(obj, 6), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f45145b.toArray()) + ">{" + this.d + ", type=" + this.e + ", deps=" + Arrays.toString(this.f45146c.toArray()) + "}";
    }
}
