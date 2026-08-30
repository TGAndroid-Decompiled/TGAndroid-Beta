package vc;

import dd.p;
import k7.p7;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.t;
import uc.h;
public final class c extends wc.c {
    public int f45668a;
    public final p f45669b;
    public final uc.c f45670c;

    public c(uc.c cVar, h hVar, p pVar, uc.c cVar2) {
        super(cVar, hVar);
        this.f45669b = pVar;
        this.f45670c = cVar2;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f45668a;
        if (i10 != 0) {
            if (i10 == 1) {
                this.f45668a = 2;
                p7.b(obj);
                return obj;
            }
            throw new IllegalStateException("This coroutine had already completed");
        }
        this.f45668a = 1;
        p7.b(obj);
        p pVar = this.f45669b;
        j.c(pVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        t.a(2, pVar);
        return pVar.invoke(this.f45670c, this);
    }
}
