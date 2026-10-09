package q9;

import b2.i0;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import m4.w;
import w7.r6;
public final class a {
    public final String f46007a;
    public final Set f46008b;
    public final Set f46009c;
    public final int d;
    public final int f46010e;
    public final d f46011f;
    public final Set f46012g;

    public a(String str, Set set, Set set2, int i10, int i11, d dVar, Set set3) {
        this.f46007a = str;
        this.f46008b = DesugarCollections.unmodifiableSet(set);
        this.f46009c = DesugarCollections.unmodifiableSet(set2);
        this.d = i10;
        this.f46010e = i11;
        this.f46011f = dVar;
        this.f46012g = DesugarCollections.unmodifiableSet(set3);
    }

    public static i0 a(Class cls) {
        return new i0(cls, new Class[0]);
    }

    public static i0 b(r rVar) {
        r[] rVarArr = new r[0];
        ?? obj = new Object();
        obj.d = null;
        HashSet hashSet = new HashSet();
        obj.f3339c = hashSet;
        obj.f3340e = new HashSet();
        obj.f3337a = 0;
        obj.f3338b = 0;
        obj.f3342g = new HashSet();
        hashSet.add(rVar);
        for (r rVar2 : rVarArr) {
            r6.a(rVar2, "Null interface");
        }
        Collections.addAll((HashSet) obj.f3339c, rVarArr);
        return obj;
    }

    public static a c(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(r.a(cls));
        for (Class cls2 : clsArr) {
            r6.a(cls2, "Null interface");
            hashSet.add(r.a(cls2));
        }
        return new a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new w(obj, 18), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f46008b.toArray()) + ">{" + this.d + ", type=" + this.f46010e + ", deps=" + Arrays.toString(this.f46009c.toArray()) + "}";
    }
}
