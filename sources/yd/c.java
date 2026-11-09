package yd;

import c8.j1;
import java.util.concurrent.TimeUnit;
public final class c {
    public static final c f59405b;
    public static final c f59406c;
    public static final c d;
    public static final c f59407e;
    public static final c f59408f;
    public static final c h;
    public static final c[] f59409n;
    public final TimeUnit f59410a;

    static {
        c cVar = new c("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
        f59405b = cVar;
        c cVar2 = new c("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
        c cVar3 = new c("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
        f59406c = cVar3;
        c cVar4 = new c("SECONDS", 3, TimeUnit.SECONDS);
        d = cVar4;
        c cVar5 = new c("MINUTES", 4, TimeUnit.MINUTES);
        f59407e = cVar5;
        c cVar6 = new c("HOURS", 5, TimeUnit.HOURS);
        f59408f = cVar6;
        c cVar7 = new c("DAYS", 6, TimeUnit.DAYS);
        h = cVar7;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7};
        f59409n = cVarArr;
        j1.a(cVarArr);
    }

    public c(String str, int i7, TimeUnit timeUnit) {
        this.f59410a = timeUnit;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f59409n.clone();
    }
}
