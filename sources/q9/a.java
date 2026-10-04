package q9;

import b2.i0;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import k2.v;
import w7.t6;
public final class a {
    public final String f44844a;
    public final Set f44845b;
    public final Set f44846c;
    public final int d;
    public final int f44847e;
    public final d f44848f;
    public final Set f44849g;

    public a(String str, Set set, Set set2, int i10, int i11, d dVar, Set set3) {
        this.f44844a = str;
        this.f44845b = DesugarCollections.unmodifiableSet(set);
        this.f44846c = DesugarCollections.unmodifiableSet(set2);
        this.d = i10;
        this.f44847e = i11;
        this.f44848f = dVar;
        this.f44849g = DesugarCollections.unmodifiableSet(set3);
    }

    public static i0 a(Class cls) {
        return new i0(cls, new Class[0]);
    }

    public static i0 b(r rVar) {
        r[] rVarArr = new r[0];
        ?? obj = new Object();
        obj.d = null;
        HashSet hashSet = new HashSet();
        obj.f3260c = hashSet;
        obj.f3261e = new HashSet();
        obj.f3258a = 0;
        obj.f3259b = 0;
        obj.f3263g = new HashSet();
        hashSet.add(rVar);
        for (r rVar2 : rVarArr) {
            t6.a(rVar2, "Null interface");
        }
        Collections.addAll((HashSet) obj.f3260c, rVarArr);
        return obj;
    }

    public static a c(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(r.a(cls));
        for (Class cls2 : clsArr) {
            t6.a(cls2, "Null interface");
            hashSet.add(r.a(cls2));
        }
        return new a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new v(obj, 19), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f44845b.toArray()) + ">{" + this.d + ", type=" + this.f44847e + ", deps=" + Arrays.toString(this.f44846c.toArray()) + "}";
    }
}
