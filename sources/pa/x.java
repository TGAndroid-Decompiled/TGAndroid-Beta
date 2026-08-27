package pa;

import h7.w6;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

public final class x implements ma.v {

    public final g5.b f45674a;

    public final oa.f f45675b;

    public final j f45676c;
    public final ArrayList d;

    public x(g5.b bVar, oa.f fVar, j jVar, ArrayList arrayList) {
        this.f45674a = bVar;
        this.f45675b = fVar;
        this.f45676c = jVar;
        this.d = arrayList;
    }

    public static void a(Class cls, String str, Field field, Field field2) {
        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + str + "'; conflict is caused by fields " + ra.c.c(field) + " and " + ra.c.c(field2) + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("duplicate-fields"));
    }

    public final v b(ma.g gVar, ta.a aVar, Class cls, boolean z10) {
        boolean z11;
        Method method;
        ?? r10;
        List listSingletonList;
        ta.a aVar2;
        Class cls2;
        boolean z12;
        int modifiers;
        boolean z13;
        na.a aVar3;
        ma.g gVar2;
        ?? r27;
        ma.u uVarB;
        boolean z14;
        ma.u uVar;
        s sVar;
        s sVar2;
        s sVar3;
        ma.u oVar;
        if (cls.isInterface()) {
            return v.f45668c;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        ta.a aVar4 = aVar;
        Class cls3 = cls;
        while (cls3 != Object.class) {
            Field[] declaredFields = cls3.getDeclaredFields();
            if (cls3 != cls && declaredFields.length > 0) {
                oa.d.f(this.d);
            }
            int length = declaredFields.length;
            ?? r14 = 0;
            int i10 = 0;
            while (i10 < length) {
                Field field = declaredFields[i10];
                boolean zC = c(field, true);
                boolean zC2 = c(field, r14);
                if (zC || zC2) {
                    if (!z10) {
                        z11 = zC2;
                        method = null;
                    } else if (Modifier.isStatic(field.getModifiers())) {
                        method = null;
                        z11 = false;
                    } else {
                        Method methodA = ra.c.f46882a.a(cls3, field);
                        ra.c.f(methodA);
                        if (methodA.getAnnotation(na.b.class) != null && field.getAnnotation(na.b.class) == null) {
                            throw new ma.j(a9.p.m("@SerializedName on ", ra.c.d(methodA, r14), " is not supported"));
                        }
                        z11 = zC2;
                        method = methodA;
                    }
                    if (method == null) {
                        ra.c.f(field);
                    }
                    Type typeJ = oa.d.j(aVar4.f48152b, cls3, field.getGenericType(), new HashMap());
                    na.b bVar = (na.b) field.getAnnotation(na.b.class);
                    if (bVar == null) {
                        listSingletonList = Collections.singletonList(field.getName());
                    } else {
                        String strValue = bVar.value();
                        String[] strArrAlternate = bVar.alternate();
                        if (strArrAlternate.length == 0) {
                            listSingletonList = Collections.singletonList(strValue);
                        } else {
                            ArrayList arrayList = new ArrayList(strArrAlternate.length + 1);
                            arrayList.add(strValue);
                            Collections.addAll(arrayList, strArrAlternate);
                            r10 = arrayList;
                        }
                        String str = (String) r10.get(r14);
                        aVar2 = new ta.a(typeJ);
                        cls2 = aVar2.f48151a;
                        if (cls2 == null && cls2.isPrimitive()) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        modifiers = field.getModifiers();
                        if (Modifier.isStatic(modifiers) || !Modifier.isFinal(modifiers)) {
                            z13 = false;
                        } else {
                            z13 = true;
                        }
                        aVar3 = (na.a) field.getAnnotation(na.a.class);
                        if (aVar3 != null) {
                            r27 = r10;
                            gVar2 = gVar;
                            uVarB = this.f45676c.a(this.f45674a, gVar2, aVar2, aVar3, false);
                        } else {
                            gVar2 = gVar;
                            r27 = r10;
                            uVarB = null;
                        }
                        if (uVarB != null) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (uVarB == null) {
                            uVarB = gVar2.b(aVar2);
                        }
                        if (zC) {
                            if (z14) {
                                oVar = uVarB;
                            } else {
                                oVar = new o(gVar2, uVarB, aVar2.f48152b);
                            }
                            uVar = oVar;
                        } else {
                            uVar = uVarB;
                        }
                        sVar = new s(str, field, method, uVar, uVarB, z12, z13);
                        if (z11) {
                            for (String str2 : r27) {
                                sVar3 = (s) linkedHashMap.put(str2, sVar);
                                if (sVar3 == null) {
                                    a(cls, str2, sVar3.f45661b, field);
                                    throw null;
                                }
                            }
                        }
                        if (zC && (sVar2 = (s) linkedHashMap2.put(str, sVar)) != null) {
                            a(cls, str, sVar2.f45661b, field);
                            throw null;
                        }
                    }
                    r10 = listSingletonList;
                    String str3 = (String) r10.get(r14);
                    aVar2 = new ta.a(typeJ);
                    cls2 = aVar2.f48151a;
                    if (cls2 == null) {
                        z12 = false;
                    } else {
                        z12 = false;
                    }
                    modifiers = field.getModifiers();
                    if (Modifier.isStatic(modifiers)) {
                        z13 = false;
                    } else {
                        z13 = false;
                    }
                    aVar3 = (na.a) field.getAnnotation(na.a.class);
                    if (aVar3 != null) {
                        r27 = r10;
                        gVar2 = gVar;
                        uVarB = this.f45676c.a(this.f45674a, gVar2, aVar2, aVar3, false);
                    } else {
                        gVar2 = gVar;
                        r27 = r10;
                        uVarB = null;
                    }
                    if (uVarB != null) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (uVarB == null) {
                        uVarB = gVar2.b(aVar2);
                    }
                    if (zC) {
                        if (z14) {
                            oVar = uVarB;
                        } else {
                            oVar = new o(gVar2, uVarB, aVar2.f48152b);
                        }
                        uVar = oVar;
                    } else {
                        uVar = uVarB;
                    }
                    sVar = new s(str3, field, method, uVar, uVarB, z12, z13);
                    if (z11) {
                        while (r5.hasNext()) {
                            sVar3 = (s) linkedHashMap.put(str2, sVar);
                            if (sVar3 == null) {
                                a(cls, str2, sVar3.f45661b, field);
                                throw null;
                            }
                        }
                    }
                    if (zC) {
                        continue;
                    }
                }
                i10++;
                r14 = 0;
            }
            aVar4 = new ta.a(oa.d.j(aVar4.f48152b, cls3, cls3.getGenericSuperclass(), new HashMap()));
            cls3 = aVar4.f48151a;
        }
        return new v(linkedHashMap, new ArrayList(linkedHashMap2.values()));
    }

    public final boolean c(Field field, boolean z10) {
        boolean z11;
        oa.f fVar = this.f45675b;
        fVar.getClass();
        if ((136 & field.getModifiers()) != 0 || field.isSynthetic() || fVar.b(field.getType(), z10)) {
            z11 = true;
        } else {
            List list = z10 ? fVar.f19385a : fVar.f19386b;
            if (!list.isEmpty()) {
                ma.b bVar = new ma.b(field);
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((ma.a) it.next()).shouldSkipField(bVar)) {
                            z11 = true;
                        }
                    }
                }
            }
            z11 = false;
        }
        return !z11;
    }

    @Override
    public final ma.u create(ma.g gVar, ta.a aVar) {
        Class cls = aVar.f48151a;
        if (!Object.class.isAssignableFrom(cls)) {
            return null;
        }
        w6 w6Var = ra.c.f46882a;
        if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
            return new ma.d(2);
        }
        oa.d.f(this.d);
        return ra.c.f46882a.d(cls) ? new w(cls, b(gVar, aVar, cls, true)) : new u(this.f45674a.l(aVar), b(gVar, aVar, cls, false));
    }
}
