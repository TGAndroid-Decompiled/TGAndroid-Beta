package vc;

import dd.p;
import k7.q7;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.t;
import uc.h;
public final class c extends wc.c {
    public int f48967a;
    public final p f48968b;
    public final uc.c f48969c;

    public c(uc.c cVar, h hVar, p pVar, uc.c cVar2) {
        super(cVar, hVar);
        this.f48968b = pVar;
        this.f48969c = cVar2;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f48967a;
        if (i10 != 0) {
            if (i10 == 1) {
                this.f48967a = 2;
                q7.b(obj);
                return obj;
            }
            throw new IllegalStateException("This coroutine had already completed");
        }
        this.f48967a = 1;
        q7.b(obj);
        p pVar = this.f48968b;
        j.c(pVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        t.a(2, pVar);
        return pVar.invoke(this.f48969c, this);
    }
}
