package ra;

import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.List;
import k7.a8;
import pa.u;
import pa.v;
public final class f implements v, Cloneable {
    public static final f f43431c = new f();
    public List f43432a;
    public final List f43433b;

    public f() {
        List list = Collections.EMPTY_LIST;
        this.f43432a = list;
        this.f43433b = list;
    }

    public final f clone() {
        try {
            return (f) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean b(Class cls, boolean z4) {
        List<pa.a> list;
        if (!z4 && !Enum.class.isAssignableFrom(cls)) {
            a8 a8Var = ua.c.f45266a;
            if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
                return true;
            }
        }
        if (z4) {
            list = this.f43432a;
        } else {
            list = this.f43433b;
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
        Class cls = aVar.f46587a;
        boolean b10 = b(cls, true);
        boolean b11 = b(cls, false);
        if (!b10 && !b11) {
            return null;
        }
        return new e(this, b11, b10, gVar, aVar);
    }
}
