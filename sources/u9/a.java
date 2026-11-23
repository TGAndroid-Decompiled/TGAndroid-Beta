package u9;

import c8.wc;
import e2.j0;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import tg.o1;
public final class a {
    public final String f58573a;
    public final Set f58574b;
    public final Set f58575c;
    public final int d;
    public final int f58576e;
    public final d f58577f;
    public final Set f58578g;

    public a(String str, Set set, Set set2, int i7, int i10, d dVar, Set set3) {
        this.f58573a = str;
        this.f58574b = DesugarCollections.unmodifiableSet(set);
        this.f58575c = DesugarCollections.unmodifiableSet(set2);
        this.d = i7;
        this.f58576e = i10;
        this.f58577f = dVar;
        this.f58578g = DesugarCollections.unmodifiableSet(set3);
    }

    public static j0 a(Class cls) {
        return new j0(cls, new Class[0]);
    }

    public static j0 b(q qVar) {
        q[] qVarArr = new q[0];
        ?? obj = new Object();
        obj.d = null;
        HashSet hashSet = new HashSet();
        obj.f10473c = hashSet;
        obj.f10474e = new HashSet();
        obj.f10471a = 0;
        obj.f10472b = 0;
        obj.f10476g = new HashSet();
        hashSet.add(qVar);
        for (q qVar2 : qVarArr) {
            wc.a(qVar2, "Null interface");
        }
        Collections.addAll((HashSet) obj.f10473c, qVarArr);
        return obj;
    }

    public static a c(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(q.a(cls));
        for (Class cls2 : clsArr) {
            wc.a(cls2, "Null interface");
            hashSet.add(q.a(cls2));
        }
        return new a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new o1(obj, 8), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f58574b.toArray()) + ">{" + this.d + ", type=" + this.f58576e + ", deps=" + Arrays.toString(this.f58575c.toArray()) + "}";
    }
}
