package rc;

import g7.y5;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.s;
import sc.g;
import zc.p;
public final class b extends g {
    public int f47129a;
    public final p f47130b;
    public final qc.c f47131c;

    public b(qc.c cVar, qc.c cVar2, p pVar) {
        super(cVar);
        this.f47130b = pVar;
        this.f47131c = cVar2;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i9 = this.f47129a;
        if (i9 != 0) {
            if (i9 == 1) {
                this.f47129a = 2;
                y5.b(obj);
                return obj;
            }
            throw new IllegalStateException("This coroutine had already completed");
        }
        this.f47129a = 1;
        y5.b(obj);
        p pVar = this.f47130b;
        i.c(pVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        s.a(2, pVar);
        return pVar.invoke(this.f47131c, this);
    }
}
