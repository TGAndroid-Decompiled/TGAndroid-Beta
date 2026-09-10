package q9;

import b2.i0;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import w7.r6;
public final class a {
    public final String f40551a;
    public final Set f40552b;
    public final Set f40553c;
    public final int d;
    public final int e;
    public final d f40554f;
    public final Set f40555g;

    public a(String str, Set set, Set set2, int i10, int i11, d dVar, Set set3) {
        this.f40551a = str;
        this.f40552b = DesugarCollections.unmodifiableSet(set);
        this.f40553c = DesugarCollections.unmodifiableSet(set2);
        this.d = i10;
        this.e = i11;
        this.f40554f = dVar;
        this.f40555g = DesugarCollections.unmodifiableSet(set3);
    }

    public static i0 a(Class cls) {
        return new i0(cls, new Class[0]);
    }

    public static i0 b(r rVar) {
        r[] rVarArr = new r[0];
        ?? obj = new Object();
        obj.d = null;
        HashSet hashSet = new HashSet();
        obj.f1715c = hashSet;
        obj.e = new HashSet();
        obj.f1713a = 0;
        obj.f1714b = 0;
        obj.f1717g = new HashSet();
        hashSet.add(rVar);
        for (r rVar2 : rVarArr) {
            r6.a(rVar2, "Null interface");
        }
        Collections.addAll((HashSet) obj.f1715c, rVarArr);
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
        return new a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new org.telegram.tgnet.j(obj, 17), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f40552b.toArray()) + ">{" + this.d + ", type=" + this.e + ", deps=" + Arrays.toString(this.f40553c.toArray()) + "}";
    }
}
