package yd;

import c8.j1;
import java.util.concurrent.TimeUnit;
public final class c {
    public static final c f59403b;
    public static final c f59404c;
    public static final c d;
    public static final c f59405e;
    public static final c f59406f;
    public static final c h;
    public static final c[] f59407n;
    public final TimeUnit f59408a;

    static {
        c cVar = new c("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
        f59403b = cVar;
        c cVar2 = new c("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
        c cVar3 = new c("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
        f59404c = cVar3;
        c cVar4 = new c("SECONDS", 3, TimeUnit.SECONDS);
        d = cVar4;
        c cVar5 = new c("MINUTES", 4, TimeUnit.MINUTES);
        f59405e = cVar5;
        c cVar6 = new c("HOURS", 5, TimeUnit.HOURS);
        f59406f = cVar6;
        c cVar7 = new c("DAYS", 6, TimeUnit.DAYS);
        h = cVar7;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7};
        f59407n = cVarArr;
        j1.a(cVarArr);
    }

    public c(String str, int i7, TimeUnit timeUnit) {
        this.f59408a = timeUnit;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f59407n.clone();
    }
}
