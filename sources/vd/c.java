package vd;

import b8.zc;
import java.util.concurrent.TimeUnit;
public final class c {
    public static final c f56560b;
    public static final c f56561c;
    public static final c d;
    public static final c f56562e;
    public static final c f56563f;
    public static final c h;
    public static final c[] f56564n;
    public final TimeUnit f56565a;

    static {
        c cVar = new c("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
        f56560b = cVar;
        c cVar2 = new c("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
        c cVar3 = new c("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
        f56561c = cVar3;
        c cVar4 = new c("SECONDS", 3, TimeUnit.SECONDS);
        d = cVar4;
        c cVar5 = new c("MINUTES", 4, TimeUnit.MINUTES);
        f56562e = cVar5;
        c cVar6 = new c("HOURS", 5, TimeUnit.HOURS);
        f56563f = cVar6;
        c cVar7 = new c("DAYS", 6, TimeUnit.DAYS);
        h = cVar7;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7};
        f56564n = cVarArr;
        zc.a(cVarArr);
    }

    public c(String str, int i3, TimeUnit timeUnit) {
        this.f56565a = timeUnit;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f56564n.clone();
    }
}
