package yd;

import c8.n1;
import java.util.concurrent.TimeUnit;
public final class c {
    public static final c f61217b;
    public static final c f61218c;
    public static final c d;
    public static final c f61219e;
    public static final c f61220f;
    public static final c h;
    public static final c[] f61221n;
    public final TimeUnit f61222a;

    static {
        c cVar = new c("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
        f61217b = cVar;
        c cVar2 = new c("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
        c cVar3 = new c("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
        f61218c = cVar3;
        c cVar4 = new c("SECONDS", 3, TimeUnit.SECONDS);
        d = cVar4;
        c cVar5 = new c("MINUTES", 4, TimeUnit.MINUTES);
        f61219e = cVar5;
        c cVar6 = new c("HOURS", 5, TimeUnit.HOURS);
        f61220f = cVar6;
        c cVar7 = new c("DAYS", 6, TimeUnit.DAYS);
        h = cVar7;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7};
        f61221n = cVarArr;
        n1.a(cVarArr);
    }

    public c(String str, int i7, TimeUnit timeUnit) {
        this.f61222a = timeUnit;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f61221n.clone();
    }
}
