package r9;

import b2.n0;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import w7.g7;
public final class a {
    public final String f46431a;
    public final Set f46432b;
    public final Set f46433c;
    public final int d;
    public final int e;
    public final d f46434f;
    public final Set f46435g;

    public a(String str, Set set, Set set2, int i10, int i11, d dVar, Set set3) {
        this.f46431a = str;
        this.f46432b = DesugarCollections.unmodifiableSet(set);
        this.f46433c = DesugarCollections.unmodifiableSet(set2);
        this.d = i10;
        this.e = i11;
        this.f46434f = dVar;
        this.f46435g = DesugarCollections.unmodifiableSet(set3);
    }

    public static n0 a(Class cls) {
        return new n0(cls, new Class[0]);
    }

    public static n0 b(r rVar) {
        r[] rVarArr = new r[0];
        ?? obj = new Object();
        obj.d = null;
        HashSet hashSet = new HashSet();
        obj.f2125c = hashSet;
        obj.e = new HashSet();
        obj.f2123a = 0;
        obj.f2124b = 0;
        obj.f2127g = new HashSet();
        hashSet.add(rVar);
        for (r rVar2 : rVarArr) {
            g7.a(rVar2, "Null interface");
        }
        Collections.addAll((HashSet) obj.f2125c, rVarArr);
        return obj;
    }

    public static a c(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(r.a(cls));
        for (Class cls2 : clsArr) {
            g7.a(cls2, "Null interface");
            hashSet.add(r.a(cls2));
        }
        return new a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new mg.l(obj, 27), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f46432b.toArray()) + ">{" + this.d + ", type=" + this.e + ", deps=" + Arrays.toString(this.f46433c.toArray()) + "}";
    }
}
