package sc;

import ad.p;
import h7.k6;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.t;
import rc.h;

public final class c extends tc.c {

    public int f47852a;

    public final p f47853b;

    public final rc.c f47854c;

    public c(rc.c cVar, h hVar, p pVar, rc.c cVar2) {
        super(cVar, hVar);
        this.f47853b = pVar;
        this.f47854c = cVar2;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f47852a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f47852a = 2;
            k6.b(obj);
            return obj;
        }
        this.f47852a = 1;
        k6.b(obj);
        p pVar = this.f47853b;
        j.c(pVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        t.a(2, pVar);
        return pVar.invoke(this.f47854c, this);
    }
}
