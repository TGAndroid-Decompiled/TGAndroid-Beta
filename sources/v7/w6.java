package v7;
public abstract class w6 {
    public static cd.c a(cd.c cVar, cd.c cVar2, ld.p pVar) {
        kotlin.jvm.internal.i.e(pVar, "<this>");
        if (pVar instanceof ed.a) {
            return ((ed.a) pVar).create(cVar, cVar2);
        }
        cd.h context = cVar2.getContext();
        if (context == cd.i.f4123a) {
            return new dd.b(cVar2, cVar, pVar);
        }
        return new dd.c(cVar2, context, pVar, cVar);
    }

    public static cd.c b(cd.c cVar) {
        ed.c cVar2;
        cd.c intercepted;
        kotlin.jvm.internal.i.e(cVar, "<this>");
        if (cVar instanceof ed.c) {
            cVar2 = (ed.c) cVar;
        } else {
            cVar2 = null;
        }
        if (cVar2 != null && (intercepted = cVar2.intercepted()) != null) {
            return intercepted;
        }
        return cVar;
    }
}
