package w7;
public abstract class h {
    public static jd.c a(jd.c cVar, jd.c cVar2, sd.p pVar) {
        kotlin.jvm.internal.i.e(pVar, "<this>");
        if (pVar instanceof ld.a) {
            return ((ld.a) pVar).create(cVar, cVar2);
        }
        jd.h context = cVar2.getContext();
        if (context == jd.i.f14129a) {
            return new kd.b(cVar2, cVar, pVar);
        }
        return new kd.c(cVar2, context, pVar, cVar);
    }

    public static jd.c b(jd.c cVar) {
        ld.c cVar2;
        jd.c intercepted;
        kotlin.jvm.internal.i.e(cVar, "<this>");
        if (cVar instanceof ld.c) {
            cVar2 = (ld.c) cVar;
        } else {
            cVar2 = null;
        }
        if (cVar2 != null && (intercepted = cVar2.intercepted()) != null) {
            return intercepted;
        }
        return cVar;
    }
}
