package t9;

import d2.l0;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.telegram.ui.ActionBar.e3;
import x7.b0;
public final class a {
    public final String f55041a;
    public final Set f55042b;
    public final Set f55043c;
    public final int d;
    public final int f55044e;
    public final d f55045f;
    public final Set f55046g;

    public a(String str, Set set, Set set2, int i3, int i10, d dVar, Set set3) {
        this.f55041a = str;
        this.f55042b = DesugarCollections.unmodifiableSet(set);
        this.f55043c = DesugarCollections.unmodifiableSet(set2);
        this.d = i3;
        this.f55044e = i10;
        this.f55045f = dVar;
        this.f55046g = DesugarCollections.unmodifiableSet(set3);
    }

    public static l0 a(Class cls) {
        return new l0(cls, new Class[0]);
    }

    public static l0 b(r rVar) {
        r[] rVarArr = new r[0];
        ?? obj = new Object();
        obj.d = null;
        HashSet hashSet = new HashSet();
        obj.f8175c = hashSet;
        obj.f8176e = new HashSet();
        obj.f8173a = 0;
        obj.f8174b = 0;
        obj.f8178g = new HashSet();
        hashSet.add(rVar);
        for (r rVar2 : rVarArr) {
            b0.a(rVar2, "Null interface");
        }
        Collections.addAll((HashSet) obj.f8175c, rVarArr);
        return obj;
    }

    public static a c(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(r.a(cls));
        for (Class cls2 : clsArr) {
            b0.a(cls2, "Null interface");
            hashSet.add(r.a(cls2));
        }
        return new a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new e3(obj, 15), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f55042b.toArray()) + ">{" + this.d + ", type=" + this.f55044e + ", deps=" + Arrays.toString(this.f55043c.toArray()) + "}";
    }
}
