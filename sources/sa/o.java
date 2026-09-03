package sa;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.security.AccessController;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public final class o extends pa.u {
    public final int f47228a;
    public final Object f47229b;
    public final Object f47230c;
    public final Object d;

    public o(Class cls) {
        Field[] fieldArr;
        this.f47228a = 2;
        this.f47229b = new HashMap();
        this.f47230c = new HashMap();
        this.d = new HashMap();
        try {
            for (Field field : (Field[]) AccessController.doPrivileged(new g1(cls))) {
                Enum r42 = (Enum) field.get(null);
                String name = r42.name();
                String str = r42.toString();
                qa.b bVar = (qa.b) field.getAnnotation(qa.b.class);
                if (bVar != null) {
                    name = bVar.value();
                    for (String str2 : bVar.alternate()) {
                        ((HashMap) this.f47229b).put(str2, r42);
                    }
                }
                ((HashMap) this.f47229b).put(name, r42);
                ((HashMap) this.f47230c).put(str, r42);
                ((HashMap) this.d).put(r42, name);
            }
        } catch (IllegalAccessException e6) {
            throw new AssertionError(e6);
        }
    }

    @Override
    public final Object read(xa.a aVar) {
        switch (this.f47228a) {
            case 0:
                int x10 = aVar.x();
                if (x10 == 9) {
                    aVar.t();
                    return null;
                }
                Map map = (Map) ((ra.m) this.d).y2();
                if (x10 == 1) {
                    aVar.a();
                    while (aVar.k()) {
                        aVar.a();
                        Object read = ((pa.u) ((o) this.f47229b).f47230c).read(aVar);
                        if (map.put(read, ((pa.u) ((o) this.f47230c).f47230c).read(aVar)) == null) {
                            aVar.e();
                        } else {
                            throw new RuntimeException("duplicate key: " + read);
                        }
                    }
                    aVar.e();
                } else {
                    aVar.b();
                    while (aVar.k()) {
                        cb.b.f2402b.getClass();
                        if (aVar instanceof l) {
                            l lVar = (l) aVar;
                            lVar.F(5);
                            Map.Entry entry = (Map.Entry) ((Iterator) lVar.J()).next();
                            lVar.L(entry.getValue());
                            lVar.L(new pa.m((String) entry.getKey()));
                        } else {
                            int i10 = aVar.h;
                            if (i10 == 0) {
                                i10 = aVar.d();
                            }
                            if (i10 == 13) {
                                aVar.h = 9;
                            } else if (i10 == 12) {
                                aVar.h = 8;
                            } else if (i10 == 14) {
                                aVar.h = 10;
                            } else {
                                throw aVar.E("a name");
                            }
                        }
                        Object read2 = ((pa.u) ((o) this.f47229b).f47230c).read(aVar);
                        if (map.put(read2, ((pa.u) ((o) this.f47230c).f47230c).read(aVar)) != null) {
                            throw new RuntimeException("duplicate key: " + read2);
                        }
                    }
                    aVar.f();
                }
                return map;
            case 1:
                return ((pa.u) this.f47230c).read(aVar);
            default:
                if (aVar.x() == 9) {
                    aVar.t();
                    return null;
                }
                String v = aVar.v();
                Enum r02 = (Enum) ((HashMap) this.f47229b).get(v);
                if (r02 == null) {
                    return (Enum) ((HashMap) this.f47230c).get(v);
                }
                return r02;
        }
    }

    @Override
    public final void write(xa.b r5, java.lang.Object r6) {
        throw new UnsupportedOperationException("Method not decompiled: sa.o.write(xa.b, java.lang.Object):void");
    }

    public o(pa.g gVar, pa.u uVar, Type type) {
        this.f47228a = 1;
        this.f47229b = gVar;
        this.f47230c = uVar;
        this.d = type;
    }

    public o(d dVar, pa.g gVar, Type type, pa.u uVar, Type type2, pa.u uVar2, ra.m mVar) {
        this.f47228a = 0;
        this.f47229b = new o(gVar, uVar, type);
        this.f47230c = new o(gVar, uVar2, type2);
        this.d = mVar;
    }
}
