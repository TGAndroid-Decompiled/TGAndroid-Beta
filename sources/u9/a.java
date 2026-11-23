package u9;

import c8.xc;
import e2.j0;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import tg.s;
public final class a {
    public final String f58653a;
    public final Set f58654b;
    public final Set f58655c;
    public final int d;
    public final int f58656e;
    public final d f58657f;
    public final Set f58658g;

    public a(String str, Set set, Set set2, int i7, int i10, d dVar, Set set3) {
        this.f58653a = str;
        this.f58654b = DesugarCollections.unmodifiableSet(set);
        this.f58655c = DesugarCollections.unmodifiableSet(set2);
        this.d = i7;
        this.f58656e = i10;
        this.f58657f = dVar;
        this.f58658g = DesugarCollections.unmodifiableSet(set3);
    }

    public static j0 a(Class cls) {
        return new j0(cls, new Class[0]);
    }

    public static j0 b(q qVar) {
        q[] qVarArr = new q[0];
        ?? obj = new Object();
        obj.d = null;
        HashSet hashSet = new HashSet();
        obj.f10434c = hashSet;
        obj.f10435e = new HashSet();
        obj.f10432a = 0;
        obj.f10433b = 0;
        obj.f10437g = new HashSet();
        hashSet.add(qVar);
        for (q qVar2 : qVarArr) {
            xc.a(qVar2, "Null interface");
        }
        Collections.addAll((HashSet) obj.f10434c, qVarArr);
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
        return new a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new s(obj, 10), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f58654b.toArray()) + ">{" + this.d + ", type=" + this.f58656e + ", deps=" + Arrays.toString(this.f58655c.toArray()) + "}";
    }
}
