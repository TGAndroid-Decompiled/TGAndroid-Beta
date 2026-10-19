package w7;
public abstract class n {
    public static kd.c a(kd.c cVar, kd.c cVar2, td.p pVar) {
        kotlin.jvm.internal.i.e(pVar, "<this>");
        if (pVar instanceof md.a) {
            return ((md.a) pVar).create(cVar, cVar2);
        }
        kd.h context = cVar2.getContext();
        if (context == kd.i.f15029a) {
            return new ld.b(cVar2, cVar, pVar);
        }
        return new ld.c(cVar2, context, pVar, cVar);
    }

    public static kd.c b(kd.c cVar) {
        md.c cVar2;
        kd.c intercepted;
        kotlin.jvm.internal.i.e(cVar, "<this>");
        if (cVar instanceof md.c) {
            cVar2 = (md.c) cVar;
        } else {
            cVar2 = null;
        }
        if (cVar2 != null && (intercepted = cVar2.intercepted()) != null) {
            return intercepted;
        }
        return cVar;
    }
}
