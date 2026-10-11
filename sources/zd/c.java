package zd;

import java.util.concurrent.TimeUnit;
import w7.v;
public final class c {
    public static final c f54450b;
    public static final c f54451c;
    public static final c d;
    public static final c f54452e;
    public static final c f54453f;
    public static final c h;
    public static final c[] f54454n;
    public final TimeUnit f54455a;

    static {
        c cVar = new c("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
        f54450b = cVar;
        c cVar2 = new c("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
        c cVar3 = new c("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
        f54451c = cVar3;
        c cVar4 = new c("SECONDS", 3, TimeUnit.SECONDS);
        d = cVar4;
        c cVar5 = new c("MINUTES", 4, TimeUnit.MINUTES);
        f54452e = cVar5;
        c cVar6 = new c("HOURS", 5, TimeUnit.HOURS);
        f54453f = cVar6;
        c cVar7 = new c("DAYS", 6, TimeUnit.DAYS);
        h = cVar7;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7};
        f54454n = cVarArr;
        v.a(cVarArr);
    }

    public c(String str, int i10, TimeUnit timeUnit) {
        this.f54455a = timeUnit;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f54454n.clone();
    }
}
