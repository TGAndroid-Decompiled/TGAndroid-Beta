package yd;

import c8.n1;
import java.util.concurrent.TimeUnit;
public final class c {
    public static final c f61176b;
    public static final c f61177c;
    public static final c d;
    public static final c f61178e;
    public static final c f61179f;
    public static final c h;
    public static final c[] f61180n;
    public final TimeUnit f61181a;

    static {
        c cVar = new c("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
        f61176b = cVar;
        c cVar2 = new c("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
        c cVar3 = new c("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
        f61177c = cVar3;
        c cVar4 = new c("SECONDS", 3, TimeUnit.SECONDS);
        d = cVar4;
        c cVar5 = new c("MINUTES", 4, TimeUnit.MINUTES);
        f61178e = cVar5;
        c cVar6 = new c("HOURS", 5, TimeUnit.HOURS);
        f61179f = cVar6;
        c cVar7 = new c("DAYS", 6, TimeUnit.DAYS);
        h = cVar7;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7};
        f61180n = cVarArr;
        n1.a(cVarArr);
    }

    public c(String str, int i7, TimeUnit timeUnit) {
        this.f61181a = timeUnit;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f61180n.clone();
    }
}
