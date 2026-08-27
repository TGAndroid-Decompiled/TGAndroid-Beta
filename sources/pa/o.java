package pa;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.security.AccessController;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class o extends ma.u {

    public final int f45650a;

    public final Object f45651b;

    public final Object f45652c;
    public final Object d;

    public o(Class cls) {
        this.f45650a = 2;
        this.f45651b = new HashMap();
        this.f45652c = new HashMap();
        this.d = new HashMap();
        try {
            for (Field field : (Field[]) AccessController.doPrivileged(new g1(cls))) {
                Enum r10 = (Enum) field.get(null);
                String strName = r10.name();
                String string = r10.toString();
                na.b bVar = (na.b) field.getAnnotation(na.b.class);
                if (bVar != null) {
                    strName = bVar.value();
                    for (String str : bVar.alternate()) {
                        ((HashMap) this.f45651b).put(str, r10);
                    }
                }
                ((HashMap) this.f45651b).put(strName, r10);
                ((HashMap) this.f45652c).put(string, r10);
                ((HashMap) this.d).put(r10, strName);
            }
        } catch (IllegalAccessException e9) {
            throw new AssertionError(e9);
        }
    }

    @Override
    public final Object read(ua.a aVar) throws IOException {
        switch (this.f45650a) {
            case 0:
                int iX = aVar.x();
                if (iX == 9) {
                    aVar.t();
                    return null;
                }
                Map map = (Map) ((oa.m) this.d).f2();
                if (iX == 1) {
                    aVar.a();
                    while (aVar.k()) {
                        aVar.a();
                        Object obj = ((ma.u) ((o) this.f45651b).f45652c).read(aVar);
                        if (map.put(obj, ((ma.u) ((o) this.f45652c).f45652c).read(aVar)) != null) {
                            throw new ma.j("duplicate key: " + obj);
                        }
                        aVar.e();
                    }
                    aVar.e();
                } else {
                    aVar.b();
                    while (aVar.k()) {
                        xa.a.d.getClass();
                        if (aVar instanceof l) {
                            l lVar = (l) aVar;
                            lVar.F(5);
                            Map.Entry entry = (Map.Entry) ((Iterator) lVar.J()).next();
                            lVar.L(entry.getValue());
                            lVar.L(new ma.m((String) entry.getKey()));
                        } else {
                            int iD = aVar.h;
                            if (iD == 0) {
                                iD = aVar.d();
                            }
                            if (iD == 13) {
                                aVar.h = 9;
                            } else if (iD == 12) {
                                aVar.h = 8;
                            } else {
                                if (iD != 14) {
                                    throw aVar.E("a name");
                                }
                                aVar.h = 10;
                            }
                        }
                        Object obj2 = ((ma.u) ((o) this.f45651b).f45652c).read(aVar);
                        if (map.put(obj2, ((ma.u) ((o) this.f45652c).f45652c).read(aVar)) != null) {
                            throw new ma.j("duplicate key: " + obj2);
                        }
                    }
                    aVar.f();
                }
                return map;
            case 1:
                return ((ma.u) this.f45652c).read(aVar);
            default:
                if (aVar.x() == 9) {
                    aVar.t();
                    return null;
                }
                String strV = aVar.v();
                Enum r10 = (Enum) ((HashMap) this.f45651b).get(strV);
                return r10 == null ? (Enum) ((HashMap) this.f45652c).get(strV) : r10;
        }
    }

    @Override
    public final void write(ua.b bVar, Object obj) throws IOException {
        ma.u uVarA;
        switch (this.f45650a) {
            case 0:
                Map map = (Map) obj;
                o oVar = (o) this.f45652c;
                if (map == null) {
                    bVar.i();
                } else {
                    bVar.c();
                    for (Map.Entry entry : map.entrySet()) {
                        bVar.g(String.valueOf(entry.getKey()));
                        oVar.write(bVar, entry.getValue());
                    }
                    bVar.f();
                }
                break;
            case 1:
                ma.u uVar = (ma.u) this.f45652c;
                Type type = (Type) this.d;
                Type type2 = (obj == null || !((type instanceof Class) || (type instanceof TypeVariable))) ? type : obj.getClass();
                if (type2 != type) {
                    ma.u uVarB = ((ma.g) this.f45651b).b(new ta.a(type2));
                    if (uVarB instanceof t) {
                        ma.u uVar2 = uVar;
                        while ((uVar2 instanceof y) && (uVarA = ((y) uVar2).a()) != uVar2) {
                            uVar2 = uVarA;
                        }
                        if (uVar2 instanceof t) {
                            uVar = uVarB;
                        }
                    } else {
                        uVar = uVarB;
                    }
                }
                uVar.write(bVar, obj);
                break;
            default:
                Enum r10 = (Enum) obj;
                bVar.r(r10 == null ? null : (String) ((HashMap) this.d).get(r10));
                break;
        }
    }

    public o(ma.g gVar, ma.u uVar, Type type) {
        this.f45650a = 1;
        this.f45651b = gVar;
        this.f45652c = uVar;
        this.d = type;
    }

    public o(d dVar, ma.g gVar, Type type, ma.u uVar, Type type2, ma.u uVar2, oa.m mVar) {
        this.f45650a = 0;
        this.f45651b = new o(gVar, uVar, type);
        this.f45652c = new o(gVar, uVar2, type2);
        this.d = mVar;
    }
}
