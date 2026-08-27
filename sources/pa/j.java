package pa;

import j$.util.concurrent.ConcurrentHashMap;

public final class j implements ma.v {

    public static final i f45647c;
    public static final i d;

    public final g5.b f45648a;

    public final ConcurrentHashMap f45649b = new ConcurrentHashMap();

    static {
        int i10 = 0;
        f45647c = new i(i10);
        d = new i(i10);
    }

    public j(g5.b bVar) {
        this.f45648a = bVar;
    }

    public final ma.u a(g5.b bVar, ma.g gVar, ta.a aVar, na.a aVar2, boolean z10) {
        ma.u uVarCreate;
        Object objF2 = bVar.l(new ta.a(aVar2.value())).f2();
        boolean zNullSafe = aVar2.nullSafe();
        if (objF2 instanceof ma.u) {
            uVarCreate = (ma.u) objF2;
        } else if (objF2 instanceof ma.v) {
            ma.v vVar = (ma.v) objF2;
            if (z10) {
                ma.v vVar2 = (ma.v) this.f45649b.putIfAbsent(aVar.f48151a, vVar);
                if (vVar2 != null) {
                    vVar = vVar2;
                }
            }
            uVarCreate = vVar.create(gVar, aVar);
        } else {
            boolean z11 = objF2 instanceof ma.o;
            if (!z11) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objF2.getClass().getName() + " as a @JsonAdapter for " + oa.d.k(aVar.f48152b) + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            a0 a0Var = new a0(z11 ? (ma.o) objF2 : null, gVar, aVar, z10 ? f45647c : d, zNullSafe);
            zNullSafe = false;
            uVarCreate = a0Var;
        }
        return (uVarCreate == null || !zNullSafe) ? uVarCreate : uVarCreate.nullSafe();
    }

    @Override
    public final ma.u create(ma.g gVar, ta.a aVar) {
        na.a aVar2 = (na.a) aVar.f48151a.getAnnotation(na.a.class);
        if (aVar2 == null) {
            return null;
        }
        return a(this.f45648a, gVar, aVar, aVar2, true);
    }
}
