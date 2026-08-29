package tc;

import bd.p;
import i7.c7;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.t;
import uc.g;
public final class b extends g {
    public int f48212a;
    public final p f48213b;
    public final sc.c f48214c;

    public b(p pVar, sc.c cVar, sc.c cVar2) {
        super(cVar);
        this.f48213b = pVar;
        this.f48214c = cVar2;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f48212a;
        if (i10 != 0) {
            if (i10 == 1) {
                this.f48212a = 2;
                c7.b(obj);
                return obj;
            }
            throw new IllegalStateException("This coroutine had already completed");
        }
        this.f48212a = 1;
        c7.b(obj);
        p pVar = this.f48213b;
        j.c(pVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        t.a(2, pVar);
        return pVar.invoke(this.f48214c, this);
    }
}
