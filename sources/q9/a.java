package q9;

import b2.i0;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import k2.v;
import w7.r6;
public final class a {
    public final String f41196a;
    public final Set f41197b;
    public final Set f41198c;
    public final int d;
    public final int e;
    public final d f41199f;
    public final Set f41200g;

    public a(String str, Set set, Set set2, int i10, int i11, d dVar, Set set3) {
        this.f41196a = str;
        this.f41197b = DesugarCollections.unmodifiableSet(set);
        this.f41198c = DesugarCollections.unmodifiableSet(set2);
        this.d = i10;
        this.e = i11;
        this.f41199f = dVar;
        this.f41200g = DesugarCollections.unmodifiableSet(set3);
    }

    public static i0 a(Class cls) {
        return new i0(cls, new Class[0]);
    }

    public static i0 b(r rVar) {
        r[] rVarArr = new r[0];
        ?? obj = new Object();
        obj.d = null;
        HashSet hashSet = new HashSet();
        obj.f3022c = hashSet;
        obj.e = new HashSet();
        obj.f3020a = 0;
        obj.f3021b = 0;
        obj.f3024g = new HashSet();
        hashSet.add(rVar);
        for (r rVar2 : rVarArr) {
            r6.a(rVar2, "Null interface");
        }
        Collections.addAll((HashSet) obj.f3022c, rVarArr);
        return obj;
    }

    public static a c(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(r.a(cls));
        for (Class cls2 : clsArr) {
            r6.a(cls2, "Null interface");
            hashSet.add(r.a(cls2));
        }
        return new a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new v(obj, 18), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f41197b.toArray()) + ">{" + this.d + ", type=" + this.e + ", deps=" + Arrays.toString(this.f41198c.toArray()) + "}";
    }
}
