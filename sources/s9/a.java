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
    public final String f48018a;
    public final Set f48019b;
    public final Set f48020c;
    public final int d;
    public final int e;
    public final d f48021f;
    public final Set f48022g;

    public a(String str, Set set, Set set2, int i10, int i11, d dVar, Set set3) {
        this.f48018a = str;
        this.f48019b = DesugarCollections.unmodifiableSet(set);
        this.f48020c = DesugarCollections.unmodifiableSet(set2);
        this.d = i10;
        this.e = i11;
        this.f48021f = dVar;
        this.f48022g = DesugarCollections.unmodifiableSet(set3);
    }

    public static n0 a(Class cls) {
        return new n0(cls, new Class[0]);
    }

    public static n0 b(s sVar) {
        s[] sVarArr = new s[0];
        ?? obj = new Object();
        obj.d = null;
        HashSet hashSet = new HashSet();
        obj.f3289c = hashSet;
        obj.e = new HashSet();
        obj.f3287a = 0;
        obj.f3288b = 0;
        obj.f3291g = new HashSet();
        hashSet.add(sVar);
        for (s sVar2 : sVarArr) {
            s1.a(sVar2, "Null interface");
        }
        Collections.addAll((HashSet) obj.f3289c, sVarArr);
        return obj;
    }

    public static a c(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(s.a(cls));
        for (Class cls2 : clsArr) {
            s1.a(cls2, "Null interface");
            hashSet.add(s.a(cls2));
        }
        return new a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new j1(obj, 10), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f48019b.toArray()) + ">{" + this.d + ", type=" + this.e + ", deps=" + Arrays.toString(this.f48020c.toArray()) + "}";
    }
}
