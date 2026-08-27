package z8;

import h7.v8;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public final class a {

    public final String f50218a;

    public final Set f50219b;

    public final Set f50220c;
    public final int d;

    public final int f50221e;

    public final d f50222f;

    public final Set f50223g;

    public a(String str, Set set, Set set2, int i10, int i11, d dVar, Set set3) {
        this.f50218a = str;
        this.f50219b = DesugarCollections.unmodifiableSet(set);
        this.f50220c = DesugarCollections.unmodifiableSet(set2);
        this.d = i10;
        this.f50221e = i11;
        this.f50222f = dVar;
        this.f50223g = DesugarCollections.unmodifiableSet(set3);
    }

    public static ug.b a(Class cls) {
        return new ug.b(cls, new Class[0]);
    }

    public static ug.b b(q qVar) {
        return new ug.b(qVar, new q[0]);
    }

    public static a c(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(q.a(cls));
        for (Class cls2 : clsArr) {
            v8.a(cls2, "Null interface");
            hashSet.add(q.a(cls2));
        }
        return new a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new t0.c(obj, 7), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f50219b.toArray()) + ">{" + this.d + ", type=" + this.f50221e + ", deps=" + Arrays.toString(this.f50220c.toArray()) + "}";
    }
}
