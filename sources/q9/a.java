package q9;

import b2.i0;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import w7.s6;
public final class a {
    public final String f41463a;
    public final Set f41464b;
    public final Set f41465c;
    public final int d;
    public final int e;
    public final d f41466f;
    public final Set f41467g;

    public a(String str, Set set, Set set2, int i10, int i11, d dVar, Set set3) {
        this.f41463a = str;
        this.f41464b = DesugarCollections.unmodifiableSet(set);
        this.f41465c = DesugarCollections.unmodifiableSet(set2);
        this.d = i10;
        this.e = i11;
        this.f41466f = dVar;
        this.f41467g = DesugarCollections.unmodifiableSet(set3);
    }

    public static i0 a(Class cls) {
        return new i0(cls, new Class[0]);
    }

    public static i0 b(r rVar) {
        r[] rVarArr = new r[0];
        ?? obj = new Object();
        obj.d = null;
        HashSet hashSet = new HashSet();
        obj.f3014c = hashSet;
        obj.e = new HashSet();
        obj.f3012a = 0;
        obj.f3013b = 0;
        obj.f3016g = new HashSet();
        hashSet.add(rVar);
        for (r rVar2 : rVarArr) {
            s6.a(rVar2, "Null interface");
        }
        Collections.addAll((HashSet) obj.f3014c, rVarArr);
        return obj;
    }

    public static a c(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(r.a(cls));
        for (Class cls2 : clsArr) {
            s6.a(cls2, "Null interface");
            hashSet.add(r.a(cls2));
        }
        return new a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new le.b(obj, 18), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f41464b.toArray()) + ">{" + this.d + ", type=" + this.e + ", deps=" + Arrays.toString(this.f41465c.toArray()) + "}";
    }
}
