package y8;

import g7.t8;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public final class a {
    public final String f49621a;
    public final Set f49622b;
    public final Set f49623c;
    public final int d;
    public final int f49624e;
    public final d f49625f;
    public final Set f49626g;

    public a(String str, Set set, Set set2, int i9, int i10, d dVar, Set set3) {
        this.f49621a = str;
        this.f49622b = DesugarCollections.unmodifiableSet(set);
        this.f49623c = DesugarCollections.unmodifiableSet(set2);
        this.d = i9;
        this.f49624e = i10;
        this.f49625f = dVar;
        this.f49626g = DesugarCollections.unmodifiableSet(set3);
    }

    public static tg.b a(Class cls) {
        return new tg.b(cls, new Class[0]);
    }

    public static tg.b b(r rVar) {
        return new tg.b(rVar, new r[0]);
    }

    public static a c(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(r.a(cls));
        for (Class cls2 : clsArr) {
            t8.a(cls2, "Null interface");
            hashSet.add(r.a(cls2));
        }
        return new a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new t0.c(obj, 7), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f49622b.toArray()) + ">{" + this.d + ", type=" + this.f49624e + ", deps=" + Arrays.toString(this.f49623c.toArray()) + "}";
    }
}
