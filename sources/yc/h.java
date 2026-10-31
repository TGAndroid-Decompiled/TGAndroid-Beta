package yc;

import java.util.regex.Pattern;
import ve.r;
public abstract class h {
    public i f54374a;
    public df.c f54375b;
    public String f54376c;
    public int d;

    public final String a(Pattern pattern) {
        i iVar = this.f54374a;
        iVar.f54386g = this.d;
        String c10 = iVar.c(pattern);
        this.d = this.f54374a.f54386g;
        return c10;
    }

    public abstract df.c b();

    public final char c() {
        i iVar = this.f54374a;
        iVar.f54386g = this.d;
        return iVar.d();
    }

    public abstract char d();

    public final void e() {
        i iVar = this.f54374a;
        iVar.f54386g = this.d;
        iVar.c(i.f54378k);
        this.d = this.f54374a.f54386g;
    }

    public final r f(String str) {
        this.f54374a.getClass();
        return new r(str);
    }
}
