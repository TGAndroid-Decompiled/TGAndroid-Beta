package qc;

import java.util.regex.Pattern;
import ne.p;
import ne.s;
public abstract class h {
    public i f43026a;
    public p f43027b;
    public String f43028c;
    public int d;

    public final String a(Pattern pattern) {
        i iVar = this.f43026a;
        iVar.f43038g = this.d;
        String c3 = iVar.c(pattern);
        this.d = this.f43026a.f43038g;
        return c3;
    }

    public abstract p b();

    public final char c() {
        i iVar = this.f43026a;
        iVar.f43038g = this.d;
        return iVar.d();
    }

    public abstract char d();

    public final void e() {
        i iVar = this.f43026a;
        iVar.f43038g = this.d;
        iVar.c(i.f43030k);
        this.d = this.f43026a.f43038g;
    }

    public final s f(String str) {
        this.f43026a.getClass();
        return new s(str);
    }
}
