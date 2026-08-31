package qc;

import java.util.regex.Pattern;
import ne.p;
import ne.s;
public abstract class h {
    public i f44769a;
    public p f44770b;
    public String f44771c;
    public int d;

    public final String a(Pattern pattern) {
        i iVar = this.f44769a;
        iVar.f44782g = this.d;
        String c3 = iVar.c(pattern);
        this.d = this.f44769a.f44782g;
        return c3;
    }

    public abstract p b();

    public final char c() {
        i iVar = this.f44769a;
        iVar.f44782g = this.d;
        return iVar.d();
    }

    public abstract char d();

    public final void e() {
        i iVar = this.f44769a;
        iVar.f44782g = this.d;
        iVar.c(i.f44773k);
        this.d = this.f44769a.f44782g;
    }

    public final s f(String str) {
        this.f44769a.getClass();
        return new s(str);
    }
}
