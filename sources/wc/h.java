package wc;

import kotlin.jvm.internal.j;
import kotlin.jvm.internal.r;
import kotlin.jvm.internal.s;
public abstract class h extends g implements kotlin.jvm.internal.g {
    public final int f46595a;

    public h(uc.c cVar) {
        super(cVar);
        this.f46595a = 2;
    }

    @Override
    public final int getArity() {
        return this.f46595a;
    }

    @Override
    public final String toString() {
        if (getCompletion() == null) {
            r.f11101a.getClass();
            String a2 = s.a(this);
            j.d(a2, "renderLambdaToString(...)");
            return a2;
        }
        return super.toString();
    }
}
