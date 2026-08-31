package vc;

import dd.p;
import k7.q7;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.t;
import wc.g;
public final class b extends g {
    public int f48964a;
    public final p f48965b;
    public final uc.c f48966c;

    public b(p pVar, uc.c cVar, uc.c cVar2) {
        super(cVar);
        this.f48965b = pVar;
        this.f48966c = cVar2;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f48964a;
        if (i10 != 0) {
            if (i10 == 1) {
                this.f48964a = 2;
                q7.b(obj);
                return obj;
            }
            throw new IllegalStateException("This coroutine had already completed");
        }
        this.f48964a = 1;
        q7.b(obj);
        p pVar = this.f48965b;
        j.c(pVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        t.a(2, pVar);
        return pVar.invoke(this.f48966c, this);
    }
}
