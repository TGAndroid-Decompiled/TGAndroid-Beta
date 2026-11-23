package u9;

import c8.xc;
import e2.j0;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import tg.o1;
public final class a {
    public final String f58538a;
    public final Set f58539b;
    public final Set f58540c;
    public final int d;
    public final int f58541e;
    public final d f58542f;
    public final Set f58543g;

    public a(String str, Set set, Set set2, int i7, int i10, d dVar, Set set3) {
        this.f58538a = str;
        this.f58539b = DesugarCollections.unmodifiableSet(set);
        this.f58540c = DesugarCollections.unmodifiableSet(set2);
        this.d = i7;
        this.f58541e = i10;
        this.f58542f = dVar;
        this.f58543g = DesugarCollections.unmodifiableSet(set3);
    }

    public static j0 a(Class cls) {
        return new j0(cls, new Class[0]);
    }

    public static j0 b(q qVar) {
        q[] qVarArr = new q[0];
        ?? obj = new Object();
        obj.d = null;
        HashSet hashSet = new HashSet();
        obj.f10436c = hashSet;
        obj.f10437e = new HashSet();
        obj.f10434a = 0;
        obj.f10435b = 0;
        obj.f10439g = new HashSet();
        hashSet.add(qVar);
        for (q qVar2 : qVarArr) {
            xc.a(qVar2, "Null interface");
        }
        Collections.addAll((HashSet) obj.f10436c, qVarArr);
        return obj;
    }

    public static a c(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(q.a(cls));
        for (Class cls2 : clsArr) {
            xc.a(cls2, "Null interface");
            hashSet.add(q.a(cls2));
        }
        return new a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new o1(obj, 8), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f58539b.toArray()) + ">{" + this.d + ", type=" + this.f58541e + ", deps=" + Arrays.toString(this.f58540c.toArray()) + "}";
    }
}
