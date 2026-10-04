package yd;

import java.util.concurrent.TimeUnit;
import w7.n;
public final class c {
    public static final c f50849b;
    public static final c f50850c;
    public static final c d;
    public static final c f50851e;
    public static final c f50852f;
    public static final c h;
    public static final c[] f50853n;
    public final TimeUnit f50854a;

    static {
        c cVar = new c("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
        f50849b = cVar;
        c cVar2 = new c("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
        c cVar3 = new c("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
        f50850c = cVar3;
        c cVar4 = new c("SECONDS", 3, TimeUnit.SECONDS);
        d = cVar4;
        c cVar5 = new c("MINUTES", 4, TimeUnit.MINUTES);
        f50851e = cVar5;
        c cVar6 = new c("HOURS", 5, TimeUnit.HOURS);
        f50852f = cVar6;
        c cVar7 = new c("DAYS", 6, TimeUnit.DAYS);
        h = cVar7;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7};
        f50853n = cVarArr;
        n.a(cVarArr);
    }

    public c(String str, int i10, TimeUnit timeUnit) {
        this.f50854a = timeUnit;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f50853n.clone();
    }
}
