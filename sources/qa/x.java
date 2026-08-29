package qa;

import i7.r7;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
public final class x implements na.v {
    public final oc.i f46581a;
    public final pa.f f46582b;
    public final j f46583c;
    public final ArrayList d;

    public x(oc.i iVar, pa.f fVar, j jVar, ArrayList arrayList) {
        this.f46581a = iVar;
        this.f46582b = fVar;
        this.f46583c = jVar;
        this.d = arrayList;
    }

    public static void a(Class cls, String str, Field field, Field field2) {
        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + str + "'; conflict is caused by fields " + sa.c.c(field) + " and " + sa.c.c(field2) + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("duplicate-fields"));
    }

    public final qa.v b(na.g r29, ua.a r30, java.lang.Class r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: qa.x.b(na.g, ua.a, java.lang.Class, boolean):qa.v");
    }

    public final boolean c(Field field, boolean z10) {
        List<na.a> list;
        boolean z11;
        pa.f fVar = this.f46582b;
        fVar.getClass();
        if ((136 & field.getModifiers()) != 0 || field.isSynthetic() || fVar.b(field.getType(), z10)) {
            z11 = true;
            break;
        }
        if (z10) {
            list = fVar.f45680a;
        } else {
            list = fVar.f45681b;
        }
        if (!list.isEmpty()) {
            na.b bVar = new na.b(field);
            for (na.a aVar : list) {
                if (aVar.shouldSkipField(bVar)) {
                    z11 = true;
                    break;
                }
            }
        }
        z11 = false;
        return !z11;
    }

    @Override
    public final na.u create(na.g gVar, ua.a aVar) {
        Class cls = aVar.f49163a;
        if (!Object.class.isAssignableFrom(cls)) {
            return null;
        }
        r7 r7Var = sa.c.f47694a;
        if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
            return new na.d(2);
        }
        pa.d.f(this.d);
        if (sa.c.f47694a.d(cls)) {
            return new w(cls, b(gVar, aVar, cls, true));
        }
        return new u(this.f46581a.d2(aVar), b(gVar, aVar, cls, false));
    }
}
