package vc;

import dd.p;
import k7.p7;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.t;
import wc.g;
public final class b extends g {
    public int f45729a;
    public final p f45730b;
    public final uc.c f45731c;

    public b(p pVar, uc.c cVar, uc.c cVar2) {
        super(cVar);
        this.f45730b = pVar;
        this.f45731c = cVar2;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f45729a;
        if (i10 != 0) {
            if (i10 == 1) {
                this.f45729a = 2;
                p7.b(obj);
                return obj;
            }
            throw new IllegalStateException("This coroutine had already completed");
        }
        this.f45729a = 1;
        p7.b(obj);
        p pVar = this.f45730b;
        j.c(pVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        t.a(2, pVar);
        return pVar.invoke(this.f45731c, this);
    }
}
