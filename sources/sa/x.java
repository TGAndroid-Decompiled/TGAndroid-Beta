package sa;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import k7.a8;
public final class x implements pa.v {
    public final q5.g0 f44231a;
    public final ra.f f44232b;
    public final j f44233c;
    public final ArrayList d;

    public x(q5.g0 g0Var, ra.f fVar, j jVar, ArrayList arrayList) {
        this.f44231a = g0Var;
        this.f44232b = fVar;
        this.f44233c = jVar;
        this.d = arrayList;
    }

    public static void a(Class cls, String str, Field field, Field field2) {
        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + str + "'; conflict is caused by fields " + ua.c.c(field) + " and " + ua.c.c(field2) + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("duplicate-fields"));
    }

    public final sa.v b(pa.g r29, wa.a r30, java.lang.Class r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: sa.x.b(pa.g, wa.a, java.lang.Class, boolean):sa.v");
    }

    public final boolean c(Field field, boolean z4) {
        List<pa.a> list;
        boolean z10;
        ra.f fVar = this.f44232b;
        fVar.getClass();
        if ((136 & field.getModifiers()) != 0 || field.isSynthetic() || fVar.b(field.getType(), z4)) {
            z10 = true;
            break;
        }
        if (z4) {
            list = fVar.f43408a;
        } else {
            list = fVar.f43409b;
        }
        if (!list.isEmpty()) {
            pa.b bVar = new pa.b(field);
            for (pa.a aVar : list) {
                if (aVar.shouldSkipField(bVar)) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        return !z10;
    }

    @Override
    public final pa.u create(pa.g gVar, wa.a aVar) {
        Class cls = aVar.f46505a;
        if (!Object.class.isAssignableFrom(cls)) {
            return null;
        }
        a8 a8Var = ua.c.f45204a;
        if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
            return new pa.d(2);
        }
        ra.d.f(this.d);
        if (ua.c.f45204a.d(cls)) {
            return new w(cls, b(gVar, aVar, cls, true));
        }
        return new u(this.f44231a.I(aVar), b(gVar, aVar, cls, false));
    }
}
