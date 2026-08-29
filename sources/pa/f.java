package pa;

import i7.r7;
import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.List;
import na.u;
import na.v;
public final class f implements v, Cloneable {
    public static final f f45679c = new f();
    public List f45680a;
    public final List f45681b;

    public f() {
        List list = Collections.EMPTY_LIST;
        this.f45680a = list;
        this.f45681b = list;
    }

    public final f clone() {
        try {
            return (f) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public final boolean b(Class cls, boolean z10) {
        List<na.a> list;
        if (!z10 && !Enum.class.isAssignableFrom(cls)) {
            r7 r7Var = sa.c.f47694a;
            if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
                return true;
            }
        }
        if (z10) {
            list = this.f45680a;
        } else {
            list = this.f45681b;
        }
        for (na.a aVar : list) {
            if (aVar.shouldSkipClass(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final u create(na.g gVar, ua.a aVar) {
        Class cls = aVar.f49163a;
        boolean b10 = b(cls, true);
        boolean b11 = b(cls, false);
        if (!b10 && !b11) {
            return null;
        }
        return new e(this, b11, b10, gVar, aVar);
    }
}
