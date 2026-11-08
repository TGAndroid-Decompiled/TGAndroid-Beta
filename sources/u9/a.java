package u9;

import c8.tc;
import e2.j0;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
public final class a {
    public final String f56452a;
    public final Set f56453b;
    public final Set f56454c;
    public final int d;
    public final int f56455e;
    public final d f56456f;
    public final Set f56457g;

    public a(String str, Set set, Set set2, int i7, int i10, d dVar, Set set3) {
        this.f56452a = str;
        this.f56453b = DesugarCollections.unmodifiableSet(set);
        this.f56454c = DesugarCollections.unmodifiableSet(set2);
        this.d = i7;
        this.f56455e = i10;
        this.f56456f = dVar;
        this.f56457g = DesugarCollections.unmodifiableSet(set3);
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
        return "Component<" + Arrays.toString(this.f56453b.toArray()) + ">{" + this.d + ", type=" + this.f56455e + ", deps=" + Arrays.toString(this.f56454c.toArray()) + "}";
    }
}
