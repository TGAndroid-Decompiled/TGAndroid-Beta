package yd;

import c8.h9;
import java.util.concurrent.TimeUnit;
public final class c {
    public static final c f61305b;
    public static final c f61306c;
    public static final c d;
    public static final c f61307e;
    public static final c f61308f;
    public static final c h;
    public static final c[] f61309n;
    public final TimeUnit f61310a;

    static {
        c cVar = new c("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
        f61305b = cVar;
        c cVar2 = new c("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
        c cVar3 = new c("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
        f61306c = cVar3;
        c cVar4 = new c("SECONDS", 3, TimeUnit.SECONDS);
        d = cVar4;
        c cVar5 = new c("MINUTES", 4, TimeUnit.MINUTES);
        f61307e = cVar5;
        c cVar6 = new c("HOURS", 5, TimeUnit.HOURS);
        f61308f = cVar6;
        c cVar7 = new c("DAYS", 6, TimeUnit.DAYS);
        h = cVar7;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7};
        f61309n = cVarArr;
        h9.a(cVarArr);
    }

    public c(String str, int i7, TimeUnit timeUnit) {
        this.f61310a = timeUnit;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f61309n.clone();
    }
}
