package u9;

import c8.sc;
import e2.j0;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
public final class a {
    public final String f56338a;
    public final Set f56339b;
    public final Set f56340c;
    public final int d;
    public final int f56341e;
    public final d f56342f;
    public final Set f56343g;

    public a(String str, Set set, Set set2, int i7, int i10, d dVar, Set set3) {
        this.f56338a = str;
        this.f56339b = DesugarCollections.unmodifiableSet(set);
        this.f56340c = DesugarCollections.unmodifiableSet(set2);
        this.d = i7;
        this.f56341e = i10;
        this.f56342f = dVar;
        this.f56343g = DesugarCollections.unmodifiableSet(set3);
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
        return "Component<" + Arrays.toString(this.f56339b.toArray()) + ">{" + this.d + ", type=" + this.f56341e + ", deps=" + Arrays.toString(this.f56340c.toArray()) + "}";
    }
}
