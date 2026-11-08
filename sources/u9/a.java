package u9;

import c8.tc;
import e2.j0;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
public final class a {
    public final String f56451a;
    public final Set f56452b;
    public final Set f56453c;
    public final int d;
    public final int f56454e;
    public final d f56455f;
    public final Set f56456g;

    public a(String str, Set set, Set set2, int i7, int i10, d dVar, Set set3) {
        this.f56451a = str;
        this.f56452b = DesugarCollections.unmodifiableSet(set);
        this.f56453c = DesugarCollections.unmodifiableSet(set2);
        this.d = i7;
        this.f56454e = i10;
        this.f56455f = dVar;
        this.f56456g = DesugarCollections.unmodifiableSet(set3);
    }

    public static j0 a(Class cls) {
        return new j0(cls, new Class[0]);
    }

    public static j0 b(r rVar) {
        r[] rVarArr = new r[0];
        ?? obj = new Object();
        obj.d = null;
        HashSet hashSet = new HashSet();
        obj.f10290c = hashSet;
        obj.f10291e = new HashSet();
        obj.f10288a = 0;
        obj.f10289b = 0;
        obj.f10293g = new HashSet();
        hashSet.add(rVar);
        for (r rVar2 : rVarArr) {
            tc.a(rVar2, "Null interface");
        }
        Collections.addAll((HashSet) obj.f10290c, rVarArr);
        return obj;
    }

    public static a c(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(r.a(cls));
        for (Class cls2 : clsArr) {
            tc.a(cls2, "Null interface");
            hashSet.add(r.a(cls2));
        }
        return new a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new u5.e(obj, 1), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f56452b.toArray()) + ">{" + this.d + ", type=" + this.f56454e + ", deps=" + Arrays.toString(this.f56453c.toArray()) + "}";
    }
}
