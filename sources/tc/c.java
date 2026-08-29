package tc;

import bd.p;
import i7.c7;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.t;
import sc.h;
public final class c extends uc.c {
    public int f48215a;
    public final p f48216b;
    public final sc.c f48217c;

    public c(sc.c cVar, h hVar, p pVar, sc.c cVar2) {
        super(cVar, hVar);
        this.f48216b = pVar;
        this.f48217c = cVar2;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f48215a;
        if (i10 != 0) {
            if (i10 == 1) {
                this.f48215a = 2;
                c7.b(obj);
                return obj;
            }
            throw new IllegalStateException("This coroutine had already completed");
        }
        this.f48215a = 1;
        c7.b(obj);
        p pVar = this.f48216b;
        j.c(pVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        t.a(2, pVar);
        return pVar.invoke(this.f48217c, this);
    }
}
