package qc;

import java.util.regex.Pattern;
import ne.p;
import ne.s;
public abstract class h {
    public i f42996a;
    public p f42997b;
    public String f42998c;
    public int d;

    public final String a(Pattern pattern) {
        i iVar = this.f42996a;
        iVar.f43008g = this.d;
        String c3 = iVar.c(pattern);
        this.d = this.f42996a.f43008g;
        return c3;
    }

    public abstract p b();

    public final char c() {
        i iVar = this.f42996a;
        iVar.f43008g = this.d;
        return iVar.d();
    }

    public abstract char d();

    public final void e() {
        i iVar = this.f42996a;
        iVar.f43008g = this.d;
        iVar.c(i.f43000k);
        this.d = this.f42996a.f43008g;
    }

    public final s f(String str) {
        this.f42996a.getClass();
        return new s(str);
    }
}
