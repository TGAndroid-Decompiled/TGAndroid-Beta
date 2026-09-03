package qc;

import java.util.regex.Pattern;
import ne.p;
import ne.s;
public abstract class h {
    public i f44800a;
    public p f44801b;
    public String f44802c;
    public int d;

    public final String a(Pattern pattern) {
        i iVar = this.f44800a;
        iVar.f44813g = this.d;
        String c3 = iVar.c(pattern);
        this.d = this.f44800a.f44813g;
        return c3;
    }

    public abstract p b();

    public final char c() {
        i iVar = this.f44800a;
        iVar.f44813g = this.d;
        return iVar.d();
    }

    public abstract char d();

    public final void e() {
        i iVar = this.f44800a;
        iVar.f44813g = this.d;
        iVar.c(i.f44804k);
        this.d = this.f44800a.f44813g;
    }

    public final s f(String str) {
        this.f44800a.getClass();
        return new s(str);
    }
}
