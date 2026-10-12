package zd;

import java.util.concurrent.TimeUnit;
import w7.u;
public final class c {
    public static final c f54587b;
    public static final c f54588c;
    public static final c d;
    public static final c f54589e;
    public static final c f54590f;
    public static final c h;
    public static final c[] f54591n;
    public final TimeUnit f54592a;

    static {
        c cVar = new c("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
        f54587b = cVar;
        c cVar2 = new c("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
        c cVar3 = new c("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
        f54588c = cVar3;
        c cVar4 = new c("SECONDS", 3, TimeUnit.SECONDS);
        d = cVar4;
        c cVar5 = new c("MINUTES", 4, TimeUnit.MINUTES);
        f54589e = cVar5;
        c cVar6 = new c("HOURS", 5, TimeUnit.HOURS);
        f54590f = cVar6;
        c cVar7 = new c("DAYS", 6, TimeUnit.DAYS);
        h = cVar7;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7};
        f54591n = cVarArr;
        u.a(cVarArr);
    }

    public c(String str, int i10, TimeUnit timeUnit) {
        this.f54592a = timeUnit;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f54591n.clone();
    }
}
