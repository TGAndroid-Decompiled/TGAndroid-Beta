package yc;

import java.util.regex.Pattern;
import ve.r;
public abstract class h {
    public i f54395a;
    public df.c f54396b;
    public String f54397c;
    public int d;

    public final String a(Pattern pattern) {
        i iVar = this.f54395a;
        iVar.f54407g = this.d;
        String c10 = iVar.c(pattern);
        this.d = this.f54395a.f54407g;
        return c10;
    }

    public abstract df.c b();

    public final char c() {
        i iVar = this.f54395a;
        iVar.f54407g = this.d;
        return iVar.d();
    }

    public abstract char d();

    public final void e() {
        i iVar = this.f54395a;
        iVar.f54407g = this.d;
        iVar.c(i.f54399k);
        this.d = this.f54395a.f54407g;
    }

    public final r f(String str) {
        this.f54395a.getClass();
        return new r(str);
    }
}
