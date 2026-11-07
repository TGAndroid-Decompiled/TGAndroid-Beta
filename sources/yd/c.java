package yd;

import c8.j1;
import java.util.concurrent.TimeUnit;
public final class c {
    public static final c f59306b;
    public static final c f59307c;
    public static final c d;
    public static final c f59308e;
    public static final c f59309f;
    public static final c h;
    public static final c[] f59310n;
    public final TimeUnit f59311a;

    static {
        c cVar = new c("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
        f59306b = cVar;
        c cVar2 = new c("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
        c cVar3 = new c("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
        f59307c = cVar3;
        c cVar4 = new c("SECONDS", 3, TimeUnit.SECONDS);
        d = cVar4;
        c cVar5 = new c("MINUTES", 4, TimeUnit.MINUTES);
        f59308e = cVar5;
        c cVar6 = new c("HOURS", 5, TimeUnit.HOURS);
        f59309f = cVar6;
        c cVar7 = new c("DAYS", 6, TimeUnit.DAYS);
        h = cVar7;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7};
        f59310n = cVarArr;
        j1.a(cVarArr);
    }

    public c(String str, int i7, TimeUnit timeUnit) {
        this.f59311a = timeUnit;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f59310n.clone();
    }
}
