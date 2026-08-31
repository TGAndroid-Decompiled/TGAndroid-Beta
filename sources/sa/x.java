package sa;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import k7.a8;
public final class x implements pa.v {
    public final q5.g0 f47221a;
    public final ra.f f47222b;
    public final j f47223c;
    public final ArrayList d;

    public x(q5.g0 g0Var, ra.f fVar, j jVar, ArrayList arrayList) {
        this.f47221a = g0Var;
        this.f47222b = fVar;
        this.f47223c = jVar;
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
        ra.f fVar = this.f47222b;
        fVar.getClass();
        if ((136 & field.getModifiers()) != 0 || field.isSynthetic() || fVar.b(field.getType(), z4)) {
            z10 = true;
            break;
        }
        if (z4) {
            list = fVar.f46760a;
        } else {
            list = fVar.f46761b;
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
        Class cls = aVar.f49483a;
        if (!Object.class.isAssignableFrom(cls)) {
            return null;
        }
        a8 a8Var = ua.c.f48463a;
        if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
            return new pa.d(2);
        }
        ra.d.f(this.d);
        if (ua.c.f48463a.d(cls)) {
            return new w(cls, b(gVar, aVar, cls, true));
        }
        return new u(this.f47221a.z(aVar), b(gVar, aVar, cls, false));
    }
}
