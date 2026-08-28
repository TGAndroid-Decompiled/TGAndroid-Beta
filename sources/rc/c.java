package rc;

import g7.y5;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.s;
import qc.h;
import zc.p;
public final class c extends sc.c {
    public int f47132a;
    public final p f47133b;
    public final qc.c f47134c;

    public c(qc.c cVar, h hVar, p pVar, qc.c cVar2) {
        super(cVar, hVar);
        this.f47133b = pVar;
        this.f47134c = cVar2;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i9 = this.f47132a;
        if (i9 != 0) {
            if (i9 == 1) {
                this.f47132a = 2;
                y5.b(obj);
                return obj;
            }
            throw new IllegalStateException("This coroutine had already completed");
        }
        this.f47132a = 1;
        y5.b(obj);
        p pVar = this.f47133b;
        i.c(pVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        s.a(2, pVar);
        return pVar.invoke(this.f47134c, this);
    }
}
