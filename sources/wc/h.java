package wc;

import kotlin.jvm.internal.j;
import kotlin.jvm.internal.r;
import kotlin.jvm.internal.s;
public abstract class h extends g implements kotlin.jvm.internal.g {
    public final int f46513a;

    public h(uc.c cVar) {
        super(cVar);
        this.f46513a = 2;
    }

    @Override
    public final int getArity() {
        return this.f46513a;
    }

    @Override
    public final String toString() {
        if (getCompletion() == null) {
            r.f10991a.getClass();
            String a2 = s.a(this);
            j.d(a2, "renderLambdaToString(...)");
            return a2;
        }
        return super.toString();
    }
}
