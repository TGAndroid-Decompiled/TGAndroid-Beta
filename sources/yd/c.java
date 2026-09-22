package yd;

import java.util.concurrent.TimeUnit;
import w7.m;
public final class c {
    public static final c f46700b;
    public static final c f46701c;
    public static final c d;
    public static final c e;
    public static final c f46702f;
    public static final c h;
    public static final c[] f46703n;
    public final TimeUnit f46704a;

    static {
        c cVar = new c("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
        f46700b = cVar;
        c cVar2 = new c("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
        c cVar3 = new c("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
        f46701c = cVar3;
        c cVar4 = new c("SECONDS", 3, TimeUnit.SECONDS);
        d = cVar4;
        c cVar5 = new c("MINUTES", 4, TimeUnit.MINUTES);
        e = cVar5;
        c cVar6 = new c("HOURS", 5, TimeUnit.HOURS);
        f46702f = cVar6;
        c cVar7 = new c("DAYS", 6, TimeUnit.DAYS);
        h = cVar7;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7};
        f46703n = cVarArr;
        m.a(cVarArr);
    }

    public c(String str, int i10, TimeUnit timeUnit) {
        this.f46704a = timeUnit;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f46703n.clone();
    }
}
