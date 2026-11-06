package u9;

import c8.sc;
import e2.j0;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
public final class a {
    public final String f56363a;
    public final Set f56364b;
    public final Set f56365c;
    public final int d;
    public final int f56366e;
    public final d f56367f;
    public final Set f56368g;

    public a(String str, Set set, Set set2, int i7, int i10, d dVar, Set set3) {
        this.f56363a = str;
        this.f56364b = DesugarCollections.unmodifiableSet(set);
        this.f56365c = DesugarCollections.unmodifiableSet(set2);
        this.d = i7;
        this.f56366e = i10;
        this.f56367f = dVar;
        this.f56368g = DesugarCollections.unmodifiableSet(set3);
    }

    public static j0 a(Class cls) {
        return new j0(cls, new Class[0]);
    }

    public static j0 b(q qVar) {
        q[] qVarArr = new q[0];
        ?? obj = new Object();
        obj.d = null;
        HashSet hashSet = new HashSet();
        obj.f10290c = hashSet;
        obj.f10291e = new HashSet();
        obj.f10288a = 0;
        obj.f10289b = 0;
        obj.f10293g = new HashSet();
        hashSet.add(qVar);
        for (q qVar2 : qVarArr) {
            sc.a(qVar2, "Null interface");
        }
        Collections.addAll((HashSet) obj.f10290c, qVarArr);
        return obj;
    }

    public static a c(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(q.a(cls));
        for (Class cls2 : clsArr) {
            sc.a(cls2, "Null interface");
            hashSet.add(q.a(cls2));
        }
        return new a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new u5.e(obj, 1), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f56364b.toArray()) + ">{" + this.d + ", type=" + this.f56366e + ", deps=" + Arrays.toString(this.f56365c.toArray()) + "}";
    }
}
