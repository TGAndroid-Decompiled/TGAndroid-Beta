package ra;

import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.List;
import k7.a8;
import pa.u;
import pa.v;
public final class f implements v, Cloneable {
    public static final f f46790c = new f();
    public List f46791a;
    public final List f46792b;

    public f() {
        List list = Collections.EMPTY_LIST;
        this.f46791a = list;
        this.f46792b = list;
    }

    public final f clone() {
        try {
            return (f) super.clone();
        } catch (CloneNotSupportedException e6) {
            throw new AssertionError(e6);
        }
    }

    public final boolean b(Class cls, boolean z4) {
        List<pa.a> list;
        if (!z4 && !Enum.class.isAssignableFrom(cls)) {
            a8 a8Var = ua.c.f48499a;
            if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
                return true;
            }
        }
        if (z4) {
            list = this.f46791a;
        } else {
            list = this.f46792b;
        }
        for (pa.a aVar : list) {
            if (aVar.shouldSkipClass(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final u create(pa.g gVar, wa.a aVar) {
        Class cls = aVar.f49520a;
        boolean b10 = b(cls, true);
        boolean b11 = b(cls, false);
        if (!b10 && !b11) {
            return null;
        }
        return new e(this, b11, b10, gVar, aVar);
    }
}
