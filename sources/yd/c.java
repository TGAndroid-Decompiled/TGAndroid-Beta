package yd;

import java.util.concurrent.TimeUnit;
import w7.m;
public final class c {
    public static final c f46727b;
    public static final c f46728c;
    public static final c d;
    public static final c e;
    public static final c f46729f;
    public static final c h;
    public static final c[] f46730n;
    public final TimeUnit f46731a;

    static {
        c cVar = new c("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
        f46727b = cVar;
        c cVar2 = new c("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
        c cVar3 = new c("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
        f46728c = cVar3;
        c cVar4 = new c("SECONDS", 3, TimeUnit.SECONDS);
        d = cVar4;
        c cVar5 = new c("MINUTES", 4, TimeUnit.MINUTES);
        e = cVar5;
        c cVar6 = new c("HOURS", 5, TimeUnit.HOURS);
        f46729f = cVar6;
        c cVar7 = new c("DAYS", 6, TimeUnit.DAYS);
        h = cVar7;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7};
        f46730n = cVarArr;
        m.a(cVarArr);
    }

    public c(String str, int i10, TimeUnit timeUnit) {
        this.f46731a = timeUnit;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f46730n.clone();
    }
}
