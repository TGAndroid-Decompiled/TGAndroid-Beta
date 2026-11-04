package wd;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class k1 extends kotlin.jvm.internal.i implements od.q {
    public static final k1 f57509a = new kotlin.jvm.internal.i(3, n1.class, "onAwaitInternalRegFunc", "onAwaitInternalRegFunc(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override
    public final Object a(Object obj, Object obj2, Object obj3) {
        Object obj4;
        n1 n1Var = (n1) obj;
        if (obj2 == null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n1.f57519a;
            n1Var.getClass();
            do {
                obj4 = n1.f57519a.get(n1Var);
                if (!(obj4 instanceof x0)) {
                    throw null;
                }
            } while (n1Var.L(obj4) < 0);
            b0.n(n1Var, true, new m0(n1Var));
            throw null;
        }
        throw new ClassCastException();
    }
}
