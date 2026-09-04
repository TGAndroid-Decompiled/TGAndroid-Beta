package zd;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class r1 extends kotlin.jvm.internal.h implements rd.q {
    public static final r1 f51593a = new kotlin.jvm.internal.h(3, u1.class, "onAwaitInternalRegFunc", "onAwaitInternalRegFunc(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override
    public final Object c(Object obj, Object obj2, kd.c cVar) {
        Object u10;
        u1 u1Var = (u1) obj;
        if (obj2 == null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = u1.f51604a;
            do {
                u10 = u1Var.u();
                if (!(u10 instanceof a1)) {
                    throw null;
                }
            } while (u1Var.I(u10) < 0);
            e0.n(u1Var, false, new p0(u1Var), 3);
            throw null;
        }
        throw new ClassCastException();
    }
}
