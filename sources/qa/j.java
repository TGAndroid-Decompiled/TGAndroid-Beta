package qa;

import j$.util.concurrent.ConcurrentHashMap;
public final class j implements na.v {
    public static final i f46554c = new i(0);
    public static final i d = new i(0);
    public final oc.i f46555a;
    public final ConcurrentHashMap f46556b = new ConcurrentHashMap();

    public j(oc.i iVar) {
        this.f46555a = iVar;
    }

    public final na.u a(oc.i iVar, na.g gVar, ua.a aVar, oa.a aVar2, boolean z10) {
        na.o oVar;
        i iVar2;
        na.u uVar;
        Object p22 = iVar.d2(new ua.a(aVar2.value())).p2();
        boolean nullSafe = aVar2.nullSafe();
        if (p22 instanceof na.u) {
            uVar = (na.u) p22;
        } else if (p22 instanceof na.v) {
            na.v vVar = (na.v) p22;
            if (z10) {
                na.v vVar2 = (na.v) this.f46556b.putIfAbsent(aVar.f49163a, vVar);
                if (vVar2 != null) {
                    vVar = vVar2;
                }
            }
            uVar = vVar.create(gVar, aVar);
        } else {
            boolean z11 = p22 instanceof na.o;
            if (z11) {
                if (z11) {
                    oVar = (na.o) p22;
                } else {
                    oVar = null;
                }
                na.o oVar2 = oVar;
                if (z10) {
                    iVar2 = f46554c;
                } else {
                    iVar2 = d;
                }
                a0 a0Var = new a0(oVar2, gVar, aVar, iVar2, nullSafe);
                nullSafe = false;
                uVar = a0Var;
            } else {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + p22.getClass().getName() + " as a @JsonAdapter for " + pa.d.k(aVar.f49164b) + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
        }
        if (uVar != null && nullSafe) {
            return uVar.nullSafe();
        }
        return uVar;
    }

    @Override
    public final na.u create(na.g gVar, ua.a aVar) {
        oa.a aVar2 = (oa.a) aVar.f49163a.getAnnotation(oa.a.class);
        if (aVar2 == null) {
            return null;
        }
        return a(this.f46555a, gVar, aVar, aVar2, true);
    }
}
