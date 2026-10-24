package r9;

import b2.m0;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import qg.g0;
import w7.a7;
public final class a {
    public final String f45541a;
    public final Set f45542b;
    public final Set f45543c;
    public final int d;
    public final int e;
    public final d f45544f;
    public final Set f45545g;

    public a(String str, Set set, Set set2, int i10, int i11, d dVar, Set set3) {
        this.f45541a = str;
        this.f45542b = DesugarCollections.unmodifiableSet(set);
        this.f45543c = DesugarCollections.unmodifiableSet(set2);
        this.d = i10;
        this.e = i11;
        this.f45544f = dVar;
        this.f45545g = DesugarCollections.unmodifiableSet(set3);
    }

    public static m0 a(Class cls) {
        return new m0(cls, new Class[0]);
    }

    public static m0 b(r rVar) {
        r[] rVarArr = new r[0];
        ?? obj = new Object();
        obj.d = null;
        HashSet hashSet = new HashSet();
        obj.f3838c = hashSet;
        obj.e = new HashSet();
        obj.f3836a = 0;
        obj.f3837b = 0;
        obj.f3840g = new HashSet();
        hashSet.add(rVar);
        for (r rVar2 : rVarArr) {
            a7.a(rVar2, "Null interface");
        }
        Collections.addAll((HashSet) obj.f3838c, rVarArr);
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
        return new a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new g0(obj, 6), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f45542b.toArray()) + ">{" + this.d + ", type=" + this.e + ", deps=" + Arrays.toString(this.f45543c.toArray()) + "}";
    }
}
