package sa;

import j$.util.concurrent.ConcurrentHashMap;
public final class j implements pa.v {
    public static final i f44206c = new i(0);
    public static final i d = new i(0);
    public final q5.g0 f44207a;
    public final ConcurrentHashMap f44208b = new ConcurrentHashMap();

    public j(q5.g0 g0Var) {
        this.f44207a = g0Var;
    }

    public final pa.u a(q5.g0 g0Var, pa.g gVar, wa.a aVar, qa.a aVar2, boolean z4) {
        pa.o oVar;
        i iVar;
        pa.u uVar;
        Object s22 = g0Var.I(new wa.a(aVar2.value())).s2();
        boolean nullSafe = aVar2.nullSafe();
        if (s22 instanceof pa.u) {
            uVar = (pa.u) s22;
        } else if (s22 instanceof pa.v) {
            pa.v vVar = (pa.v) s22;
            if (z4) {
                pa.v vVar2 = (pa.v) this.f44208b.putIfAbsent(aVar.f46505a, vVar);
                if (vVar2 != null) {
                    vVar = vVar2;
                }
            }
            uVar = vVar.create(gVar, aVar);
        } else {
            boolean z10 = s22 instanceof pa.o;
            if (z10) {
                if (z10) {
                    oVar = (pa.o) s22;
                } else {
                    oVar = null;
                }
                pa.o oVar2 = oVar;
                if (z4) {
                    iVar = f44206c;
                } else {
                    iVar = d;
                }
                a0 a0Var = new a0(oVar2, gVar, aVar, iVar, nullSafe);
                nullSafe = false;
                uVar = a0Var;
            } else {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + s22.getClass().getName() + " as a @JsonAdapter for " + ra.d.k(aVar.f46506b) + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
        }
        if (uVar != null && nullSafe) {
            return uVar.nullSafe();
        }
        return uVar;
    }

    @Override
    public final pa.u create(pa.g gVar, wa.a aVar) {
        qa.a aVar2 = (qa.a) aVar.f46505a.getAnnotation(qa.a.class);
        if (aVar2 == null) {
            return null;
        }
        return a(this.f44207a, gVar, aVar, aVar2, true);
    }
}
