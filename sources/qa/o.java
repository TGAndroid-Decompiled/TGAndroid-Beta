package qa;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.security.AccessController;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public final class o extends na.u {
    public final int f46557a;
    public final Object f46558b;
    public final Object f46559c;
    public final Object d;

    public o(Class cls) {
        Field[] fieldArr;
        this.f46557a = 2;
        this.f46558b = new HashMap();
        this.f46559c = new HashMap();
        this.d = new HashMap();
        try {
            for (Field field : (Field[]) AccessController.doPrivileged(new g1(cls))) {
                Enum r42 = (Enum) field.get(null);
                String name = r42.name();
                String str = r42.toString();
                oa.b bVar = (oa.b) field.getAnnotation(oa.b.class);
                if (bVar != null) {
                    name = bVar.value();
                    for (String str2 : bVar.alternate()) {
                        ((HashMap) this.f46558b).put(str2, r42);
                    }
                }
                ((HashMap) this.f46558b).put(name, r42);
                ((HashMap) this.f46559c).put(str, r42);
                ((HashMap) this.d).put(r42, name);
            }
        } catch (IllegalAccessException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override
    public final Object read(va.a aVar) {
        switch (this.f46557a) {
            case 0:
                int x4 = aVar.x();
                if (x4 == 9) {
                    aVar.t();
                    return null;
                }
                Map map = (Map) ((pa.m) this.d).p2();
                if (x4 == 1) {
                    aVar.a();
                    while (aVar.k()) {
                        aVar.a();
                        Object read = ((na.u) ((o) this.f46558b).f46559c).read(aVar);
                        if (map.put(read, ((na.u) ((o) this.f46559c).f46559c).read(aVar)) == null) {
                            aVar.e();
                        } else {
                            throw new RuntimeException("duplicate key: " + read);
                        }
                    }
                    aVar.e();
                } else {
                    aVar.b();
                    while (aVar.k()) {
                        x9.d.f50112b.getClass();
                        if (aVar instanceof l) {
                            l lVar = (l) aVar;
                            lVar.F(5);
                            Map.Entry entry = (Map.Entry) ((Iterator) lVar.J()).next();
                            lVar.L(entry.getValue());
                            lVar.L(new na.m((String) entry.getKey()));
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
                        Object read2 = ((na.u) ((o) this.f46558b).f46559c).read(aVar);
                        if (map.put(read2, ((na.u) ((o) this.f46559c).f46559c).read(aVar)) != null) {
                            throw new RuntimeException("duplicate key: " + read2);
                        }
                    }
                    aVar.f();
                }
                return map;
            case 1:
                return ((na.u) this.f46559c).read(aVar);
            default:
                if (aVar.x() == 9) {
                    aVar.t();
                    return null;
                }
                String v = aVar.v();
                Enum r02 = (Enum) ((HashMap) this.f46558b).get(v);
                if (r02 == null) {
                    return (Enum) ((HashMap) this.f46559c).get(v);
                }
                return r02;
        }
    }

    @Override
    public final void write(va.b r5, java.lang.Object r6) {
        throw new UnsupportedOperationException("Method not decompiled: qa.o.write(va.b, java.lang.Object):void");
    }

    public o(na.g gVar, na.u uVar, Type type) {
        this.f46557a = 1;
        this.f46558b = gVar;
        this.f46559c = uVar;
        this.d = type;
    }

    public o(d dVar, na.g gVar, Type type, na.u uVar, Type type2, na.u uVar2, pa.m mVar) {
        this.f46557a = 0;
        this.f46558b = new o(gVar, uVar, type);
        this.f46559c = new o(gVar, uVar2, type2);
        this.d = mVar;
    }
}
