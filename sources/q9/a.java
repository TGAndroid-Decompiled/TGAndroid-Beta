package q9;

import b2.i0;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import k2.v;
import w7.s6;
public final class a {
    public final String f41497a;
    public final Set f41498b;
    public final Set f41499c;
    public final int d;
    public final int e;
    public final d f41500f;
    public final Set f41501g;

    public a(String str, Set set, Set set2, int i10, int i11, d dVar, Set set3) {
        this.f41497a = str;
        this.f41498b = DesugarCollections.unmodifiableSet(set);
        this.f41499c = DesugarCollections.unmodifiableSet(set2);
        this.d = i10;
        this.e = i11;
        this.f41500f = dVar;
        this.f41501g = DesugarCollections.unmodifiableSet(set3);
    }

    public static i0 a(Class cls) {
        return new i0(cls, new Class[0]);
    }

    public static i0 b(s sVar) {
        s[] sVarArr = new s[0];
        ?? obj = new Object();
        obj.d = null;
        HashSet hashSet = new HashSet();
        obj.f3021c = hashSet;
        obj.e = new HashSet();
        obj.f3019a = 0;
        obj.f3020b = 0;
        obj.f3023g = new HashSet();
        hashSet.add(sVar);
        for (s sVar2 : sVarArr) {
            s6.a(sVar2, "Null interface");
        }
        Collections.addAll((HashSet) obj.f3021c, sVarArr);
        return obj;
    }

    public static a c(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(s.a(cls));
        for (Class cls2 : clsArr) {
            s6.a(cls2, "Null interface");
            hashSet.add(s.a(cls2));
        }
        return new a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new v(obj, 18), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f41498b.toArray()) + ">{" + this.d + ", type=" + this.e + ", deps=" + Arrays.toString(this.f41499c.toArray()) + "}";
    }
}
