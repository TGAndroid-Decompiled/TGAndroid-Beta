package s9;

import b2.n0;
import com.google.android.gms.internal.play_billing.s1;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.telegram.ui.Components.voip.j1;
public final class a {
    public final String f47980a;
    public final Set f47981b;
    public final Set f47982c;
    public final int d;
    public final int e;
    public final d f47983f;
    public final Set f47984g;

    public a(String str, Set set, Set set2, int i10, int i11, d dVar, Set set3) {
        this.f47980a = str;
        this.f47981b = DesugarCollections.unmodifiableSet(set);
        this.f47982c = DesugarCollections.unmodifiableSet(set2);
        this.d = i10;
        this.e = i11;
        this.f47983f = dVar;
        this.f47984g = DesugarCollections.unmodifiableSet(set3);
    }

    public static n0 a(Class cls) {
        return new n0(cls, new Class[0]);
    }

    public static n0 b(r rVar) {
        r[] rVarArr = new r[0];
        ?? obj = new Object();
        obj.d = null;
        HashSet hashSet = new HashSet();
        obj.f3289c = hashSet;
        obj.e = new HashSet();
        obj.f3287a = 0;
        obj.f3288b = 0;
        obj.f3291g = new HashSet();
        hashSet.add(rVar);
        for (r rVar2 : rVarArr) {
            s1.a(rVar2, "Null interface");
        }
        Collections.addAll((HashSet) obj.f3289c, rVarArr);
        return obj;
    }

    public static a c(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(r.a(cls));
        for (Class cls2 : clsArr) {
            s1.a(cls2, "Null interface");
            hashSet.add(r.a(cls2));
        }
        return new a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new j1(obj, 10), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f47981b.toArray()) + ">{" + this.d + ", type=" + this.e + ", deps=" + Arrays.toString(this.f47982c.toArray()) + "}";
    }
}
