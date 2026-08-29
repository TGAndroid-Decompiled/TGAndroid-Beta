package uc;

import kotlin.jvm.internal.j;
import kotlin.jvm.internal.r;
import kotlin.jvm.internal.s;
public abstract class h extends g implements kotlin.jvm.internal.g {
    public final int f49171a;

    public h(sc.c cVar) {
        super(cVar);
        this.f49171a = 2;
    }

    @Override
    public final int getArity() {
        return this.f49171a;
    }

    @Override
    public final String toString() {
        if (getCompletion() == null) {
            r.f13928a.getClass();
            String a2 = s.a(this);
            j.d(a2, "renderLambdaToString(...)");
            return a2;
        }
        return super.toString();
    }
}
