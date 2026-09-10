package zd;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class t1 extends kotlin.jvm.internal.h implements rd.q {
    public static final t1 f48049a = new kotlin.jvm.internal.h(3, u1.class, "registerSelectForOnJoin", "registerSelectForOnJoin(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override
    public final Object c(Object obj, Object obj2, kd.c cVar) {
        Object u10;
        u1 u1Var = (u1) obj;
        if (obj2 == null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = u1.f48054a;
            do {
                u10 = u1Var.u();
                if (!(u10 instanceof a1)) {
                    throw null;
                }
            } while (u1Var.I(u10) < 0);
            e0.n(u1Var, false, new ee.k(), 3);
            throw null;
        }
        throw new ClassCastException();
    }
}
