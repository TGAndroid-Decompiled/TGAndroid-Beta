package v7;
public abstract class t8 {
    public static id.c a(id.c cVar, id.c cVar2, rd.p pVar) {
        kotlin.jvm.internal.i.e(pVar, "<this>");
        if (pVar instanceof kd.a) {
            return ((kd.a) pVar).create(cVar, cVar2);
        }
        id.h context = cVar2.getContext();
        if (context == id.i.f11954a) {
            return new jd.b(cVar2, cVar, pVar);
        }
        return new jd.c(cVar2, context, pVar, cVar);
    }

    public static id.c b(id.c cVar) {
        kd.c cVar2;
        id.c intercepted;
        kotlin.jvm.internal.i.e(cVar, "<this>");
        if (cVar instanceof kd.c) {
            cVar2 = (kd.c) cVar;
        } else {
            cVar2 = null;
        }
        if (cVar2 != null && (intercepted = cVar2.intercepted()) != null) {
            return intercepted;
        }
        return cVar;
    }
}
