package u9;

import c8.tc;
import e2.j0;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import tg.z1;
public final class a {
    public final String f57962a;
    public final Set f57963b;
    public final Set f57964c;
    public final int d;
    public final int f57965e;
    public final d f57966f;
    public final Set f57967g;

    public a(String str, Set set, Set set2, int i7, int i10, d dVar, Set set3) {
        this.f57962a = str;
        this.f57963b = DesugarCollections.unmodifiableSet(set);
        this.f57964c = DesugarCollections.unmodifiableSet(set2);
        this.d = i7;
        this.f57965e = i10;
        this.f57966f = dVar;
        this.f57967g = DesugarCollections.unmodifiableSet(set3);
    }

    public static j0 a(Class cls) {
        return new j0(cls, new Class[0]);
    }

    public static j0 b(q qVar) {
        q[] qVarArr = new q[0];
        ?? obj = new Object();
        obj.d = null;
        HashSet hashSet = new HashSet();
        obj.f10126c = hashSet;
        obj.f10127e = new HashSet();
        obj.f10124a = 0;
        obj.f10125b = 0;
        obj.f10129g = new HashSet();
        hashSet.add(qVar);
        for (q qVar2 : qVarArr) {
            tc.a(qVar2, "Null interface");
        }
        Collections.addAll((HashSet) obj.f10126c, qVarArr);
        return obj;
    }

    public static a c(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(q.a(cls));
        for (Class cls2 : clsArr) {
            tc.a(cls2, "Null interface");
            hashSet.add(q.a(cls2));
        }
        return new a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new z1(obj, 6), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f57963b.toArray()) + ">{" + this.d + ", type=" + this.f57965e + ", deps=" + Arrays.toString(this.f57964c.toArray()) + "}";
    }
}
