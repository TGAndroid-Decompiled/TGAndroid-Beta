package sa;

import j$.util.concurrent.ConcurrentHashMap;
public final class j implements pa.v {
    public static final i f47225c = new i(0);
    public static final i d = new i(0);
    public final q5.c0 f47226a;
    public final ConcurrentHashMap f47227b = new ConcurrentHashMap();

    public j(q5.c0 c0Var) {
        this.f47226a = c0Var;
    }

    public final pa.u a(q5.c0 c0Var, pa.g gVar, wa.a aVar, qa.a aVar2, boolean z4) {
        pa.o oVar;
        i iVar;
        pa.u uVar;
        Object y22 = c0Var.z(new wa.a(aVar2.value())).y2();
        boolean nullSafe = aVar2.nullSafe();
        if (y22 instanceof pa.u) {
            uVar = (pa.u) y22;
        } else if (y22 instanceof pa.v) {
            pa.v vVar = (pa.v) y22;
            if (z4) {
                pa.v vVar2 = (pa.v) this.f47227b.putIfAbsent(aVar.f49520a, vVar);
                if (vVar2 != null) {
                    vVar = vVar2;
                }
            }
            uVar = vVar.create(gVar, aVar);
        } else {
            boolean z10 = y22 instanceof pa.o;
            if (z10) {
                if (z10) {
                    oVar = (pa.o) y22;
                } else {
                    oVar = null;
                }
                pa.o oVar2 = oVar;
                if (z4) {
                    iVar = f47225c;
                } else {
                    iVar = d;
                }
                a0 a0Var = new a0(oVar2, gVar, aVar, iVar, nullSafe);
                nullSafe = false;
                uVar = a0Var;
            } else {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + y22.getClass().getName() + " as a @JsonAdapter for " + ra.d.k(aVar.f49521b) + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
        }
        if (uVar != null && nullSafe) {
            return uVar.nullSafe();
        }
        return uVar;
    }

    @Override
    public final pa.u create(pa.g gVar, wa.a aVar) {
        qa.a aVar2 = (qa.a) aVar.f49520a.getAnnotation(qa.a.class);
        if (aVar2 == null) {
            return null;
        }
        return a(this.f47226a, gVar, aVar, aVar2, true);
    }
}
