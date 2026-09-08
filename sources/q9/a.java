package q9;

import b2.i0;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import ji.k5;
import w7.o6;
public final class a {
    public final String f44237a;
    public final Set f44238b;
    public final Set f44239c;
    public final int d;
    public final int f44240e;
    public final d f44241f;
    public final Set f44242g;

    public a(String str, Set set, Set set2, int i10, int i11, d dVar, Set set3) {
        this.f44237a = str;
        this.f44238b = DesugarCollections.unmodifiableSet(set);
        this.f44239c = DesugarCollections.unmodifiableSet(set2);
        this.d = i10;
        this.f44240e = i11;
        this.f44241f = dVar;
        this.f44242g = DesugarCollections.unmodifiableSet(set3);
    }

    public static i0 a(Class cls) {
        return new i0(cls, new Class[0]);
    }

    public static i0 b(r rVar) {
        r[] rVarArr = new r[0];
        ?? obj = new Object();
        obj.d = null;
        HashSet hashSet = new HashSet();
        obj.f2093c = hashSet;
        obj.f2094e = new HashSet();
        obj.f2091a = 0;
        obj.f2092b = 0;
        obj.f2096g = new HashSet();
        hashSet.add(rVar);
        for (r rVar2 : rVarArr) {
            o6.a(rVar2, "Null interface");
        }
        Collections.addAll((HashSet) obj.f2093c, rVarArr);
        return obj;
    }

    public static a c(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(r.a(cls));
        for (Class cls2 : clsArr) {
            o6.a(cls2, "Null interface");
            hashSet.add(r.a(cls2));
        }
        return new a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new k5(obj, 16), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f44238b.toArray()) + ">{" + this.d + ", type=" + this.f44240e + ", deps=" + Arrays.toString(this.f44239c.toArray()) + "}";
    }
}
