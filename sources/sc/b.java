package sc;

import ad.p;
import h7.k6;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.t;
import tc.g;

public final class b extends g {

    public int f47849a;

    public final p f47850b;

    public final rc.c f47851c;

    public b(p pVar, rc.c cVar, rc.c cVar2) {
        super(cVar);
        this.f47850b = pVar;
        this.f47851c = cVar2;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f47849a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f47849a = 2;
            k6.b(obj);
            return obj;
        }
        this.f47849a = 1;
        k6.b(obj);
        p pVar = this.f47850b;
        j.c(pVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        t.a(2, pVar);
        return pVar.invoke(this.f47851c, this);
    }
}
