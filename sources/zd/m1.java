package zd;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class m1 extends kotlin.jvm.internal.i implements rd.q {
    public static final m1 f60003a = new kotlin.jvm.internal.i(3, n1.class, "registerSelectForOnJoin", "registerSelectForOnJoin(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override
    public final Object b(Object obj, Object obj2, Object obj3) {
        Object obj4;
        n1 n1Var = (n1) obj;
        if (obj2 == null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n1.f60006a;
            n1Var.getClass();
            do {
                obj4 = n1.f60006a.get(n1Var);
                if (!(obj4 instanceof x0)) {
                    throw null;
                }
            } while (n1Var.L(obj4) < 0);
            b0.n(n1Var, true, new ee.j());
            throw null;
        }
        throw new ClassCastException();
    }
}
