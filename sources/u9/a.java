package u9;

import c8.wc;
import e2.j0;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import tg.z1;
public final class a {
    public final String f58528a;
    public final Set f58529b;
    public final Set f58530c;
    public final int d;
    public final int f58531e;
    public final d f58532f;
    public final Set f58533g;

    public a(String str, Set set, Set set2, int i7, int i10, d dVar, Set set3) {
        this.f58528a = str;
        this.f58529b = DesugarCollections.unmodifiableSet(set);
        this.f58530c = DesugarCollections.unmodifiableSet(set2);
        this.d = i7;
        this.f58531e = i10;
        this.f58532f = dVar;
        this.f58533g = DesugarCollections.unmodifiableSet(set3);
    }

    public static j0 a(Class cls) {
        return new j0(cls, new Class[0]);
    }

    public static j0 b(q qVar) {
        q[] qVarArr = new q[0];
        ?? obj = new Object();
        obj.d = null;
        HashSet hashSet = new HashSet();
        obj.f10441c = hashSet;
        obj.f10442e = new HashSet();
        obj.f10439a = 0;
        obj.f10440b = 0;
        obj.f10444g = new HashSet();
        hashSet.add(qVar);
        for (q qVar2 : qVarArr) {
            wc.a(qVar2, "Null interface");
        }
        Collections.addAll((HashSet) obj.f10441c, qVarArr);
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
        return new a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new z1(obj, 7), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f58529b.toArray()) + ">{" + this.d + ", type=" + this.f58531e + ", deps=" + Arrays.toString(this.f58530c.toArray()) + "}";
    }
}
